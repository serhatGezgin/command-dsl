/**
 */
package org.provus.atm.command.command.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.provus.atm.command.command.CommandPackage;
import org.provus.atm.command.command.PASS;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PASS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.provus.atm.command.command.impl.PASSImpl#getPass <em>Pass</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PASSImpl extends CommandImpl implements PASS
{
  /**
   * The default value of the '{@link #getPass() <em>Pass</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPass()
   * @generated
   * @ordered
   */
  protected static final String PASS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPass() <em>Pass</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPass()
   * @generated
   * @ordered
   */
  protected String pass = PASS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PASSImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return CommandPackage.Literals.PASS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPass()
  {
    return pass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPass(String newPass)
  {
    String oldPass = pass;
    pass = newPass;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CommandPackage.PASS__PASS, oldPass, pass));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String toString()
  {
    if (eIsProxy()) return super.toString();
    
    StringBuffer result = new StringBuffer(super.toString());
    result.append("pass=");
    result.append(pass);
    return result.toString();
    
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case CommandPackage.PASS__PASS:
        return getPass();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CommandPackage.PASS__PASS:
        setPass((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case CommandPackage.PASS__PASS:
        setPass(PASS_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case CommandPackage.PASS__PASS:
        return PASS_EDEFAULT == null ? pass != null : !PASS_EDEFAULT.equals(pass);
    }
    return super.eIsSet(featureID);
  }

} //PASSImpl
