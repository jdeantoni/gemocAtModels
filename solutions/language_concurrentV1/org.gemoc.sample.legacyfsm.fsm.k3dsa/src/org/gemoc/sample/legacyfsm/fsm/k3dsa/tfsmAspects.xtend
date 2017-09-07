package org.gemoc.sample.legacyfsm.fsm.k3dsa

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.inria.diverse.k3.al.annotationprocessor.Step

import org.gemoc.sample.legacyfsm.fsm.State
import org.gemoc.sample.legacyfsm.fsm.StateMachine
import org.gemoc.sample.legacyfsm.fsm.Transition
import org.gemoc.sample.legacyfsm.fsm.FSMSystem


import static extension org.gemoc.sample.legacyfsm.fsm.k3dsa.FSMSystemAspect.*
import static extension org.gemoc.sample.legacyfsm.fsm.k3dsa.StateAspect.*
import static extension org.gemoc.sample.legacyfsm.fsm.k3dsa.BufferAspect.*

import static extension org.gemoc.sample.legacyfsm.fsm.k3dsa.StateMachineAspect.*
import static extension org.gemoc.sample.legacyfsm.fsm.k3dsa.TransitionAspect.*
import org.eclipse.emf.common.util.EList
import java.util.Scanner
import org.gemoc.sample.legacyfsm.fsm.Buffer
import java.util.ArrayList
import java.util.List

@Aspect(className=FSMSystem)
class FSMSystemAspect{
	
//	@Main
//    def public void main() {
//    	
//    	while(true){
//	    	try{	
//	   			for(StateMachine sm : _self.ownedStateMachines){
//	   				sm.run()
//	   			}
//			}  catch (Exception nt){
//				println("Stopped due to "+nt.message)
//			}
//		}
//
//	}
	
	@Step
	@InitializeModel
	def public void initialize(){
		println("init")
		for(StateMachine sm : _self.ownedStateMachines){
			sm.initializeModel()
		}
		for(Buffer b : _self.ownedBuffer){
			b.initialize();
		}
		println("finish init")
	}
	
}



@Aspect(className=Buffer)
class BufferAspect{
	public EList<String> currentValues
	
	public def void initialize(){
		println("initialize buffer "+_self.name)
		for(String s : _self.initialValue){
			_self.currentValues.add(s) 
		}
	}
	
	public def void enqueue(String v){
		_self.currentValues.add(v)
	}

	public def String dequeue(){
		var String res = _self.currentValues.get(0)
		_self.currentValues.remove(0)
		return res
	}
}

@Aspect(className=StateMachine)
class StateMachineAspect {

	public State currentState
	
	public String unprocessedString
	public String consummedString
	public String producedString 
	
	
	@Step
    def public void run() {
    	for(Buffer b: (_self.eContainer() as FSMSystem).ownedBuffer){
    		if (b.outputs.contains(_self)){
    			if (b.currentValues.size == 0){
    				return
    			}
    			_self.unprocessedString = _self.unprocessedString + b.dequeue
    		}
    	}
    	println("run SM"+_self.name+" step on "+_self.unprocessedString)
    	try{	
   			_self.currentState.step(_self.unprocessedString)
		} catch (Exception nt){
			println("Stopped due to "+nt.message)
		}
		
		for(Buffer b: (_self.eContainer() as FSMSystem).ownedBuffer){
    		if (b.inputs.contains(_self)){
    			b.enqueue(_self.producedString)
    			_self.producedString = ""
    		}
    	}
		
	}
       
      
	def public void initializeModel(){
		println("init SM")
		_self.currentState = _self.initialState;
		_self.unprocessedString = ""
		_self.consummedString = ""
		_self.producedString = ""
	}
	

}


@Aspect(className=State)
class StateAspect {
	@Step
	def public void step(String inputString) {
		// Get the valid transitions	
		val validTransitions =  _self.outgoingTransitions.filter[t | inputString.startsWith(t.input)]
		if(validTransitions.empty) {
			//throw new NoTransition()
			throw new Exception("No Transition")
		}
		if(validTransitions.size > 1) {
			//throw new NonDeterminism()
			throw new Exception("Non Determinism")
			
		}
		// Fire transition
		validTransitions.get(0).fire
	}
}

@Aspect(className=Transition)
class TransitionAspect {
	@Step
	def public void fire() {
		//println("Firing " + _self.name + " and entering " + _self.target.name)
		println(_self.output)
		val fsm = _self.source.owningFSM
		fsm.currentState = _self.target
		fsm.producedString = fsm.producedString + _self.output
		fsm.consummedString = fsm.consummedString + _self.input
		fsm.unprocessedString = fsm.unprocessedString.substring(_self.input.length)
	}
}
/* need to be enabled when feature request  */
class NoTransition extends Exception{
	
}
class NonDeterminism extends Exception{
	
}
