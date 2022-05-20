package org.xtext.orchestr8_test.tests;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.testing.CompilationTestHelper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@ExtendWith(InjectionExtension.class)
@InjectWith(Orch8InjectorProvider.class)
@SuppressWarnings("all")
public class Orch8CodeGenTest {
  @Inject
  @Extension
  private CompilationTestHelper _compilationTestHelper;
  
  @Test
  public void testUndefinedScore() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Score my_score {");
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
      final IAcceptor<CompilationTestHelper.Result> _function = (CompilationTestHelper.Result it) -> {
      };
      this._compilationTestHelper.compile(_builder, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
