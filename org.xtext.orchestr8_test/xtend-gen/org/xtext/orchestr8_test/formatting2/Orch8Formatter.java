/**
 * generated by Xtext 2.26.0
 */
package org.xtext.orchestr8_test.formatting2;

import Orchestr8.Command;
import Orchestr8.Instrument;
import Orchestr8.Measure;
import Orchestr8.Mixer;
import Orchestr8.Model;
import Orchestr8.Score;
import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import org.xtext.orchestr8_test.services.Orch8GrammarAccess;

@SuppressWarnings("all")
public class Orch8Formatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private Orch8GrammarAccess _orch8GrammarAccess;
  
  protected void _format(final Model model, @Extension final IFormattableDocument document) {
    EList<Score> _scores = model.getScores();
    for (final Score score : _scores) {
      document.<Score>format(score);
    }
    EList<Instrument> _instruments = model.getInstruments();
    for (final Instrument instrument : _instruments) {
      document.<Instrument>format(instrument);
    }
    document.<Mixer>format(model.getMixer());
  }
  
  protected void _format(final Score score, @Extension final IFormattableDocument document) {
    EList<Command> _setup = score.getSetup();
    for (final Command command : _setup) {
      document.<Command>format(command);
    }
    EList<Measure> _measures = score.getMeasures();
    for (final Measure measure : _measures) {
      document.<Measure>format(measure);
    }
    EList<Command> _end = score.getEnd();
    for (final Command command_1 : _end) {
      document.<Command>format(command_1);
    }
  }
  
  public void format(final Object score, final IFormattableDocument document) {
    if (score instanceof XtextResource) {
      _format((XtextResource)score, document);
      return;
    } else if (score instanceof Score) {
      _format((Score)score, document);
      return;
    } else if (score instanceof Model) {
      _format((Model)score, document);
      return;
    } else if (score instanceof EObject) {
      _format((EObject)score, document);
      return;
    } else if (score == null) {
      _format((Void)null, document);
      return;
    } else if (score != null) {
      _format(score, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(score, document).toString());
    }
  }
}