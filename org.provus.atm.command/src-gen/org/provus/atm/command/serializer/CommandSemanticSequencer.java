package org.provus.atm.command.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.provus.atm.command.command.CommandPackage;
import org.provus.atm.command.command.ENC;
import org.provus.atm.command.command.Model;
import org.provus.atm.command.command.PASS;
import org.provus.atm.command.command.USER;
import org.provus.atm.command.services.CommandGrammarAccess;

@SuppressWarnings("all")
public class CommandSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private CommandGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == CommandPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case CommandPackage.ENC:
				if(context == grammarAccess.getCommandRule() ||
				   context == grammarAccess.getENCRule()) {
					sequence_ENC(context, (ENC) semanticObject); 
					return; 
				}
				else break;
			case CommandPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case CommandPackage.PASS:
				if(context == grammarAccess.getCommandRule() ||
				   context == grammarAccess.getPASSRule()) {
					sequence_PASS(context, (PASS) semanticObject); 
					return; 
				}
				else break;
			case CommandPackage.USER:
				if(context == grammarAccess.getCommandRule() ||
				   context == grammarAccess.getUSERRule()) {
					sequence_USER(context, (USER) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     pass=STRING
	 */
	protected void sequence_ENC(EObject context, ENC semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CommandPackage.Literals.ENC__PASS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CommandPackage.Literals.ENC__PASS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getENCAccess().getPassSTRINGTerminalRuleCall_3_0(), semanticObject.getPass());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (commands+=Command*)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     pass=STRING
	 */
	protected void sequence_PASS(EObject context, PASS semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CommandPackage.Literals.PASS__PASS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CommandPackage.Literals.PASS__PASS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPASSAccess().getPassSTRINGTerminalRuleCall_3_0(), semanticObject.getPass());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     user=STRING
	 */
	protected void sequence_USER(EObject context, USER semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CommandPackage.Literals.USER__USER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CommandPackage.Literals.USER__USER));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUSERAccess().getUserSTRINGTerminalRuleCall_3_0(), semanticObject.getUser());
		feeder.finish();
	}
}
