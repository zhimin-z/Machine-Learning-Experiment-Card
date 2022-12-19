/**
 */
package mlam;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Production Code</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mlam.ProductionCode#getOrchestrationScript <em>Orchestration Script</em>}</li>
 * </ul>
 *
 * @see mlam.MlamPackage#getProductionCode()
 * @model
 * @generated
 */
public interface ProductionCode extends Code {
	/**
	 * Returns the value of the '<em><b>Orchestration Script</b></em>' containment reference list.
	 * The list contents are of type {@link mlam.ConfigurationFile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orchestration Script</em>' containment reference list.
	 * @see mlam.MlamPackage#getProductionCode_OrchestrationScript()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConfigurationFile> getOrchestrationScript();

} // ProductionCode
