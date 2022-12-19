/**
 */
package mlam;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generated Artifact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mlam.GeneratedArtifact#getDtype <em>Dtype</em>}</li>
 * </ul>
 *
 * @see mlam.MlamPackage#getGeneratedArtifact()
 * @model
 * @generated
 */
public interface GeneratedArtifact extends Data {
	/**
	 * Returns the value of the '<em><b>Dtype</b></em>' attribute list.
	 * The list contents are of type {@link mlam.DataType}.
	 * The literals are from the enumeration {@link mlam.DataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dtype</em>' attribute list.
	 * @see mlam.DataType
	 * @see mlam.MlamPackage#getGeneratedArtifact_Dtype()
	 * @model
	 * @generated
	 */
	EList<DataType> getDtype();

} // GeneratedArtifact
