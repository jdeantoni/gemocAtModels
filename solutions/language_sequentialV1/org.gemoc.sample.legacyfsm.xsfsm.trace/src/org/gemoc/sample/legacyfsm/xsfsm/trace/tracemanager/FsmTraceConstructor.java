package org.gemoc.sample.legacyfsm.xsfsm.trace.tracemanager;

import java.util.Collection;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import fr.inria.diverse.trace.commons.model.trace.LaunchConfiguration;
import fr.inria.diverse.trace.commons.model.trace.MSEModel;
import fr.inria.diverse.trace.commons.model.trace.SequentialStep;
import fr.inria.diverse.trace.gemoc.api.ITraceConstructor;

public class FsmTraceConstructor implements ITraceConstructor {
	private fsmTrace.SpecificTrace traceRoot;
	private MSEModel mseModel;
	private Resource executedModel;
	private final Map<EObject, EObject> exeToTraced;

	private fsmTrace.States.State lastState;

	private Resource traceResource;
	private final Deque<fsmTrace.Steps.SpecificStep> context = new LinkedList<fsmTrace.Steps.SpecificStep>();

	public FsmTraceConstructor(Resource exeModel, Resource traceResource, Map<EObject, EObject> exeToTraced) {
		this.traceResource = traceResource;
		this.executedModel = exeModel;
		this.exeToTraced = exeToTraced;
	}

	private void addInitialState() {
		if (lastState == null) {
			// Creation of the initial state
			Set<Resource> allResources = getAllExecutedModelResources();
			lastState = fsmTrace.States.StatesFactory.eINSTANCE.createState();
			for (Resource r : allResources) {
				for (TreeIterator<EObject> i = r.getAllContents(); i.hasNext();) {
					EObject o = i.next();

					if (o instanceof org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.NamedElement) {
						org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.NamedElement o_cast = (org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.NamedElement) o;
						addNewObjectToState(o_cast, lastState);
					}
				}
			}
			this.traceRoot.getStatesTrace().add(lastState);
		}
	}

