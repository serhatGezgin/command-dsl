package org.provus.atm.command;

import com.google.common.collect.Iterables;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.GeneratedMetamodel;
import org.eclipse.xtext.xtext.ecoreInference.IXtext2EcorePostProcessor;

@SuppressWarnings("all")
public class MyXtext2EcorePostProcessor implements IXtext2EcorePostProcessor {
  public void process(final GeneratedMetamodel metamodel) {
    EPackage _ePackage = metamodel.getEPackage();
    this.process(_ePackage);
  }
  
  public void process(final EPackage p) {
    EList<EClassifier> _eClassifiers = p.getEClassifiers();
    Iterable<EClass> _filter = Iterables.<EClass>filter(_eClassifiers, EClass.class);
    for (final EClass c : _filter) {
      this.handle(c);
    }
  }
  
  public boolean handle(final EClass c) {
    boolean _xblockexpression = false;
    {
      final EOperation op = EcoreFactory.eINSTANCE.createEOperation();
      op.setName("toString");
      EDataType _eString = EcorePackage.eINSTANCE.getEString();
      op.setEType(_eString);
      final EAnnotation body = EcoreFactory.eINSTANCE.createEAnnotation();
      body.setSource(GenModelPackage.eNS_URI);
      EClass _eStringToStringMapEntry = EcorePackage.eINSTANCE.getEStringToStringMapEntry();
      EObject _create = EcoreFactory.eINSTANCE.create(_eStringToStringMapEntry);
      final BasicEMap.Entry<String, String> map = ((BasicEMap.Entry<String, String>) _create);
      map.setKey("body");
      String _name = c.getName();
      boolean _equals = _name.equals("Model");
      if (_equals) {
        CharSequence _modelToString = this.modelToString();
        String _string = _modelToString.toString();
        map.setValue(_string);
      } else {
        String _name_1 = c.getName();
        boolean _equals_1 = _name_1.equals("Command");
        if (_equals_1) {
          CharSequence _commandToString = this.commandToString();
          String _string_1 = _commandToString.toString();
          map.setValue(_string_1);
        } else {
          String _name_2 = c.getName();
          boolean _equals_2 = _name_2.equals("ENC");
          if (_equals_2) {
            CharSequence _encToString = this.encToString();
            String _string_2 = _encToString.toString();
            map.setValue(_string_2);
          } else {
            String _name_3 = c.getName();
            boolean _equals_3 = _name_3.equals("PASS");
            if (_equals_3) {
              CharSequence _passToString = this.passToString();
              String _string_3 = _passToString.toString();
              map.setValue(_string_3);
            } else {
              String _name_4 = c.getName();
              boolean _equals_4 = _name_4.equals("USER");
              if (_equals_4) {
                CharSequence _userToString = this.userToString();
                String _string_4 = _userToString.toString();
                map.setValue(_string_4);
              }
            }
          }
        }
      }
      EMap<String, String> _details = body.getDetails();
      _details.add(map);
      EList<EAnnotation> _eAnnotations = op.getEAnnotations();
      _eAnnotations.add(body);
      EList<EOperation> _eOperations = c.getEOperations();
      _xblockexpression = _eOperations.add(op);
    }
    return _xblockexpression;
  }
  
  public CharSequence modelToString() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("TreeIterator<EObject> eAllContents = this.eAllContents();");
    _builder.newLine();
    _builder.newLine();
    _builder.append("StringBuilder sb = new StringBuilder();");
    _builder.newLine();
    _builder.append("for (TreeIterator<EObject> iterator = eAllContents; iterator.hasNext();) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("EObject eObject = (EObject) iterator.next();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("sb.append(eObject.toString() + \" \");");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("sb.deleteCharAt(sb.length() - 1);");
    _builder.newLine();
    _builder.newLine();
    _builder.append("return sb.toString();");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence commandToString() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("return \"\";");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence encToString() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("if (eIsProxy()) return super.toString();");
    _builder.newLine();
    _builder.newLine();
    _builder.append("StringBuffer result = new StringBuffer(super.toString());");
    _builder.newLine();
    _builder.append("result.append(\"ENC{\");");
    _builder.newLine();
    _builder.append("result.append(\"\\\"\" + pass + \"\\\"\");");
    _builder.newLine();
    _builder.append("result.append(\'}\');");
    _builder.newLine();
    _builder.append("return result.toString();");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence passToString() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("if (eIsProxy()) return super.toString();");
    _builder.newLine();
    _builder.newLine();
    _builder.append("StringBuffer result = new StringBuffer(super.toString());");
    _builder.newLine();
    _builder.append("result.append(\"pass=\");");
    _builder.newLine();
    _builder.append("result.append(\"\\\"\" + pass + \"\\\"\");");
    _builder.newLine();
    _builder.append("return result.toString();");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence userToString() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("if (eIsProxy()) return super.toString();");
    _builder.newLine();
    _builder.newLine();
    _builder.append("StringBuffer result = new StringBuffer(super.toString());");
    _builder.newLine();
    _builder.append("result.append(\"user=\");");
    _builder.newLine();
    _builder.append("result.append(\"\\\"\" + user + \"\\\"\");");
    _builder.newLine();
    _builder.append("return result.toString();");
    _builder.newLine();
    return _builder;
  }
}
