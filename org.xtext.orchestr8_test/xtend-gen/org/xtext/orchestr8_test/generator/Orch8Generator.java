/**
 * generated by Xtext 2.26.0
 */
package org.xtext.orchestr8_test.generator;

import Orchestr8.Beat;
import Orchestr8.CmdInstrument;
import Orchestr8.CmdPlay;
import Orchestr8.CmdSet;
import Orchestr8.CmdTempo;
import Orchestr8.CmdTimeSignature;
import Orchestr8.Command;
import Orchestr8.Instrument;
import Orchestr8.Measure;
import Orchestr8.Mixer;
import Orchestr8.Model;
import Orchestr8.Parameter;
import Orchestr8.Score;
import com.google.common.base.Objects;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class Orch8Generator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    EObject _head = IterableExtensions.<EObject>head(resource.getContents());
    fsa.generateFile(resource.getURI().lastSegment().replace(".orch8", ".java"), 
      this.toJavaCode(((Model) _head)));
  }
  
  public CharSequence javaLibrary() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package folder_1;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import something;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class file_1 {}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence toJavaCode(final Model model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("// This file was automatically generated by xtext");
    _builder.newLine();
    _builder.append("// Orchestr-8");
    _builder.newLine();
    _builder.append("// 2022-05");
    _builder.newLine();
    _builder.append("// Miguel Roldao");
    _builder.newLine();
    _builder.newLine();
    _builder.append("package bin;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import java.util.ArrayList;");
    _builder.newLine();
    _builder.append("import orchestr8.fluentSound.InstrumentBuilder;");
    _builder.newLine();
    _builder.append("import orchestr8.fluentSound.ScoreBuilder;");
    _builder.newLine();
    _builder.append("import orchestr8.sound.Instrument;");
    _builder.newLine();
    _builder.append("import orchestr8.sound.Mixer;");
    _builder.newLine();
    _builder.append("import orchestr8.sound.Score;");
    _builder.newLine();
    _builder.append("import orchestr8.sound.Generator;");
    _builder.newLine();
    _builder.append("import generators.*;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    String _replace = model.eResource().getURI().lastSegment().replace(".orch8", "");
    _builder.append(_replace);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("public static void main(String[] args) {");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.newLine();
    {
      EList<Instrument> _instruments = model.getInstruments();
      for(final Instrument inst : _instruments) {
        {
          String _mode = inst.getGenerator().getMode();
          boolean _equals = Objects.equal(_mode, "custom");
          if (_equals) {
            _builder.append("\t\t");
            _builder.append("Generator g");
            String _type = inst.getGenerator().getType();
            _builder.append(_type, "\t\t");
            _builder.append(" = new ");
            String _type_1 = inst.getGenerator().getType();
            _builder.append(_type_1, "\t\t");
            _builder.append("();");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t\t");
        _builder.newLine();
      }
    }
    _builder.append("\t\t\t\t\t\t");
    _builder.newLine();
    {
      EList<Instrument> _instruments_1 = model.getInstruments();
      for(final Instrument inst_1 : _instruments_1) {
        _builder.append("\t\t");
        CharSequence _generateCode = this.generateCode(inst_1);
        _builder.append(_generateCode, "\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t\t\t\t\t");
    _builder.newLine();
    {
      EList<Score> _scores = model.getScores();
      for(final Score score : _scores) {
        _builder.append("\t\t");
        CharSequence _generateCode_1 = this.generateCode(score);
        _builder.append(_generateCode_1, "\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t\t\t\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    CharSequence _generateCode_2 = this.generateCode(model.getMixer());
    _builder.append(_generateCode_2, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateCode(final Instrument instrument) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Instrument ");
    String _name = instrument.getName();
    _builder.append(_name);
    _builder.append(" = InstrumentBuilder");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append(".builder()");
    _builder.newLine();
    {
      String _mode = instrument.getGenerator().getMode();
      boolean _equals = Objects.equal(_mode, "custom");
      if (_equals) {
        _builder.append("\t\t");
        _builder.append(".generator(g");
        String _type = instrument.getGenerator().getType();
        _builder.append(_type, "\t\t");
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("\t\t");
        _builder.append(".type(\"");
        String _type_1 = instrument.getGenerator().getType();
        _builder.append(_type_1, "\t\t");
        _builder.append("\")");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<Parameter> _parameters = instrument.getParameters();
      for(final Parameter param : _parameters) {
        _builder.append("\t\t");
        _builder.append(".parameter(\"");
        String _iD = param.getID();
        _builder.append(_iD, "\t\t");
        _builder.append("\", ");
        double _value = param.getValue();
        _builder.append(_value, "\t\t");
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.append(".build();");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateCode(final Score score) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Score ");
    String _name = score.getName();
    _builder.append(_name);
    _builder.append(" = ScoreBuilder");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append(".builder()");
    _builder.newLine();
    {
      boolean _isEmpty = score.getSetup().isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("\t\t");
        _builder.append(".setup()");
        _builder.newLine();
        {
          EList<Command> _setup = score.getSetup();
          for(final Command cmd : _setup) {
            _builder.append("\t\t");
            CharSequence _generateCode = this.generateCode(cmd);
            _builder.append(_generateCode, "\t\t");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    {
      EList<Measure> _measures = score.getMeasures();
      for(final Measure measure : _measures) {
        _builder.append("\t\t");
        _builder.append(".onMeasure(");
        int _iD = measure.getID();
        _builder.append(_iD, "\t\t");
        _builder.append(")");
        _builder.newLineIfNotEmpty();
        {
          EList<Beat> _beats = measure.getBeats();
          for(final Beat beat : _beats) {
            _builder.append("\t\t");
            _builder.append(".onBeat(");
            double _iD_1 = beat.getID();
            _builder.append(_iD_1, "\t\t");
            _builder.append(")");
            _builder.newLineIfNotEmpty();
            {
              EList<Command> _commands = beat.getCommands();
              for(final Command cmd_1 : _commands) {
                _builder.append("\t\t");
                CharSequence _generateCode_1 = this.generateCode(cmd_1);
                _builder.append(_generateCode_1, "\t\t");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
      }
    }
    {
      boolean _isEmpty_1 = score.getEnd().isEmpty();
      boolean _not_1 = (!_isEmpty_1);
      if (_not_1) {
        _builder.append("\t\t");
        _builder.append(".end()");
        _builder.newLine();
        {
          EList<Command> _end = score.getEnd();
          for(final Command cmd_2 : _end) {
            _builder.append("\t\t");
            CharSequence _generateCode_2 = this.generateCode(cmd_2);
            _builder.append(_generateCode_2, "\t\t");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("\t\t");
    _builder.append(".build(); ");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateCode(final Mixer mixer) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("ArrayList<Score> __scores__ = new ArrayList<>();");
    _builder.newLine();
    {
      EList<Score> _scores = mixer.getScores();
      for(final Score score : _scores) {
        _builder.append("__scores__.add(");
        String _name = score.getName();
        _builder.append(_name);
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("Mixer ");
    String _name_1 = mixer.getName();
    _builder.append(_name_1);
    _builder.append(" = new Mixer(__scores__);");
    _builder.newLineIfNotEmpty();
    String _name_2 = mixer.getName();
    _builder.append(_name_2);
    _builder.append(".sampling_rate = ");
    int _sampling_rate = mixer.getSampling_rate();
    _builder.append(_sampling_rate);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    {
      EList<Score> _scores_1 = mixer.getScores();
      for(final Score score_1 : _scores_1) {
        String _name_3 = score_1.getName();
        _builder.append(_name_3);
        _builder.append(".mixer = ");
        String _name_4 = mixer.getName();
        _builder.append(_name_4);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    String _name_5 = mixer.getName();
    _builder.append(_name_5);
    _builder.append(".mix();");
    _builder.newLineIfNotEmpty();
    String _name_6 = mixer.getName();
    _builder.append(_name_6);
    _builder.append(".play();");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence generateCode(final Command cmd) {
    String _type = cmd.getType();
    if (_type != null) {
      switch (_type) {
        case "set":
          return this.cmdSet(((CmdSet) cmd));
        case "tempo":
          return this.cmdTempo(((CmdTempo) cmd));
        case "instrument":
          return this.cmdInstrument(((CmdInstrument) cmd));
        case "time_signature":
          return this.cmdTimeSignature(((CmdTimeSignature) cmd));
        case "play":
          return this.cmdPlay(((CmdPlay) cmd));
        default:
          return this.cmdUnknown(cmd);
      }
    } else {
      return this.cmdUnknown(cmd);
    }
  }
  
  public CharSequence cmdSet(final CmdSet cmd) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(".set(");
    String _name = cmd.getInstrument().getName();
    _builder.append(_name);
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence cmdInstrument(final CmdInstrument cmd) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(".instrument(\"");
    String _iD = cmd.getParameter().getID();
    _builder.append(_iD);
    _builder.append("\", ");
    double _value = cmd.getParameter().getValue();
    _builder.append(_value);
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence cmdTempo(final CmdTempo cmd) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(".tempo(");
    int _bpm = cmd.getBpm();
    _builder.append(_bpm);
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence cmdTimeSignature(final CmdTimeSignature cmd) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(".timeSignature(\"");
    int _numerator = cmd.getNumerator();
    _builder.append(_numerator);
    _builder.append("/");
    int _denominator = cmd.getDenominator();
    _builder.append(_denominator);
    _builder.append("\")");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence cmdPlay(final CmdPlay cmd) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(".play(\"");
    String _note = cmd.getNote();
    _builder.append(_note);
    _builder.append("\")");
    _builder.newLineIfNotEmpty();
    _builder.append(".length(");
    double _length = cmd.getLength();
    _builder.append(_length);
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence cmdUnknown(final Command cmd) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<unknwon cmd \"");
    Class<? extends Command> _class = cmd.getClass();
    _builder.append(_class);
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence SoundCommand() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package sound;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public interface Command {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public abstract void run();");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence SoundGenerator() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package sound;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public interface Generator {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public double generate(double fpos);");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void setParameter(String parameter, double val);");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
