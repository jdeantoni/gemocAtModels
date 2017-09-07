package org.gemoc.sample.legacyfsm.fsm.k3dsa;

import java.util.Map;
import org.gemoc.sample.legacyfsm.fsm.FSMSystem;
import org.gemoc.sample.legacyfsm.fsm.k3dsa.FSMSystemAspectFSMSystemAspectProperties;

@SuppressWarnings("all")
public class FSMSystemAspectFSMSystemAspectContext {
  public final static FSMSystemAspectFSMSystemAspectContext INSTANCE = new FSMSystemAspectFSMSystemAspectContext();
  
  public static FSMSystemAspectFSMSystemAspectProperties getSelf(final FSMSystem _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.sample.legacyfsm.fsm.k3dsa.FSMSystemAspectFSMSystemAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<FSMSystem, FSMSystemAspectFSMSystemAspectProperties> map = new java.util.WeakHashMap<org.gemoc.sample.legacyfsm.fsm.FSMSystem, org.gemoc.sample.legacyfsm.fsm.k3dsa.FSMSystemAspectFSMSystemAspectProperties>();
  
  public Map<FSMSystem, FSMSystemAspectFSMSystemAspectProperties> getMap() {
    return map;
  }
}
