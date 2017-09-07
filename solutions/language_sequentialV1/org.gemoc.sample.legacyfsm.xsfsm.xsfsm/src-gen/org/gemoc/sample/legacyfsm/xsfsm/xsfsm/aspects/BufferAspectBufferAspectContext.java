package org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects;

import java.util.Map;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.Buffer;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.BufferAspectBufferAspectProperties;

@SuppressWarnings("all")
public class BufferAspectBufferAspectContext {
  public final static BufferAspectBufferAspectContext INSTANCE = new BufferAspectBufferAspectContext();
  
  public static BufferAspectBufferAspectProperties getSelf(final Buffer _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.BufferAspectBufferAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Buffer, BufferAspectBufferAspectProperties> map = new java.util.WeakHashMap<org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.Buffer, org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.BufferAspectBufferAspectProperties>();
  
  public Map<Buffer, BufferAspectBufferAspectProperties> getMap() {
    return map;
  }
}
