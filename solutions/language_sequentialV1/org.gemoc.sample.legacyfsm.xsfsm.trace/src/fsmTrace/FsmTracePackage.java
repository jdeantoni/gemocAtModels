/**
 */
package fsmTrace;

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
 * @see fsmTrace.FsmTraceFactory
 * @model kind="package"
 * @generated
 */
public interface FsmTracePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "fsmTrace";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "fsmTrace";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fsmTrace";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FsmTracePackage eINSTANCE = fsmTrace.impl.FsmTracePackageImpl.init();

	/**
	 * The meta object id for the '{@link fsmTrace.impl.SpecificTraceImpl <em>Specific Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmTrace.impl.SpecificTraceImpl
	 * @see fsmTrace.impl.FsmTracePackageImpl#getSpecificTrace()
	 * @generated
	 */
	int SPECIFIC_TRACE = 0;

	/**
	 * The feature id for the '<em><b>Root Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ROOT_STEP = TracePackage.TRACE__ROOT_STEP;

	/**
	 * The feature id for the '<em><b>Launchconfiguration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__LAUNCHCONFIGURATION = TracePackage.TRACE__LAUNCHCONFIGURATION;

	/**
	 * The feature id for the '<em><b>Fsm FSM System Initialize Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FSM_FSM_SYSTEM_INITIALIZE_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fsm State Machine Run Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FSM_STATE_MACHINE_RUN_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fsm State Step Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FSM_STATE_STEP_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fsm Transition Fire Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FSM_TRANSITION_FIRE_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fsm traced Buffers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FSM_TRACED_BUFFERS = TracePackage.TRACE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Fsm traced FSM Systems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FSM_TRACED_FSM_SYSTEMS = TracePackage.TRACE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Fsm traced State Machines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FSM_TRACED_STATE_MACHINES = TracePackage.TRACE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Fsm traced States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FSM_TRACED_STATES = TracePackage.TRACE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Fsm traced Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FSM_TRACED_TRANSITIONS = TracePackage.TRACE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>States Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__STATES_TRACE = TracePackage.TRACE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Specific Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE_FEATURE_COUNT = TracePackage.TRACE_FEATURE_COUNT + 10;


	/**
	 * Returns the meta object for class '{@link fsmTrace.SpecificTrace <em>Specific Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Trace</em>'.
	 * @see fsmTrace.SpecificTrace
	 * @generated
	 */
	EClass getSpecificTrace();

	/**
	 * Returns the meta object for the reference list '{@link fsmTrace.SpecificTrace#getFsm_FSMSystem_Initialize_Sequence <em>Fsm FSM System Initialize Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fsm FSM System Initialize Sequence</em>'.
	 * @see fsmTrace.SpecificTrace#getFsm_FSMSystem_Initialize_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Fsm_FSMSystem_Initialize_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fsmTrace.SpecificTrace#getFsm_StateMachine_Run_Sequence <em>Fsm State Machine Run Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fsm State Machine Run Sequence</em>'.
	 * @see fsmTrace.SpecificTrace#getFsm_StateMachine_Run_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Fsm_StateMachine_Run_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fsmTrace.SpecificTrace#getFsm_State_Step_Sequence <em>Fsm State Step Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fsm State Step Sequence</em>'.
	 * @see fsmTrace.SpecificTrace#getFsm_State_Step_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Fsm_State_Step_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fsmTrace.SpecificTrace#getFsm_Transition_Fire_Sequence <em>Fsm Transition Fire Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fsm Transition Fire Sequence</em>'.
	 * @see fsmTrace.SpecificTrace#getFsm_Transition_Fire_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Fsm_Transition_Fire_Sequence();

	/**
	 * Returns the meta object for the containment reference list '{@link fsmTrace.SpecificTrace#getFsm_tracedBuffers <em>Fsm traced Buffers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fsm traced Buffers</em>'.
	 * @see fsmTrace.SpecificTrace#getFsm_tracedBuffers()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Fsm_tracedBuffers();

	/**
	 * Returns the meta object for the containment reference list '{@link fsmTrace.SpecificTrace#getFsm_tracedFSMSystems <em>Fsm traced FSM Systems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fsm traced FSM Systems</em>'.
	 * @see fsmTrace.SpecificTrace#getFsm_tracedFSMSystems()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Fsm_tracedFSMSystems();

	/**
	 * Returns the meta object for the containment reference list '{@link fsmTrace.SpecificTrace#getFsm_tracedStateMachines <em>Fsm traced State Machines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fsm traced State Machines</em>'.
	 * @see fsmTrace.SpecificTrace#getFsm_tracedStateMachines()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Fsm_tracedStateMachines();

	/**
	 * Returns the meta object for the containment reference list '{@link fsmTrace.SpecificTrace#getFsm_tracedStates <em>Fsm traced States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fsm traced States</em>'.
	 * @see fsmTrace.SpecificTrace#getFsm_tracedStates()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Fsm_tracedStates();

	/**
	 * Returns the meta object for the containment reference list '{@link fsmTrace.SpecificTrace#getFsm_tracedTransitions <em>Fsm traced Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fsm traced Transitions</em>'.
	 * @see fsmTrace.SpecificTrace#getFsm_tracedTransitions()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Fsm_tracedTransitions();

	/**
	 * Returns the meta object for the containment reference list '{@link fsmTrace.SpecificTrace#getStatesTrace <em>States Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States Trace</em>'.
	 * @see fsmTrace.SpecificTrace#getStatesTrace()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_StatesTrace();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FsmTraceFactory getFsmTraceFactory();

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
		 * The meta object literal for the '{@link fsmTrace.impl.SpecificTraceImpl <em>Specific Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmTrace.impl.SpecificTraceImpl
		 * @see fsmTrace.impl.FsmTracePackageImpl#getSpecificTrace()
		 * @generated
		 */
		EClass SPECIFIC_TRACE = eINSTANCE.getSpecificTrace();

		/**
		 * The meta object literal for the '<em><b>Fsm FSM System Initialize Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FSM_FSM_SYSTEM_INITIALIZE_SEQUENCE = eINSTANCE.getSpecificTrace_Fsm_FSMSystem_Initialize_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fsm State Machine Run Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FSM_STATE_MACHINE_RUN_SEQUENCE = eINSTANCE.getSpecificTrace_Fsm_StateMachine_Run_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fsm State Step Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FSM_STATE_STEP_SEQUENCE = eINSTANCE.getSpecificTrace_Fsm_State_Step_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fsm Transition Fire Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FSM_TRANSITION_FIRE_SEQUENCE = eINSTANCE.getSpecificTrace_Fsm_Transition_Fire_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fsm traced Buffers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FSM_TRACED_BUFFERS = eINSTANCE.getSpecificTrace_Fsm_tracedBuffers();

		/**
		 * The meta object literal for the '<em><b>Fsm traced FSM Systems</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FSM_TRACED_FSM_SYSTEMS = eINSTANCE.getSpecificTrace_Fsm_tracedFSMSystems();

		/**
		 * The meta object literal for the '<em><b>Fsm traced State Machines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FSM_TRACED_STATE_MACHINES = eINSTANCE.getSpecificTrace_Fsm_tracedStateMachines();

		/**
		 * The meta object literal for the '<em><b>Fsm traced States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FSM_TRACED_STATES = eINSTANCE.getSpecificTrace_Fsm_tracedStates();

		/**
		 * The meta object literal for the '<em><b>Fsm traced Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FSM_TRACED_TRANSITIONS = eINSTANCE.getSpecificTrace_Fsm_tracedTransitions();

		/**
		 * The meta object literal for the '<em><b>States Trace</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__STATES_TRACE = eINSTANCE.getSpecificTrace_StatesTrace();

	}

} //FsmTracePackage
