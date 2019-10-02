/**
 */
package no.hal.pg.config.viewmodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see no.hal.pg.config.viewmodel.ViewmodelPackage
 * @generated
 */
public interface ViewmodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ViewmodelFactory eINSTANCE = no.hal.pg.config.viewmodel.impl.ViewmodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Boolean Combo Renderer Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Combo Renderer Config</em>'.
	 * @generated
	 */
	BooleanComboRendererConfig createBooleanComboRendererConfig();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ViewmodelPackage getViewmodelPackage();

} //ViewmodelFactory
