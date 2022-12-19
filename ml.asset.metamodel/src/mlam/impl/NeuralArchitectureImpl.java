/**
 */
package mlam.impl;

import mlam.MlamPackage;
import mlam.NeuralArchitecture;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Neural Architecture</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mlam.impl.NeuralArchitectureImpl#getDtype <em>Dtype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NeuralArchitectureImpl extends MinimalEObjectImpl.Container implements NeuralArchitecture {
	/**
	 * The default value of the '{@link #getDtype() <em>Dtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDtype()
	 * @generated
	 * @ordered
	 */
	protected static final String DTYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDtype() <em>Dtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDtype()
	 * @generated
	 * @ordered
	 */
	protected String dtype = DTYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NeuralArchitectureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MlamPackage.Literals.NEURAL_ARCHITECTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDtype() {
		return dtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDtype(String newDtype) {
		String oldDtype = dtype;
		dtype = newDtype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlamPackage.NEURAL_ARCHITECTURE__DTYPE, oldDtype, dtype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MlamPackage.NEURAL_ARCHITECTURE__DTYPE:
				return getDtype();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MlamPackage.NEURAL_ARCHITECTURE__DTYPE:
				setDtype((String)newValue);
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
			case MlamPackage.NEURAL_ARCHITECTURE__DTYPE:
				setDtype(DTYPE_EDEFAULT);
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
			case MlamPackage.NEURAL_ARCHITECTURE__DTYPE:
				return DTYPE_EDEFAULT == null ? dtype != null : !DTYPE_EDEFAULT.equals(dtype);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (dtype: ");
		result.append(dtype);
		result.append(')');
		return result.toString();
	}

} //NeuralArchitectureImpl
