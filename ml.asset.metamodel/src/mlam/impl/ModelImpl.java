/**
 */
package mlam.impl;

import java.util.Collection;

import mlam.Hyperparameter;
import mlam.MlamPackage;
import mlam.Model;
import mlam.NeuralArchitecture;
import mlam.Parameter;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mlam.impl.ModelImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link mlam.impl.ModelImpl#getHyperparameter <em>Hyperparameter</em>}</li>
 *   <li>{@link mlam.impl.ModelImpl#getNeuralArchitecture <em>Neural Architecture</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends AssetImpl implements Model {
	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameter;

	/**
	 * The cached value of the '{@link #getHyperparameter() <em>Hyperparameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHyperparameter()
	 * @generated
	 * @ordered
	 */
	protected EList<Hyperparameter> hyperparameter;

	/**
	 * The cached value of the '{@link #getNeuralArchitecture() <em>Neural Architecture</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeuralArchitecture()
	 * @generated
	 * @ordered
	 */
	protected EList<NeuralArchitecture> neuralArchitecture;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MlamPackage.Literals.MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameter() {
		if (parameter == null) {
			parameter = new EObjectContainmentEList<Parameter>(Parameter.class, this, MlamPackage.MODEL__PARAMETER);
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Hyperparameter> getHyperparameter() {
		if (hyperparameter == null) {
			hyperparameter = new EObjectContainmentEList<Hyperparameter>(Hyperparameter.class, this, MlamPackage.MODEL__HYPERPARAMETER);
		}
		return hyperparameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NeuralArchitecture> getNeuralArchitecture() {
		if (neuralArchitecture == null) {
			neuralArchitecture = new EObjectContainmentEList<NeuralArchitecture>(NeuralArchitecture.class, this, MlamPackage.MODEL__NEURAL_ARCHITECTURE);
		}
		return neuralArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MlamPackage.MODEL__PARAMETER:
				return ((InternalEList<?>)getParameter()).basicRemove(otherEnd, msgs);
			case MlamPackage.MODEL__HYPERPARAMETER:
				return ((InternalEList<?>)getHyperparameter()).basicRemove(otherEnd, msgs);
			case MlamPackage.MODEL__NEURAL_ARCHITECTURE:
				return ((InternalEList<?>)getNeuralArchitecture()).basicRemove(otherEnd, msgs);
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
			case MlamPackage.MODEL__PARAMETER:
				return getParameter();
			case MlamPackage.MODEL__HYPERPARAMETER:
				return getHyperparameter();
			case MlamPackage.MODEL__NEURAL_ARCHITECTURE:
				return getNeuralArchitecture();
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
			case MlamPackage.MODEL__PARAMETER:
				getParameter().clear();
				getParameter().addAll((Collection<? extends Parameter>)newValue);
				return;
			case MlamPackage.MODEL__HYPERPARAMETER:
				getHyperparameter().clear();
				getHyperparameter().addAll((Collection<? extends Hyperparameter>)newValue);
				return;
			case MlamPackage.MODEL__NEURAL_ARCHITECTURE:
				getNeuralArchitecture().clear();
				getNeuralArchitecture().addAll((Collection<? extends NeuralArchitecture>)newValue);
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
			case MlamPackage.MODEL__PARAMETER:
				getParameter().clear();
				return;
			case MlamPackage.MODEL__HYPERPARAMETER:
				getHyperparameter().clear();
				return;
			case MlamPackage.MODEL__NEURAL_ARCHITECTURE:
				getNeuralArchitecture().clear();
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
			case MlamPackage.MODEL__PARAMETER:
				return parameter != null && !parameter.isEmpty();
			case MlamPackage.MODEL__HYPERPARAMETER:
				return hyperparameter != null && !hyperparameter.isEmpty();
			case MlamPackage.MODEL__NEURAL_ARCHITECTURE:
				return neuralArchitecture != null && !neuralArchitecture.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModelImpl
