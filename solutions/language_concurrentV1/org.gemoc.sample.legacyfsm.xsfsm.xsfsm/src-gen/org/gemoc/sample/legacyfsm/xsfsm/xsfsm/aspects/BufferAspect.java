package org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.Buffer;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.BufferAspectBufferAspectProperties;

@Aspect(className = Buffer.class)
@SuppressWarnings("all")
public class BufferAspect {
  public static void initialize(final Buffer _self) {
	final org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.BufferAspectBufferAspectProperties _self_ = org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.BufferAspectBufferAspectContext
			.getSelf(_self);
	_privk3_initialize(_self_, _self);
	;
}
  
  public static void enqueue(final Buffer _self, final String v) {
	final org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.BufferAspectBufferAspectProperties _self_ = org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.BufferAspectBufferAspectContext
			.getSelf(_self);
	_privk3_enqueue(_self_, _self, v);
	;
}
  
  public static String dequeue(final Buffer _self) {
	final org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.BufferAspectBufferAspectProperties _self_ = org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.BufferAspectBufferAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_dequeue(_self_, _self);
	;
	return (java.lang.String) result;
}
  
  public static EList<String> currentValues(final Buffer _self) {
	final org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.BufferAspectBufferAspectProperties _self_ = org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.BufferAspectBufferAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_currentValues(_self_, _self);
	;
	return (org.eclipse.emf.common.util.EList) result;
}
  
  public static void currentValues(final Buffer _self, final EList<String> currentValues) {
    final org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.BufferAspectBufferAspectProperties _self_ = org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.BufferAspectBufferAspectContext.getSelf(_self);
    _privk3_currentValues(_self_, _self,currentValues);;
  }
  
  protected static void _privk3_initialize(final BufferAspectBufferAspectProperties _self_, final Buffer _self) {
    String _name = _self.getName();
    String _plus = ("initialize buffer " + _name);
    InputOutput.<String>println(_plus);
    EList<String> _initialValue = _self.getInitialValue();
    for (final String s : _initialValue) {
      EList<String> _currentValues = BufferAspect.currentValues(_self);
      _currentValues.add(s);
    }
  }
  
  protected static void _privk3_enqueue(final BufferAspectBufferAspectProperties _self_, final Buffer _self, final String v) {
    EList<String> _currentValues = BufferAspect.currentValues(_self);
    _currentValues.add(v);
  }
  
  protected static String _privk3_dequeue(final BufferAspectBufferAspectProperties _self_, final Buffer _self) {
    EList<String> _currentValues = BufferAspect.currentValues(_self);
    String res = _currentValues.get(0);
    EList<String> _currentValues_1 = BufferAspect.currentValues(_self);
    _currentValues_1.remove(0);
    return res;
  }
  
  protected static EList<String> _privk3_currentValues(final BufferAspectBufferAspectProperties _self_, final Buffer _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getCurrentValues") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (org.eclipse.emf.common.util.EList) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.currentValues;
  }
  
  protected static void _privk3_currentValues(final BufferAspectBufferAspectProperties _self_, final Buffer _self, final EList<String> currentValues) {
    _self_.currentValues = currentValues; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setCurrentValues")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, currentValues);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
}
