package ejercicios;

/**
 * Ejercicio14
 * 
 * Diseñar un algoritmo que lea del teclado una frase e indique, para la letras
 * que aparecen en la frase, cuántas veces se repite cada una. Se consideran
 * iguales las letras mayúsculas y las minúsculas para realizar la cuenta.
 */
public class Ejercicio14 {
	public static int[] contadorLetras(String frase) {
		int[] abecedario = new int[25]; // 'z' - 'a'
		char[] cFrase = frase.toLowerCase().toCharArray();

		// Para cada caracter
		for (char c : cFrase) {
			// Sumar 1 al contador de cada letra
			// caracter - 'a' hace q se le reste el valor de 'a' a cada letra
			// por lo tanto 'a' - 'a' se guardaria en 0, 'b' - 'a' se guardaria en 1...
			if (Character.isAlphabetic(c))
				abecedario[c - 'a']++;
		}

		return abecedario;
	}

	public static void main(String[] args) {
		final String frase = "En un lugar de la Mancha";
		int[] letras = contadorLetras(frase);

		for (int i = 0; i < letras.length; i++) {
			if (letras[i] > 0)
				System.out.printf("%c: %d veces\n", i + 'a', letras[i]);
		}
	}
}
