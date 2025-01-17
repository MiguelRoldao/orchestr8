/*
 * generated by Xtext 2.26.0
 */
package org.xtext.orchestr8_test.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import Orchestr8.Model
import Orchestr8.Instrument
import Orchestr8.Score
import Orchestr8.Mixer
import Orchestr8.Command
import Orchestr8.CmdSet
import Orchestr8.CmdTempo
import Orchestr8.CmdInstrument
import Orchestr8.CmdTimeSignature
import Orchestr8.CmdPlay


/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class Orch8Generator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		fsa.generateFile(resource.URI.lastSegment.replace(".orch8", ".java"),
			toJavaCode(resource.contents.head as Model)
		)
//		System.out.println(resource.URI.lastSegment)
		//fsa.generateFile("folder_1/file_1.txt", javaLibrary())
		
		//var file = new File("")
		//fsa.generateFile("folder_1/test.txt", addIncludeFile)
		
		//fsa.generateFile("folder_1/test.txt", fsa.readTextFile("Score.java"))
		//fsa.
//		fsa.generateFile('greetings.txt', 'People to greet: ' + 
//			resource.allContents
//				.filter(Greeting)
//				.map[name]
//				.join(', '))
	}
	
	
	def javaLibrary() {
		'''
		package folder_1;
		
		import something;
		
		public class file_1 {}
		'''
	}
	
	def toJavaCode(Model model) {
		'''
		// This file was automatically generated by xtext
		// Orchestr-8
		// 2022-05
		// Miguel Roldao
		
		package bin;
		
		import java.util.ArrayList;
		import orchestr8.fluentSound.InstrumentBuilder;
		import orchestr8.fluentSound.ScoreBuilder;
		import orchestr8.sound.Instrument;
		import orchestr8.sound.Mixer;
		import orchestr8.sound.Score;
		import orchestr8.sound.Generator;
		import generators.*;
		
		public class �model.eResource.URI.lastSegment.replace(".orch8", "")� {
			public static void main(String[] args) {
				��� Generate Custom sound generators, if any
				
				�FOR inst : model.instruments�
					�IF inst.generator.mode == "custom"�
						Generator g�inst.generator.type� = new �inst.generator.type�();
					�ENDIF�
					
				�ENDFOR�
				��� Generate instruments
				
				�FOR inst : model.instruments�
					�inst.generateCode�
				�ENDFOR�
				��� Generate scores
				
				�FOR score : model.scores�
					�score.generateCode�
				�ENDFOR�
				��� Generate the only mixer
				
				�model.mixer.generateCode�
			}
			
		}
		'''
	}
	
	def generateCode(Instrument instrument) {
		'''
		Instrument �instrument.name� = InstrumentBuilder
				.builder()
				�IF instrument.generator.mode == "custom"�
					.generator(g�instrument.generator.type�)
				�ELSE�
					.type("�instrument.generator.type�")
				�ENDIF�
				�FOR param : instrument.parameters�
					.parameter("�param.ID�", �param.value�)
				�ENDFOR�
				.build();
		'''
	}
	
	def generateCode(Score score) {
		'''
		Score �score.name� = ScoreBuilder
				.builder()
				�IF ! score.setup.isEmpty()�
					.setup()
					�FOR cmd : score.setup�
						�cmd.generateCode()�
					�ENDFOR�
				�ENDIF�
				�FOR measure : score.measures�
					.onMeasure(�measure.ID�)
					�FOR beat : measure.beats�
						.onBeat(�beat.ID�)
						�FOR cmd : beat.commands�
							�cmd.generateCode()�
						�ENDFOR�
					�ENDFOR�
				�ENDFOR�
				�IF ! score.end.isEmpty()�
					.end()
					�FOR cmd : score.end�
						�cmd.generateCode()�
					�ENDFOR�
				�ENDIF�
				.build(); 
		'''
	}
	
	// currently only the first score is mixed
	def generateCode(Mixer mixer) {
		'''
		ArrayList<Score> __scores__ = new ArrayList<>();
		�FOR score : mixer.scores�
			__scores__.add(�score.name�);
		�ENDFOR�
		Mixer �mixer.name� = new Mixer(__scores__);
		�mixer.name�.sampling_rate = �mixer.sampling_rate�;
		�FOR score : mixer.scores�
			�score.name�.mixer = �mixer.name�;
		�ENDFOR�
		�mixer.name�.mix();
		�mixer.name�.play();
		'''
	}
	
	
	
	def generateCode(Command cmd) {
		switch(cmd.type) {
			case "set": return cmdSet(cmd as CmdSet)
			case "tempo": return cmdTempo(cmd as CmdTempo)
			case "instrument": return cmdInstrument(cmd as CmdInstrument)
			case "time_signature": return cmdTimeSignature(cmd as CmdTimeSignature)
			case "play": return cmdPlay(cmd as CmdPlay)
			default: return cmdUnknown(cmd)
		}
	}
	
	def cmdSet(CmdSet cmd) {
		'''
		.set(�cmd.instrument.name�)
		'''
	}
	
	def cmdInstrument(CmdInstrument cmd) {
		'''
		.instrument("�cmd.parameter.ID�", �cmd.parameter.value�)
		'''
	}
	
	def cmdTempo(CmdTempo cmd) {
		'''
		.tempo(�cmd.bpm�)
		'''
	}
	
	def cmdTimeSignature(CmdTimeSignature cmd) {
		'''
		.timeSignature("�cmd.numerator�/�cmd.denominator�")
		'''
	}
	
	def cmdPlay(CmdPlay cmd) {
		'''
		.play("�cmd.note�")
		.length(�cmd.length�)
		'''
	}
	
	def cmdUnknown(Command cmd) {
		'''
		<unknwon cmd "�cmd.getClass()�">
		'''
	}
	
	
	
	def SoundCommand() {
		'''
		package sound;
		
		public interface Command {
			public abstract void run();
		}
		'''
	}
	
	def SoundGenerator() {
		'''
		package sound;
		
		public interface Generator {
			public double generate(double fpos);
		
			public void setParameter(String parameter, double val);
		}
		'''
	}
	
}
