/**
 */
package fsmTrace.States.fsm;

import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.FSMSystem;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced FSM System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fsmTrace.States.fsm.TracedFSMSystem#getOriginalObject <em>Original Object</em>}</li>
 * </ul>
 *
 * @see fsmTrace.States.fsm.FsmPackage#getTracedFSMSystem()
 * @model
 * @generated
 */
public interface TracedFSMSystem extends TracedNamedElement {
	/**
	 * Returns the value of the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Object</em>' reference.
	 * @see #setOriginalObject(FSMSystem)
	 * @see fsmTrace.States.fsm.FsmPackage#getTracedFSMSystem_OriginalObject()
	 * @model
	 * @generated
	 */
	FSMSystem getOriginalObject();

	/**
	 * Sets the value of the '{@link fsmTrace.States.fsm.TracedFSMSystem#getOriginalObject <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Object</em>' reference.
	 * @see #getOriginalObject()
	 * @generated
	 */
	void setOriginalObject(FSMSystem value);

} // TracedFSMSystem
