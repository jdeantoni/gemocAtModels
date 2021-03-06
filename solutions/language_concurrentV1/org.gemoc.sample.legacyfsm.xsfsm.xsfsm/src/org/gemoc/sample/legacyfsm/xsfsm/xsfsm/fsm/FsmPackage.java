/**
 */
package org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.FsmFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 * @generated
 */
public interface FsmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "fsm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.gemoc.sample.legacyfsm.xsfsm.xsfsm/fsm/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fsm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FsmPackage eINSTANCE = org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.impl.FsmPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.impl.NamedElementImpl
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.impl.FsmPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.impl.StateMachineImpl <em>State Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.impl.StateMachineImpl
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.impl.FsmPackageImpl#getStateMachine()
	 * @generated
	 */
	int STATE_MACHINE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__OWNED_STATES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Initial State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__INITIAL_STATE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__OWNED_TRANSITIONS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Current State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__CURRENT_STATE = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Unprocessed String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__UNPROCESSED_STRING = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Consummed String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__CONSUMMED_STRING = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Produced String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__PRODUCED_STRING = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.impl.StateImpl
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.impl.FsmPackageImpl#getState()
	 * @generated
	 */
	int STATE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owning FSM</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OWNING_FSM = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outgoing Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OUTGOING_TRANSITIONS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Incoming Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INCOMING_TRANSITIONS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.impl.TransitionImpl
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.impl.FsmPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SOURCE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TARGET = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__INPUT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__OUTPUT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.impl.FSMSystemImpl <em>FSM System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.impl.FSMSystemImpl
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.impl.FsmPackageImpl#getFSMSystem()
	 * @generated
	 */
	int FSM_SYSTEM = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_SYSTEM__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned State Machines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_SYSTEM__OWNED_STATE_MACHINES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Buffer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_SYSTEM__OWNED_BUFFER = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>FSM System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_SYSTEM_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.impl.BufferImpl <em>Buffer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.impl.BufferImpl
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.impl.FsmPackageImpl#getBuffer()
	 * @generated
	 */
	int BUFFER = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER__INPUTS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER__OUTPUTS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER__INITIAL_VALUE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Current Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER__CURRENT_VALUES = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Buffer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;


	/**
	 * Returns the meta object for class '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.StateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine</em>'.
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.StateMachine
	 * @generated
	 */
	EClass getStateMachine();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.StateMachine#getOwnedStates <em>Owned States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned States</em>'.
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.StateMachine#getOwnedStates()
	 * @see #getStateMachine()
	 * @generated
	 */
	EReference getStateMachine_OwnedStates();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.StateMachine#getInitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initial State</em>'.
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.StateMachine#getInitialState()
	 * @see #getStateMachine()
	 * @generated
	 */
	EReference getStateMachine_InitialState();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.StateMachine#getOwnedTransitions <em>Owned Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Transitions</em>'.
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.StateMachine#getOwnedTransitions()
	 * @see #getStateMachine()
	 * @generated
	 */
	EReference getStateMachine_OwnedTransitions();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.StateMachine#getCurrentState <em>Current State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current State</em>'.
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.StateMachine#getCurrentState()
	 * @see #getStateMachine()
	 * @generated
	 */
	EReference getStateMachine_CurrentState();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.StateMachine#getUnprocessedString <em>Unprocessed String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unprocessed String</em>'.
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.StateMachine#getUnprocessedString()
	 * @see #getStateMachine()
	 * @generated
	 */
	EAttribute getStateMachine_UnprocessedString();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.StateMachine#getConsummedString <em>Consummed String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Consummed String</em>'.
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.StateMachine#getConsummedString()
	 * @see #getStateMachine()
	 * @generated
	 */
	EAttribute getStateMachine_ConsummedString();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.StateMachine#getProducedString <em>Produced String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Produced String</em>'.
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.StateMachine#getProducedString()
	 * @see #getStateMachine()
	 * @generated
	 */
	EAttribute getStateMachine_ProducedString();

	/**
	 * Returns the meta object for class '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the container reference '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.State#getOwningFSM <em>Owning FSM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning FSM</em>'.
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.State#getOwningFSM()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_OwningFSM();

	/**
	 * Returns the meta object for the reference list '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.State#getOutgoingTransitions <em>Outgoing Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing Transitions</em>'.
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.State#getOutgoingTransitions()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_OutgoingTransitions();

	/**
	 * Returns the meta object for the reference list '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.State#getIncomingTransitions <em>Incoming Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Transitions</em>'.
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.State#getIncomingTransitions()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_IncomingTransitions();

	/**
	 * Returns the meta object for class '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.Transition#getSource()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Target();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.Transition#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input</em>'.
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.Transition#getInput()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Input();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.Transition#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output</em>'.
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.Transition#getOutput()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Output();

	/**
	 * Returns the meta object for class '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.FSMSystem <em>FSM System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FSM System</em>'.
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.FSMSystem
	 * @generated
	 */
	EClass getFSMSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.FSMSystem#getOwnedStateMachines <em>Owned State Machines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned State Machines</em>'.
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.FSMSystem#getOwnedStateMachines()
	 * @see #getFSMSystem()
	 * @generated
	 */
	EReference getFSMSystem_OwnedStateMachines();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.FSMSystem#getOwnedBuffer <em>Owned Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Buffer</em>'.
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.FSMSystem#getOwnedBuffer()
	 * @see #getFSMSystem()
	 * @generated
	 */
	EReference getFSMSystem_OwnedBuffer();

	/**
	 * Returns the meta object for class '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.Buffer <em>Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Buffer</em>'.
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.Buffer
	 * @generated
	 */
	EClass getBuffer();

	/**
	 * Returns the meta object for the reference list '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.Buffer#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inputs</em>'.
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.Buffer#getInputs()
	 * @see #getBuffer()
	 * @generated
	 */
	EReference getBuffer_Inputs();

	/**
	 * Returns the meta object for the reference list '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.Buffer#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outputs</em>'.
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.Buffer#getOutputs()
	 * @see #getBuffer()
	 * @generated
	 */
	EReference getBuffer_Outputs();

	/**
	 * Returns the meta object for the attribute list '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.Buffer#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Initial Value</em>'.
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.Buffer#getInitialValue()
	 * @see #getBuffer()
	 * @generated
	 */
	EAttribute getBuffer_InitialValue();

	/**
	 * Returns the meta object for the attribute list '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.Buffer#getCurrentValues <em>Current Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Current Values</em>'.
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.Buffer#getCurrentValues()
	 * @see #getBuffer()
	 * @generated
	 */
	EAttribute getBuffer_CurrentValues();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FsmFactory getFsmFactory();

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
		 * The meta object literal for the '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.impl.StateMachineImpl <em>State Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.impl.StateMachineImpl
		 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.impl.FsmPackageImpl#getStateMachine()
		 * @generated
		 */
		EClass STATE_MACHINE = eINSTANCE.getStateMachine();

		/**
		 * The meta object literal for the '<em><b>Owned States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE__OWNED_STATES = eINSTANCE.getStateMachine_OwnedStates();

		/**
		 * The meta object literal for the '<em><b>Initial State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE__INITIAL_STATE = eINSTANCE.getStateMachine_InitialState();

		/**
		 * The meta object literal for the '<em><b>Owned Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE__OWNED_TRANSITIONS = eINSTANCE.getStateMachine_OwnedTransitions();

		/**
		 * The meta object literal for the '<em><b>Current State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE__CURRENT_STATE = eINSTANCE.getStateMachine_CurrentState();

		/**
		 * The meta object literal for the '<em><b>Unprocessed String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_MACHINE__UNPROCESSED_STRING = eINSTANCE.getStateMachine_UnprocessedString();

		/**
		 * The meta object literal for the '<em><b>Consummed String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_MACHINE__CONSUMMED_STRING = eINSTANCE.getStateMachine_ConsummedString();

		/**
		 * The meta object literal for the '<em><b>Produced String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_MACHINE__PRODUCED_STRING = eINSTANCE.getStateMachine_ProducedString();

		/**
		 * The meta object literal for the '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.impl.StateImpl
		 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.impl.FsmPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Owning FSM</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__OWNING_FSM = eINSTANCE.getState_OwningFSM();

		/**
		 * The meta object literal for the '<em><b>Outgoing Transitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__OUTGOING_TRANSITIONS = eINSTANCE.getState_OutgoingTransitions();

		/**
		 * The meta object literal for the '<em><b>Incoming Transitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__INCOMING_TRANSITIONS = eINSTANCE.getState_IncomingTransitions();

		/**
		 * The meta object literal for the '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.impl.TransitionImpl
		 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.impl.FsmPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__SOURCE = eINSTANCE.getTransition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__INPUT = eINSTANCE.getTransition_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__OUTPUT = eINSTANCE.getTransition_Output();

		/**
		 * The meta object literal for the '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.impl.NamedElementImpl
		 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.impl.FsmPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.impl.FSMSystemImpl <em>FSM System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.impl.FSMSystemImpl
		 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.impl.FsmPackageImpl#getFSMSystem()
		 * @generated
		 */
		EClass FSM_SYSTEM = eINSTANCE.getFSMSystem();

		/**
		 * The meta object literal for the '<em><b>Owned State Machines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSM_SYSTEM__OWNED_STATE_MACHINES = eINSTANCE.getFSMSystem_OwnedStateMachines();

		/**
		 * The meta object literal for the '<em><b>Owned Buffer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSM_SYSTEM__OWNED_BUFFER = eINSTANCE.getFSMSystem_OwnedBuffer();

		/**
		 * The meta object literal for the '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.impl.BufferImpl <em>Buffer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.impl.BufferImpl
		 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.impl.FsmPackageImpl#getBuffer()
		 * @generated
		 */
		EClass BUFFER = eINSTANCE.getBuffer();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUFFER__INPUTS = eINSTANCE.getBuffer_Inputs();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUFFER__OUTPUTS = eINSTANCE.getBuffer_Outputs();

		/**
		 * The meta object literal for the '<em><b>Initial Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUFFER__INITIAL_VALUE = eINSTANCE.getBuffer_InitialValue();

		/**
		 * The meta object literal for the '<em><b>Current Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUFFER__CURRENT_VALUES = eINSTANCE.getBuffer_CurrentValues();

	}

} //FsmPackage
