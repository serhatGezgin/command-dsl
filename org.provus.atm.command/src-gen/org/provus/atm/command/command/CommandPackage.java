/**
 */
package org.provus.atm.command.command;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.provus.atm.command.command.CommandFactory
 * @model kind="package"
 * @generated
 */
public interface CommandPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "command";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.provus.org/atm/command/Command";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "command";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CommandPackage eINSTANCE = org.provus.atm.command.command.impl.CommandPackageImpl.init();

  /**
   * The meta object id for the '{@link org.provus.atm.command.command.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.provus.atm.command.command.impl.ModelImpl
   * @see org.provus.atm.command.command.impl.CommandPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Commands</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__COMMANDS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.provus.atm.command.command.impl.CommandImpl <em>Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.provus.atm.command.command.impl.CommandImpl
   * @see org.provus.atm.command.command.impl.CommandPackageImpl#getCommand()
   * @generated
   */
  int COMMAND = 1;

  /**
   * The number of structural features of the '<em>Command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.provus.atm.command.command.impl.ENCImpl <em>ENC</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.provus.atm.command.command.impl.ENCImpl
   * @see org.provus.atm.command.command.impl.CommandPackageImpl#getENC()
   * @generated
   */
  int ENC = 2;

  /**
   * The feature id for the '<em><b>Pass</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENC__PASS = COMMAND_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>ENC</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENC_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.provus.atm.command.command.impl.PASSImpl <em>PASS</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.provus.atm.command.command.impl.PASSImpl
   * @see org.provus.atm.command.command.impl.CommandPackageImpl#getPASS()
   * @generated
   */
  int PASS = 3;

  /**
   * The feature id for the '<em><b>Pass</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PASS__PASS = COMMAND_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>PASS</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PASS_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.provus.atm.command.command.impl.USERImpl <em>USER</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.provus.atm.command.command.impl.USERImpl
   * @see org.provus.atm.command.command.impl.CommandPackageImpl#getUSER()
   * @generated
   */
  int USER = 4;

  /**
   * The feature id for the '<em><b>User</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER__USER = COMMAND_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>USER</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link org.provus.atm.command.command.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.provus.atm.command.command.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.provus.atm.command.command.Model#getCommands <em>Commands</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Commands</em>'.
   * @see org.provus.atm.command.command.Model#getCommands()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Commands();

  /**
   * Returns the meta object for class '{@link org.provus.atm.command.command.Command <em>Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Command</em>'.
   * @see org.provus.atm.command.command.Command
   * @generated
   */
  EClass getCommand();

  /**
   * Returns the meta object for class '{@link org.provus.atm.command.command.ENC <em>ENC</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ENC</em>'.
   * @see org.provus.atm.command.command.ENC
   * @generated
   */
  EClass getENC();

  /**
   * Returns the meta object for the attribute '{@link org.provus.atm.command.command.ENC#getPass <em>Pass</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pass</em>'.
   * @see org.provus.atm.command.command.ENC#getPass()
   * @see #getENC()
   * @generated
   */
  EAttribute getENC_Pass();

  /**
   * Returns the meta object for class '{@link org.provus.atm.command.command.PASS <em>PASS</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>PASS</em>'.
   * @see org.provus.atm.command.command.PASS
   * @generated
   */
  EClass getPASS();

  /**
   * Returns the meta object for the attribute '{@link org.provus.atm.command.command.PASS#getPass <em>Pass</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pass</em>'.
   * @see org.provus.atm.command.command.PASS#getPass()
   * @see #getPASS()
   * @generated
   */
  EAttribute getPASS_Pass();

  /**
   * Returns the meta object for class '{@link org.provus.atm.command.command.USER <em>USER</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>USER</em>'.
   * @see org.provus.atm.command.command.USER
   * @generated
   */
  EClass getUSER();

  /**
   * Returns the meta object for the attribute '{@link org.provus.atm.command.command.USER#getUser <em>User</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>User</em>'.
   * @see org.provus.atm.command.command.USER#getUser()
   * @see #getUSER()
   * @generated
   */
  EAttribute getUSER_User();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  CommandFactory getCommandFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.provus.atm.command.command.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.provus.atm.command.command.impl.ModelImpl
     * @see org.provus.atm.command.command.impl.CommandPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Commands</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__COMMANDS = eINSTANCE.getModel_Commands();

    /**
     * The meta object literal for the '{@link org.provus.atm.command.command.impl.CommandImpl <em>Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.provus.atm.command.command.impl.CommandImpl
     * @see org.provus.atm.command.command.impl.CommandPackageImpl#getCommand()
     * @generated
     */
    EClass COMMAND = eINSTANCE.getCommand();

    /**
     * The meta object literal for the '{@link org.provus.atm.command.command.impl.ENCImpl <em>ENC</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.provus.atm.command.command.impl.ENCImpl
     * @see org.provus.atm.command.command.impl.CommandPackageImpl#getENC()
     * @generated
     */
    EClass ENC = eINSTANCE.getENC();

    /**
     * The meta object literal for the '<em><b>Pass</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENC__PASS = eINSTANCE.getENC_Pass();

    /**
     * The meta object literal for the '{@link org.provus.atm.command.command.impl.PASSImpl <em>PASS</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.provus.atm.command.command.impl.PASSImpl
     * @see org.provus.atm.command.command.impl.CommandPackageImpl#getPASS()
     * @generated
     */
    EClass PASS = eINSTANCE.getPASS();

    /**
     * The meta object literal for the '<em><b>Pass</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PASS__PASS = eINSTANCE.getPASS_Pass();

    /**
     * The meta object literal for the '{@link org.provus.atm.command.command.impl.USERImpl <em>USER</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.provus.atm.command.command.impl.USERImpl
     * @see org.provus.atm.command.command.impl.CommandPackageImpl#getUSER()
     * @generated
     */
    EClass USER = eINSTANCE.getUSER();

    /**
     * The meta object literal for the '<em><b>User</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute USER__USER = eINSTANCE.getUSER_User();

  }

} //CommandPackage
