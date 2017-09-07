/**
 */
package fsmTrace.States;

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
 * @see fsmTrace.States.StatesFactory
 * @model kind="package"
 * @generated
 */
public interface StatesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "States";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "fsmTrace_States";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tracedclasses";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StatesPackage eINSTANCE = fsmTrace.States.impl.StatesPackageImpl.init();

	/**
	 * The meta object id for the '{@link fsmTrace.States.Value <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmTrace.States.Value
	 * @see fsmTrace.States.impl.StatesPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 6;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__STATES_NO_OPPOSITE = 0;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link fsmTrace.States.impl.Buffer_currentValues_ValueImpl <em>Buffer current Values Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmTrace.States.impl.Buffer_currentValues_ValueImpl
	 * @see fsmTrace.States.impl.StatesPackageImpl#getBuffer_currentValues_Value()
	 * @generated
	 */
	int BUFFER_CURRENT_VALUES_VALUE = 0;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_CURRENT_VALUES_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Current Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_CURRENT_VALUES_VALUE__CURRENT_VALUES = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_CURRENT_VALUES_VALUE__PARENT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_CURRENT_VALUES_VALUE__STATES = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Buffer current Values Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_CURRENT_VALUES_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link fsmTrace.States.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmTrace.States.impl.StateImpl
	 * @see fsmTrace.States.impl.StatesPackageImpl#getState()
	 * @generated
	 */
	int STATE = 1;

	/**
	 * The feature id for the '<em><b>Buffer current Values Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__BUFFER_CURRENT_VALUES_VALUES = 0;

	/**
	 * The feature id for the '<em><b>Ended Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ENDED_STEPS = 1;

	/**
	 * The feature id for the '<em><b>Started Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__STARTED_STEPS = 2;

	/**
	 * The feature id for the '<em><b>State Machine consummed String Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__STATE_MACHINE_CONSUMMED_STRING_VALUES = 3;

	/**
	 * The feature id for the '<em><b>State Machine current State Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__STATE_MACHINE_CURRENT_STATE_VALUES = 4;

	/**
	 * The feature id for the '<em><b>State Machine produced String Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__STATE_MACHINE_PRODUCED_STRING_VALUES = 5;

	/**
	 * The feature id for the '<em><b>State Machine unprocessed String Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__STATE_MACHINE_UNPROCESSED_STRING_VALUES = 6;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link fsmTrace.States.impl.StateMachine_consummedString_ValueImpl <em>State Machine consummed String Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmTrace.States.impl.StateMachine_consummedString_ValueImpl
	 * @see fsmTrace.States.impl.StatesPackageImpl#getStateMachine_consummedString_Value()
	 * @generated
	 */
	int STATE_MACHINE_CONSUMMED_STRING_VALUE = 2;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_CONSUMMED_STRING_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Consummed String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_CONSUMMED_STRING_VALUE__CONSUMMED_STRING = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_CONSUMMED_STRING_VALUE__PARENT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_CONSUMMED_STRING_VALUE__STATES = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>State Machine consummed String Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_CONSUMMED_STRING_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link fsmTrace.States.impl.StateMachine_currentState_ValueImpl <em>State Machine current State Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmTrace.States.impl.StateMachine_currentState_ValueImpl
	 * @see fsmTrace.States.impl.StatesPackageImpl#getStateMachine_currentState_Value()
	 * @generated
	 */
	int STATE_MACHINE_CURRENT_STATE_VALUE = 3;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_CURRENT_STATE_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Current State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_CURRENT_STATE_VALUE__CURRENT_STATE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_CURRENT_STATE_VALUE__PARENT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_CURRENT_STATE_VALUE__STATES = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>State Machine current State Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_CURRENT_STATE_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link fsmTrace.States.impl.StateMachine_producedString_ValueImpl <em>State Machine produced String Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmTrace.States.impl.StateMachine_producedString_ValueImpl
	 * @see fsmTrace.States.impl.StatesPackageImpl#getStateMachine_producedString_Value()
	 * @generated
	 */
	int STATE_MACHINE_PRODUCED_STRING_VALUE = 4;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_PRODUCED_STRING_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_PRODUCED_STRING_VALUE__PARENT = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Produced String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_PRODUCED_STRING_VALUE__PRODUCED_STRING = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_PRODUCED_STRING_VALUE__STATES = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>State Machine produced String Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_PRODUCED_STRING_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link fsmTrace.States.impl.StateMachine_unprocessedString_ValueImpl <em>State Machine unprocessed String Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmTrace.States.impl.StateMachine_unprocessedString_ValueImpl
	 * @see fsmTrace.States.impl.StatesPackageImpl#getStateMachine_unprocessedString_Value()
	 * @generated
	 */
	int STATE_MACHINE_UNPROCESSED_STRING_VALUE = 5;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_UNPROCESSED_STRING_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_UNPROCESSED_STRING_VALUE__PARENT = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_UNPROCESSED_STRING_VALUE__STATES = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Unprocessed String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_UNPROCESSED_STRING_VALUE__UNPROCESSED_STRING = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>State Machine unprocessed String Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_UNPROCESSED_STRING_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;


	/**
	 * Returns the meta object for class '{@link fsmTrace.States.Buffer_currentValues_Value <em>Buffer current Values Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Buffer current Values Value</em>'.
	 * @see fsmTrace.States.Buffer_currentValues_Value
	 * @generated
	 */
	EClass getBuffer_currentValues_Value();

	/**
	 * Returns the meta object for the attribute list '{@link fsmTrace.States.Buffer_currentValues_Value#getCurrentValues <em>Current Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Current Values</em>'.
	 * @see fsmTrace.States.Buffer_currentValues_Value#getCurrentValues()
	 * @see #getBuffer_currentValues_Value()
	 * @generated
	 */
	EAttribute getBuffer_currentValues_Value_CurrentValues();

	/**
	 * Returns the meta object for the container reference '{@link fsmTrace.States.Buffer_currentValues_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see fsmTrace.States.Buffer_currentValues_Value#getParent()
	 * @see #getBuffer_currentValues_Value()
	 * @generated
	 */
	EReference getBuffer_currentValues_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link fsmTrace.States.Buffer_currentValues_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see fsmTrace.States.Buffer_currentValues_Value#getStates()
	 * @see #getBuffer_currentValues_Value()
	 * @generated
	 */
	EReference getBuffer_currentValues_Value_States();

	/**
	 * Returns the meta object for class '{@link fsmTrace.States.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see fsmTrace.States.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the reference list '{@link fsmTrace.States.State#getBuffer_currentValues_Values <em>Buffer current Values Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Buffer current Values Values</em>'.
	 * @see fsmTrace.States.State#getBuffer_currentValues_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Buffer_currentValues_Values();

	/**
	 * Returns the meta object for the reference list '{@link fsmTrace.States.State#getEndedSteps <em>Ended Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ended Steps</em>'.
	 * @see fsmTrace.States.State#getEndedSteps()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_EndedSteps();

	/**
	 * Returns the meta object for the reference list '{@link fsmTrace.States.State#getStartedSteps <em>Started Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Started Steps</em>'.
	 * @see fsmTrace.States.State#getStartedSteps()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_StartedSteps();

	/**
	 * Returns the meta object for the reference list '{@link fsmTrace.States.State#getStateMachine_consummedString_Values <em>State Machine consummed String Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>State Machine consummed String Values</em>'.
	 * @see fsmTrace.States.State#getStateMachine_consummedString_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_StateMachine_consummedString_Values();

	/**
	 * Returns the meta object for the reference list '{@link fsmTrace.States.State#getStateMachine_currentState_Values <em>State Machine current State Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>State Machine current State Values</em>'.
	 * @see fsmTrace.States.State#getStateMachine_currentState_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_StateMachine_currentState_Values();

	/**
	 * Returns the meta object for the reference list '{@link fsmTrace.States.State#getStateMachine_producedString_Values <em>State Machine produced String Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>State Machine produced String Values</em>'.
	 * @see fsmTrace.States.State#getStateMachine_producedString_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_StateMachine_producedString_Values();

	/**
	 * Returns the meta object for the reference list '{@link fsmTrace.States.State#getStateMachine_unprocessedString_Values <em>State Machine unprocessed String Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>State Machine unprocessed String Values</em>'.
	 * @see fsmTrace.States.State#getStateMachine_unprocessedString_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_StateMachine_unprocessedString_Values();

	/**
	 * Returns the meta object for class '{@link fsmTrace.States.StateMachine_consummedString_Value <em>State Machine consummed String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine consummed String Value</em>'.
	 * @see fsmTrace.States.StateMachine_consummedString_Value
	 * @generated
	 */
	EClass getStateMachine_consummedString_Value();

	/**
	 * Returns the meta object for the attribute '{@link fsmTrace.States.StateMachine_consummedString_Value#getConsummedString <em>Consummed String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Consummed String</em>'.
	 * @see fsmTrace.States.StateMachine_consummedString_Value#getConsummedString()
	 * @see #getStateMachine_consummedString_Value()
	 * @generated
	 */
	EAttribute getStateMachine_consummedString_Value_ConsummedString();

	/**
	 * Returns the meta object for the container reference '{@link fsmTrace.States.StateMachine_consummedString_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see fsmTrace.States.StateMachine_consummedString_Value#getParent()
	 * @see #getStateMachine_consummedString_Value()
	 * @generated
	 */
	EReference getStateMachine_consummedString_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link fsmTrace.States.StateMachine_consummedString_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see fsmTrace.States.StateMachine_consummedString_Value#getStates()
	 * @see #getStateMachine_consummedString_Value()
	 * @generated
	 */
	EReference getStateMachine_consummedString_Value_States();

	/**
	 * Returns the meta object for class '{@link fsmTrace.States.StateMachine_currentState_Value <em>State Machine current State Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine current State Value</em>'.
	 * @see fsmTrace.States.StateMachine_currentState_Value
	 * @generated
	 */
	EClass getStateMachine_currentState_Value();

	/**
	 * Returns the meta object for the reference '{@link fsmTrace.States.StateMachine_currentState_Value#getCurrentState <em>Current State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current State</em>'.
	 * @see fsmTrace.States.StateMachine_currentState_Value#getCurrentState()
	 * @see #getStateMachine_currentState_Value()
	 * @generated
	 */
	EReference getStateMachine_currentState_Value_CurrentState();

	/**
	 * Returns the meta object for the container reference '{@link fsmTrace.States.StateMachine_currentState_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see fsmTrace.States.StateMachine_currentState_Value#getParent()
	 * @see #getStateMachine_currentState_Value()
	 * @generated
	 */
	EReference getStateMachine_currentState_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link fsmTrace.States.StateMachine_currentState_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see fsmTrace.States.StateMachine_currentState_Value#getStates()
	 * @see #getStateMachine_currentState_Value()
	 * @generated
	 */
	EReference getStateMachine_currentState_Value_States();

	/**
	 * Returns the meta object for class '{@link fsmTrace.States.StateMachine_producedString_Value <em>State Machine produced String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine produced String Value</em>'.
	 * @see fsmTrace.States.StateMachine_producedString_Value
	 * @generated
	 */
	EClass getStateMachine_producedString_Value();

	/**
	 * Returns the meta object for the container reference '{@link fsmTrace.States.StateMachine_producedString_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see fsmTrace.States.StateMachine_producedString_Value#getParent()
	 * @see #getStateMachine_producedString_Value()
	 * @generated
	 */
	EReference getStateMachine_producedString_Value_Parent();

	/**
	 * Returns the meta object for the attribute '{@link fsmTrace.States.StateMachine_producedString_Value#getProducedString <em>Produced String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Produced String</em>'.
	 * @see fsmTrace.States.StateMachine_producedString_Value#getProducedString()
	 * @see #getStateMachine_producedString_Value()
	 * @generated
	 */
	EAttribute getStateMachine_producedString_Value_ProducedString();

	/**
	 * Returns the meta object for the reference list '{@link fsmTrace.States.StateMachine_producedString_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see fsmTrace.States.StateMachine_producedString_Value#getStates()
	 * @see #getStateMachine_producedString_Value()
	 * @generated
	 */
	EReference getStateMachine_producedString_Value_States();

	/**
	 * Returns the meta object for class '{@link fsmTrace.States.StateMachine_unprocessedString_Value <em>State Machine unprocessed String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine unprocessed String Value</em>'.
	 * @see fsmTrace.States.StateMachine_unprocessedString_Value
	 * @generated
	 */
	EClass getStateMachine_unprocessedString_Value();

	/**
	 * Returns the meta object for the container reference '{@link fsmTrace.States.StateMachine_unprocessedString_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see fsmTrace.States.StateMachine_unprocessedString_Value#getParent()
	 * @see #getStateMachine_unprocessedString_Value()
	 * @generated
	 */
	EReference getStateMachine_unprocessedString_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link fsmTrace.States.StateMachine_unprocessedString_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see fsmTrace.States.StateMachine_unprocessedString_Value#getStates()
	 * @see #getStateMachine_unprocessedString_Value()
	 * @generated
	 */
	EReference getStateMachine_unprocessedString_Value_States();

	/**
	 * Returns the meta object for the attribute '{@link fsmTrace.States.StateMachine_unprocessedString_Value#getUnprocessedString <em>Unprocessed String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unprocessed String</em>'.
	 * @see fsmTrace.States.StateMachine_unprocessedString_Value#getUnprocessedString()
	 * @see #getStateMachine_unprocessedString_Value()
	 * @generated
	 */
	EAttribute getStateMachine_unprocessedString_Value_UnprocessedString();

	/**
	 * Returns the meta object for class '{@link fsmTrace.States.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see fsmTrace.States.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for the reference list '{@link fsmTrace.States.Value#getStatesNoOpposite <em>States No Opposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States No Opposite</em>'.
	 * @see fsmTrace.States.Value#getStatesNoOpposite()
	 * @see #getValue()
	 * @generated
	 */
	EReference getValue_StatesNoOpposite();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StatesFactory getStatesFactory();

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
		 * The meta object literal for the '{@link fsmTrace.States.impl.Buffer_currentValues_ValueImpl <em>Buffer current Values Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmTrace.States.impl.Buffer_currentValues_ValueImpl
		 * @see fsmTrace.States.impl.StatesPackageImpl#getBuffer_currentValues_Value()
		 * @generated
		 */
		EClass BUFFER_CURRENT_VALUES_VALUE = eINSTANCE.getBuffer_currentValues_Value();

		/**
		 * The meta object literal for the '<em><b>Current Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUFFER_CURRENT_VALUES_VALUE__CURRENT_VALUES = eINSTANCE.getBuffer_currentValues_Value_CurrentValues();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUFFER_CURRENT_VALUES_VALUE__PARENT = eINSTANCE.getBuffer_currentValues_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUFFER_CURRENT_VALUES_VALUE__STATES = eINSTANCE.getBuffer_currentValues_Value_States();

		/**
		 * The meta object literal for the '{@link fsmTrace.States.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmTrace.States.impl.StateImpl
		 * @see fsmTrace.States.impl.StatesPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Buffer current Values Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__BUFFER_CURRENT_VALUES_VALUES = eINSTANCE.getState_Buffer_currentValues_Values();

		/**
		 * The meta object literal for the '<em><b>Ended Steps</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ENDED_STEPS = eINSTANCE.getState_EndedSteps();

		/**
		 * The meta object literal for the '<em><b>Started Steps</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__STARTED_STEPS = eINSTANCE.getState_StartedSteps();

		/**
		 * The meta object literal for the '<em><b>State Machine consummed String Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__STATE_MACHINE_CONSUMMED_STRING_VALUES = eINSTANCE.getState_StateMachine_consummedString_Values();

		/**
		 * The meta object literal for the '<em><b>State Machine current State Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__STATE_MACHINE_CURRENT_STATE_VALUES = eINSTANCE.getState_StateMachine_currentState_Values();

		/**
		 * The meta object literal for the '<em><b>State Machine produced String Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__STATE_MACHINE_PRODUCED_STRING_VALUES = eINSTANCE.getState_StateMachine_producedString_Values();

		/**
		 * The meta object literal for the '<em><b>State Machine unprocessed String Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__STATE_MACHINE_UNPROCESSED_STRING_VALUES = eINSTANCE.getState_StateMachine_unprocessedString_Values();

		/**
		 * The meta object literal for the '{@link fsmTrace.States.impl.StateMachine_consummedString_ValueImpl <em>State Machine consummed String Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmTrace.States.impl.StateMachine_consummedString_ValueImpl
		 * @see fsmTrace.States.impl.StatesPackageImpl#getStateMachine_consummedString_Value()
		 * @generated
		 */
		EClass STATE_MACHINE_CONSUMMED_STRING_VALUE = eINSTANCE.getStateMachine_consummedString_Value();

		/**
		 * The meta object literal for the '<em><b>Consummed String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_MACHINE_CONSUMMED_STRING_VALUE__CONSUMMED_STRING = eINSTANCE.getStateMachine_consummedString_Value_ConsummedString();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE_CONSUMMED_STRING_VALUE__PARENT = eINSTANCE.getStateMachine_consummedString_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE_CONSUMMED_STRING_VALUE__STATES = eINSTANCE.getStateMachine_consummedString_Value_States();

		/**
		 * The meta object literal for the '{@link fsmTrace.States.impl.StateMachine_currentState_ValueImpl <em>State Machine current State Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmTrace.States.impl.StateMachine_currentState_ValueImpl
		 * @see fsmTrace.States.impl.StatesPackageImpl#getStateMachine_currentState_Value()
		 * @generated
		 */
		EClass STATE_MACHINE_CURRENT_STATE_VALUE = eINSTANCE.getStateMachine_currentState_Value();

		/**
		 * The meta object literal for the '<em><b>Current State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE_CURRENT_STATE_VALUE__CURRENT_STATE = eINSTANCE.getStateMachine_currentState_Value_CurrentState();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE_CURRENT_STATE_VALUE__PARENT = eINSTANCE.getStateMachine_currentState_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE_CURRENT_STATE_VALUE__STATES = eINSTANCE.getStateMachine_currentState_Value_States();

		/**
		 * The meta object literal for the '{@link fsmTrace.States.impl.StateMachine_producedString_ValueImpl <em>State Machine produced String Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmTrace.States.impl.StateMachine_producedString_ValueImpl
		 * @see fsmTrace.States.impl.StatesPackageImpl#getStateMachine_producedString_Value()
		 * @generated
		 */
		EClass STATE_MACHINE_PRODUCED_STRING_VALUE = eINSTANCE.getStateMachine_producedString_Value();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE_PRODUCED_STRING_VALUE__PARENT = eINSTANCE.getStateMachine_producedString_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>Produced String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_MACHINE_PRODUCED_STRING_VALUE__PRODUCED_STRING = eINSTANCE.getStateMachine_producedString_Value_ProducedString();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE_PRODUCED_STRING_VALUE__STATES = eINSTANCE.getStateMachine_producedString_Value_States();

		/**
		 * The meta object literal for the '{@link fsmTrace.States.impl.StateMachine_unprocessedString_ValueImpl <em>State Machine unprocessed String Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmTrace.States.impl.StateMachine_unprocessedString_ValueImpl
		 * @see fsmTrace.States.impl.StatesPackageImpl#getStateMachine_unprocessedString_Value()
		 * @generated
		 */
		EClass STATE_MACHINE_UNPROCESSED_STRING_VALUE = eINSTANCE.getStateMachine_unprocessedString_Value();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE_UNPROCESSED_STRING_VALUE__PARENT = eINSTANCE.getStateMachine_unprocessedString_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE_UNPROCESSED_STRING_VALUE__STATES = eINSTANCE.getStateMachine_unprocessedString_Value_States();

		/**
		 * The meta object literal for the '<em><b>Unprocessed String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_MACHINE_UNPROCESSED_STRING_VALUE__UNPROCESSED_STRING = eINSTANCE.getStateMachine_unprocessedString_Value_UnprocessedString();

		/**
		 * The meta object literal for the '{@link fsmTrace.States.Value <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmTrace.States.Value
		 * @see fsmTrace.States.impl.StatesPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '<em><b>States No Opposite</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE__STATES_NO_OPPOSITE = eINSTANCE.getValue_StatesNoOpposite();

	}

} //StatesPackage
