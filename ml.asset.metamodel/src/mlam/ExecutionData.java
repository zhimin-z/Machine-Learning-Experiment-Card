/**
 */
package mlam;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execution Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mlam.ExecutionData#getDtype <em>Dtype</em>}</li>
 * </ul>
 *
 * @see mlam.MlamPackage#getExecutionData()
 * @model
 * @generated
 */
public interface ExecutionData extends Data {
	/**
	 * Returns the value of the '<em><b>Dtype</b></em>' attribute list.
	 * The list contents are of type {@link mlam.DataType}.
	 * The literals are from the enumeration {@link mlam.DataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dtype</em>' attribute list.
	 * @see mlam.DataType
	 * @see mlam.MlamPackage#getExecutionData_Dtype()
	 * @model
	 * @generated
	 */
	EList<DataType> getDtype();

} // ExecutionData
