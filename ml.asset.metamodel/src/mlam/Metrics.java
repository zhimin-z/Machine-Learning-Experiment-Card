/**
 */
package mlam;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metrics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mlam.Metrics#getDtype <em>Dtype</em>}</li>
 * </ul>
 *
 * @see mlam.MlamPackage#getMetrics()
 * @model
 * @generated
 */
public interface Metrics extends EObject {
	/**
	 * Returns the value of the '<em><b>Dtype</b></em>' attribute list.
	 * The list contents are of type {@link mlam.DataType}.
	 * The literals are from the enumeration {@link mlam.DataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dtype</em>' attribute list.
	 * @see mlam.DataType
	 * @see mlam.MlamPackage#getMetrics_Dtype()
	 * @model
	 * @generated
	 */
	EList<DataType> getDtype();

} // Metrics
