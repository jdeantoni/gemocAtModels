package org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.fsm;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.XSFSMMTAdaptersFactory;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.Buffer;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.StateMachine;

@SuppressWarnings("all")
public class BufferAdapter extends EObjectAdapter<Buffer> implements org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.Buffer {
  private XSFSMMTAdaptersFactory adaptersFactory;
  
  public BufferAdapter() {
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
  
  @Override
  public EList<String> getInitialValue() {
    return adaptee.getInitialValue();
  }
  
  private EList<StateMachine> inputs_;
  
  @Override
  public EList<StateMachine> getInputs() {
    if (inputs_ == null)
    	inputs_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getInputs(), adaptersFactory, eResource);
    return inputs_;
  }
  
  private EList<StateMachine> outputs_;
  
  @Override
  public EList<StateMachine> getOutputs() {
    if (outputs_ == null)
    	outputs_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOutputs(), adaptersFactory, eResource);
    return outputs_;
  }
  
  @Override
  public EList<String> getCurrentValues() {
    return org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.BufferAspect.currentValues(adaptee);
  }
  
  @Override
  public String dequeue() {
    return org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.BufferAspect.dequeue(adaptee);
  }
  
  @Override
  public void enqueue(final String v) {
    org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.BufferAspect.enqueue(adaptee, v
    );
  }
  
  @Override
  public void initialize() {
    org.gemoc.sample.legacyfsm.xsfsm.xsfsm.aspects.BufferAspect.initialize(adaptee);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.FsmPackage.eINSTANCE.getBuffer();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.FsmPackage.BUFFER__NAME:
    		return getName();
    	case org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.FsmPackage.BUFFER__INPUTS:
    		return getInputs();
    	case org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.FsmPackage.BUFFER__OUTPUTS:
    		return getOutputs();
    	case org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.FsmPackage.BUFFER__INITIAL_VALUE:
    		return getInitialValue();
    	case org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.FsmPackage.BUFFER__CURRENT_VALUES:
    		return getCurrentValues();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.FsmPackage.BUFFER__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.FsmPackage.BUFFER__INPUTS:
    		return getInputs() != null && !getInputs().isEmpty();
    	case org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.FsmPackage.BUFFER__OUTPUTS:
    		return getOutputs() != null && !getOutputs().isEmpty();
    	case org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.FsmPackage.BUFFER__INITIAL_VALUE:
    		return getInitialValue() != null && !getInitialValue().isEmpty();
    	case org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.FsmPackage.BUFFER__CURRENT_VALUES:
    		return getCurrentValues() != null && !getCurrentValues().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.FsmPackage.BUFFER__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.FsmPackage.BUFFER__INPUTS:
    		getInputs().clear();
    		getInputs().addAll((Collection) newValue);
    		return;
    	case org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.FsmPackage.BUFFER__OUTPUTS:
    		getOutputs().clear();
    		getOutputs().addAll((Collection) newValue);
    		return;
    	case org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.FsmPackage.BUFFER__INITIAL_VALUE:
    		getInitialValue().clear();
    		getInitialValue().addAll((Collection) newValue);
    		return;
    	case org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.FsmPackage.BUFFER__CURRENT_VALUES:
    		getCurrentValues().clear();
    		getCurrentValues().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
