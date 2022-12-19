/**
 */
package mlam.impl;

import java.util.Collection;
import java.util.Date;

import mlam.Experiment;
import mlam.MlamPackage;
import mlam.Run;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Experiment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mlam.impl.ExperimentImpl#getId <em>Id</em>}</li>
 *   <li>{@link mlam.impl.ExperimentImpl#getName <em>Name</em>}</li>
 *   <li>{@link mlam.impl.ExperimentImpl#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link mlam.impl.ExperimentImpl#getLastUpdateDate <em>Last Update Date</em>}</li>
 *   <li>{@link mlam.impl.ExperimentImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link mlam.impl.ExperimentImpl#getRun <em>Run</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExperimentImpl extends MinimalEObjectImpl.Container implements Experiment {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected Date creationDate = CREATION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastUpdateDate() <em>Last Update Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastUpdateDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_UPDATE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastUpdateDate() <em>Last Update Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastUpdateDate()
	 * @generated
	 * @ordered
	 */
	protected Date lastUpdateDate = LAST_UPDATE_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRun() <em>Run</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRun()
	 * @generated
	 * @ordered
	 */
	protected EList<Run> run;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExperimentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MlamPackage.Literals.EXPERIMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlamPackage.EXPERIMENT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlamPackage.EXPERIMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCreationDate() {
		return creationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationDate(Date newCreationDate) {
		Date oldCreationDate = creationDate;
		creationDate = newCreationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlamPackage.EXPERIMENT__CREATION_DATE, oldCreationDate, creationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastUpdateDate(Date newLastUpdateDate) {
		Date oldLastUpdateDate = lastUpdateDate;
		lastUpdateDate = newLastUpdateDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlamPackage.EXPERIMENT__LAST_UPDATE_DATE, oldLastUpdateDate, lastUpdateDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlamPackage.EXPERIMENT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Run> getRun() {
		if (run == null) {
			run = new EObjectContainmentEList<Run>(Run.class, this, MlamPackage.EXPERIMENT__RUN);
		}
		return run;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MlamPackage.EXPERIMENT__RUN:
				return ((InternalEList<?>)getRun()).basicRemove(otherEnd, msgs);
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
			case MlamPackage.EXPERIMENT__ID:
				return getId();
			case MlamPackage.EXPERIMENT__NAME:
				return getName();
			case MlamPackage.EXPERIMENT__CREATION_DATE:
				return getCreationDate();
			case MlamPackage.EXPERIMENT__LAST_UPDATE_DATE:
				return getLastUpdateDate();
			case MlamPackage.EXPERIMENT__DESCRIPTION:
				return getDescription();
			case MlamPackage.EXPERIMENT__RUN:
				return getRun();
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
			case MlamPackage.EXPERIMENT__ID:
				setId((String)newValue);
				return;
			case MlamPackage.EXPERIMENT__NAME:
				setName((String)newValue);
				return;
			case MlamPackage.EXPERIMENT__CREATION_DATE:
				setCreationDate((Date)newValue);
				return;
			case MlamPackage.EXPERIMENT__LAST_UPDATE_DATE:
				setLastUpdateDate((Date)newValue);
				return;
			case MlamPackage.EXPERIMENT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case MlamPackage.EXPERIMENT__RUN:
				getRun().clear();
				getRun().addAll((Collection<? extends Run>)newValue);
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
			case MlamPackage.EXPERIMENT__ID:
				setId(ID_EDEFAULT);
				return;
			case MlamPackage.EXPERIMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MlamPackage.EXPERIMENT__CREATION_DATE:
				setCreationDate(CREATION_DATE_EDEFAULT);
				return;
			case MlamPackage.EXPERIMENT__LAST_UPDATE_DATE:
				setLastUpdateDate(LAST_UPDATE_DATE_EDEFAULT);
				return;
			case MlamPackage.EXPERIMENT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case MlamPackage.EXPERIMENT__RUN:
				getRun().clear();
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
			case MlamPackage.EXPERIMENT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case MlamPackage.EXPERIMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MlamPackage.EXPERIMENT__CREATION_DATE:
				return CREATION_DATE_EDEFAULT == null ? creationDate != null : !CREATION_DATE_EDEFAULT.equals(creationDate);
			case MlamPackage.EXPERIMENT__LAST_UPDATE_DATE:
				return LAST_UPDATE_DATE_EDEFAULT == null ? lastUpdateDate != null : !LAST_UPDATE_DATE_EDEFAULT.equals(lastUpdateDate);
			case MlamPackage.EXPERIMENT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case MlamPackage.EXPERIMENT__RUN:
				return run != null && !run.isEmpty();
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
		result.append(" (Id: ");
		result.append(id);
		result.append(", Name: ");
		result.append(name);
		result.append(", CreationDate: ");
		result.append(creationDate);
		result.append(", LastUpdateDate: ");
		result.append(lastUpdateDate);
		result.append(", Description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //ExperimentImpl
