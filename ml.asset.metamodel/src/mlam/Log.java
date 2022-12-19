/**
 */
package mlam;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Log</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mlam.Log#getMetrics <em>Metrics</em>}</li>
 *   <li>{@link mlam.Log#getExecutionData <em>Execution Data</em>}</li>
 * </ul>
 *
 * @see mlam.MlamPackage#getLog()
 * @model
 * @generated
 */
public interface Log extends Documentation {
	/**
	 * Returns the value of the '<em><b>Metrics</b></em>' containment reference list.
	 * The list contents are of type {@link mlam.Metrics}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metrics</em>' containment reference list.
	 * @see mlam.MlamPackage#getLog_Metrics()
	 * @model containment="true"
	 * @generated
	 */
	EList<Metrics> getMetrics();

	/**
	 * Returns the value of the '<em><b>Execution Data</b></em>' containment reference list.
	 * The list contents are of type {@link mlam.ExecutionData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution Data</em>' containment reference list.
	 * @see mlam.MlamPackage#getLog_ExecutionData()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExecutionData> getExecutionData();

} // Log
