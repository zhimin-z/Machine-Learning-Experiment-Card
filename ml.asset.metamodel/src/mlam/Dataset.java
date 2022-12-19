/**
 */
package mlam;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dataset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mlam.Dataset#getData <em>Data</em>}</li>
 * </ul>
 *
 * @see mlam.MlamPackage#getDataset()
 * @model
 * @generated
 */
public interface Dataset extends Data {
	/**
	 * Returns the value of the '<em><b>Data</b></em>' attribute list.
	 * The list contents are of type {@link mlam.DataType}.
	 * The literals are from the enumeration {@link mlam.DataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' attribute list.
	 * @see mlam.DataType
	 * @see mlam.MlamPackage#getDataset_Data()
	 * @model
	 * @generated
	 */
	EList<DataType> getData();

} // Dataset
