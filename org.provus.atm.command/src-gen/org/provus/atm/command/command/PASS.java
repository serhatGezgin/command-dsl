/**
 */
package org.provus.atm.command.command;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PASS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.provus.atm.command.command.PASS#getPass <em>Pass</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.provus.atm.command.command.CommandPackage#getPASS()
 * @model
 * @generated
 */
public interface PASS extends Command
{
  /**
   * Returns the value of the '<em><b>Pass</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pass</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pass</em>' attribute.
   * @see #setPass(String)
   * @see org.provus.atm.command.command.CommandPackage#getPASS_Pass()
   * @model
   * @generated
   */
  String getPass();

  /**
   * Sets the value of the '{@link org.provus.atm.command.command.PASS#getPass <em>Pass</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pass</em>' attribute.
   * @see #getPass()
   * @generated
   */
  void setPass(String value);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if (eIsProxy()) return super.toString();\r\n\r\nStringBuffer result = new StringBuffer(super.toString());\r\nresult.append(\"pass=\");\r\nresult.append(\"\\\"\" + pass + \"\\\"\");\r\nreturn result.toString();\r\n'"
   * @generated
   */
  String toString();

} // PASS
