/**
 */
package fsmTrace.Steps;

import fr.inria.diverse.trace.commons.model.trace.SmallStep;

import fsmTrace.States.fsm.TracedFSMSystem;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fsm FSM System Initialize</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fsmTrace.Steps.StepsPackage#getFsm_FSMSystem_Initialize()
 * @model
 * @generated
 */
public interface Fsm_FSMSystem_Initialize extends SpecificStep, SmallStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fsmTrace.States.fsm.TracedFSMSystem) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedFSMSystem getCaller();

} // Fsm_FSMSystem_Initialize
