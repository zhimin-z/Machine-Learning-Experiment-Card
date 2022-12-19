/**
 */
package mlam.impl;

import java.util.Collection;

import mlam.Code;
import mlam.Dependency;
import mlam.MlamPackage;
import mlam.SourceFile;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Code</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mlam.impl.CodeImpl#getDependency <em>Dependency</em>}</li>
 *   <li>{@link mlam.impl.CodeImpl#getSourceFile <em>Source File</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CodeImpl extends AssetImpl implements Code {
	/**
	 * The cached value of the '{@link #getDependency() <em>Dependency</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependency()
	 * @generated
	 * @ordered
	 */
	protected EList<Dependency> dependency;

	/**
	 * The cached value of the '{@link #getSourceFile() <em>Source File</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceFile()
	 * @generated
	 * @ordered
	 */
	protected EList<SourceFile> sourceFile;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MlamPackage.Literals.CODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dependency> getDependency() {
		if (dependency == null) {
			dependency = new EObjectContainmentEList<Dependency>(Dependency.class, this, MlamPackage.CODE__DEPENDENCY);
		}
		return dependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SourceFile> getSourceFile() {
		if (sourceFile == null) {
			sourceFile = new EObjectContainmentEList<SourceFile>(SourceFile.class, this, MlamPackage.CODE__SOURCE_FILE);
		}
		return sourceFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MlamPackage.CODE__DEPENDENCY:
				return ((InternalEList<?>)getDependency()).basicRemove(otherEnd, msgs);
			case MlamPackage.CODE__SOURCE_FILE:
				return ((InternalEList<?>)getSourceFile()).basicRemove(otherEnd, msgs);
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
			case MlamPackage.CODE__DEPENDENCY:
				return getDependency();
			case MlamPackage.CODE__SOURCE_FILE:
				return getSourceFile();
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
			case MlamPackage.CODE__DEPENDENCY:
				getDependency().clear();
				getDependency().addAll((Collection<? extends Dependency>)newValue);
				return;
			case MlamPackage.CODE__SOURCE_FILE:
				getSourceFile().clear();
				getSourceFile().addAll((Collection<? extends SourceFile>)newValue);
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
			case MlamPackage.CODE__DEPENDENCY:
				getDependency().clear();
				return;
			case MlamPackage.CODE__SOURCE_FILE:
				getSourceFile().clear();
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
			case MlamPackage.CODE__DEPENDENCY:
				return dependency != null && !dependency.isEmpty();
			case MlamPackage.CODE__SOURCE_FILE:
				return sourceFile != null && !sourceFile.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CodeImpl
