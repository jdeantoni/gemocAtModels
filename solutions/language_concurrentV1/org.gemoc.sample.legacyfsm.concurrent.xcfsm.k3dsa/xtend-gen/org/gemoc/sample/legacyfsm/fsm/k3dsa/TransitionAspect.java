package org.gemoc.sample.legacyfsm.fsm.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.gemoc.sample.legacyfsm.fsm.State;
import org.gemoc.sample.legacyfsm.fsm.StateMachine;
import org.gemoc.sample.legacyfsm.fsm.Transition;
import org.gemoc.sample.legacyfsm.fsm.k3dsa.StateMachineAspect;
import org.gemoc.sample.legacyfsm.fsm.k3dsa.TransitionAspectTransitionAspectProperties;

@Aspect(className = Transition.class)
@SuppressWarnings("all")
public class TransitionAspect {
  @Step
  public static void fire(final Transition _self) {
    final org.gemoc.sample.legacyfsm.fsm.k3dsa.TransitionAspectTransitionAspectProperties _self_ = org.gemoc.sample.legacyfsm.fsm.k3dsa.TransitionAspectTransitionAspectContext.getSelf(_self);
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		_privk3_fire(_self_, _self);
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (stepManager != null) {
    	stepManager.executeStep(_self,command,"Transition","fire");
    } else {
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IEventManager eventManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.EventManagerRegistry.getInstance().findEventManager(_self);
    	if (eventManager != null) {
    		eventManager.manageEvents();
    	}
    	command.execute();
    }
    ;;
  }
  
  protected static void _privk3_fire(final TransitionAspectTransitionAspectProperties _self_, final Transition _self) {
    String _output = _self.getOutput();
    InputOutput.<String>println(_output);
    State _source = _self.getSource();
    final StateMachine fsm = _source.getOwningFSM();
    State _target = _self.getTarget();
    StateMachineAspect.currentState(fsm, _target);
    String _producedString = StateMachineAspect.producedString(fsm);
    String _output_1 = _self.getOutput();
    String _plus = (_producedString + _output_1);
    StateMachineAspect.producedString(fsm, _plus);
    String _consummedString = StateMachineAspect.consummedString(fsm);
    String _input = _self.getInput();
    String _plus_1 = (_consummedString + _input);
    StateMachineAspect.consummedString(fsm, _plus_1);
    String _unprocessedString = StateMachineAspect.unprocessedString(fsm);
    String _input_1 = _self.getInput();
    int _length = _input_1.length();
    String _substring = _unprocessedString.substring(_length);
    StateMachineAspect.unprocessedString(fsm, _substring);
  }
}