	private boolean addNewObjectToState(org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.Buffer o_cast,
			fsmTrace.States.State newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			fsmTrace.States.fsm.TracedBuffer tracedObject = fsmTrace.States.fsm.FsmFactory.eINSTANCE
					.createTracedBuffer();
			tracedObject.setOriginalObject((org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.Buffer) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getFsm_tracedBuffers().add(tracedObject);

			// Creation of the first value of the field currentValues
			fsmTrace.States.Buffer_currentValues_Value firstValue_currentValues = fsmTrace.States.StatesFactory.eINSTANCE
					.createBuffer_currentValues_Value();

			firstValue_currentValues.getCurrentValues()
					.addAll((Collection<? extends java.lang.String>) o_cast.getCurrentValues());

			tracedObject.getCurrentValuesSequence().add(firstValue_currentValues);
			newState.getBuffer_currentValues_Values().add(firstValue_currentValues);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.FSMSystem o_cast,
			fsmTrace.States.State newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			fsmTrace.States.fsm.TracedFSMSystem tracedObject = fsmTrace.States.fsm.FsmFactory.eINSTANCE
					.createTracedFSMSystem();
			tracedObject.setOriginalObject((org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.FSMSystem) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getFsm_tracedFSMSystems().add(tracedObject);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.NamedElement o_cast,
			fsmTrace.States.State newState) {
		boolean added = false;
		if (o_cast instanceof org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.Transition) {
			added = addNewObjectToState((org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.Transition) o_cast, newState);
		} else if (o_cast instanceof org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.FSMSystem) {
			added = addNewObjectToState((org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.FSMSystem) o_cast, newState);
		} else if (o_cast instanceof org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.StateMachine) {
			added = addNewObjectToState((org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.StateMachine) o_cast, newState);
		} else if (o_cast instanceof org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.State) {
			added = addNewObjectToState((org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.State) o_cast, newState);
		} else if (o_cast instanceof org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.Buffer) {
			added = addNewObjectToState((org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.Buffer) o_cast, newState);
		}

		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.State o_cast,
			fsmTrace.States.State newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			fsmTrace.States.fsm.TracedState tracedObject = fsmTrace.States.fsm.FsmFactory.eINSTANCE.createTracedState();
			tracedObject.setOriginalObject((org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.State) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getFsm_tracedStates().add(tracedObject);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.StateMachine o_cast,
			fsmTrace.States.State newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			fsmTrace.States.fsm.TracedStateMachine tracedObject = fsmTrace.States.fsm.FsmFactory.eINSTANCE
					.createTracedStateMachine();
			tracedObject.setOriginalObject((org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.StateMachine) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getFsm_tracedStateMachines().add(tracedObject);

			// Creation of the first value of the field consummedString
			fsmTrace.States.StateMachine_consummedString_Value firstValue_consummedString = fsmTrace.States.StatesFactory.eINSTANCE
					.createStateMachine_consummedString_Value();

			firstValue_consummedString.setConsummedString((java.lang.String) o_cast.getConsummedString());
			tracedObject.getConsummedStringSequence().add(firstValue_consummedString);
			newState.getStateMachine_consummedString_Values().add(firstValue_consummedString);

			// Creation of the first value of the field currentState
			fsmTrace.States.StateMachine_currentState_Value firstValue_currentState = fsmTrace.States.StatesFactory.eINSTANCE
					.createStateMachine_currentState_Value();

			if (o_cast.getCurrentState() != null) {
				addNewObjectToState((org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.State) o_cast.getCurrentState(),
						newState);
				firstValue_currentState.setCurrentState(
						(fsmTrace.States.fsm.TracedState) ((fsmTrace.States.fsm.TracedState) exeToTraced
								.get(o_cast.getCurrentState())));
			} else {
				firstValue_currentState.setCurrentState((fsmTrace.States.fsm.TracedState) null);
			}

			tracedObject.getCurrentStateSequence().add(firstValue_currentState);
			newState.getStateMachine_currentState_Values().add(firstValue_currentState);

			// Creation of the first value of the field producedString
			fsmTrace.States.StateMachine_producedString_Value firstValue_producedString = fsmTrace.States.StatesFactory.eINSTANCE
					.createStateMachine_producedString_Value();

			firstValue_producedString.setProducedString((java.lang.String) o_cast.getProducedString());
			tracedObject.getProducedStringSequence().add(firstValue_producedString);
			newState.getStateMachine_producedString_Values().add(firstValue_producedString);

			// Creation of the first value of the field unprocessedString
			fsmTrace.States.StateMachine_unprocessedString_Value firstValue_unprocessedString = fsmTrace.States.StatesFactory.eINSTANCE
					.createStateMachine_unprocessedString_Value();

			firstValue_unprocessedString.setUnprocessedString((java.lang.String) o_cast.getUnprocessedString());
			tracedObject.getUnprocessedStringSequence().add(firstValue_unprocessedString);
			newState.getStateMachine_unprocessedString_Values().add(firstValue_unprocessedString);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.Transition o_cast,
			fsmTrace.States.State newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			fsmTrace.States.fsm.TracedTransition tracedObject = fsmTrace.States.fsm.FsmFactory.eINSTANCE
					.createTracedTransition();
			tracedObject.setOriginalObject((org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.Transition) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getFsm_tracedTransitions().add(tracedObject);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean copiedState = false;

	private fsmTrace.States.State copyState(fsmTrace.States.State oldState) {
		fsmTrace.States.State newState = fsmTrace.States.StatesFactory.eINSTANCE.createState();
		newState.getStateMachine_consummedString_Values().addAll(oldState.getStateMachine_consummedString_Values());
		newState.getStateMachine_currentState_Values().addAll(oldState.getStateMachine_currentState_Values());
		newState.getBuffer_currentValues_Values().addAll(oldState.getBuffer_currentValues_Values());
		newState.getStateMachine_producedString_Values().addAll(oldState.getStateMachine_producedString_Values());
		newState.getStateMachine_unprocessedString_Values().addAll(oldState.getStateMachine_unprocessedString_Values());
		copiedState = true;
		return newState;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void addState(List<org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.ModelChange> changes) {
		if (lastState == null) {
			addInitialState();
		}
		if (!changes.isEmpty()) {
			boolean stateChanged = false;
			// We start by a (shallow) copy of the last state
			// But we will have to rollback a little by replacing values that changed
			fsmTrace.States.State newState = copyState(lastState);
			for (org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.ModelChange modelChange : changes) {
				EObject o = modelChange.getChangedObject();
				// Here we must look at non-collection mutable fields
				// We must rollback the last values from the copied state, and add new values as well
				// ie. mix of remove and new
				if (modelChange instanceof org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.NonCollectionFieldModelChange) {
					stateChanged = true;

					org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.NonCollectionFieldModelChange modelChange_cast = (org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.NonCollectionFieldModelChange) modelChange;
					org.eclipse.emf.ecore.EStructuralFeature p = modelChange_cast.getChangedField();

					if (o instanceof org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.StateMachine) {
						org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.StateMachine o_cast = (org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.StateMachine) o;

						if (p.getFeatureID() == org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.FsmPackage.eINSTANCE
								.getStateMachine_ProducedString().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							fsmTrace.States.fsm.TracedStateMachine traced = (fsmTrace.States.fsm.TracedStateMachine) exeToTraced
									.get(o);
							fsmTrace.States.StateMachine_producedString_Value lastValue = traced
									.getProducedStringSequence().get(traced.getProducedStringSequence().size() - 1);
							newState.getStateMachine_producedString_Values().remove(lastValue);

							// And we create a proper new value
							fsmTrace.States.StateMachine_producedString_Value newValue = fsmTrace.States.StatesFactory.eINSTANCE
									.createStateMachine_producedString_Value();

							java.lang.String value = o_cast.getProducedString();

							newValue.setProducedString((java.lang.String) value);

							traced.getProducedStringSequence().add(newValue);
							newState.getStateMachine_producedString_Values().add(newValue);
						} else

						if (p.getFeatureID() == org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.FsmPackage.eINSTANCE
								.getStateMachine_CurrentState().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							fsmTrace.States.fsm.TracedStateMachine traced = (fsmTrace.States.fsm.TracedStateMachine) exeToTraced
									.get(o);
							fsmTrace.States.StateMachine_currentState_Value lastValue = traced.getCurrentStateSequence()
									.get(traced.getCurrentStateSequence().size() - 1);
							newState.getStateMachine_currentState_Values().remove(lastValue);

							// And we create a proper new value
							fsmTrace.States.StateMachine_currentState_Value newValue = fsmTrace.States.StatesFactory.eINSTANCE
									.createStateMachine_currentState_Value();

							fsmTrace.States.fsm.TracedState value = null;
							if (o_cast.getCurrentState() != null) {
								value = ((fsmTrace.States.fsm.TracedState) exeToTraced.get(o_cast.getCurrentState()));
							}

							newValue.setCurrentState((fsmTrace.States.fsm.TracedState) value);

							traced.getCurrentStateSequence().add(newValue);
							newState.getStateMachine_currentState_Values().add(newValue);
						} else

						if (p.getFeatureID() == org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.FsmPackage.eINSTANCE
								.getStateMachine_ConsummedString().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							fsmTrace.States.fsm.TracedStateMachine traced = (fsmTrace.States.fsm.TracedStateMachine) exeToTraced
									.get(o);
							fsmTrace.States.StateMachine_consummedString_Value lastValue = traced
									.getConsummedStringSequence().get(traced.getConsummedStringSequence().size() - 1);
							newState.getStateMachine_consummedString_Values().remove(lastValue);

							// And we create a proper new value
							fsmTrace.States.StateMachine_consummedString_Value newValue = fsmTrace.States.StatesFactory.eINSTANCE
									.createStateMachine_consummedString_Value();

							java.lang.String value = o_cast.getConsummedString();

							newValue.setConsummedString((java.lang.String) value);

							traced.getConsummedStringSequence().add(newValue);
							newState.getStateMachine_consummedString_Values().add(newValue);
						} else

						if (p.getFeatureID() == org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.FsmPackage.eINSTANCE
								.getStateMachine_UnprocessedString().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							fsmTrace.States.fsm.TracedStateMachine traced = (fsmTrace.States.fsm.TracedStateMachine) exeToTraced
									.get(o);
							fsmTrace.States.StateMachine_unprocessedString_Value lastValue = traced
									.getUnprocessedStringSequence()
									.get(traced.getUnprocessedStringSequence().size() - 1);
							newState.getStateMachine_unprocessedString_Values().remove(lastValue);

							// And we create a proper new value
							fsmTrace.States.StateMachine_unprocessedString_Value newValue = fsmTrace.States.StatesFactory.eINSTANCE
									.createStateMachine_unprocessedString_Value();

							java.lang.String value = o_cast.getUnprocessedString();

							newValue.setUnprocessedString((java.lang.String) value);

							traced.getUnprocessedStringSequence().add(newValue);
							newState.getStateMachine_unprocessedString_Values().add(newValue);
						}
					}
				}
				// Here we look at collection mutable fields
				// We must first manually find out if the collection changed...
				// If it changed we must rollback the last values from the copied state, and add new values as well
				else if (modelChange instanceof org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.PotentialCollectionFieldModelChange) {
					org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.PotentialCollectionFieldModelChange modelChange_cast = (org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.PotentialCollectionFieldModelChange) modelChange;
					org.eclipse.emf.ecore.EStructuralFeature p = modelChange_cast.getChangedField();
					if (o instanceof org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.Buffer) {
						org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.Buffer o_cast = (org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.Buffer) o;
						fsmTrace.States.fsm.TracedBuffer tracedObject = (fsmTrace.States.fsm.TracedBuffer) exeToTraced
								.get(o_cast);
						if (p.getFeatureID() == org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.FsmPackage.eINSTANCE
								.getBuffer_CurrentValues().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<fsmTrace.States.Buffer_currentValues_Value> valueSequence = tracedObject
									.getCurrentValuesSequence();
							fsmTrace.States.Buffer_currentValues_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getCurrentValues().size() == o_cast.getCurrentValues().size()) {
									java.util.Iterator<java.lang.String> it = o_cast.getCurrentValues().iterator();
									for (java.lang.String aPreviousValue : previousValue.getCurrentValues()) {
										java.lang.String aCurrentValue = it.next();
										if (!aPreviousValue.equals(aCurrentValue)) {
											change = true;
											break;
										}
									}
								} else {
									change = true;
								}
							} else {
								change = true;
							}
							if (change) {
								stateChanged = true;
								// Rollback: we remove the last value of this field from the new state
								fsmTrace.States.Buffer_currentValues_Value lastValue = tracedObject
										.getCurrentValuesSequence()
										.get(tracedObject.getCurrentValuesSequence().size() - 1);
								newState.getBuffer_currentValues_Values().remove(lastValue);
								// And we create a proper new value							
								fsmTrace.States.Buffer_currentValues_Value newValue = fsmTrace.States.StatesFactory.eINSTANCE
										.createBuffer_currentValues_Value();
								newValue.getCurrentValues()
										.addAll((Collection<? extends java.lang.String>) o_cast.getCurrentValues());
								tracedObject.getCurrentValuesSequence().add(newValue);
								newState.getBuffer_currentValues_Values().add(newValue);
							}
						}
					}
				}
			}
			if (stateChanged) {
				final fsmTrace.Steps.SpecificStep currentStep = context.peekFirst();
				if (currentStep != null && currentStep instanceof fr.inria.diverse.trace.commons.model.trace.BigStep) {
					final fsmTrace.States.State startingState = lastState;
					final fsmTrace.States.State endingState = newState;
					addImplicitStep(currentStep, startingState, endingState);
				}
				lastState = newState;
				traceRoot.getStatesTrace().add(lastState);
			} else if (copiedState) {
				newState.getStateMachine_consummedString_Values().clear();
				newState.getStateMachine_currentState_Values().clear();
				newState.getBuffer_currentValues_Values().clear();
				newState.getStateMachine_producedString_Values().clear();
				newState.getStateMachine_unprocessedString_Values().clear();
			}
			copiedState = false;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public void addStep(fr.inria.diverse.trace.commons.model.trace.Step step) {
		fsmTrace.Steps.SpecificStep step_cast = null;
		if (step != null && step instanceof fsmTrace.Steps.SpecificStep) {
			step_cast = (fsmTrace.Steps.SpecificStep) step;
			if (mseModel == null) {
				mseModel = fr.inria.diverse.trace.commons.model.trace.TraceFactory.eINSTANCE.createMSEModel();
				traceResource.getContents().add(mseModel);
			}
			mseModel.getOwnedMSEs().add(step_cast.getMseoccurrence().getMse());

			// Creating generic (or almost generic) links
			fsmTrace.States.State state = traceRoot.getStatesTrace().get(traceRoot.getStatesTrace().size() - 1);
			step_cast.setStartingState(state);
			if (!context.isEmpty() && context.getFirst() != null) {
				((SequentialStep<fsmTrace.Steps.SpecificStep>) context.getFirst()).getSubSteps().add(step_cast);
			} else {
				traceRoot.getRootStep().getSubSteps().add(step_cast);
			}

			// Adding step in its dedicated sequence/dimension
			if (step_cast instanceof fsmTrace.Steps.Fsm_FSMSystem_Initialize) {
				fsmTrace.Steps.Fsm_FSMSystem_Initialize fsm_FSMSystem_InitializeInstance = (fsmTrace.Steps.Fsm_FSMSystem_Initialize) step_cast;
				traceRoot.getFsm_FSMSystem_Initialize_Sequence().add(fsm_FSMSystem_InitializeInstance);
			} else if (step_cast instanceof fsmTrace.Steps.Fsm_State_Step) {
				fsmTrace.Steps.Fsm_State_Step fsm_State_StepInstance = (fsmTrace.Steps.Fsm_State_Step) step_cast;
				traceRoot.getFsm_State_Step_Sequence().add(fsm_State_StepInstance);
			} else if (step_cast instanceof fsmTrace.Steps.Fsm_StateMachine_Run) {
				fsmTrace.Steps.Fsm_StateMachine_Run fsm_StateMachine_RunInstance = (fsmTrace.Steps.Fsm_StateMachine_Run) step_cast;
				traceRoot.getFsm_StateMachine_Run_Sequence().add(fsm_StateMachine_RunInstance);
			} else if (step_cast instanceof fsmTrace.Steps.Fsm_Transition_Fire) {
				fsmTrace.Steps.Fsm_Transition_Fire fsm_Transition_FireInstance = (fsmTrace.Steps.Fsm_Transition_Fire) step_cast;
				traceRoot.getFsm_Transition_Fire_Sequence().add(fsm_Transition_FireInstance);
			}
		}
		context.push(step_cast);
	}

	@SuppressWarnings("unchecked")
	private void addImplicitStep(fsmTrace.Steps.SpecificStep currentStep, fsmTrace.States.State startingState,
			fsmTrace.States.State endingState) {

		fsmTrace.Steps.SpecificStep implicitStep = null;
		if (currentStep instanceof fsmTrace.Steps.Fsm_StateMachine_Run) {
			implicitStep = fsmTrace.Steps.StepsFactory.eINSTANCE.createFsm_StateMachine_Run_ImplicitStep();
		} else if (currentStep instanceof fsmTrace.Steps.Fsm_State_Step) {
			implicitStep = fsmTrace.Steps.StepsFactory.eINSTANCE.createFsm_State_Step_ImplicitStep();
		}
		if (implicitStep != null) {
			implicitStep.setStartingState(startingState);
			implicitStep.setEndingState(endingState);
			((SequentialStep<fsmTrace.Steps.SpecificStep>) currentStep).getSubSteps().add(implicitStep);

		}
	}

	@Override
	public void endStep(fr.inria.diverse.trace.commons.model.trace.Step step) {
		fsmTrace.Steps.SpecificStep popped = context.pop();
		if (popped != null)
			popped.setEndingState(lastState);
	}

	@Override
	public EObject initTrace(LaunchConfiguration launchConfiguration) {
		// Create root
		traceRoot = fsmTrace.FsmTraceFactory.eINSTANCE.createSpecificTrace();
		traceRoot.setLaunchconfiguration(launchConfiguration);

		// Create root sequential step
		fr.inria.diverse.trace.commons.model.trace.SequentialStep<fsmTrace.Steps.SpecificStep> rootStep = fr.inria.diverse.trace.commons.model.trace.TraceFactory.eINSTANCE
				.createSequentialStep();
		traceRoot.setRootStep(rootStep);

		// Put in the resource
		traceResource.getContents().add(traceRoot);

		return traceRoot;
	}

	@Override
	public void save() {
		try {
			traceResource.save(null);
		} catch (java.io.IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void save(URI uri) {
		try {
			traceResource.setURI(uri);
			traceResource.save(null);
		} catch (java.io.IOException e) {
			e.printStackTrace();
		}
	}

	private Set<Resource> getAllExecutedModelResources() {
		Set<Resource> allResources = new HashSet<>();
		allResources.add(executedModel);
		allResources.addAll(org.gemoc.commons.eclipse.emf.EMFResource.getRelatedResources(executedModel));
		allResources.removeIf(r -> r == null);
		return allResources;
	}

	@Override
	public boolean isPartialTraceConstructor() {
		return false;
	}
}
