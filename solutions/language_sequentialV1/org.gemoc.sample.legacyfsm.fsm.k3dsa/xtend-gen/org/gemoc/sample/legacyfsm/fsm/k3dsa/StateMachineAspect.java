package org.gemoc.sample.legacyfsm.fsm.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.gemoc.sample.legacyfsm.fsm.Buffer;
import org.gemoc.sample.legacyfsm.fsm.FSMSystem;
import org.gemoc.sample.legacyfsm.fsm.State;
import org.gemoc.sample.legacyfsm.fsm.StateMachine;
import org.gemoc.sample.legacyfsm.fsm.k3dsa.BufferAspect;
import org.gemoc.sample.legacyfsm.fsm.k3dsa.StateAspect;
import org.gemoc.sample.legacyfsm.fsm.k3dsa.StateMachineAspectStateMachineAspectProperties;

@Aspect(className = StateMachine.class)
@SuppressWarnings("all")
public class StateMachineAspect {
  @Step
  public static void run(final StateMachine _self) {
    final org.gemoc.sample.legacyfsm.fsm.k3dsa.StateMachineAspectStateMachineAspectProperties _self_ = org.gemoc.sample.legacyfsm.fsm.k3dsa.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		_privk3_run(_self_, _self);
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (stepManager != null) {
    	stepManager.executeStep(_self,command,"StateMachine","run");
    } else {
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IEventManager eventManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.EventManagerRegistry.getInstance().findEventManager(_self);
    	if (eventManager != null) {
    		eventManager.manageEvents();
    	}
    	command.execute();
    }
    ;;
  }
  
  public static void initializeModel(final StateMachine _self) {
    final org.gemoc.sample.legacyfsm.fsm.k3dsa.StateMachineAspectStateMachineAspectProperties _self_ = org.gemoc.sample.legacyfsm.fsm.k3dsa.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    _privk3_initializeModel(_self_, _self);;
  }
  
  public static State currentState(final StateMachine _self) {
    final org.gemoc.sample.legacyfsm.fsm.k3dsa.StateMachineAspectStateMachineAspectProperties _self_ = org.gemoc.sample.legacyfsm.fsm.k3dsa.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_currentState(_self_, _self);;
    return (org.gemoc.sample.legacyfsm.fsm.State)result;
  }
  
  public static void currentState(final StateMachine _self, final State currentState) {
    final org.gemoc.sample.legacyfsm.fsm.k3dsa.StateMachineAspectStateMachineAspectProperties _self_ = org.gemoc.sample.legacyfsm.fsm.k3dsa.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    _privk3_currentState(_self_, _self,currentState);;
  }
  
  public static String unprocessedString(final StateMachine _self) {
    final org.gemoc.sample.legacyfsm.fsm.k3dsa.StateMachineAspectStateMachineAspectProperties _self_ = org.gemoc.sample.legacyfsm.fsm.k3dsa.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_unprocessedString(_self_, _self);;
    return (java.lang.String)result;
  }
  
  public static void unprocessedString(final StateMachine _self, final String unprocessedString) {
    final org.gemoc.sample.legacyfsm.fsm.k3dsa.StateMachineAspectStateMachineAspectProperties _self_ = org.gemoc.sample.legacyfsm.fsm.k3dsa.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    _privk3_unprocessedString(_self_, _self,unprocessedString);;
  }
  
  public static String consummedString(final StateMachine _self) {
    final org.gemoc.sample.legacyfsm.fsm.k3dsa.StateMachineAspectStateMachineAspectProperties _self_ = org.gemoc.sample.legacyfsm.fsm.k3dsa.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_consummedString(_self_, _self);;
    return (java.lang.String)result;
  }
  
  public static void consummedString(final StateMachine _self, final String consummedString) {
    final org.gemoc.sample.legacyfsm.fsm.k3dsa.StateMachineAspectStateMachineAspectProperties _self_ = org.gemoc.sample.legacyfsm.fsm.k3dsa.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    _privk3_consummedString(_self_, _self,consummedString);;
  }
  
