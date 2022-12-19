/**
 */
package mlam.impl;

import java.util.Collection;

import mlam.ExecutionData;
import mlam.Log;
import mlam.Metrics;
import mlam.MlamPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Log</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mlam.impl.LogImpl#getMetrics <em>Metrics</em>}</li>
 *   <li>{@link mlam.impl.LogImpl#getExecutionData <em>Execution Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogImpl extends DocumentationImpl implements Log {
	/**
	 * The cached value of the '{@link #getMetrics() <em>Metrics</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetrics()
	 * @generated
	 * @ordered
	 */
	protected EList<Metrics> metrics;

	/**
	 * The cached value of the '{@link #getExecutionData() <em>Execution Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionData()
	 * @generated
	 * @ordered
	 */
	protected EList<ExecutionData> executionData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MlamPackage.Literals.LOG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Metrics> getMetrics() {
		if (metrics == null) {
			metrics = new EObjectContainmentEList<Metrics>(Metrics.class, this, MlamPackage.LOG__METRICS);
		}
		return metrics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExecutionData> getExecutionData() {
		if (executionData == null) {
			executionData = new EObjectContainmentEList<ExecutionData>(ExecutionData.class, this, MlamPackage.LOG__EXECUTION_DATA);
		}
		return executionData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MlamPackage.LOG__METRICS:
				return ((InternalEList<?>)getMetrics()).basicRemove(otherEnd, msgs);
			case MlamPackage.LOG__EXECUTION_DATA:
				return ((InternalEList<?>)getExecutionData()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MlamPackage.LOG__METRICS:
				return getMetrics();
			case MlamPackage.LOG__EXECUTION_DATA:
				return getExecutionData();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MlamPackage.LOG__METRICS:
				getMetrics().clear();
				getMetrics().addAll((Collection<? extends Metrics>)newValue);
				return;
			case MlamPackage.LOG__EXECUTION_DATA:
				getExecutionData().clear();
				getExecutionData().addAll((Collection<? extends ExecutionData>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MlamPackage.LOG__METRICS:
				getMetrics().clear();
				return;
			case MlamPackage.LOG__EXECUTION_DATA:
				getExecutionData().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MlamPackage.LOG__METRICS:
				return metrics != null && !metrics.isEmpty();
			case MlamPackage.LOG__EXECUTION_DATA:
				return executionData != null && !executionData.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LogImpl
