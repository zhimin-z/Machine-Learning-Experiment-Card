/**
 */
package mlam;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mlam.Parameter#getDtype <em>Dtype</em>}</li>
 * </ul>
 *
 * @see mlam.MlamPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Dtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dtype</em>' attribute.
	 * @see #setDtype(float)
	 * @see mlam.MlamPackage#getParameter_Dtype()
	 * @model
	 * @generated
	 */
	float getDtype();

	/**
	 * Sets the value of the '{@link mlam.Parameter#getDtype <em>Dtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dtype</em>' attribute.
	 * @see #getDtype()
	 * @generated
	 */
	void setDtype(float value);

} // Parameter
