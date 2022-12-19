/**
 */
package mlam;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Random Seed</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mlam.RandomSeed#getDtype <em>Dtype</em>}</li>
 * </ul>
 *
 * @see mlam.MlamPackage#getRandomSeed()
 * @model
 * @generated
 */
public interface RandomSeed extends Data {
	/**
	 * Returns the value of the '<em><b>Dtype</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dtype</em>' attribute list.
	 * @see mlam.MlamPackage#getRandomSeed_Dtype()
	 * @model required="true"
	 * @generated
	 */
	EList<Integer> getDtype();

} // RandomSeed
