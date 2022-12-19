/**
 */
package mlam.impl;

import java.util.Collection;

import mlam.ConfigurationFile;
import mlam.MlamPackage;
import mlam.ProductionCode;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Production Code</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mlam.impl.ProductionCodeImpl#getOrchestrationScript <em>Orchestration Script</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductionCodeImpl extends CodeImpl implements ProductionCode {
	/**
	 * The cached value of the '{@link #getOrchestrationScript() <em>Orchestration Script</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrchestrationScript()
	 * @generated
	 * @ordered
	 */
	protected EList<ConfigurationFile> orchestrationScript;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductionCodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MlamPackage.Literals.PRODUCTION_CODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConfigurationFile> getOrchestrationScript() {
		if (orchestrationScript == null) {
			orchestrationScript = new EObjectContainmentEList<ConfigurationFile>(ConfigurationFile.class, this, MlamPackage.PRODUCTION_CODE__ORCHESTRATION_SCRIPT);
		}
		return orchestrationScript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MlamPackage.PRODUCTION_CODE__ORCHESTRATION_SCRIPT:
				return ((InternalEList<?>)getOrchestrationScript()).basicRemove(otherEnd, msgs);
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
			case MlamPackage.PRODUCTION_CODE__ORCHESTRATION_SCRIPT:
				return getOrchestrationScript();
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
			case MlamPackage.PRODUCTION_CODE__ORCHESTRATION_SCRIPT:
				getOrchestrationScript().clear();
				getOrchestrationScript().addAll((Collection<? extends ConfigurationFile>)newValue);
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
			case MlamPackage.PRODUCTION_CODE__ORCHESTRATION_SCRIPT:
				getOrchestrationScript().clear();
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
			case MlamPackage.PRODUCTION_CODE__ORCHESTRATION_SCRIPT:
				return orchestrationScript != null && !orchestrationScript.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProductionCodeImpl
