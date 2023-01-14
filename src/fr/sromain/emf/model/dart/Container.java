/**
 */
package fr.sromain.emf.model.dart;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.sromain.emf.model.dart.Container#getAssets <em>Assets</em>}</li>
 * </ul>
 *
 * @see fr.sromain.emf.model.dart.DartPackage#getContainer()
 * @model abstract="true"
 * @generated
 */
public interface Container extends EObject {
	/**
	 * Returns the value of the '<em><b>Assets</b></em>' containment reference list.
	 * The list contents are of type {@link fr.sromain.emf.model.dart.Asset}.
	 * It is bidirectional and its opposite is '{@link fr.sromain.emf.model.dart.Asset#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assets</em>' containment reference list.
	 * @see fr.sromain.emf.model.dart.DartPackage#getContainer_Assets()
	 * @see fr.sromain.emf.model.dart.Asset#getContainer
	 * @model opposite="container" containment="true"
	 * @generated
	 */
	EList<Asset> getAssets();

} // Container
