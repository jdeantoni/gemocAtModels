package org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.fsm;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.XSFSMMTAdaptersFactory;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.FSMSystem;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.Buffer;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.StateMachine;

@SuppressWarnings("all")
public class FSMSystemAdapter extends EObjectAdapter<FSMSystem> implements org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.FSMSystem {
  private XSFSMMTAdaptersFactory adaptersFactory;
  
  public FSMSystemAdapter() {
    super(org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.XSFSMMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.XSFSMMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getName() {
    return adaptee.getName();
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o);
  }
  
  private EList<StateMachine> ownedStateMachines_;
  
  @Override
  public EList<StateMachine> getOwnedStateMachines() {
    if (ownedStateMachines_ == null)
    	ownedStateMachines_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedStateMachines(), adaptersFactory, eResource);
    return ownedStateMachines_;
  }
  
  private EList<Buffer> ownedBuffer_;
  
  @Override
  public EList<Buffer> getOwnedBuffer() {
    if (ownedBuffer_ == null)
    	ownedBuffer_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedBuffer(), adaptersFactory, eResource);
    return ownedBuffer_;
  }
  
  @Override
  public void initialize(final org.eclipse.emf.common.util.EList<java.lang.String> args) {
    org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.FSMSystemAspect.initialize(adaptee, args
    );
  }
  
  @Override
  public void main() {
    org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.FSMSystemAspect.main(adaptee);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.FsmPackage.eINSTANCE.getFSMSystem();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.FsmPackage.FSM_SYSTEM__NAME:
    		return getName();
    	case org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.FsmPackage.FSM_SYSTEM__OWNED_STATE_MACHINES:
    		return getOwnedStateMachines();
    	case org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.FsmPackage.FSM_SYSTEM__OWNED_BUFFER:
    		return getOwnedBuffer();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.FsmPackage.FSM_SYSTEM__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.FsmPackage.FSM_SYSTEM__OWNED_STATE_MACHINES:
    		return getOwnedStateMachines() != null && !getOwnedStateMachines().isEmpty();
    	case org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.FsmPackage.FSM_SYSTEM__OWNED_BUFFER:
    		return getOwnedBuffer() != null && !getOwnedBuffer().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.FsmPackage.FSM_SYSTEM__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.FsmPackage.FSM_SYSTEM__OWNED_STATE_MACHINES:
    		getOwnedStateMachines().clear();
    		getOwnedStateMachines().addAll((Collection) newValue);
    		return;
    	case org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.FsmPackage.FSM_SYSTEM__OWNED_BUFFER:
    		getOwnedBuffer().clear();
    		getOwnedBuffer().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
