/**
 */
package no.hal.pg.config.viewmodel.impl;

import no.hal.pg.config.viewmodel.BooleanComboRendererConfig;
import no.hal.pg.config.viewmodel.ViewmodelFactory;
import no.hal.pg.config.viewmodel.ViewmodelPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecp.view.spi.model.VViewPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ViewmodelPackageImpl extends EPackageImpl implements ViewmodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanComboRendererConfigEClass = null;
	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see no.hal.pg.config.viewmodel.ViewmodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ViewmodelPackageImpl() {
		super(eNS_URI, ViewmodelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ViewmodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ViewmodelPackage init() {
		if (isInited) return (ViewmodelPackage)EPackage.Registry.INSTANCE.getEPackage(ViewmodelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredViewmodelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ViewmodelPackageImpl theViewmodelPackage = registeredViewmodelPackage instanceof ViewmodelPackageImpl ? (ViewmodelPackageImpl)registeredViewmodelPackage : new ViewmodelPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		VViewPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theViewmodelPackage.createPackageContents();

		// Initialize created meta-data
		theViewmodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theViewmodelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ViewmodelPackage.eNS_URI, theViewmodelPackage);
		return theViewmodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBooleanComboRendererConfig() {
		return booleanComboRendererConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBooleanComboRendererConfig_TrueFalseLabels() {
		return (EAttribute)booleanComboRendererConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ViewmodelFactory getViewmodelFactory() {
		return (ViewmodelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		booleanComboRendererConfigEClass = createEClass(BOOLEAN_COMBO_RENDERER_CONFIG);
		createEAttribute(booleanComboRendererConfigEClass, BOOLEAN_COMBO_RENDERER_CONFIG__TRUE_FALSE_LABELS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		VViewPackage theViewPackage = (VViewPackage)EPackage.Registry.INSTANCE.getEPackage(VViewPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		booleanComboRendererConfigEClass.getESuperTypes().add(theViewPackage.getAttachment());

		// Initialize classes and features; add operations and parameters
		initEClass(booleanComboRendererConfigEClass, BooleanComboRendererConfig.class, "BooleanComboRendererConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanComboRendererConfig_TrueFalseLabels(), ecorePackage.getEString(), "trueFalseLabels", null, 0, 1, BooleanComboRendererConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ViewmodelPackageImpl
