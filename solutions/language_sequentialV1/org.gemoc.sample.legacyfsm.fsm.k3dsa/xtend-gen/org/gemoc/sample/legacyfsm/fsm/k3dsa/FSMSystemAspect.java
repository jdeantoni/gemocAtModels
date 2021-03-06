package org.gemoc.sample.legacyfsm.fsm.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.gemoc.sample.legacyfsm.fsm.Buffer;
import org.gemoc.sample.legacyfsm.fsm.FSMSystem;
import org.gemoc.sample.legacyfsm.fsm.StateMachine;
import org.gemoc.sample.legacyfsm.fsm.k3dsa.BufferAspect;
import org.gemoc.sample.legacyfsm.fsm.k3dsa.FSMSystemAspectFSMSystemAspectProperties;
import org.gemoc.sample.legacyfsm.fsm.k3dsa.StateMachineAspect;

@Aspect(className = FSMSystem.class)
@SuppressWarnings("all")
public class FSMSystemAspect {
  @Main
  public static void main(final FSMSystem _self) {
    final org.gemoc.sample.legacyfsm.fsm.k3dsa.FSMSystemAspectFSMSystemAspectProperties _self_ = org.gemoc.sample.legacyfsm.fsm.k3dsa.FSMSystemAspectFSMSystemAspectContext.getSelf(_self);
    _privk3_main(_self_, _self);;
  }
  
  @Step
  @InitializeModel
  public static void initialize(final FSMSystem _self, final EList<String> args) {
    final org.gemoc.sample.legacyfsm.fsm.k3dsa.FSMSystemAspectFSMSystemAspectProperties _self_ = org.gemoc.sample.legacyfsm.fsm.k3dsa.FSMSystemAspectFSMSystemAspectContext.getSelf(_self);
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		_privk3_initialize(_self_, _self,args);
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (stepManager != null) {
    	stepManager.executeStep(_self,command,"FSMSystem","initialize");
    } else {
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IEventManager eventManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.EventManagerRegistry.getInstance().findEventManager(_self);
    	if (eventManager != null) {
    		eventManager.manageEvents();
    	}
    	command.execute();
    }
    ;;
  }
  
  protected static void _privk3_main(final FSMSystemAspectFSMSystemAspectProperties _self_, final FSMSystem _self) {
    while (true) {
      try {
        EList<StateMachine> _ownedStateMachines = _self.getOwnedStateMachines();
        for (final StateMachine sm : _ownedStateMachines) {
          StateMachineAspect.run(sm);
        }
      } catch (final Throwable _t) {
        if (_t instanceof Exception) {
          final Exception nt = (Exception)_t;
          String _message = nt.getMessage();
          String _plus = ("Stopped due to " + _message);
          InputOutput.<String>println(_plus);
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    }
  }
  
  protected static void _privk3_initialize(final FSMSystemAspectFSMSystemAspectProperties _self_, final FSMSystem _self, final EList<String> args) {
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
