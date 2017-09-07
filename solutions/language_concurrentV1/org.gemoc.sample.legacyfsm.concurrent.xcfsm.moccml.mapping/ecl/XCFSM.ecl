import 'http://org.gemoc.sample.legacyfsm.xsfsm.xsfsm/fsm/'
--import 'platform:/resource/org.gemoc.sample.legacyfsm.xsfsm.xsfsm/model/XSFSM.ecore'

ECLimport "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/kernel.ccslLib" 
ECLimport "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/CCSL.ccslLib" 

package fsm

/*****
 * DSE 
 */

context FSMSystem
	def : initializeIt: Event = self.initialize()

context StateMachine
	def : runIt : Event = self.run()
	
	
/*****
 * MoCCML Mapping
 */
	
context FSMSystem
	inv initBeforeRun:
		let firstRun : Event = Expression Inf(self.ownedStateMachines.runIt) in
		Relation Precedes(initializeIt, firstRun)
		
	inv initOnlyOnce:
		let firstInitOccurrence : Event = Expression OneTickAndDie(self.initializeIt) in
		Relation Coincides(self.initializeIt, firstInitOccurrence)
		
context Buffer
	inv oneReadAtATime:
		Relation Exclusion(self.inputs.runIt)
	
	inv oneWriteAtATime:
		Relation Exclusion(self.outputs.runIt)
	
	inv WriteBufferReadNoInitialValue:
		(self.initialValue->size() = 0) implies
		let allInputWrites : Event = Expression Union(self.inputs.runIt) in
		let allOutputReads : Event = Expression Union(self.outputs.runIt) in
		Relation Precedes(allInputWrites, allOutputReads)
		
	inv WriteBufferReadWithInitialValue:
		(self.initialValue->size() > 0) implies
		let allInputWritesWIV : Event = Expression Union(self.inputs.runIt) in
		let allOutputReadsWIV : Event = Expression Union(self.outputs.runIt) in
		let initialSize : Integer = self.initialValue->size().oclAsType(Integer) in
		let allReadsButInitialOnes : Event = Expression DelayFor(allOutputReadsWIV, allOutputReadsWIV, initialSize) in
		Relation Precedes(allInputWritesWIV, allReadsButInitialOnes)

endpackage