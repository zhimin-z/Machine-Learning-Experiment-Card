/**
 */
package mlam;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mlam.Code#getDependency <em>Dependency</em>}</li>
 *   <li>{@link mlam.Code#getSourceFile <em>Source File</em>}</li>
 * </ul>
 *
 * @see mlam.MlamPackage#getCode()
 * @model abstract="true"
 * @generated
 */
public interface Code extends Asset {
	/**
	 * Returns the value of the '<em><b>Dependency</b></em>' containment reference list.
	 * The list contents are of type {@link mlam.Dependency}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependency</em>' containment reference list.
	 * @see mlam.MlamPackage#getCode_Dependency()
	 * @model containment="true"
	 * @generated
	 */
	EList<Dependency> getDependency();

	/**
	 * Returns the value of the '<em><b>Source File</b></em>' containment reference list.
	 * The list contents are of type {@link mlam.SourceFile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source File</em>' containment reference list.
	 * @see mlam.MlamPackage#getCode_SourceFile()
	 * @model containment="true"
	 * @generated
	 */
	EList<SourceFile> getSourceFile();

} // Code
