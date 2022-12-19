/**
 */
package mlam;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mlam.Specification#getProblemDefinition <em>Problem Definition</em>}</li>
 *   <li>{@link mlam.Specification#getObservation <em>Observation</em>}</li>
 *   <li>{@link mlam.Specification#getDecision <em>Decision</em>}</li>
 *   <li>{@link mlam.Specification#getMetrics <em>Metrics</em>}</li>
 * </ul>
 *
 * @see mlam.MlamPackage#getSpecification()
 * @model
 * @generated
 */
public interface Specification extends Documentation {
	/**
	 * Returns the value of the '<em><b>Problem Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Problem Definition</em>' attribute.
	 * @see #setProblemDefinition(String)
	 * @see mlam.MlamPackage#getSpecification_ProblemDefinition()
	 * @model required="true"
	 * @generated
	 */
	String getProblemDefinition();

	/**
	 * Sets the value of the '{@link mlam.Specification#getProblemDefinition <em>Problem Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Problem Definition</em>' attribute.
	 * @see #getProblemDefinition()
	 * @generated
	 */
	void setProblemDefinition(String value);

	/**
	 * Returns the value of the '<em><b>Observation</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Observation</em>' attribute list.
	 * @see mlam.MlamPackage#getSpecification_Observation()
	 * @model
	 * @generated
	 */
	EList<String> getObservation();

	/**
	 * Returns the value of the '<em><b>Decision</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decision</em>' attribute list.
	 * @see mlam.MlamPackage#getSpecification_Decision()
	 * @model
	 * @generated
	 */
	EList<String> getDecision();

	/**
	 * Returns the value of the '<em><b>Metrics</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metrics</em>' attribute list.
	 * @see mlam.MlamPackage#getSpecification_Metrics()
	 * @model
	 * @generated
	 */
	EList<String> getMetrics();

} // Specification
