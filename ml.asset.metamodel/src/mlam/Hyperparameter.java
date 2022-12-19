/**
 */
package mlam;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hyperparameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mlam.Hyperparameter#getDtype <em>Dtype</em>}</li>
 * </ul>
 *
 * @see mlam.MlamPackage#getHyperparameter()
 * @model
 * @generated
 */
public interface Hyperparameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Dtype</b></em>' attribute.
	 * The literals are from the enumeration {@link mlam.DataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dtype</em>' attribute.
	 * @see mlam.DataType
	 * @see #setDtype(DataType)
	 * @see mlam.MlamPackage#getHyperparameter_Dtype()
	 * @model
	 * @generated
	 */
	DataType getDtype();

	/**
	 * Sets the value of the '{@link mlam.Hyperparameter#getDtype <em>Dtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dtype</em>' attribute.
	 * @see mlam.DataType
	 * @see #getDtype()
	 * @generated
	 */
	void setDtype(DataType value);

} // Hyperparameter
