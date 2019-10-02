/**
 */
package no.hal.pg.config.viewmodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecp.view.spi.model.VViewPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see no.hal.pg.config.viewmodel.ViewmodelFactory
 * @model kind="package"
 * @generated
 */
public interface ViewmodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "viewmodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/no.hal.pg.config.editor/model/viewmodel.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pgviewmodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ViewmodelPackage eINSTANCE = no.hal.pg.config.viewmodel.impl.ViewmodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link no.hal.pg.config.viewmodel.impl.BooleanComboRendererConfigImpl <em>Boolean Combo Renderer Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.config.viewmodel.impl.BooleanComboRendererConfigImpl
	 * @see no.hal.pg.config.viewmodel.impl.ViewmodelPackageImpl#getBooleanComboRendererConfig()
	 * @generated
	 */
	int BOOLEAN_COMBO_RENDERER_CONFIG = 0;

	/**
	 * The feature id for the '<em><b>True False Labels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_COMBO_RENDERER_CONFIG__TRUE_FALSE_LABELS = VViewPackage.ATTACHMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Combo Renderer Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_COMBO_RENDERER_CONFIG_FEATURE_COUNT = VViewPackage.ATTACHMENT_FEATURE_COUNT + 1;

	/**
	 * Returns the meta object for class '{@link no.hal.pg.config.viewmodel.BooleanComboRendererConfig <em>Boolean Combo Renderer Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Combo Renderer Config</em>'.
	 * @see no.hal.pg.config.viewmodel.BooleanComboRendererConfig
	 * @generated
	 */
	EClass getBooleanComboRendererConfig();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.config.viewmodel.BooleanComboRendererConfig#getTrueFalseLabels <em>True False Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>True False Labels</em>'.
	 * @see no.hal.pg.config.viewmodel.BooleanComboRendererConfig#getTrueFalseLabels()
	 * @see #getBooleanComboRendererConfig()
	 * @generated
	 */
	EAttribute getBooleanComboRendererConfig_TrueFalseLabels();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ViewmodelFactory getViewmodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link no.hal.pg.config.viewmodel.impl.BooleanComboRendererConfigImpl <em>Boolean Combo Renderer Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.config.viewmodel.impl.BooleanComboRendererConfigImpl
		 * @see no.hal.pg.config.viewmodel.impl.ViewmodelPackageImpl#getBooleanComboRendererConfig()
		 * @generated
		 */
		EClass BOOLEAN_COMBO_RENDERER_CONFIG = eINSTANCE.getBooleanComboRendererConfig();

		/**
		 * The meta object literal for the '<em><b>True False Labels</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_COMBO_RENDERER_CONFIG__TRUE_FALSE_LABELS = eINSTANCE.getBooleanComboRendererConfig_TrueFalseLabels();

	}

} //ViewmodelPackage
