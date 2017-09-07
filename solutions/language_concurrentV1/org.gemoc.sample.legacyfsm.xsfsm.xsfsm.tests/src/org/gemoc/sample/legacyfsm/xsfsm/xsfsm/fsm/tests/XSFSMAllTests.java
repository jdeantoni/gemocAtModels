/**
 */
package org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>XSFSM</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class XSFSMAllTests extends TestSuite {

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
		TestSuite suite = new XSFSMAllTests("XSFSM Tests");
		suite.addTest(FsmTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSFSMAllTests(String name) {
		super(name);
	}

} //XSFSMAllTests
