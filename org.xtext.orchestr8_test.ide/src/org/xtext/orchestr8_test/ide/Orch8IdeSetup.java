/*
 * generated by Xtext 2.26.0
 */
package org.xtext.orchestr8_test.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.orchestr8_test.Orch8RuntimeModule;
import org.xtext.orchestr8_test.Orch8StandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class Orch8IdeSetup extends Orch8StandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new Orch8RuntimeModule(), new Orch8IdeModule()));
	}
	
}
