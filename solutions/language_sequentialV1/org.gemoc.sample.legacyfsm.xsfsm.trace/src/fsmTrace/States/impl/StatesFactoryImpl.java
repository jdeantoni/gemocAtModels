/**
 */
package fsmTrace.States.impl;

import fsmTrace.States.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StatesFactoryImpl extends EFactoryImpl implements StatesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StatesFactory init() {
		try {
			StatesFactory theStatesFactory = (StatesFactory)EPackage.Registry.INSTANCE.getEFactory(StatesPackage.eNS_URI);
			if (theStatesFactory != null) {
				return theStatesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StatesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case StatesPackage.BUFFER_CURRENT_VALUES_VALUE: return createBuffer_currentValues_Value();
			case StatesPackage.STATE: return createState();
			case StatesPackage.STATE_MACHINE_CONSUMMED_STRING_VALUE: return createStateMachine_consummedString_Value();
			case StatesPackage.STATE_MACHINE_CURRENT_STATE_VALUE: return createStateMachine_currentState_Value();
			case StatesPackage.STATE_MACHINE_PRODUCED_STRING_VALUE: return createStateMachine_producedString_Value();
			case StatesPackage.STATE_MACHINE_UNPROCESSED_STRING_VALUE: return createStateMachine_unprocessedString_Value();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Buffer_currentValues_Value createBuffer_currentValues_Value() {
		Buffer_currentValues_ValueImpl buffer_currentValues_Value = new Buffer_currentValues_ValueImpl();
		return buffer_currentValues_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine_consummedString_Value createStateMachine_consummedString_Value() {
		StateMachine_consummedString_ValueImpl stateMachine_consummedString_Value = new StateMachine_consummedString_ValueImpl();
		return stateMachine_consummedString_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine_currentState_Value createStateMachine_currentState_Value() {
		StateMachine_currentState_ValueImpl stateMachine_currentState_Value = new StateMachine_currentState_ValueImpl();
		return stateMachine_currentState_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine_producedString_Value createStateMachine_producedString_Value() {
		StateMachine_producedString_ValueImpl stateMachine_producedString_Value = new StateMachine_producedString_ValueImpl();
		return stateMachine_producedString_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine_unprocessedString_Value createStateMachine_unprocessedString_Value() {
		StateMachine_unprocessedString_ValueImpl stateMachine_unprocessedString_Value = new StateMachine_unprocessedString_ValueImpl();
		return stateMachine_unprocessedString_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatesPackage getStatesPackage() {
		return (StatesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StatesPackage getPackage() {
		return StatesPackage.eINSTANCE;
	}

} //StatesFactoryImpl
