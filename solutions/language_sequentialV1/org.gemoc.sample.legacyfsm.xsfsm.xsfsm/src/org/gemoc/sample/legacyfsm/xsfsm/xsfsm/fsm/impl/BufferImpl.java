/**
 */
package org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.Buffer;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.FsmPackage;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.StateMachine;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Buffer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.impl.BufferImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.impl.BufferImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.impl.BufferImpl#getInitialValue <em>Initial Value</em>}</li>
 *   <li>{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.impl.BufferImpl#getCurrentValues <em>Current Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BufferImpl extends NamedElementImpl implements Buffer {
	/**
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<StateMachine> inputs;

	/**
	 * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected EList<StateMachine> outputs;

	/**
	 * The cached value of the '{@link #getInitialValue() <em>Initial Value</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialValue()
	 * @generated
	 * @ordered
	 */
	protected EList<String> initialValue;

	/**
	 * The cached value of the '{@link #getCurrentValues() <em>Current Values</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentValues()
	 * @generated
	 * @ordered
	 */
	protected EList<String> currentValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BufferImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FsmPackage.Literals.BUFFER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StateMachine> getInputs() {
		if (inputs == null) {
			inputs = new EObjectResolvingEList<StateMachine>(StateMachine.class, this, FsmPackage.BUFFER__INPUTS);
		}
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StateMachine> getOutputs() {
		if (outputs == null) {
			outputs = new EObjectResolvingEList<StateMachine>(StateMachine.class, this, FsmPackage.BUFFER__OUTPUTS);
		}
		return outputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getInitialValue() {
		if (initialValue == null) {
			initialValue = new EDataTypeEList<String>(String.class, this, FsmPackage.BUFFER__INITIAL_VALUE);
		}
		return initialValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getCurrentValues() {
		if (currentValues == null) {
			currentValues = new EDataTypeEList<String>(String.class, this, FsmPackage.BUFFER__CURRENT_VALUES);
		}
		return currentValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initialize() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void enqueue(String v) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String dequeue() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FsmPackage.BUFFER__INPUTS:
				return getInputs();
			case FsmPackage.BUFFER__OUTPUTS:
				return getOutputs();
			case FsmPackage.BUFFER__INITIAL_VALUE:
				return getInitialValue();
			case FsmPackage.BUFFER__CURRENT_VALUES:
				return getCurrentValues();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FsmPackage.BUFFER__INPUTS:
				getInputs().clear();
				getInputs().addAll((Collection<? extends StateMachine>)newValue);
				return;
			case FsmPackage.BUFFER__OUTPUTS:
				getOutputs().clear();
				getOutputs().addAll((Collection<? extends StateMachine>)newValue);
				return;
			case FsmPackage.BUFFER__INITIAL_VALUE:
				getInitialValue().clear();
				getInitialValue().addAll((Collection<? extends String>)newValue);
				return;
			case FsmPackage.BUFFER__CURRENT_VALUES:
				getCurrentValues().clear();
				getCurrentValues().addAll((Collection<? extends String>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FsmPackage.BUFFER__INPUTS:
				getInputs().clear();
				return;
			case FsmPackage.BUFFER__OUTPUTS:
				getOutputs().clear();
				return;
			case FsmPackage.BUFFER__INITIAL_VALUE:
				getInitialValue().clear();
				return;
			case FsmPackage.BUFFER__CURRENT_VALUES:
				getCurrentValues().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FsmPackage.BUFFER__INPUTS:
				return inputs != null && !inputs.isEmpty();
			case FsmPackage.BUFFER__OUTPUTS:
				return outputs != null && !outputs.isEmpty();
			case FsmPackage.BUFFER__INITIAL_VALUE:
				return initialValue != null && !initialValue.isEmpty();
			case FsmPackage.BUFFER__CURRENT_VALUES:
				return currentValues != null && !currentValues.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (initialValue: ");
		result.append(initialValue);
		result.append(", currentValues: ");
		result.append(currentValues);
		result.append(')');
		return result.toString();
	}

} //BufferImpl
