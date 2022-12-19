/**
 */
package mlam;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mlam.Model#getParameter <em>Parameter</em>}</li>
 *   <li>{@link mlam.Model#getHyperparameter <em>Hyperparameter</em>}</li>
 *   <li>{@link mlam.Model#getNeuralArchitecture <em>Neural Architecture</em>}</li>
 * </ul>
 *
 * @see mlam.MlamPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends Asset {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link mlam.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see mlam.MlamPackage#getModel_Parameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameter();

	/**
	 * Returns the value of the '<em><b>Hyperparameter</b></em>' containment reference list.
	 * The list contents are of type {@link mlam.Hyperparameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hyperparameter</em>' containment reference list.
	 * @see mlam.MlamPackage#getModel_Hyperparameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<Hyperparameter> getHyperparameter();

	/**
	 * Returns the value of the '<em><b>Neural Architecture</b></em>' containment reference list.
	 * The list contents are of type {@link mlam.NeuralArchitecture}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neural Architecture</em>' containment reference list.
	 * @see mlam.MlamPackage#getModel_NeuralArchitecture()
	 * @model containment="true"
	 * @generated
	 */
	EList<NeuralArchitecture> getNeuralArchitecture();

} // Model
