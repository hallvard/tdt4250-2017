package no.hal.pg.config.actions;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emfforms.spi.editor.IToolbarAction;

public abstract class ConfigToolbarAction implements IToolbarAction {

	protected EditingDomain getEditingDomain(final EObject context) {
		return AdapterFactoryEditingDomain.getEditingDomainFor(context);
	}

	protected void executeCommand(final EditingDomain editingDomain, final Command command) {
		editingDomain.getCommandStack().execute(command);
	}

	protected void executeAttachChildCommand(final EObject container, final EReference eRef, final EObject newChild) {
		final EditingDomain editingDomain = getEditingDomain(container);
		final Command command = (eRef.isMany() ?
				new AddCommand(editingDomain, ((EList<?>) container.eGet(eRef)), newChild) :
					new SetCommand(editingDomain, container, eRef, newChild)
				);
		executeCommand(editingDomain, command);
	}

	@Override
	public boolean canExecute(final Object object) {
		if (object instanceof ResourceSet) {
			for (final Resource resource : ((ResourceSet) object).getResources()) {
				if (canExecute(resource)) {
					return true;
				}
			}
		} else if (object instanceof Resource) {
			if (canExecute((Resource) object)) {
				return true;
			}
		}
		return false;
	}

	protected boolean canExecute(final Resource resource) {
		return "config".equals(resource.getURI().fileExtension());
	}
}
