package no.hal.pg.config.actions;

import java.net.URL;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ISelectionProvider;

import no.hal.pg.config.GameConfig;

public class AddConfigObjectToolbarAction extends ConfigToolbarAction {

	private final EClass eClass;
	private final EReference eRef;

	public AddConfigObjectToolbarAction(final EClass eClass, final EReference eRef) {
		this.eClass = eClass;
		this.eRef = eRef;
	}

	protected String getText(final EClass eClass) {
		String name = eClass.getName();
		final String suffix = "Config";
		if (name.endsWith(suffix)) {
			name = name.substring(0, name.length() - suffix.length());
		}
		return name;
	}

	protected String getToolTipText(final EClass eClass) {
		return "Create " + getText(eClass);
	}

	protected URL getImageURL(final EClass eClass) {
		return null;
	}

	protected ImageDescriptor getImageDescriptor(final EClass eClass) {
		final URL imageURL = getImageURL(eClass);
		return (imageURL != null ? ImageDescriptor.createFromURL(imageURL) : null);
	}

	@Override
	public Action getAction(final Object currentObject, final ISelectionProvider selectionProvider) {
		final ConfigAction configAction = new ConfigAction(selectionProvider) {
			{
				final String text = AddConfigObjectToolbarAction.this.getText(eClass);
				final ImageDescriptor imageDescriptor = AddConfigObjectToolbarAction.this.getImageDescriptor(eClass);
				if (imageDescriptor != null) {
					setImageDescriptor(imageDescriptor);
				} else {
					setText(text);
				}
				setToolTipText(AddConfigObjectToolbarAction.this.getToolTipText(eClass));
			}

			@Override
			protected void run(final GameConfig gameConfig) {
				executeAttachChildCommand(gameConfig, eRef, EcoreUtil.create(eClass));
			}
		};
		return configAction;
	}
}
