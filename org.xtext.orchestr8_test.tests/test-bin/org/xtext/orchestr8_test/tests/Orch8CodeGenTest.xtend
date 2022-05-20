package org.xtext.orchestr8_test.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.xbase.testing.CompilationTestHelper
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@ExtendWith(InjectionExtension)
@InjectWith(Orch8InjectorProvider)
class Orch8CodeGenTest {
	
	@Inject extension CompilationTestHelper
	
	@Test
	def void testUndefinedScore() {
		'''
			Score my_score {
				@1
					:1.0
						play e4 length 1.0
			}
			
			Mixer my_mixer {
				scores { my_score }
			}
		'''.compile[]
	}
}