/**
 */
package mlam;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mlam.SourceFile#getDtype <em>Dtype</em>}</li>
 * </ul>
 *
 * @see mlam.MlamPackage#getSourceFile()
 * @model
 * @generated
 */
public interface SourceFile extends EObject {
	/**
	 * Returns the value of the '<em><b>Dtype</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dtype</em>' attribute list.
	 * @see mlam.MlamPackage#getSourceFile_Dtype()
	 * @model
	 * @generated
	 */
	EList<String> getDtype();

} // SourceFile
