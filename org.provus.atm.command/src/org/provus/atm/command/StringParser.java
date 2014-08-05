package org.provus.atm.command;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.provus.atm.command.CommandStandaloneSetup;
import org.provus.atm.command.command.Model;

import com.google.inject.Injector;

public class StringParser {
	private static final String DUMMY_FILE = "dummy:/example.cmd";

	public static Model parser(String content) {
		new org.eclipse.emf.mwe.utils.StandaloneSetup().setPlatformUri("../");
		Injector injector = new CommandStandaloneSetup()
				.createInjectorAndDoEMFRegistration();
		XtextResourceSet resourceSet = injector
				.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL,
				Boolean.TRUE);
		Resource resource = resourceSet.createResource(URI
				.createURI(DUMMY_FILE));
		InputStream in = new ByteArrayInputStream(content.getBytes());
		try {
			resource.load(in, resourceSet.getLoadOptions());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Model model = (Model) resource.getContents().get(0);

		return model;
	}
}
