/**
 */
package fsmTrace.States.fsm;

import fsmTrace.States.Buffer_currentValues_Value;

import org.eclipse.emf.common.util.EList;

import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.Buffer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Buffer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fsmTrace.States.fsm.TracedBuffer#getCurrentValuesSequence <em>Current Values Sequence</em>}</li>
 *   <li>{@link fsmTrace.States.fsm.TracedBuffer#getOriginalObject <em>Original Object</em>}</li>
 * </ul>
 *
 * @see fsmTrace.States.fsm.FsmPackage#getTracedBuffer()
 * @model
 * @generated
 */
public interface TracedBuffer extends TracedNamedElement {
	/**
	 * Returns the value of the '<em><b>Current Values Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link fsmTrace.States.Buffer_currentValues_Value}.
	 * It is bidirectional and its opposite is '{@link fsmTrace.States.Buffer_currentValues_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Values Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Values Sequence</em>' containment reference list.
	 * @see fsmTrace.States.fsm.FsmPackage#getTracedBuffer_CurrentValuesSequence()
	 * @see fsmTrace.States.Buffer_currentValues_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Buffer_currentValues_Value> getCurrentValuesSequence();

	/**
	 * Returns the value of the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Object</em>' reference.
	 * @see #setOriginalObject(Buffer)
	 * @see fsmTrace.States.fsm.FsmPackage#getTracedBuffer_OriginalObject()
	 * @model
	 * @generated
	 */
	Buffer getOriginalObject();

	/**
	 * Sets the value of the '{@link fsmTrace.States.fsm.TracedBuffer#getOriginalObject <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Object</em>' reference.
	 * @see #getOriginalObject()
	 * @generated
	 */
	void setOriginalObject(Buffer value);

} // TracedBuffer
