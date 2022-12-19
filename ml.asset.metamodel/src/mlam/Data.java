/**
 */
package mlam;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mlam.Data#getDataset <em>Dataset</em>}</li>
 *   <li>{@link mlam.Data#getFeature <em>Feature</em>}</li>
 *   <li>{@link mlam.Data#getGeneratedArtifact <em>Generated Artifact</em>}</li>
 *   <li>{@link mlam.Data#getLog <em>Log</em>}</li>
 * </ul>
 *
 * @see mlam.MlamPackage#getData()
 * @model abstract="true"
 * @generated
 */
public interface Data extends Asset {
	/**
	 * Returns the value of the '<em><b>Dataset</b></em>' containment reference list.
	 * The list contents are of type {@link mlam.Dataset}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dataset</em>' containment reference list.
	 * @see mlam.MlamPackage#getData_Dataset()
	 * @model containment="true"
	 * @generated
	 */
	EList<Dataset> getDataset();

	/**
	 * Returns the value of the '<em><b>Feature</b></em>' containment reference list.
	 * The list contents are of type {@link mlam.Feature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' containment reference list.
	 * @see mlam.MlamPackage#getData_Feature()
	 * @model containment="true"
	 * @generated
	 */
	EList<Feature> getFeature();

	/**
	 * Returns the value of the '<em><b>Generated Artifact</b></em>' containment reference list.
	 * The list contents are of type {@link mlam.GeneratedArtifact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Artifact</em>' containment reference list.
	 * @see mlam.MlamPackage#getData_GeneratedArtifact()
	 * @model containment="true"
	 * @generated
	 */
	EList<GeneratedArtifact> getGeneratedArtifact();

	/**
	 * Returns the value of the '<em><b>Log</b></em>' containment reference list.
	 * The list contents are of type {@link mlam.Log}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log</em>' containment reference list.
	 * @see mlam.MlamPackage#getData_Log()
	 * @model containment="true"
	 * @generated
	 */
	EList<Log> getLog();

} // Data
