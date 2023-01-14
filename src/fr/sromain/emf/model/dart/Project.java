/**
 */
package fr.sromain.emf.model.dart;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.sromain.emf.model.dart.Project#getName <em>Name</em>}</li>
 *   <li>{@link fr.sromain.emf.model.dart.Project#getPackages <em>Packages</em>}</li>
 * </ul>
 *
 * @see fr.sromain.emf.model.dart.DartPackage#getProject()
 * @model
 * @generated
 */
public interface Project extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fr.sromain.emf.model.dart.DartPackage#getProject_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.sromain.emf.model.dart.Project#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Packages</b></em>' containment reference list.
	 * The list contents are of type {@link fr.sromain.emf.model.dart.Package}.
	 * It is bidirectional and its opposite is '{@link fr.sromain.emf.model.dart.Package#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packages</em>' containment reference list.
	 * @see fr.sromain.emf.model.dart.DartPackage#getProject_Packages()
	 * @see fr.sromain.emf.model.dart.Package#getProject
	 * @model opposite="project" containment="true"
	 * @generated
	 */
	EList<fr.sromain.emf.model.dart.Package> getPackages();

} // Project
