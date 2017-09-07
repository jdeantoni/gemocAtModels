/**
 */
package fsmTrace.Steps;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fsmTrace.Steps.StepsPackage
 * @generated
 */
public interface StepsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StepsFactory eINSTANCE = fsmTrace.Steps.impl.StepsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Fsm FSM System Initialize</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fsm FSM System Initialize</em>'.
	 * @generated
	 */
	Fsm_FSMSystem_Initialize createFsm_FSMSystem_Initialize();

	/**
	 * Returns a new object of class '<em>Fsm State Machine Run</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fsm State Machine Run</em>'.
	 * @generated
	 */
	Fsm_StateMachine_Run createFsm_StateMachine_Run();

	/**
	 * Returns a new object of class '<em>Fsm State Machine Run Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fsm State Machine Run Implicit Step</em>'.
	 * @generated
	 */
	Fsm_StateMachine_Run_ImplicitStep createFsm_StateMachine_Run_ImplicitStep();

	/**
	 * Returns a new object of class '<em>Fsm State Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fsm State Step</em>'.
	 * @generated
	 */
	Fsm_State_Step createFsm_State_Step();

	/**
	 * Returns a new object of class '<em>Fsm State Step Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fsm State Step Implicit Step</em>'.
	 * @generated
	 */
	Fsm_State_Step_ImplicitStep createFsm_State_Step_ImplicitStep();

	/**
	 * Returns a new object of class '<em>Fsm Transition Fire</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fsm Transition Fire</em>'.
	 * @generated
	 */
	Fsm_Transition_Fire createFsm_Transition_Fire();

	/**
	 * Returns a new object of class '<em>Root Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root Implicit Step</em>'.
	 * @generated
	 */
	RootImplicitStep createRootImplicitStep();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StepsPackage getStepsPackage();

} //StepsFactory