  public static String producedString(final StateMachine _self) {
    final org.gemoc.sample.legacyfsm.fsm.k3dsa.StateMachineAspectStateMachineAspectProperties _self_ = org.gemoc.sample.legacyfsm.fsm.k3dsa.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_producedString(_self_, _self);;
    return (java.lang.String)result;
  }
  
  public static void producedString(final StateMachine _self, final String producedString) {
    final org.gemoc.sample.legacyfsm.fsm.k3dsa.StateMachineAspectStateMachineAspectProperties _self_ = org.gemoc.sample.legacyfsm.fsm.k3dsa.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    _privk3_producedString(_self_, _self,producedString);;
  }
  
  protected static void _privk3_run(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self) {
    EObject _eContainer = _self.eContainer();
    EList<Buffer> _ownedBuffer = ((FSMSystem) _eContainer).getOwnedBuffer();
    for (final Buffer b : _ownedBuffer) {
      EList<StateMachine> _outputs = b.getOutputs();
      boolean _contains = _outputs.contains(_self);
      if (_contains) {
        EList<String> _currentValues = BufferAspect.currentValues(b);
        int _size = _currentValues.size();
        boolean _equals = (_size == 0);
        if (_equals) {
          return;
        }
        String _unprocessedString = StateMachineAspect.unprocessedString(_self);
        String _dequeue = BufferAspect.dequeue(b);
        String _plus = (_unprocessedString + _dequeue);
        StateMachineAspect.unprocessedString(_self, _plus);
      }
    }
    String _name = _self.getName();
    String _plus_1 = ("run SM" + _name);
    String _plus_2 = (_plus_1 + " step on ");
    String _unprocessedString_1 = StateMachineAspect.unprocessedString(_self);
    String _plus_3 = (_plus_2 + _unprocessedString_1);
    InputOutput.<String>println(_plus_3);
    try {
      State _currentState = StateMachineAspect.currentState(_self);
      String _unprocessedString_2 = StateMachineAspect.unprocessedString(_self);
      StateAspect.step(_currentState, _unprocessedString_2);
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception nt = (Exception)_t;
        String _message = nt.getMessage();
        String _plus_4 = ("Stopped due to " + _message);
        InputOutput.<String>println(_plus_4);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    EObject _eContainer_1 = _self.eContainer();
    EList<Buffer> _ownedBuffer_1 = ((FSMSystem) _eContainer_1).getOwnedBuffer();
    for (final Buffer b_1 : _ownedBuffer_1) {
      EList<StateMachine> _inputs = b_1.getInputs();
      boolean _contains_1 = _inputs.contains(_self);
      if (_contains_1) {
        String _producedString = StateMachineAspect.producedString(_self);
        BufferAspect.enqueue(b_1, _producedString);
        StateMachineAspect.producedString(_self, "");
      }
    }
  }
  
  protected static void _privk3_initializeModel(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self) {
    InputOutput.<String>println("init SM");
    State _initialState = _self.getInitialState();
    StateMachineAspect.currentState(_self, _initialState);
    StateMachineAspect.unprocessedString(_self, "");
    StateMachineAspect.consummedString(_self, "");
    StateMachineAspect.producedString(_self, "");
  }
  
  protected static State _privk3_currentState(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getCurrentState") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (org.gemoc.sample.legacyfsm.fsm.State) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.currentState;
  }
  
  protected static void _privk3_currentState(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self, final State currentState) {
    _self_.currentState = currentState; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setCurrentState")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, currentState);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
  
  protected static String _privk3_unprocessedString(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getUnprocessedString") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.lang.String) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.unprocessedString;
  }
  
  protected static void _privk3_unprocessedString(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self, final String unprocessedString) {
    _self_.unprocessedString = unprocessedString; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setUnprocessedString")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, unprocessedString);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
  
  protected static String _privk3_consummedString(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getConsummedString") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.lang.String) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.consummedString;
  }
  
  protected static void _privk3_consummedString(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self, final String consummedString) {
    _self_.consummedString = consummedString; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setConsummedString")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, consummedString);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
  
  protected static String _privk3_producedString(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getProducedString") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.lang.String) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.producedString;
  }
  
  protected static void _privk3_producedString(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self, final String producedString) {
    _self_.producedString = producedString; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setProducedString")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, producedString);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
}
