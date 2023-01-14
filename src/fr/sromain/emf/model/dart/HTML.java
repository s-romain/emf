/**
 */
package fr.sromain.emf.model.dart;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HTML</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.sromain.emf.model.dart.HTML#getUses <em>Uses</em>}</li>
 * </ul>
 *
 * @see fr.sromain.emf.model.dart.DartPackage#getHTML()
 * @model
 * @generated
 */
public interface HTML extends Asset {
	/**
	 * Returns the value of the '<em><b>Uses</b></em>' reference list.
	 * The list contents are of type {@link fr.sromain.emf.model.dart.Asset}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses</em>' reference list.
	 * @see fr.sromain.emf.model.dart.DartPackage#getHTML_Uses()
	 * @model
	 * @generated
	 */
	EList<Asset> getUses();

} // HTML
