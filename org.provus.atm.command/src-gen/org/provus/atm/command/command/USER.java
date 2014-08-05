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

} // USER
