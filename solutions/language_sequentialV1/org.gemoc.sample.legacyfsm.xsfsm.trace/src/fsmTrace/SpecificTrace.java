/**
 */
package fsmTrace;

import fr.inria.diverse.trace.commons.model.trace.SequentialStep;
import fr.inria.diverse.trace.commons.model.trace.Trace;

import fsmTrace.States.State;

import fsmTrace.States.fsm.TracedBuffer;
import fsmTrace.States.fsm.TracedFSMSystem;
import fsmTrace.States.fsm.TracedState;
import fsmTrace.States.fsm.TracedStateMachine;
import fsmTrace.States.fsm.TracedTransition;

import fsmTrace.Steps.Fsm_FSMSystem_Initialize;
import fsmTrace.Steps.Fsm_StateMachine_Run;
import fsmTrace.Steps.Fsm_State_Step;
import fsmTrace.Steps.Fsm_Transition_Fire;
import fsmTrace.Steps.SpecificStep;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specific Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fsmTrace.SpecificTrace#getFsm_FSMSystem_Initialize_Sequence <em>Fsm FSM System Initialize Sequence</em>}</li>
 *   <li>{@link fsmTrace.SpecificTrace#getFsm_StateMachine_Run_Sequence <em>Fsm State Machine Run Sequence</em>}</li>
 *   <li>{@link fsmTrace.SpecificTrace#getFsm_State_Step_Sequence <em>Fsm State Step Sequence</em>}</li>
 *   <li>{@link fsmTrace.SpecificTrace#getFsm_Transition_Fire_Sequence <em>Fsm Transition Fire Sequence</em>}</li>
 *   <li>{@link fsmTrace.SpecificTrace#getFsm_tracedBuffers <em>Fsm traced Buffers</em>}</li>
 *   <li>{@link fsmTrace.SpecificTrace#getFsm_tracedFSMSystems <em>Fsm traced FSM Systems</em>}</li>
 *   <li>{@link fsmTrace.SpecificTrace#getFsm_tracedStateMachines <em>Fsm traced State Machines</em>}</li>
 *   <li>{@link fsmTrace.SpecificTrace#getFsm_tracedStates <em>Fsm traced States</em>}</li>
 *   <li>{@link fsmTrace.SpecificTrace#getFsm_tracedTransitions <em>Fsm traced Transitions</em>}</li>
 *   <li>{@link fsmTrace.SpecificTrace#getStatesTrace <em>States Trace</em>}</li>
 * </ul>
 *
 * @see fsmTrace.FsmTracePackage#getSpecificTrace()
 * @model
 * @generated
 */
public interface SpecificTrace extends Trace<SequentialStep<SpecificStep>> {
	/**
	 * Returns the value of the '<em><b>Fsm FSM System Initialize Sequence</b></em>' reference list.
	 * The list contents are of type {@link fsmTrace.Steps.Fsm_FSMSystem_Initialize}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fsm FSM System Initialize Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fsm FSM System Initialize Sequence</em>' reference list.
	 * @see fsmTrace.FsmTracePackage#getSpecificTrace_Fsm_FSMSystem_Initialize_Sequence()
	 * @model
	 * @generated
	 */
	EList<Fsm_FSMSystem_Initialize> getFsm_FSMSystem_Initialize_Sequence();

	/**
	 * Returns the value of the '<em><b>Fsm State Machine Run Sequence</b></em>' reference list.
	 * The list contents are of type {@link fsmTrace.Steps.Fsm_StateMachine_Run}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fsm State Machine Run Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fsm State Machine Run Sequence</em>' reference list.
	 * @see fsmTrace.FsmTracePackage#getSpecificTrace_Fsm_StateMachine_Run_Sequence()
	 * @model
	 * @generated
	 */
	EList<Fsm_StateMachine_Run> getFsm_StateMachine_Run_Sequence();

	/**
	 * Returns the value of the '<em><b>Fsm State Step Sequence</b></em>' reference list.
	 * The list contents are of type {@link fsmTrace.Steps.Fsm_State_Step}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fsm State Step Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fsm State Step Sequence</em>' reference list.
	 * @see fsmTrace.FsmTracePackage#getSpecificTrace_Fsm_State_Step_Sequence()
	 * @model
	 * @generated
	 */
	EList<Fsm_State_Step> getFsm_State_Step_Sequence();

	/**
	 * Returns the value of the '<em><b>Fsm Transition Fire Sequence</b></em>' reference list.
	 * The list contents are of type {@link fsmTrace.Steps.Fsm_Transition_Fire}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fsm Transition Fire Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fsm Transition Fire Sequence</em>' reference list.
	 * @see fsmTrace.FsmTracePackage#getSpecificTrace_Fsm_Transition_Fire_Sequence()
	 * @model
	 * @generated
	 */
	EList<Fsm_Transition_Fire> getFsm_Transition_Fire_Sequence();

	/**
	 * Returns the value of the '<em><b>Fsm traced Buffers</b></em>' containment reference list.
	 * The list contents are of type {@link fsmTrace.States.fsm.TracedBuffer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fsm traced Buffers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fsm traced Buffers</em>' containment reference list.
	 * @see fsmTrace.FsmTracePackage#getSpecificTrace_Fsm_tracedBuffers()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedBuffer> getFsm_tracedBuffers();

	/**
	 * Returns the value of the '<em><b>Fsm traced FSM Systems</b></em>' containment reference list.
	 * The list contents are of type {@link fsmTrace.States.fsm.TracedFSMSystem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fsm traced FSM Systems</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fsm traced FSM Systems</em>' containment reference list.
	 * @see fsmTrace.FsmTracePackage#getSpecificTrace_Fsm_tracedFSMSystems()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedFSMSystem> getFsm_tracedFSMSystems();

	/**
	 * Returns the value of the '<em><b>Fsm traced State Machines</b></em>' containment reference list.
	 * The list contents are of type {@link fsmTrace.States.fsm.TracedStateMachine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fsm traced State Machines</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fsm traced State Machines</em>' containment reference list.
	 * @see fsmTrace.FsmTracePackage#getSpecificTrace_Fsm_tracedStateMachines()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedStateMachine> getFsm_tracedStateMachines();

	/**
	 * Returns the value of the '<em><b>Fsm traced States</b></em>' containment reference list.
	 * The list contents are of type {@link fsmTrace.States.fsm.TracedState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fsm traced States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fsm traced States</em>' containment reference list.
	 * @see fsmTrace.FsmTracePackage#getSpecificTrace_Fsm_tracedStates()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedState> getFsm_tracedStates();

	/**
	 * Returns the value of the '<em><b>Fsm traced Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link fsmTrace.States.fsm.TracedTransition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fsm traced Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fsm traced Transitions</em>' containment reference list.
	 * @see fsmTrace.FsmTracePackage#getSpecificTrace_Fsm_tracedTransitions()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedTransition> getFsm_tracedTransitions();

	/**
	 * Returns the value of the '<em><b>States Trace</b></em>' containment reference list.
	 * The list contents are of type {@link fsmTrace.States.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States Trace</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States Trace</em>' containment reference list.
	 * @see fsmTrace.FsmTracePackage#getSpecificTrace_StatesTrace()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getStatesTrace();

} // SpecificTrace
