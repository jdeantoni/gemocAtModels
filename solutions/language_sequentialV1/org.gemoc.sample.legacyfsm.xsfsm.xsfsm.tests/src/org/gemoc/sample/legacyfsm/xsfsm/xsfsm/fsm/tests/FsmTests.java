/**
 */
package org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>fsm</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class FsmTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new FsmTests("fsm Tests");
		suite.addTestSuite(StateMachineTest.class);
		suite.addTestSuite(StateTest.class);
		suite.addTestSuite(TransitionTest.class);
		suite.addTestSuite(FSMSystemTest.class);
		suite.addTestSuite(BufferTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FsmTests(String name) {
		super(name);
	}

} //FsmTests