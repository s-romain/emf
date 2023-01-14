/**
 */
package fr.sromain.emf.model.dart;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.sromain.emf.model.dart.Classifier#getFields <em>Fields</em>}</li>
 *   <li>{@link fr.sromain.emf.model.dart.Classifier#getMetadata <em>Metadata</em>}</li>
 * </ul>
 *
 * @see fr.sromain.emf.model.dart.DartPackage#getClassifier()
 * @model abstract="true"
 * @generated
 */
public interface Classifier extends Part {
	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link fr.sromain.emf.model.dart.Variable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see fr.sromain.emf.model.dart.DartPackage#getClassifier_Fields()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getFields();

	/**
	 * Returns the value of the '<em><b>Metadata</b></em>' reference list.
	 * The list contents are of type {@link fr.sromain.emf.model.dart.Metadata}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata</em>' reference list.
	 * @see fr.sromain.emf.model.dart.DartPackage#getClassifier_Metadata()
	 * @model
	 * @generated
	 */
	EList<Metadata> getMetadata();

} // Classifier
