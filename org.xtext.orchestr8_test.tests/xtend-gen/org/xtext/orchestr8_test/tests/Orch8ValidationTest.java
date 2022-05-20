package org.xtext.orchestr8_test.tests;

import Orchestr8.Model;
import Orchestr8.Orchestr8Package;
import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.testing.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.xtext.orchestr8_test.validation.Orch8Validator;

@ExtendWith(InjectionExtension.class)
@InjectWith(Orch8InjectorProvider.class)
@SuppressWarnings("all")
public class Orch8ValidationTest {
  @Inject
  private ParseHelper<Model> parseHelper;
  
  @Inject
  private ValidationTestHelper validator;
  
  @Test
  public void invalidTimeSignature() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Score my_score {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@Setup");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("time_signature 0/4");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@1");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append(":1.0");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("play e4 length 1.0");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("Mixer my_mixer {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("scores { my_score }");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final Model result = this.parseHelper.parse(_builder);
      Assertions.assertNotNull(result);
      final EList<Resource.Diagnostic> errors = result.eResource().getErrors();
      boolean _isEmpty = errors.isEmpty();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("Unexpected errors: ");
      String _join = IterableExtensions.join(errors, ", ");
      _builder_1.append(_join);
      Assertions.assertTrue(_isEmpty, _builder_1.toString());
      this.validator.assertError(result, 
        Orchestr8Package.eINSTANCE.getCmdTimeSignature(), 
        Orch8Validator.INVALID_TIME_SIGNATURE_NUMERATOR, 
        "Invalid time signature. The time signature\'s numerator must be greater than 0.");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void invalidBeatID() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Score my_score {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@1");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append(":0.5");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("play e4 length 1.0");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("Mixer my_mixer {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("scores { my_score }");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final Model result = this.parseHelper.parse(_builder);
      Assertions.assertNotNull(result);
      final EList<Resource.Diagnostic> errors = result.eResource().getErrors();
      boolean _isEmpty = errors.isEmpty();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("Unexpected errors: ");
      String _join = IterableExtensions.join(errors, ", ");
      _builder_1.append(_join);
      Assertions.assertTrue(_isEmpty, _builder_1.toString());
      this.validator.assertError(result, 
        Orchestr8Package.eINSTANCE.getBeat(), 
        Orch8Validator.INVALID_BEAT_ID, 
        (("Beats start at 1.0. If adding commands before the " + 
          "composition starts is desirable, ") + 
          "consider adding them to @Setup."));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
