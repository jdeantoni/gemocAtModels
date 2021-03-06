package org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.fsmmt;

import fr.inria.diverse.melange.adapters.ResourceAdapter;
import java.io.IOException;
import java.util.Set;
import org.eclipse.emf.common.util.URI;
import org.gemoc.sample.legacyfsm.fsm.FSMMT;
import org.gemoc.sample.legacyfsm.fsm.FsmFactory;

@SuppressWarnings("all")
public class XSFSMAdapter extends ResourceAdapter implements FSMMT {
  public XSFSMAdapter() {
    super(org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.fsmmt.FSMMTAdaptersFactory.getInstance());
  }
  
  @Override
  public FsmFactory getFsmFactory() {
    return new org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.fsmmt.fsm.FsmFactoryAdapter();
  }
  
  @Override
  public Set getFactories() {
    java.util.Set<org.eclipse.emf.ecore.EFactory> res = new java.util.HashSet<org.eclipse.emf.ecore.EFactory>();
    res.add(getFsmFactory());
    return res;
  }
  
  @Override
  public void save(final String uri) throws IOException {
    this.adaptee.setURI(URI.createURI(uri));
    this.adaptee.save(null);
  }
}
