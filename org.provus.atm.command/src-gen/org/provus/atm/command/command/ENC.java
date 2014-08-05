/**
 */
package org.provus.atm.command.command;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ENC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.provus.atm.command.command.ENC#getPass <em>Pass</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.provus.atm.command.command.CommandPackage#getENC()
 * @model
 * @generated
 */
public interface ENC extends Command
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
   * @see org.provus.atm.command.command.CommandPackage#getENC_Pass()
   * @model
   * @generated
   */
  String getPass();

  /**
   * Sets the value of the '{@link org.provus.atm.command.command.ENC#getPass <em>Pass</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pass</em>' attribute.
   * @see #getPass()
   * @generated
   */
  void setPass(String value);

} // ENC
