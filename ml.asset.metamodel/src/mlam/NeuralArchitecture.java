/**
 */
package mlam;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Neural Architecture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mlam.NeuralArchitecture#getDtype <em>Dtype</em>}</li>
 * </ul>
 *
 * @see mlam.MlamPackage#getNeuralArchitecture()
 * @model
 * @generated
 */
public interface NeuralArchitecture extends EObject {
	/**
	 * Returns the value of the '<em><b>Dtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dtype</em>' attribute.
	 * @see #setDtype(String)
	 * @see mlam.MlamPackage#getNeuralArchitecture_Dtype()
	 * @model
	 * @generated
	 */
	String getDtype();

	/**
	 * Sets the value of the '{@link mlam.NeuralArchitecture#getDtype <em>Dtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dtype</em>' attribute.
	 * @see #getDtype()
	 * @generated
	 */
	void setDtype(String value);

} // NeuralArchitecture
