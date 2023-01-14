/**
 */
package fr.sromain.emf.model.dart;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.sromain.emf.model.dart.Part#getPartOf <em>Part Of</em>}</li>
 * </ul>
 *
 * @see fr.sromain.emf.model.dart.DartPackage#getPart()
 * @model abstract="true"
 * @generated
 */
public interface Part extends DartResource {
	/**
	 * Returns the value of the '<em><b>Part Of</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.sromain.emf.model.dart.Library#getParts <em>Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part Of</em>' reference.
	 * @see #setPartOf(Library)
	 * @see fr.sromain.emf.model.dart.DartPackage#getPart_PartOf()
	 * @see fr.sromain.emf.model.dart.Library#getParts
	 * @model opposite="parts"
	 * @generated
	 */
	Library getPartOf();

	/**
	 * Sets the value of the '{@link fr.sromain.emf.model.dart.Part#getPartOf <em>Part Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part Of</em>' reference.
	 * @see #getPartOf()
	 * @generated
	 */
	void setPartOf(Library value);

} // Part
