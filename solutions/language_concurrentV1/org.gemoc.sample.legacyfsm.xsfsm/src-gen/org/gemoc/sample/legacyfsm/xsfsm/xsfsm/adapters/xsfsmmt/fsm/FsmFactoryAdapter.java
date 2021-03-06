package org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.fsm;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.XSFSMMTAdaptersFactory;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.Buffer;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.FSMSystem;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.FsmFactory;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.FsmPackage;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.State;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.StateMachine;
import org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.Transition;

@SuppressWarnings("all")
public class FsmFactoryAdapter extends EFactoryImpl implements FsmFactory {
  private XSFSMMTAdaptersFactory adaptersFactory = org.gemoc.sample.legacyfsm.xsfsm.xsfsm.adapters.xsfsmmt.XSFSMMTAdaptersFactory.getInstance();
  
  private org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.FsmFactory fsmAdaptee = org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.FsmFactory.eINSTANCE;
  
  @Override
  public StateMachine createStateMachine() {
    return adaptersFactory.createStateMachineAdapter(fsmAdaptee.createStateMachine(), null);
  }
  
  @Override
  public State createState() {
    return adaptersFactory.createStateAdapter(fsmAdaptee.createState(), null);
  }
  
  @Override
  public Transition createTransition() {
    return adaptersFactory.createTransitionAdapter(fsmAdaptee.createTransition(), null);
  }
  
  @Override
  public FSMSystem createFSMSystem() {
    return adaptersFactory.createFSMSystemAdapter(fsmAdaptee.createFSMSystem(), null);
  }
  
  @Override
  public Buffer createBuffer() {
    return adaptersFactory.createBufferAdapter(fsmAdaptee.createBuffer(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getFsmPackage();
  }
  
  public FsmPackage getFsmPackage() {
    return org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.FsmPackage.eINSTANCE;
  }
}
