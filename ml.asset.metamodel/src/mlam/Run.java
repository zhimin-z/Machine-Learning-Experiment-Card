/**
 */
package mlam;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Run</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mlam.Run#getId <em>Id</em>}</li>
 *   <li>{@link mlam.Run#getName <em>Name</em>}</li>
 *   <li>{@link mlam.Run#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link mlam.Run#getLastUpdateDate <em>Last Update Date</em>}</li>
 *   <li>{@link mlam.Run#getDescription <em>Description</em>}</li>
 *   <li>{@link mlam.Run#getAsset <em>Asset</em>}</li>
 * </ul>
 *
 * @see mlam.MlamPackage#getRun()
 * @model
 * @generated
 */
public interface Run extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see mlam.MlamPackage#getRun_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link mlam.Run#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see mlam.MlamPackage#getRun_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mlam.Run#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Date</em>' attribute.
	 * @see #setCreationDate(Date)
	 * @see mlam.MlamPackage#getRun_CreationDate()
	 * @model required="true"
	 * @generated
	 */
	Date getCreationDate();

	/**
	 * Sets the value of the '{@link mlam.Run#getCreationDate <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Date</em>' attribute.
	 * @see #getCreationDate()
	 * @generated
	 */
	void setCreationDate(Date value);

	/**
	 * Returns the value of the '<em><b>Last Update Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Update Date</em>' attribute.
	 * @see #setLastUpdateDate(Date)
	 * @see mlam.MlamPackage#getRun_LastUpdateDate()
	 * @model required="true"
	 * @generated
	 */
	Date getLastUpdateDate();

	/**
	 * Sets the value of the '{@link mlam.Run#getLastUpdateDate <em>Last Update Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Update Date</em>' attribute.
	 * @see #getLastUpdateDate()
	 * @generated
	 */
	void setLastUpdateDate(Date value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see mlam.MlamPackage#getRun_Description()
	 * @model required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link mlam.Run#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Asset</b></em>' containment reference list.
	 * The list contents are of type {@link mlam.Asset}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset</em>' containment reference list.
	 * @see mlam.MlamPackage#getRun_Asset()
	 * @model containment="true"
	 * @generated
	 */
	EList<Asset> getAsset();

} // Run
