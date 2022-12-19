/**
 */
package mlam.impl;

import java.util.Collection;

import mlam.MlamPackage;
import mlam.RandomSeed;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Random Seed</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mlam.impl.RandomSeedImpl#getDtype <em>Dtype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RandomSeedImpl extends DataImpl implements RandomSeed {
	/**
	 * The cached value of the '{@link #getDtype() <em>Dtype</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDtype()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> dtype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RandomSeedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MlamPackage.Literals.RANDOM_SEED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getDtype() {
		if (dtype == null) {
			dtype = new EDataTypeUniqueEList<Integer>(Integer.class, this, MlamPackage.RANDOM_SEED__DTYPE);
		}
		return dtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MlamPackage.RANDOM_SEED__DTYPE:
				return getDtype();
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
			case MlamPackage.RANDOM_SEED__DTYPE:
				getDtype().clear();
				getDtype().addAll((Collection<? extends Integer>)newValue);
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
			case MlamPackage.RANDOM_SEED__DTYPE:
				getDtype().clear();
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
			case MlamPackage.RANDOM_SEED__DTYPE:
				return dtype != null && !dtype.isEmpty();
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

} //RandomSeedImpl
