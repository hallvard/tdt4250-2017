package no.hal.pg.config.actions;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.ui.dialogs.ResourceDialog;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.browser.IWebBrowser;
import org.eclipse.ui.part.FileEditorInput;

import no.hal.pg.app.GameApp;
import no.hal.pg.app.util.ViewFactoryUtil;
import no.hal.pg.arc.Arc;
import no.hal.pg.arc.ArcPackage;
import no.hal.pg.arc.Person;
import no.hal.pg.config.GameConfig;
import no.hal.pg.config.util.ConfigUtil;
import no.hal.pg.http.impl.ResourceProvider;
import no.hal.pg.runtime.Game;
import no.hal.pg.runtime.Player;
import no.hal.pg.runtime.RuntimeFactory;
import no.hal.pg.runtime.Task;
import no.hal.pg.ui.EditorResourceProvidersView;

public class CreateGameToolbarAction extends ConfigToolbarAction {

	@Override
	public Action getAction(final Object currentObject, final ISelectionProvider selectionProvider) {
		return new ConfigAction(currentObject, selectionProvider) {
			{
				try {
					setImageDescriptor(ImageDescriptor.createFromURL(new URL("platform:/plugin/no.hal.pg.config.editor/icons/run.gif")));
				} catch (MalformedURLException e) {
					setText("Run game");
				}
				setToolTipText("Run game");
			}
			
			@Override
			public void run(GameConfig gameConfig) {
//				InputDialog inputDialog = new InputDialog(null, "Player count", "Enter the number of players", "3", new IInputValidator() {
//					@Override
//					public String isValid(String newText) {
//						try {
//							Integer.valueOf(newText);
//							return null;
//						} catch (NumberFormatException e) {
//							return e.getMessage();
//						}
//					}
//				});
//				if (inputDialog.open() != Window.OK) {
//					return;
//				}
//				int playerCount = Integer.valueOf(inputDialog.getValue());
//				Collection<Player> players = new ArrayList<>(playerCount);
//				for (int i = 0; i < playerCount; i++) {
//					Player player = RuntimeFactory.eINSTANCE.createPlayer();
//					player.setNickname("p" + (i + 1));
//					players.add(player);
//				}
				ResourceDialog resourceDialog = new ResourceDialog(null, "ARC model", SWT.OPEN | SWT.SINGLE);
				if (resourceDialog.open() != Window.OK) {
					return;
				}
				ResourceSet resourceSet = new ResourceSetImpl();
				// get Persons that will play the game
				Collection<Person> persons = getPersons(gameConfig, resourceDialog.getURIs(), resourceSet);
				// create a Player for each Person
				Collection<Player> players = createPlayers(persons);
				Game<Task<?>> game = ConfigUtil.createGame(gameConfig, players);
				GameApp<?> app = ViewFactoryUtil.createGameApp(game);
				URI gameUri = gameConfig.eResource().getURI().trimFileExtension().appendFileExtension("xmi");
				Resource gameResource = resourceSet.createResource(gameUri);
				gameResource.getContents().add(app);
				gameResource.getContents().add(game);

				try {
					gameResource.save(null);
				} catch (IOException e) {
					e.printStackTrace();
				}
				if (gameUri.isPlatformResource()) {
					IPath path = new Path(gameUri.toString().substring(URI.createPlatformResourceURI("", true).toString().length()));  
					IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
					IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
					IEditorDescriptor desc = PlatformUI.getWorkbench().getEditorRegistry().getDefaultEditor(gameUri.lastSegment());
					try {
						IEditorPart gameEditor = page.openEditor(new FileEditorInput(file), desc.getId());
						EditorResourceProvidersView view = (EditorResourceProvidersView) page.showView("no.hal.pg.ui.EditorResourceProvidersView");
						view.partActivated(gameEditor);
						view.registerResourceProvider(gameEditor);
						String port = System.getProperty("org.osgi.service.http.port");
						if (port != null) {
							int gameNum = 0;
							for (Player player : players) {
								final IWebBrowser browser = PlatformUI.getWorkbench().getBrowserSupport().createBrowser(player.getName() + "@" + gameUri.toString());
								URL url = new URL("http://localhost:" + port + "/app/" + ResourceProvider.defaultName(gameUri) + "/views/" + gameNum);
								browser.openURL(url);
								gameNum++;
							}
						}
					} catch (PartInitException pie) {
					} catch (MalformedURLException mue) {
					}
				}
			}

			protected Collection<Player> createPlayers(Collection<Person> persons) {
				Collection<Player> players = new ArrayList<>();
				for (Person person : persons) {
					Player player = RuntimeFactory.eINSTANCE.createPlayer();
					player.setPerson(person);
					players.add(player);
				}
				return players;
			}

			protected Collection<Person> getPersons(GameConfig gameConfig, Collection<URI> uris, ResourceSet resourceSet) {
				Collection<Person> persons = new ArrayList<>();
				// look for Persons in Resources in same ResourceSet
				for (Resource resource : gameConfig.eResource().getResourceSet().getResources()) {
					Collection<Arc> arcs = EcoreUtil.getObjectsByType(resource.getContents(), ArcPackage.eINSTANCE.getArc());
					if (! arcs.isEmpty()) {
						addPersons(resourceSet, resource.getURI(), persons);
					}
				}
				// look for Persons in other Resources
				if (uris != null) {
					for (URI uri : uris) {
						addPersons(resourceSet, uri, persons);
					}
				}
				return persons;
			}
			
			protected void addPersons(ResourceSet resourceSet, URI uri, Collection<Person> persons) {
				Collection<Arc> arcs = EcoreUtil.getObjectsByType(resourceSet.getResource(uri, true).getContents(), ArcPackage.eINSTANCE.getArc());
				for (Arc arc : arcs) {
					persons.addAll(EcoreUtil.getObjectsByType(arc.getActors(), ArcPackage.eINSTANCE.getPerson()));
				}
			}
		};
	}
}
