/**
 */
package mlam.impl;

import java.util.Collection;

import mlam.MlamPackage;
import mlam.Specification;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mlam.impl.SpecificationImpl#getProblemDefinition <em>Problem Definition</em>}</li>
 *   <li>{@link mlam.impl.SpecificationImpl#getObservation <em>Observation</em>}</li>
 *   <li>{@link mlam.impl.SpecificationImpl#getDecision <em>Decision</em>}</li>
 *   <li>{@link mlam.impl.SpecificationImpl#getMetrics <em>Metrics</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecificationImpl extends DocumentationImpl implements Specification {
	/**
	 * The default value of the '{@link #getProblemDefinition() <em>Problem Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemDefinition()
	 * @generated
	 * @ordered
	 */
	protected static final String PROBLEM_DEFINITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProblemDefinition() <em>Problem Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemDefinition()
	 * @generated
	 * @ordered
	 */
	protected String problemDefinition = PROBLEM_DEFINITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getObservation() <em>Observation</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservation()
	 * @generated
	 * @ordered
	 */
	protected EList<String> observation;

	/**
	 * The cached value of the '{@link #getDecision() <em>Decision</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecision()
	 * @generated
	 * @ordered
	 */
	protected EList<String> decision;

	/**
	 * The cached value of the '{@link #getMetrics() <em>Metrics</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetrics()
	 * @generated
	 * @ordered
	 */
	protected EList<String> metrics;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MlamPackage.Literals.SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProblemDefinition() {
		return problemDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProblemDefinition(String newProblemDefinition) {
		String oldProblemDefinition = problemDefinition;
		problemDefinition = newProblemDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MlamPackage.SPECIFICATION__PROBLEM_DEFINITION, oldProblemDefinition, problemDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getObservation() {
		if (observation == null) {
			observation = new EDataTypeUniqueEList<String>(String.class, this, MlamPackage.SPECIFICATION__OBSERVATION);
		}
		return observation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getDecision() {
		if (decision == null) {
			decision = new EDataTypeUniqueEList<String>(String.class, this, MlamPackage.SPECIFICATION__DECISION);
		}
		return decision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getMetrics() {
		if (metrics == null) {
			metrics = new EDataTypeUniqueEList<String>(String.class, this, MlamPackage.SPECIFICATION__METRICS);
		}
		return metrics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MlamPackage.SPECIFICATION__PROBLEM_DEFINITION:
				return getProblemDefinition();
			case MlamPackage.SPECIFICATION__OBSERVATION:
				return getObservation();
			case MlamPackage.SPECIFICATION__DECISION:
				return getDecision();
			case MlamPackage.SPECIFICATION__METRICS:
				return getMetrics();
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
			case MlamPackage.SPECIFICATION__PROBLEM_DEFINITION:
				setProblemDefinition((String)newValue);
				return;
			case MlamPackage.SPECIFICATION__OBSERVATION:
				getObservation().clear();
				getObservation().addAll((Collection<? extends String>)newValue);
				return;
			case MlamPackage.SPECIFICATION__DECISION:
				getDecision().clear();
				getDecision().addAll((Collection<? extends String>)newValue);
				return;
			case MlamPackage.SPECIFICATION__METRICS:
				getMetrics().clear();
				getMetrics().addAll((Collection<? extends String>)newValue);
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
			case MlamPackage.SPECIFICATION__PROBLEM_DEFINITION:
				setProblemDefinition(PROBLEM_DEFINITION_EDEFAULT);
				return;
			case MlamPackage.SPECIFICATION__OBSERVATION:
				getObservation().clear();
				return;
			case MlamPackage.SPECIFICATION__DECISION:
				getDecision().clear();
				return;
			case MlamPackage.SPECIFICATION__METRICS:
				getMetrics().clear();
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
			case MlamPackage.SPECIFICATION__PROBLEM_DEFINITION:
				return PROBLEM_DEFINITION_EDEFAULT == null ? problemDefinition != null : !PROBLEM_DEFINITION_EDEFAULT.equals(problemDefinition);
			case MlamPackage.SPECIFICATION__OBSERVATION:
				return observation != null && !observation.isEmpty();
			case MlamPackage.SPECIFICATION__DECISION:
				return decision != null && !decision.isEmpty();
			case MlamPackage.SPECIFICATION__METRICS:
				return metrics != null && !metrics.isEmpty();
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
		result.append(" (problemDefinition: ");
		result.append(problemDefinition);
		result.append(", observation: ");
		result.append(observation);
		result.append(", decision: ");
		result.append(decision);
		result.append(", metrics: ");
		result.append(metrics);
		result.append(')');
		return result.toString();
	}

} //SpecificationImpl
