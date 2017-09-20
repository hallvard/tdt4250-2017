/**
 */
package no.hal.pg.app;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see no.hal.pg.app.AppFactory
 * @model kind="package"
 * @generated
 */
public interface AppPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "app";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/no.hal.pg.runtime/model/app.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "app";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AppPackage eINSTANCE = no.hal.pg.app.impl.AppPackageImpl.init();

	/**
	 * The meta object id for the '{@link no.hal.pg.app.impl.ViewImpl <em>View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.app.impl.ViewImpl
	 * @see no.hal.pg.app.impl.AppPackageImpl#getView()
	 * @generated
	 */
	int VIEW = 0;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__USER = 0;

	/**
	 * The number of structural features of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.hal.pg.app.impl.View1Impl <em>View1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.app.impl.View1Impl
	 * @see no.hal.pg.app.impl.AppPackageImpl#getView1()
	 * @generated
	 */
	int VIEW1 = 1;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW1__USER = VIEW__USER;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW1__MODEL = VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>View1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW1_FEATURE_COUNT = VIEW_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>View1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW1_OPERATION_COUNT = VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.pg.app.impl.View2Impl <em>View2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.app.impl.View2Impl
	 * @see no.hal.pg.app.impl.AppPackageImpl#getView2()
	 * @generated
	 */
	int VIEW2 = 2;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW2__USER = VIEW__USER;

	/**
	 * The feature id for the '<em><b>Model1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW2__MODEL1 = VIEW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW2__MODEL2 = VIEW_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>View2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW2_FEATURE_COUNT = VIEW_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>View2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW2_OPERATION_COUNT = VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.pg.app.impl.GameViewImpl <em>Game View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.app.impl.GameViewImpl
	 * @see no.hal.pg.app.impl.AppPackageImpl#getGameView()
	 * @generated
	 */
	int GAME_VIEW = 3;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_VIEW__USER = VIEW1__USER;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_VIEW__MODEL = VIEW1__MODEL;

	/**
	 * The feature id for the '<em><b>Player</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_VIEW__PLAYER = VIEW1_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Task Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_VIEW__TASK_VIEWS = VIEW1_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Game View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_VIEW_FEATURE_COUNT = VIEW1_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Create Task View</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_VIEW___CREATE_TASK_VIEW__TASK = VIEW1_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Game View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_VIEW_OPERATION_COUNT = VIEW1_OPERATION_COUNT + 1;


	/**
	 * The meta object id for the '{@link no.hal.pg.app.impl.TaskViewImpl <em>Task View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.app.impl.TaskViewImpl
	 * @see no.hal.pg.app.impl.AppPackageImpl#getTaskView()
	 * @generated
	 */
	int TASK_VIEW = 4;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_VIEW__USER = VIEW1__USER;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_VIEW__MODEL = VIEW1__MODEL;

	/**
	 * The feature id for the '<em><b>Game View</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_VIEW__GAME_VIEW = VIEW1_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Task View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_VIEW_FEATURE_COUNT = VIEW1_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Task View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_VIEW_OPERATION_COUNT = VIEW1_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link no.hal.pg.app.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View</em>'.
	 * @see no.hal.pg.app.View
	 * @generated
	 */
	EClass getView();

	/**
	 * Returns the meta object for the reference '{@link no.hal.pg.app.View#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>User</em>'.
	 * @see no.hal.pg.app.View#getUser()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_User();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.app.View1 <em>View1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View1</em>'.
	 * @see no.hal.pg.app.View1
	 * @generated
	 */
	EClass getView1();

	/**
	 * Returns the meta object for the reference '{@link no.hal.pg.app.View1#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model</em>'.
	 * @see no.hal.pg.app.View1#getModel()
	 * @see #getView1()
	 * @generated
	 */
	EReference getView1_Model();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.app.View2 <em>View2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View2</em>'.
	 * @see no.hal.pg.app.View2
	 * @generated
	 */
	EClass getView2();

	/**
	 * Returns the meta object for the reference '{@link no.hal.pg.app.View2#getModel1 <em>Model1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model1</em>'.
	 * @see no.hal.pg.app.View2#getModel1()
	 * @see #getView2()
	 * @generated
	 */
	EReference getView2_Model1();

	/**
	 * Returns the meta object for the reference '{@link no.hal.pg.app.View2#getModel2 <em>Model2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model2</em>'.
	 * @see no.hal.pg.app.View2#getModel2()
	 * @see #getView2()
	 * @generated
	 */
	EReference getView2_Model2();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.app.GameView <em>Game View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game View</em>'.
	 * @see no.hal.pg.app.GameView
	 * @generated
	 */
	EClass getGameView();

	/**
	 * Returns the meta object for the reference '{@link no.hal.pg.app.GameView#getPlayer <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Player</em>'.
	 * @see no.hal.pg.app.GameView#getPlayer()
	 * @see #getGameView()
	 * @generated
	 */
	EReference getGameView_Player();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.pg.app.GameView#getTaskViews <em>Task Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task Views</em>'.
	 * @see no.hal.pg.app.GameView#getTaskViews()
	 * @see #getGameView()
	 * @generated
	 */
	EReference getGameView_TaskViews();

	/**
	 * Returns the meta object for the '{@link no.hal.pg.app.GameView#createTaskView(no.hal.pg.runtime.Task) <em>Create Task View</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Task View</em>' operation.
	 * @see no.hal.pg.app.GameView#createTaskView(no.hal.pg.runtime.Task)
	 * @generated
	 */
	EOperation getGameView__CreateTaskView__Task();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.app.TaskView <em>Task View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task View</em>'.
	 * @see no.hal.pg.app.TaskView
	 * @generated
	 */
	EClass getTaskView();

	/**
	 * Returns the meta object for the container reference '{@link no.hal.pg.app.TaskView#getGameView <em>Game View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Game View</em>'.
	 * @see no.hal.pg.app.TaskView#getGameView()
	 * @see #getTaskView()
	 * @generated
	 */
	EReference getTaskView_GameView();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AppFactory getAppFactory();

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
		 * The meta object literal for the '{@link no.hal.pg.app.impl.ViewImpl <em>View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.app.impl.ViewImpl
		 * @see no.hal.pg.app.impl.AppPackageImpl#getView()
		 * @generated
		 */
		EClass VIEW = eINSTANCE.getView();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW__USER = eINSTANCE.getView_User();

		/**
		 * The meta object literal for the '{@link no.hal.pg.app.impl.View1Impl <em>View1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.app.impl.View1Impl
		 * @see no.hal.pg.app.impl.AppPackageImpl#getView1()
		 * @generated
		 */
		EClass VIEW1 = eINSTANCE.getView1();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW1__MODEL = eINSTANCE.getView1_Model();

		/**
		 * The meta object literal for the '{@link no.hal.pg.app.impl.View2Impl <em>View2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.app.impl.View2Impl
		 * @see no.hal.pg.app.impl.AppPackageImpl#getView2()
		 * @generated
		 */
		EClass VIEW2 = eINSTANCE.getView2();

		/**
		 * The meta object literal for the '<em><b>Model1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW2__MODEL1 = eINSTANCE.getView2_Model1();

		/**
		 * The meta object literal for the '<em><b>Model2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW2__MODEL2 = eINSTANCE.getView2_Model2();

		/**
		 * The meta object literal for the '{@link no.hal.pg.app.impl.GameViewImpl <em>Game View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.app.impl.GameViewImpl
		 * @see no.hal.pg.app.impl.AppPackageImpl#getGameView()
		 * @generated
		 */
		EClass GAME_VIEW = eINSTANCE.getGameView();

		/**
		 * The meta object literal for the '<em><b>Player</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_VIEW__PLAYER = eINSTANCE.getGameView_Player();

		/**
		 * The meta object literal for the '<em><b>Task Views</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_VIEW__TASK_VIEWS = eINSTANCE.getGameView_TaskViews();

		/**
		 * The meta object literal for the '<em><b>Create Task View</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GAME_VIEW___CREATE_TASK_VIEW__TASK = eINSTANCE.getGameView__CreateTaskView__Task();

		/**
		 * The meta object literal for the '{@link no.hal.pg.app.impl.TaskViewImpl <em>Task View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.app.impl.TaskViewImpl
		 * @see no.hal.pg.app.impl.AppPackageImpl#getTaskView()
		 * @generated
		 */
		EClass TASK_VIEW = eINSTANCE.getTaskView();

		/**
		 * The meta object literal for the '<em><b>Game View</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_VIEW__GAME_VIEW = eINSTANCE.getTaskView_GameView();

	}

} //AppPackage
