/**
 */
package fsmTrace.States;

import fsmTrace.States.fsm.TracedBuffer;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Buffer current Values Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fsmTrace.States.Buffer_currentValues_Value#getCurrentValues <em>Current Values</em>}</li>
 *   <li>{@link fsmTrace.States.Buffer_currentValues_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link fsmTrace.States.Buffer_currentValues_Value#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see fsmTrace.States.StatesPackage#getBuffer_currentValues_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='null'"
 * @generated
 */
public interface Buffer_currentValues_Value extends Value {
	/**
	 * Returns the value of the '<em><b>Current Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Values</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Values</em>' attribute list.
	 * @see fsmTrace.States.StatesPackage#getBuffer_currentValues_Value_CurrentValues()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getCurrentValues();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fsmTrace.States.fsm.TracedBuffer#getCurrentValuesSequence <em>Current Values Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedBuffer)
	 * @see fsmTrace.States.StatesPackage#getBuffer_currentValues_Value_Parent()
	 * @see fsmTrace.States.fsm.TracedBuffer#getCurrentValuesSequence
	 * @model opposite="currentValuesSequence" required="true" transient="false"
	 * @generated
	 */
	TracedBuffer getParent();

	/**
	 * Sets the value of the '{@link fsmTrace.States.Buffer_currentValues_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedBuffer value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link fsmTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link fsmTrace.States.State#getBuffer_currentValues_Values <em>Buffer current Values Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see fsmTrace.States.StatesPackage#getBuffer_currentValues_Value_States()
	 * @see fsmTrace.States.State#getBuffer_currentValues_Values
	 * @model opposite="buffer_currentValues_Values" required="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getStates();'"
	 * @generated
	 */
	EList<State> getStatesNoOpposite();

} // Buffer_currentValues_Value
