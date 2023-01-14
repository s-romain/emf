package fr.sromain.emf;

import static java.text.MessageFormat.format;

public class Application {

	public static void main(String[] args) {
		log("Hello {0}", "Sébastien");
	}

	private static void log(String m, Object... p) {
		System.out.println(format(m, p));
	}
}
