package org.gemoc.sample.legacyfsm.fsm.k3dsa;

import java.util.Map;
import org.gemoc.sample.legacyfsm.fsm.Buffer;
import org.gemoc.sample.legacyfsm.fsm.k3dsa.BufferAspectBufferAspectProperties;

@SuppressWarnings("all")
public class BufferAspectBufferAspectContext {
  public final static BufferAspectBufferAspectContext INSTANCE = new BufferAspectBufferAspectContext();
  
  public static BufferAspectBufferAspectProperties getSelf(final Buffer _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.sample.legacyfsm.fsm.k3dsa.BufferAspectBufferAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Buffer, BufferAspectBufferAspectProperties> map = new java.util.WeakHashMap<org.gemoc.sample.legacyfsm.fsm.Buffer, org.gemoc.sample.legacyfsm.fsm.k3dsa.BufferAspectBufferAspectProperties>();
  
  public Map<Buffer, BufferAspectBufferAspectProperties> getMap() {
    return map;
  }
}
