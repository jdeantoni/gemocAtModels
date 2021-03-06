package org.gemoc.sample.legacyfsm.fsm.k3dsa;

import java.util.Map;
import org.gemoc.sample.legacyfsm.fsm.State;
import org.gemoc.sample.legacyfsm.fsm.k3dsa.StateAspectStateAspectProperties;

@SuppressWarnings("all")
public class StateAspectStateAspectContext {
  public final static StateAspectStateAspectContext INSTANCE = new StateAspectStateAspectContext();
  
  public static StateAspectStateAspectProperties getSelf(final State _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.sample.legacyfsm.fsm.k3dsa.StateAspectStateAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<State, StateAspectStateAspectProperties> map = new java.util.WeakHashMap<org.gemoc.sample.legacyfsm.fsm.State, org.gemoc.sample.legacyfsm.fsm.k3dsa.StateAspectStateAspectProperties>();
  
  public Map<State, StateAspectStateAspectProperties> getMap() {
    return map;
  }
}
