/*
 * generated by Xtext
 */
package org.provus.atm.command.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import org.provus.atm.command.ui.internal.CommandActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class CommandExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return CommandActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return CommandActivator.getInstance().getInjector(CommandActivator.ORG_PROVUS_ATM_COMMAND_COMMAND);
	}
	
}