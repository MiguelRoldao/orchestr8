/*
 * generated by Xtext 2.26.0
 */
package org.xtext.orchestr8_test.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.xtext.orchestr8_test.ui.internal.Orchestr8_testActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class Orch8ExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(Orchestr8_testActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		Orchestr8_testActivator activator = Orchestr8_testActivator.getInstance();
		return activator != null ? activator.getInjector(Orchestr8_testActivator.ORG_XTEXT_ORCHESTR8_TEST_ORCH8) : null;
	}

}
