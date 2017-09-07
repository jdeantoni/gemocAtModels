/**
 */
package org.gemoc.sample.legacyfsm.fsm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Buffer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.sample.legacyfsm.fsm.Buffer#getInputs <em>Inputs</em>}</li>
 *   <li>{@link org.gemoc.sample.legacyfsm.fsm.Buffer#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link org.gemoc.sample.legacyfsm.fsm.Buffer#getInitialValue <em>Initial Value</em>}</li>
 * </ul>
 *
 * @see org.gemoc.sample.legacyfsm.fsm.FsmPackage#getBuffer()
 * @model
 * @generated
 */
public interface Buffer extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' reference list.
	 * The list contents are of type {@link org.gemoc.sample.legacyfsm.fsm.StateMachine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' reference list.
	 * @see org.gemoc.sample.legacyfsm.fsm.FsmPackage#getBuffer_Inputs()
	 * @model
	 * @generated
	 */
	EList<StateMachine> getInputs();

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' reference list.
	 * The list contents are of type {@link org.gemoc.sample.legacyfsm.fsm.StateMachine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outputs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' reference list.
	 * @see org.gemoc.sample.legacyfsm.fsm.FsmPackage#getBuffer_Outputs()
	 * @model
	 * @generated
	 */
	EList<StateMachine> getOutputs();

	/**
	 * Returns the value of the '<em><b>Initial Value</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Value</em>' attribute list.
	 * @see org.gemoc.sample.legacyfsm.fsm.FsmPackage#getBuffer_InitialValue()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getInitialValue();

} // Buffer
