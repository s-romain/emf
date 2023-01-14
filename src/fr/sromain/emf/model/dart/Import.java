/**
 */
package fr.sromain.emf.model.dart;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.sromain.emf.model.dart.Import#getDartResource <em>Dart Resource</em>}</li>
 *   <li>{@link fr.sromain.emf.model.dart.Import#getAs <em>As</em>}</li>
 *   <li>{@link fr.sromain.emf.model.dart.Import#getShow <em>Show</em>}</li>
 *   <li>{@link fr.sromain.emf.model.dart.Import#getHide <em>Hide</em>}</li>
 *   <li>{@link fr.sromain.emf.model.dart.Import#getMetadata <em>Metadata</em>}</li>
 * </ul>
 *
 * @see fr.sromain.emf.model.dart.DartPackage#getImport()
 * @model
 * @generated
 */
public interface Import extends EObject {
	/**
	 * Returns the value of the '<em><b>Dart Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dart Resource</em>' reference.
	 * @see #setDartResource(DartResource)
	 * @see fr.sromain.emf.model.dart.DartPackage#getImport_DartResource()
	 * @model
	 * @generated
	 */
	DartResource getDartResource();

	/**
	 * Sets the value of the '{@link fr.sromain.emf.model.dart.Import#getDartResource <em>Dart Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dart Resource</em>' reference.
	 * @see #getDartResource()
	 * @generated
	 */
	void setDartResource(DartResource value);

	/**
	 * Returns the value of the '<em><b>As</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>As</em>' attribute.
	 * @see #setAs(String)
	 * @see fr.sromain.emf.model.dart.DartPackage#getImport_As()
	 * @model
	 * @generated
	 */
	String getAs();

	/**
	 * Sets the value of the '{@link fr.sromain.emf.model.dart.Import#getAs <em>As</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>As</em>' attribute.
	 * @see #getAs()
	 * @generated
	 */
	void setAs(String value);

	/**
	 * Returns the value of the '<em><b>Show</b></em>' reference list.
	 * The list contents are of type {@link fr.sromain.emf.model.dart.DartResource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show</em>' reference list.
	 * @see fr.sromain.emf.model.dart.DartPackage#getImport_Show()
	 * @model
	 * @generated
	 */
	EList<DartResource> getShow();

	/**
	 * Returns the value of the '<em><b>Hide</b></em>' reference list.
	 * The list contents are of type {@link fr.sromain.emf.model.dart.DartResource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hide</em>' reference list.
	 * @see fr.sromain.emf.model.dart.DartPackage#getImport_Hide()
	 * @model
	 * @generated
	 */
	EList<DartResource> getHide();

	/**
	 * Returns the value of the '<em><b>Metadata</b></em>' reference list.
	 * The list contents are of type {@link fr.sromain.emf.model.dart.Metadata}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata</em>' reference list.
	 * @see fr.sromain.emf.model.dart.DartPackage#getImport_Metadata()
	 * @model
	 * @generated
	 */
	EList<Metadata> getMetadata();

} // Import
