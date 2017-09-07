package org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects;

import java.util.Map;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.FSMSystem;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.FSMSystemAspectFSMSystemAspectProperties;

@SuppressWarnings("all")
public class FSMSystemAspectFSMSystemAspectContext {
  public final static FSMSystemAspectFSMSystemAspectContext INSTANCE = new FSMSystemAspectFSMSystemAspectContext();
  
  public static FSMSystemAspectFSMSystemAspectProperties getSelf(final FSMSystem _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.FSMSystemAspectFSMSystemAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<FSMSystem, FSMSystemAspectFSMSystemAspectProperties> map = new java.util.WeakHashMap<org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.FSMSystem, org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.FSMSystemAspectFSMSystemAspectProperties>();
  
  public Map<FSMSystem, FSMSystemAspectFSMSystemAspectProperties> getMap() {
    return map;
  }
}
