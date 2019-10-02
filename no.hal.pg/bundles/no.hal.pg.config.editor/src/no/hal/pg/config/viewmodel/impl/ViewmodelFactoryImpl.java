/**
 */
package no.hal.pg.config.viewmodel.impl;

import no.hal.pg.config.viewmodel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ViewmodelFactoryImpl extends EFactoryImpl implements ViewmodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ViewmodelFactory init() {
		try {
			ViewmodelFactory theViewmodelFactory = (ViewmodelFactory)EPackage.Registry.INSTANCE.getEFactory(ViewmodelPackage.eNS_URI);
			if (theViewmodelFactory != null) {
				return theViewmodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ViewmodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewmodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ViewmodelPackage.BOOLEAN_COMBO_RENDERER_CONFIG: return createBooleanComboRendererConfig();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanComboRendererConfig createBooleanComboRendererConfig() {
		BooleanComboRendererConfigImpl booleanComboRendererConfig = new BooleanComboRendererConfigImpl();
		return booleanComboRendererConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ViewmodelPackage getViewmodelPackage() {
		return (ViewmodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ViewmodelPackage getPackage() {
		return ViewmodelPackage.eINSTANCE;
	}

} //ViewmodelFactoryImpl
