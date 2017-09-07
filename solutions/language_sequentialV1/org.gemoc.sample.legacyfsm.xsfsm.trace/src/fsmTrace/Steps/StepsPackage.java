/**
 */
package fsmTrace.Steps;

import fr.inria.diverse.trace.commons.model.trace.TracePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fsmTrace.Steps.StepsFactory
 * @model kind="package"
 * @generated
 */
public interface StepsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Steps";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "fsmTrace_Steps";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "events";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StepsPackage eINSTANCE = fsmTrace.Steps.impl.StepsPackageImpl.init();

	/**
	 * The meta object id for the '{@link fsmTrace.Steps.SpecificStep <em>Specific Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmTrace.Steps.SpecificStep
	 * @see fsmTrace.Steps.impl.StepsPackageImpl#getSpecificStep()
	 * @generated
	 */
	int SPECIFIC_STEP = 9;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STEP__MSEOCCURRENCE = TracePackage.STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STEP__ENDING_STATE = TracePackage.STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STEP__STARTING_STATE = TracePackage.STEP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Specific Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STEP_FEATURE_COUNT = TracePackage.STEP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fsmTrace.Steps.impl.Fsm_FSMSystem_InitializeImpl <em>Fsm FSM System Initialize</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmTrace.Steps.impl.Fsm_FSMSystem_InitializeImpl
	 * @see fsmTrace.Steps.impl.StepsPackageImpl#getFsm_FSMSystem_Initialize()
	 * @generated
	 */
	int FSM_FSM_SYSTEM_INITIALIZE = 0;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_FSM_SYSTEM_INITIALIZE__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_FSM_SYSTEM_INITIALIZE__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_FSM_SYSTEM_INITIALIZE__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Fsm FSM System Initialize</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_FSM_SYSTEM_INITIALIZE_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fsmTrace.Steps.impl.Fsm_StateMachine_RunImpl <em>Fsm State Machine Run</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmTrace.Steps.impl.Fsm_StateMachine_RunImpl
	 * @see fsmTrace.Steps.impl.StepsPackageImpl#getFsm_StateMachine_Run()
	 * @generated
	 */
	int FSM_STATE_MACHINE_RUN = 1;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_STATE_MACHINE_RUN__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_STATE_MACHINE_RUN__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_STATE_MACHINE_RUN__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_STATE_MACHINE_RUN__SUB_STEPS = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fsm State Machine Run</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_STATE_MACHINE_RUN_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fsmTrace.Steps.Fsm_StateMachine_Run_AbstractSubStep <em>Fsm State Machine Run Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmTrace.Steps.Fsm_StateMachine_Run_AbstractSubStep
	 * @see fsmTrace.Steps.impl.StepsPackageImpl#getFsm_StateMachine_Run_AbstractSubStep()
	 * @generated
	 */
	int FSM_STATE_MACHINE_RUN_ABSTRACT_SUB_STEP = 2;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_STATE_MACHINE_RUN_ABSTRACT_SUB_STEP__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_STATE_MACHINE_RUN_ABSTRACT_SUB_STEP__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_STATE_MACHINE_RUN_ABSTRACT_SUB_STEP__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Fsm State Machine Run Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_STATE_MACHINE_RUN_ABSTRACT_SUB_STEP_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fsmTrace.Steps.impl.Fsm_StateMachine_Run_ImplicitStepImpl <em>Fsm State Machine Run Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmTrace.Steps.impl.Fsm_StateMachine_Run_ImplicitStepImpl
	 * @see fsmTrace.Steps.impl.StepsPackageImpl#getFsm_StateMachine_Run_ImplicitStep()
	 * @generated
	 */
	int FSM_STATE_MACHINE_RUN_IMPLICIT_STEP = 3;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_STATE_MACHINE_RUN_IMPLICIT_STEP__MSEOCCURRENCE = FSM_STATE_MACHINE_RUN_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_STATE_MACHINE_RUN_IMPLICIT_STEP__ENDING_STATE = FSM_STATE_MACHINE_RUN_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_STATE_MACHINE_RUN_IMPLICIT_STEP__STARTING_STATE = FSM_STATE_MACHINE_RUN_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Fsm State Machine Run Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_STATE_MACHINE_RUN_IMPLICIT_STEP_FEATURE_COUNT = FSM_STATE_MACHINE_RUN_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fsmTrace.Steps.impl.Fsm_State_StepImpl <em>Fsm State Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmTrace.Steps.impl.Fsm_State_StepImpl
	 * @see fsmTrace.Steps.impl.StepsPackageImpl#getFsm_State_Step()
	 * @generated
	 */
	int FSM_STATE_STEP = 4;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_STATE_STEP__MSEOCCURRENCE = FSM_STATE_MACHINE_RUN_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_STATE_STEP__ENDING_STATE = FSM_STATE_MACHINE_RUN_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_STATE_STEP__STARTING_STATE = FSM_STATE_MACHINE_RUN_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_STATE_STEP__SUB_STEPS = FSM_STATE_MACHINE_RUN_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fsm State Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_STATE_STEP_FEATURE_COUNT = FSM_STATE_MACHINE_RUN_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fsmTrace.Steps.Fsm_State_Step_AbstractSubStep <em>Fsm State Step Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmTrace.Steps.Fsm_State_Step_AbstractSubStep
	 * @see fsmTrace.Steps.impl.StepsPackageImpl#getFsm_State_Step_AbstractSubStep()
	 * @generated
	 */
	int FSM_STATE_STEP_ABSTRACT_SUB_STEP = 5;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_STATE_STEP_ABSTRACT_SUB_STEP__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_STATE_STEP_ABSTRACT_SUB_STEP__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_STATE_STEP_ABSTRACT_SUB_STEP__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Fsm State Step Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_STATE_STEP_ABSTRACT_SUB_STEP_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fsmTrace.Steps.impl.Fsm_State_Step_ImplicitStepImpl <em>Fsm State Step Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmTrace.Steps.impl.Fsm_State_Step_ImplicitStepImpl
	 * @see fsmTrace.Steps.impl.StepsPackageImpl#getFsm_State_Step_ImplicitStep()
	 * @generated
	 */
	int FSM_STATE_STEP_IMPLICIT_STEP = 6;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_STATE_STEP_IMPLICIT_STEP__MSEOCCURRENCE = FSM_STATE_STEP_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_STATE_STEP_IMPLICIT_STEP__ENDING_STATE = FSM_STATE_STEP_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_STATE_STEP_IMPLICIT_STEP__STARTING_STATE = FSM_STATE_STEP_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Fsm State Step Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_STATE_STEP_IMPLICIT_STEP_FEATURE_COUNT = FSM_STATE_STEP_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fsmTrace.Steps.impl.Fsm_Transition_FireImpl <em>Fsm Transition Fire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmTrace.Steps.impl.Fsm_Transition_FireImpl
	 * @see fsmTrace.Steps.impl.StepsPackageImpl#getFsm_Transition_Fire()
	 * @generated
	 */
	int FSM_TRANSITION_FIRE = 7;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_TRANSITION_FIRE__MSEOCCURRENCE = FSM_STATE_STEP_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_TRANSITION_FIRE__ENDING_STATE = FSM_STATE_STEP_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_TRANSITION_FIRE__STARTING_STATE = FSM_STATE_STEP_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Fsm Transition Fire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_TRANSITION_FIRE_FEATURE_COUNT = FSM_STATE_STEP_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fsmTrace.Steps.impl.RootImplicitStepImpl <em>Root Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmTrace.Steps.impl.RootImplicitStepImpl
	 * @see fsmTrace.Steps.impl.StepsPackageImpl#getRootImplicitStep()
	 * @generated
	 */
	int ROOT_IMPLICIT_STEP = 8;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_IMPLICIT_STEP__MSEOCCURRENCE = TracePackage.SMALL_STEP__MSEOCCURRENCE;

	/**
	 * The number of structural features of the '<em>Root Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_IMPLICIT_STEP_FEATURE_COUNT = TracePackage.SMALL_STEP_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link fsmTrace.Steps.Fsm_FSMSystem_Initialize <em>Fsm FSM System Initialize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fsm FSM System Initialize</em>'.
	 * @see fsmTrace.Steps.Fsm_FSMSystem_Initialize
	 * @generated
	 */
	EClass getFsm_FSMSystem_Initialize();

	/**
	 * Returns the meta object for class '{@link fsmTrace.Steps.Fsm_StateMachine_Run <em>Fsm State Machine Run</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fsm State Machine Run</em>'.
	 * @see fsmTrace.Steps.Fsm_StateMachine_Run
	 * @generated
	 */
	EClass getFsm_StateMachine_Run();

	/**
	 * Returns the meta object for class '{@link fsmTrace.Steps.Fsm_StateMachine_Run_AbstractSubStep <em>Fsm State Machine Run Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fsm State Machine Run Abstract Sub Step</em>'.
	 * @see fsmTrace.Steps.Fsm_StateMachine_Run_AbstractSubStep
	 * @generated
	 */
	EClass getFsm_StateMachine_Run_AbstractSubStep();

	/**
	 * Returns the meta object for class '{@link fsmTrace.Steps.Fsm_StateMachine_Run_ImplicitStep <em>Fsm State Machine Run Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fsm State Machine Run Implicit Step</em>'.
	 * @see fsmTrace.Steps.Fsm_StateMachine_Run_ImplicitStep
	 * @generated
	 */
	EClass getFsm_StateMachine_Run_ImplicitStep();

	/**
	 * Returns the meta object for class '{@link fsmTrace.Steps.Fsm_State_Step <em>Fsm State Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fsm State Step</em>'.
	 * @see fsmTrace.Steps.Fsm_State_Step
	 * @generated
	 */
	EClass getFsm_State_Step();

	/**
	 * Returns the meta object for class '{@link fsmTrace.Steps.Fsm_State_Step_AbstractSubStep <em>Fsm State Step Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fsm State Step Abstract Sub Step</em>'.
	 * @see fsmTrace.Steps.Fsm_State_Step_AbstractSubStep
	 * @generated
	 */
	EClass getFsm_State_Step_AbstractSubStep();

	/**
	 * Returns the meta object for class '{@link fsmTrace.Steps.Fsm_State_Step_ImplicitStep <em>Fsm State Step Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fsm State Step Implicit Step</em>'.
	 * @see fsmTrace.Steps.Fsm_State_Step_ImplicitStep
	 * @generated
	 */
	EClass getFsm_State_Step_ImplicitStep();

	/**
	 * Returns the meta object for class '{@link fsmTrace.Steps.Fsm_Transition_Fire <em>Fsm Transition Fire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fsm Transition Fire</em>'.
	 * @see fsmTrace.Steps.Fsm_Transition_Fire
	 * @generated
	 */
	EClass getFsm_Transition_Fire();

	/**
	 * Returns the meta object for class '{@link fsmTrace.Steps.RootImplicitStep <em>Root Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Implicit Step</em>'.
	 * @see fsmTrace.Steps.RootImplicitStep
	 * @generated
	 */
	EClass getRootImplicitStep();

	/**
	 * Returns the meta object for class '{@link fsmTrace.Steps.SpecificStep <em>Specific Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Step</em>'.
	 * @see fsmTrace.Steps.SpecificStep
	 * @generated
	 */
	EClass getSpecificStep();

	/**
	 * Returns the meta object for the reference '{@link fsmTrace.Steps.SpecificStep#getEndingState <em>Ending State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ending State</em>'.
	 * @see fsmTrace.Steps.SpecificStep#getEndingState()
	 * @see #getSpecificStep()
	 * @generated
	 */
	EReference getSpecificStep_EndingState();

	/**
	 * Returns the meta object for the reference '{@link fsmTrace.Steps.SpecificStep#getStartingState <em>Starting State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Starting State</em>'.
	 * @see fsmTrace.Steps.SpecificStep#getStartingState()
	 * @see #getSpecificStep()
	 * @generated
	 */
	EReference getSpecificStep_StartingState();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StepsFactory getStepsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fsmTrace.Steps.impl.Fsm_FSMSystem_InitializeImpl <em>Fsm FSM System Initialize</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmTrace.Steps.impl.Fsm_FSMSystem_InitializeImpl
		 * @see fsmTrace.Steps.impl.StepsPackageImpl#getFsm_FSMSystem_Initialize()
		 * @generated
		 */
		EClass FSM_FSM_SYSTEM_INITIALIZE = eINSTANCE.getFsm_FSMSystem_Initialize();

		/**
		 * The meta object literal for the '{@link fsmTrace.Steps.impl.Fsm_StateMachine_RunImpl <em>Fsm State Machine Run</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmTrace.Steps.impl.Fsm_StateMachine_RunImpl
		 * @see fsmTrace.Steps.impl.StepsPackageImpl#getFsm_StateMachine_Run()
		 * @generated
		 */
		EClass FSM_STATE_MACHINE_RUN = eINSTANCE.getFsm_StateMachine_Run();

		/**
		 * The meta object literal for the '{@link fsmTrace.Steps.Fsm_StateMachine_Run_AbstractSubStep <em>Fsm State Machine Run Abstract Sub Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmTrace.Steps.Fsm_StateMachine_Run_AbstractSubStep
		 * @see fsmTrace.Steps.impl.StepsPackageImpl#getFsm_StateMachine_Run_AbstractSubStep()
		 * @generated
		 */
		EClass FSM_STATE_MACHINE_RUN_ABSTRACT_SUB_STEP = eINSTANCE.getFsm_StateMachine_Run_AbstractSubStep();

		/**
		 * The meta object literal for the '{@link fsmTrace.Steps.impl.Fsm_StateMachine_Run_ImplicitStepImpl <em>Fsm State Machine Run Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmTrace.Steps.impl.Fsm_StateMachine_Run_ImplicitStepImpl
		 * @see fsmTrace.Steps.impl.StepsPackageImpl#getFsm_StateMachine_Run_ImplicitStep()
		 * @generated
		 */
		EClass FSM_STATE_MACHINE_RUN_IMPLICIT_STEP = eINSTANCE.getFsm_StateMachine_Run_ImplicitStep();

		/**
		 * The meta object literal for the '{@link fsmTrace.Steps.impl.Fsm_State_StepImpl <em>Fsm State Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmTrace.Steps.impl.Fsm_State_StepImpl
		 * @see fsmTrace.Steps.impl.StepsPackageImpl#getFsm_State_Step()
		 * @generated
		 */
		EClass FSM_STATE_STEP = eINSTANCE.getFsm_State_Step();

		/**
		 * The meta object literal for the '{@link fsmTrace.Steps.Fsm_State_Step_AbstractSubStep <em>Fsm State Step Abstract Sub Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmTrace.Steps.Fsm_State_Step_AbstractSubStep
		 * @see fsmTrace.Steps.impl.StepsPackageImpl#getFsm_State_Step_AbstractSubStep()
		 * @generated
		 */
		EClass FSM_STATE_STEP_ABSTRACT_SUB_STEP = eINSTANCE.getFsm_State_Step_AbstractSubStep();

		/**
		 * The meta object literal for the '{@link fsmTrace.Steps.impl.Fsm_State_Step_ImplicitStepImpl <em>Fsm State Step Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmTrace.Steps.impl.Fsm_State_Step_ImplicitStepImpl
		 * @see fsmTrace.Steps.impl.StepsPackageImpl#getFsm_State_Step_ImplicitStep()
		 * @generated
		 */
		EClass FSM_STATE_STEP_IMPLICIT_STEP = eINSTANCE.getFsm_State_Step_ImplicitStep();

		/**
		 * The meta object literal for the '{@link fsmTrace.Steps.impl.Fsm_Transition_FireImpl <em>Fsm Transition Fire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmTrace.Steps.impl.Fsm_Transition_FireImpl
		 * @see fsmTrace.Steps.impl.StepsPackageImpl#getFsm_Transition_Fire()
		 * @generated
		 */
		EClass FSM_TRANSITION_FIRE = eINSTANCE.getFsm_Transition_Fire();

		/**
		 * The meta object literal for the '{@link fsmTrace.Steps.impl.RootImplicitStepImpl <em>Root Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmTrace.Steps.impl.RootImplicitStepImpl
		 * @see fsmTrace.Steps.impl.StepsPackageImpl#getRootImplicitStep()
		 * @generated
		 */
		EClass ROOT_IMPLICIT_STEP = eINSTANCE.getRootImplicitStep();

		/**
		 * The meta object literal for the '{@link fsmTrace.Steps.SpecificStep <em>Specific Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmTrace.Steps.SpecificStep
		 * @see fsmTrace.Steps.impl.StepsPackageImpl#getSpecificStep()
		 * @generated
		 */
		EClass SPECIFIC_STEP = eINSTANCE.getSpecificStep();

		/**
		 * The meta object literal for the '<em><b>Ending State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_STEP__ENDING_STATE = eINSTANCE.getSpecificStep_EndingState();

		/**
		 * The meta object literal for the '<em><b>Starting State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_STEP__STARTING_STATE = eINSTANCE.getSpecificStep_StartingState();

	}

} //StepsPackage
