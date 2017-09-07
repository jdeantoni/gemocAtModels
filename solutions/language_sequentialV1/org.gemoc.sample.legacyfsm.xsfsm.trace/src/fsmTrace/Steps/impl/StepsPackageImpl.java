/**
 */
package fsmTrace.Steps.impl;

import fr.inria.diverse.trace.commons.model.trace.TracePackage;

import fsmTrace.FsmTracePackage;

import fsmTrace.States.StatesPackage;

import fsmTrace.States.fsm.impl.FsmPackageImpl;

import fsmTrace.States.impl.StatesPackageImpl;

import fsmTrace.Steps.Fsm_FSMSystem_Initialize;
import fsmTrace.Steps.Fsm_StateMachine_Run;
import fsmTrace.Steps.Fsm_StateMachine_Run_AbstractSubStep;
import fsmTrace.Steps.Fsm_StateMachine_Run_ImplicitStep;
import fsmTrace.Steps.Fsm_State_Step;
import fsmTrace.Steps.Fsm_State_Step_AbstractSubStep;
import fsmTrace.Steps.Fsm_State_Step_ImplicitStep;
import fsmTrace.Steps.Fsm_Transition_Fire;
import fsmTrace.Steps.RootImplicitStep;
import fsmTrace.Steps.SpecificStep;
import fsmTrace.Steps.StepsFactory;
import fsmTrace.Steps.StepsPackage;

