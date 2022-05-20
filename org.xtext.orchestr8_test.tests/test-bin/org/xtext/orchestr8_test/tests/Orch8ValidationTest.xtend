package org.xtext.orchestr8_test.tests

import Orchestr8.Model
import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import Orchestr8.Orchestr8Package
import org.xtext.orchestr8_test.validation.Orch8Validator

@ExtendWith(InjectionExtension)
@InjectWith(Orch8InjectorProvider)
class Orch8ValidationTest {
	@Inject
	ParseHelper<Model> parseHelper
	
	@Inject
	ValidationTestHelper validator
	
	@Test
	def void invalidTimeSignature() {
		val result = parseHelper.parse('''
			Score my_score {
				@Setup
					time_signature 0/4
				@1
					:1.0
						play e4 length 1.0
			}
			
			Mixer my_mixer {
				scores { my_score }
			}
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
		
		validator.assertError(
				result,
				Orchestr8Package::eINSTANCE.cmdTimeSignature,
				Orch8Validator::INVALID_TIME_SIGNATURE_NUMERATOR,
				"Invalid time signature. The time signature's numerator must be greater than 0."
		)
	}
	
	@Test
	def void invalidBeatID() {
		val result = parseHelper.parse('''
			Score my_score {
				@1
					:0.5
						play e4 length 1.0
			}
			
			Mixer my_mixer {
				scores { my_score }
			}
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
		
		validator.assertError(
				result,
				Orchestr8Package::eINSTANCE.beat,
				Orch8Validator::INVALID_BEAT_ID,
				"Beats start at 1.0. If adding commands before the " +
					"composition starts is desirable, " +
					"consider adding them to @Setup."
		)
	}
}