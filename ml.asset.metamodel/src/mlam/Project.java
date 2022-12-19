/**
 */
package mlam;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mlam.Project#getId <em>Id</em>}</li>
 *   <li>{@link mlam.Project#getName <em>Name</em>}</li>
 *   <li>{@link mlam.Project#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link mlam.Project#getLastUpdateDate <em>Last Update Date</em>}</li>
 *   <li>{@link mlam.Project#getDescription <em>Description</em>}</li>
 *   <li>{@link mlam.Project#getExperiment <em>Experiment</em>}</li>
 * </ul>
 *
 * @see mlam.MlamPackage#getProject()
 * @model
 * @generated
 */
public interface Project extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see mlam.MlamPackage#getProject_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link mlam.Project#getId <em>Id</em>}' attribute.
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
	 * @see mlam.MlamPackage#getProject_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mlam.Project#getName <em>Name</em>}' attribute.
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
	 * @see mlam.MlamPackage#getProject_CreationDate()
	 * @model required="true"
	 * @generated
	 */
	Date getCreationDate();

	/**
	 * Sets the value of the '{@link mlam.Project#getCreationDate <em>Creation Date</em>}' attribute.
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
	 * @see mlam.MlamPackage#getProject_LastUpdateDate()
	 * @model required="true"
	 * @generated
	 */
	Date getLastUpdateDate();

	/**
	 * Sets the value of the '{@link mlam.Project#getLastUpdateDate <em>Last Update Date</em>}' attribute.
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
	 * @see mlam.MlamPackage#getProject_Description()
	 * @model required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link mlam.Project#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Experiment</b></em>' containment reference list.
	 * The list contents are of type {@link mlam.Experiment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Experiment</em>' containment reference list.
	 * @see mlam.MlamPackage#getProject_Experiment()
	 * @model containment="true"
	 * @generated
	 */
	EList<Experiment> getExperiment();

} // Project