import fsmTrace.impl.FsmTracePackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.FsmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StepsPackageImpl extends EPackageImpl implements StepsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fsm_FSMSystem_InitializeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fsm_StateMachine_RunEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fsm_StateMachine_Run_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fsm_StateMachine_Run_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fsm_State_StepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fsm_State_Step_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fsm_State_Step_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fsm_Transition_FireEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rootImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificStepEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see fsmTrace.Steps.StepsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StepsPackageImpl() {
		super(eNS_URI, StepsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link StepsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StepsPackage init() {
		if (isInited) return (StepsPackage)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI);

		// Obtain or create and register package
		StepsPackageImpl theStepsPackage = (StepsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StepsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StepsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TracePackage.eINSTANCE.eClass();
		FsmPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		FsmTracePackageImpl theFsmTracePackage = (FsmTracePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FsmTracePackage.eNS_URI) instanceof FsmTracePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FsmTracePackage.eNS_URI) : FsmTracePackage.eINSTANCE);
		StatesPackageImpl theStatesPackage = (StatesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) instanceof StatesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) : StatesPackage.eINSTANCE);
		FsmPackageImpl theFsmPackage_1 = (FsmPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(fsmTrace.States.fsm.FsmPackage.eNS_URI) instanceof FsmPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(fsmTrace.States.fsm.FsmPackage.eNS_URI) : fsmTrace.States.fsm.FsmPackage.eINSTANCE);

		// Create package meta-data objects
		theStepsPackage.createPackageContents();
		theFsmTracePackage.createPackageContents();
		theStatesPackage.createPackageContents();
		theFsmPackage_1.createPackageContents();

		// Initialize created meta-data
		theStepsPackage.initializePackageContents();
		theFsmTracePackage.initializePackageContents();
		theStatesPackage.initializePackageContents();
		theFsmPackage_1.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStepsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StepsPackage.eNS_URI, theStepsPackage);
		return theStepsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFsm_FSMSystem_Initialize() {
		return fsm_FSMSystem_InitializeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFsm_StateMachine_Run() {
		return fsm_StateMachine_RunEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFsm_StateMachine_Run_AbstractSubStep() {
		return fsm_StateMachine_Run_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFsm_StateMachine_Run_ImplicitStep() {
		return fsm_StateMachine_Run_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFsm_State_Step() {
		return fsm_State_StepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFsm_State_Step_AbstractSubStep() {
		return fsm_State_Step_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFsm_State_Step_ImplicitStep() {
		return fsm_State_Step_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFsm_Transition_Fire() {
		return fsm_Transition_FireEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRootImplicitStep() {
		return rootImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecificStep() {
		return specificStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificStep_EndingState() {
		return (EReference)specificStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificStep_StartingState() {
		return (EReference)specificStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepsFactory getStepsFactory() {
		return (StepsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		fsm_FSMSystem_InitializeEClass = createEClass(FSM_FSM_SYSTEM_INITIALIZE);

		fsm_StateMachine_RunEClass = createEClass(FSM_STATE_MACHINE_RUN);

		fsm_StateMachine_Run_AbstractSubStepEClass = createEClass(FSM_STATE_MACHINE_RUN_ABSTRACT_SUB_STEP);

		fsm_StateMachine_Run_ImplicitStepEClass = createEClass(FSM_STATE_MACHINE_RUN_IMPLICIT_STEP);

		fsm_State_StepEClass = createEClass(FSM_STATE_STEP);

		fsm_State_Step_AbstractSubStepEClass = createEClass(FSM_STATE_STEP_ABSTRACT_SUB_STEP);

		fsm_State_Step_ImplicitStepEClass = createEClass(FSM_STATE_STEP_IMPLICIT_STEP);

		fsm_Transition_FireEClass = createEClass(FSM_TRANSITION_FIRE);

		rootImplicitStepEClass = createEClass(ROOT_IMPLICIT_STEP);

		specificStepEClass = createEClass(SPECIFIC_STEP);
		createEReference(specificStepEClass, SPECIFIC_STEP__ENDING_STATE);
		createEReference(specificStepEClass, SPECIFIC_STEP__STARTING_STATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		TracePackage theTracePackage = (TracePackage)EPackage.Registry.INSTANCE.getEPackage(TracePackage.eNS_URI);
		fsmTrace.States.fsm.FsmPackage theFsmPackage_1 = (fsmTrace.States.fsm.FsmPackage)EPackage.Registry.INSTANCE.getEPackage(fsmTrace.States.fsm.FsmPackage.eNS_URI);
		StatesPackage theStatesPackage = (StatesPackage)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		fsm_FSMSystem_InitializeEClass.getESuperTypes().add(this.getSpecificStep());
		fsm_FSMSystem_InitializeEClass.getESuperTypes().add(theTracePackage.getSmallStep());
		EGenericType g1 = createEGenericType(this.getSpecificStep());
		fsm_StateMachine_RunEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getSequentialStep());
		EGenericType g2 = createEGenericType(this.getFsm_StateMachine_Run_AbstractSubStep());
		g1.getETypeArguments().add(g2);
		fsm_StateMachine_RunEClass.getEGenericSuperTypes().add(g1);
		fsm_StateMachine_Run_AbstractSubStepEClass.getESuperTypes().add(this.getSpecificStep());
		fsm_StateMachine_Run_ImplicitStepEClass.getESuperTypes().add(this.getFsm_StateMachine_Run_AbstractSubStep());
		fsm_StateMachine_Run_ImplicitStepEClass.getESuperTypes().add(theTracePackage.getSmallStep());
		g1 = createEGenericType(this.getFsm_StateMachine_Run_AbstractSubStep());
		fsm_State_StepEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSpecificStep());
		fsm_State_StepEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getSequentialStep());
		g2 = createEGenericType(this.getFsm_State_Step_AbstractSubStep());
		g1.getETypeArguments().add(g2);
		fsm_State_StepEClass.getEGenericSuperTypes().add(g1);
		fsm_State_Step_AbstractSubStepEClass.getESuperTypes().add(this.getSpecificStep());
		fsm_State_Step_ImplicitStepEClass.getESuperTypes().add(this.getFsm_State_Step_AbstractSubStep());
		fsm_State_Step_ImplicitStepEClass.getESuperTypes().add(theTracePackage.getSmallStep());
		fsm_Transition_FireEClass.getESuperTypes().add(this.getFsm_State_Step_AbstractSubStep());
		fsm_Transition_FireEClass.getESuperTypes().add(this.getSpecificStep());
		fsm_Transition_FireEClass.getESuperTypes().add(theTracePackage.getSmallStep());
		rootImplicitStepEClass.getESuperTypes().add(theTracePackage.getSmallStep());
		specificStepEClass.getESuperTypes().add(theTracePackage.getStep());

		// Initialize classes and features; add operations and parameters
		initEClass(fsm_FSMSystem_InitializeEClass, Fsm_FSMSystem_Initialize.class, "Fsm_FSMSystem_Initialize", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(fsm_FSMSystem_InitializeEClass, theFsmPackage_1.getTracedFSMSystem(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(fsm_StateMachine_RunEClass, Fsm_StateMachine_Run.class, "Fsm_StateMachine_Run", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(fsm_StateMachine_RunEClass, theFsmPackage_1.getTracedStateMachine(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(fsm_StateMachine_Run_AbstractSubStepEClass, Fsm_StateMachine_Run_AbstractSubStep.class, "Fsm_StateMachine_Run_AbstractSubStep", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fsm_StateMachine_Run_ImplicitStepEClass, Fsm_StateMachine_Run_ImplicitStep.class, "Fsm_StateMachine_Run_ImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fsm_State_StepEClass, Fsm_State_Step.class, "Fsm_State_Step", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(fsm_State_StepEClass, theFsmPackage_1.getTracedState(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(fsm_State_Step_AbstractSubStepEClass, Fsm_State_Step_AbstractSubStep.class, "Fsm_State_Step_AbstractSubStep", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fsm_State_Step_ImplicitStepEClass, Fsm_State_Step_ImplicitStep.class, "Fsm_State_Step_ImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fsm_Transition_FireEClass, Fsm_Transition_Fire.class, "Fsm_Transition_Fire", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(fsm_Transition_FireEClass, theFsmPackage_1.getTracedTransition(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(rootImplicitStepEClass, RootImplicitStep.class, "RootImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(specificStepEClass, SpecificStep.class, "SpecificStep", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpecificStep_EndingState(), theStatesPackage.getState(), theStatesPackage.getState_EndedSteps(), "endingState", null, 0, 1, SpecificStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificStep_StartingState(), theStatesPackage.getState(), theStatesPackage.getState_StartedSteps(), "startingState", null, 1, 1, SpecificStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //StepsPackageImpl
