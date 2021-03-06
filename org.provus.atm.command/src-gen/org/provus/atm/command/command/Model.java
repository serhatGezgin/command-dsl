/**
 */
package org.provus.atm.command.command;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.provus.atm.command.command.Model#getCommands <em>Commands</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.provus.atm.command.command.CommandPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Commands</b></em>' containment reference list.
   * The list contents are of type {@link org.provus.atm.command.command.Command}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Commands</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Commands</em>' containment reference list.
   * @see org.provus.atm.command.command.CommandPackage#getModel_Commands()
   * @model containment="true"
   * @generated
   */
  EList<Command> getCommands();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='TreeIterator<EObject> eAllContents = this.eAllContents();\r\n\r\nStringBuilder sb = new StringBuilder();\r\nfor (TreeIterator<EObject> iterator = eAllContents; iterator.hasNext();) {\r\n\tEObject eObject = (EObject) iterator.next();\r\n\tsb.append(eObject.toString() + \" \");\r\n}\r\nsb.deleteCharAt(sb.length() - 1);\r\n\r\nreturn sb.toString();\r\n'"
   * @generated
   */
  String toString();

} // Model
