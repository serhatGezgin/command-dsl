/**
 */
package org.provus.atm.command.command;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>USER</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.provus.atm.command.command.USER#getUser <em>User</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.provus.atm.command.command.CommandPackage#getUSER()
 * @model
 * @generated
 */
public interface USER extends Command
{
  /**
   * Returns the value of the '<em><b>User</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>User</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>User</em>' attribute.
   * @see #setUser(String)
   * @see org.provus.atm.command.command.CommandPackage#getUSER_User()
   * @model
   * @generated
   */
  String getUser();

  /**
   * Sets the value of the '{@link org.provus.atm.command.command.USER#getUser <em>User</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>User</em>' attribute.
   * @see #getUser()
   * @generated
   */
  void setUser(String value);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if (eIsProxy()) return super.toString();\r\n\r\nStringBuffer result = new StringBuffer(super.toString());\r\nresult.append(\"user=\");\r\nresult.append(\"\\\"\" + user + \"\\\"\");\r\nreturn result.toString();\r\n'"
   * @generated
   */
  String toString();

} // USER
