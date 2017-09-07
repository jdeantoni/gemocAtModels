package org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.Buffer;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.FSMSystem;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.StateMachine;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.BufferAspect;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.FSMSystemAspectFSMSystemAspectProperties;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.StateMachineAspect;

@Aspect(className = FSMSystem.class)
@SuppressWarnings("all")
public class FSMSystemAspect {
  @Step
  @InitializeModel
  public static void initialize(final FSMSystem _self) {
	final org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.FSMSystemAspectFSMSystemAspectProperties _self_ = org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.FSMSystemAspectFSMSystemAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_initialize(_self_, _self);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "FSMSystem", "initialize");
	} else {
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IEventManager eventManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.EventManagerRegistry
				.getInstance().findEventManager(null);
		if (eventManager != null) {
			eventManager.manageEvents();
		}
		command.execute();
	}
	;
	;
}
  
  protected static void _privk3_initialize(final FSMSystemAspectFSMSystemAspectProperties _self_, final FSMSystem _self) {
    InputOutput.<String>println("init");
    EList<StateMachine> _ownedStateMachines = _self.getOwnedStateMachines();
    for (final StateMachine sm : _ownedStateMachines) {
      StateMachineAspect.initializeModel(sm);
    }
    EList<Buffer> _ownedBuffer = _self.getOwnedBuffer();
    for (final Buffer b : _ownedBuffer) {
      BufferAspect.initialize(b);
    }
    InputOutput.<String>println("finish init");
  }
}
