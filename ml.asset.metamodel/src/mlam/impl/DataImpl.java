/**
 */
package mlam.impl;

import java.util.Collection;

import mlam.Data;
import mlam.Dataset;
import mlam.Feature;
import mlam.GeneratedArtifact;
import mlam.Log;
import mlam.MlamPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mlam.impl.DataImpl#getDataset <em>Dataset</em>}</li>
 *   <li>{@link mlam.impl.DataImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link mlam.impl.DataImpl#getGeneratedArtifact <em>Generated Artifact</em>}</li>
 *   <li>{@link mlam.impl.DataImpl#getLog <em>Log</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DataImpl extends AssetImpl implements Data {
	/**
	 * The cached value of the '{@link #getDataset() <em>Dataset</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataset()
	 * @generated
	 * @ordered
	 */
	protected EList<Dataset> dataset;

	/**
	 * The cached value of the '{@link #getFeature() <em>Feature</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeature()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> feature;

	/**
	 * The cached value of the '{@link #getGeneratedArtifact() <em>Generated Artifact</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedArtifact()
	 * @generated
	 * @ordered
	 */
	protected EList<GeneratedArtifact> generatedArtifact;

	/**
	 * The cached value of the '{@link #getLog() <em>Log</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLog()
	 * @generated
	 * @ordered
	 */
	protected EList<Log> log;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MlamPackage.Literals.DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dataset> getDataset() {
		if (dataset == null) {
			dataset = new EObjectContainmentEList<Dataset>(Dataset.class, this, MlamPackage.DATA__DATASET);
		}
		return dataset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getFeature() {
		if (feature == null) {
			feature = new EObjectContainmentEList<Feature>(Feature.class, this, MlamPackage.DATA__FEATURE);
		}
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneratedArtifact> getGeneratedArtifact() {
		if (generatedArtifact == null) {
			generatedArtifact = new EObjectContainmentEList<GeneratedArtifact>(GeneratedArtifact.class, this, MlamPackage.DATA__GENERATED_ARTIFACT);
		}
		return generatedArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Log> getLog() {
		if (log == null) {
			log = new EObjectContainmentEList<Log>(Log.class, this, MlamPackage.DATA__LOG);
		}
		return log;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MlamPackage.DATA__DATASET:
				return ((InternalEList<?>)getDataset()).basicRemove(otherEnd, msgs);
			case MlamPackage.DATA__FEATURE:
				return ((InternalEList<?>)getFeature()).basicRemove(otherEnd, msgs);
			case MlamPackage.DATA__GENERATED_ARTIFACT:
				return ((InternalEList<?>)getGeneratedArtifact()).basicRemove(otherEnd, msgs);
			case MlamPackage.DATA__LOG:
				return ((InternalEList<?>)getLog()).basicRemove(otherEnd, msgs);
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
			case MlamPackage.DATA__DATASET:
				return getDataset();
			case MlamPackage.DATA__FEATURE:
				return getFeature();
			case MlamPackage.DATA__GENERATED_ARTIFACT:
				return getGeneratedArtifact();
			case MlamPackage.DATA__LOG:
				return getLog();
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
			case MlamPackage.DATA__DATASET:
				getDataset().clear();
				getDataset().addAll((Collection<? extends Dataset>)newValue);
				return;
			case MlamPackage.DATA__FEATURE:
				getFeature().clear();
				getFeature().addAll((Collection<? extends Feature>)newValue);
				return;
			case MlamPackage.DATA__GENERATED_ARTIFACT:
				getGeneratedArtifact().clear();
				getGeneratedArtifact().addAll((Collection<? extends GeneratedArtifact>)newValue);
				return;
			case MlamPackage.DATA__LOG:
				getLog().clear();
				getLog().addAll((Collection<? extends Log>)newValue);
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
			case MlamPackage.DATA__DATASET:
				getDataset().clear();
				return;
			case MlamPackage.DATA__FEATURE:
				getFeature().clear();
				return;
			case MlamPackage.DATA__GENERATED_ARTIFACT:
				getGeneratedArtifact().clear();
				return;
			case MlamPackage.DATA__LOG:
				getLog().clear();
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
			case MlamPackage.DATA__DATASET:
				return dataset != null && !dataset.isEmpty();
			case MlamPackage.DATA__FEATURE:
				return feature != null && !feature.isEmpty();
			case MlamPackage.DATA__GENERATED_ARTIFACT:
				return generatedArtifact != null && !generatedArtifact.isEmpty();
			case MlamPackage.DATA__LOG:
				return log != null && !log.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataImpl
