package no.hal.pg.config.viewmodel;

import org.eclipse.core.databinding.property.value.IValueProperty;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecp.view.spi.context.ViewModelContext;
import org.eclipse.emf.ecp.view.spi.model.VAttachment;
import org.eclipse.emf.ecp.view.spi.model.VControl;
import org.eclipse.emf.ecp.view.spi.model.VDomainModelReference;
import org.eclipse.emf.ecp.view.spi.model.VElement;
import org.eclipse.emf.emfforms.spi.view.annotation.model.VAnnotation;
import org.eclipse.emfforms.spi.core.services.databinding.DatabindingFailedException;
import org.eclipse.emfforms.spi.core.services.databinding.EMFFormsDatabinding;
import org.eclipse.emfforms.spi.swt.core.AbstractSWTRenderer;
import org.eclipse.emfforms.spi.swt.core.di.EMFFormsDIRendererService;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;

@Component
public class BooleanComboViewerSWTRendererService implements EMFFormsDIRendererService<VControl> {

	private EMFFormsDatabinding databindingService;

	@Reference(cardinality=ReferenceCardinality.MANDATORY, policy=ReferencePolicy.DYNAMIC)
	public void setEMFFormsDatabinding(final EMFFormsDatabinding databindingService) {
		this.databindingService = databindingService;
	}
	public void unsetEMFFormsDatabinding(final EMFFormsDatabinding databindingService) {
		this.databindingService = null;
	}

	public static String getAnnotationValue(final VElement vElement, final String key, final String def) {
		for (final VAttachment attachment : vElement.getAttachments()) {
			if (attachment instanceof VAnnotation) {
				final VAnnotation annotation = (VAnnotation) attachment;
				if (key.equals(annotation.getKey())) {
					return annotation.getValue();
				}
			}
		}
		return def;
	}

	public static <T extends VAttachment> T getAttachment(final VElement vElement, final Class<T> attachmentClass) {
		for (final VAttachment attachment : vElement.getAttachments()) {
			if (attachmentClass.isInstance(attachment)) {
				return (T) attachment;
			}
		}
		return null;
	}

	@Override
	public double isApplicable(final VElement vElement, final ViewModelContext viewModelContext) {
		if (vElement instanceof VControl) {
			final VDomainModelReference model = ((VControl) vElement).getDomainModelReference();
			if (databindingService != null && model != null) {
				try {
					final IValueProperty<?, ?> valueProperty = databindingService.getValueProperty(model, viewModelContext.getDomainModel());
					if (valueProperty.getValueType() instanceof EAttribute && EcorePackage.eINSTANCE.getEBoolean() == ((EAttribute) valueProperty.getValueType())) {
						if ("dropdown".equals(getAnnotationValue(vElement, "style", null))) {
							return 10;
						}
						if (getAttachment(vElement, BooleanComboRendererConfig.class) != null) {
							return 10;
						}
						return 1;
					}
				} catch (final DatabindingFailedException ex) {
				}
			}
		}
		return NOT_APPLICABLE;
	}

	@Override
	public Class<? extends AbstractSWTRenderer<VControl>> getRendererClass() {
		return BooleanComboViewerSWTRenderer.class;
	}
}
