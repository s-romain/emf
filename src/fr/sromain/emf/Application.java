package fr.sromain.emf;

import static java.text.MessageFormat.format;

import fr.sromain.emf.model.dart.DartPackage;

public class Application {

	public static void main(String[] args) {
		log("Nombre d’éléments dans le modèle : {0}", DartPackage.eINSTANCE.getEClassifiers().size());
		DartPackage.eINSTANCE.getEClassifiers().forEach(eClassifier -> log(eClassifier.getName()));
	}

	private static void log(String m, Object... p) {
		System.out.println(format(m, p));
	}
}
