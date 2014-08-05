package org.provus.atm.command

import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage
import org.eclipse.emf.common.util.BasicEMap
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EcoreFactory
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.xtext.GeneratedMetamodel
import org.eclipse.xtext.xtext.ecoreInference.IXtext2EcorePostProcessor

class MyXtext2EcorePostProcessor implements IXtext2EcorePostProcessor {
     
    override void process(GeneratedMetamodel metamodel) {
        metamodel.EPackage.process
    }
     
    def process(EPackage p) {
        for (c : p.EClassifiers.filter(typeof(EClass))) {
            c.handle
        }
    }
     
    def handle (EClass c) {
        val op = EcoreFactory::eINSTANCE.createEOperation
        op.name = "toString"
        op.EType = EcorePackage::eINSTANCE.EString
        val body = EcoreFactory::eINSTANCE.createEAnnotation
        body.source = GenModelPackage::eNS_URI
        val map = EcoreFactory::eINSTANCE.create(EcorePackage::eINSTANCE.getEStringToStringMapEntry()) as BasicEMap.Entry<String,String>
        map.key = "body"
        
        if (c.name.equals("Model")){
        	map.value = modelToString.toString
        }else if(c.name.equals("Command")){
        	map.value = commandToString.toString
        }else if(c.name.equals("ENC")){
        	map.value = encToString.toString
        }else if(c.name.equals("PASS")){
        	map.value = passToString.toString
        }else if(c.name.equals("USER")){
        	map.value = userToString.toString
        }
        
        body.details.add(map)
        op.EAnnotations += body
        c.EOperations += op
    }
    
    def modelToString(){
    	'''
		TreeIterator<EObject> eAllContents = this.eAllContents();
		
		StringBuilder sb = new StringBuilder();
		for (TreeIterator<EObject> iterator = eAllContents; iterator.hasNext();) {
			EObject eObject = (EObject) iterator.next();
			sb.append(eObject.toString() + " ");
		}
		sb.deleteCharAt(sb.length() - 1);
		
		return sb.toString();
    	'''
    }
    
    def commandToString(){
    	'''
		return "";
    	'''
    }
    
    def encToString(){
    	'''
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append("ENC{");
		result.append("\"" + pass + "\"");
		result.append('}');
		return result.toString();
    	'''
    }
    
    def passToString(){
    	'''
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append("pass=");
		result.append("\"" + pass + "\"");
		return result.toString();
    	'''
    }
    
    def userToString(){
    	'''
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append("user=");
		result.append("\"" + user + "\"");
		return result.toString();
    	'''
    }
}