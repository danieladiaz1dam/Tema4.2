package ejercicios;

import java.util.Scanner;

/**
 * Ejercicio10
 * 
 * Disponemos de la siguiente relación de letras:
 * 
 * Conjunto 1: e i k m p q r s t u v Conjunto 2: p v i u m t e r k q s
 * 
 * mediante la cual es posible codificar un texto, convirtiendo cada letra del
 * conjunto 1, en su correspondiente del conjunto 2. El resto de las letras no
 * se modifican. Los conjuntos se utilizan tanto para codificar mayúsculas como
 * minúsculas, mostrando siempre la codificación en minúsculas.
 * 
 */
public class Ejercicio10 {
	/**
	 * Codifica un caracter
	 * 
	 * @param conjunto1 Conjunto de caracteres originales
	 * @param conjunto2 Conjunto de caracteres codificados
	 * @param c         Caracter a codificar
	 * @return Caracter codificao
	 */
	public static char codifica(char[] conjunto1, char[] conjunto2, char c) {
		char newChar = c;
		boolean found = false;
		int index = 0;

		// Buscar caracter en el conjunto de caracteres originales
		while (!found && index < conjunto1.length) {
			// Si lo encontramos, devolver el caracter codificado y parar bucle
			if (c == conjunto1[index]) {
				newChar = conjunto2[index];
				found = true;
			}

			index++;
		}

		return newChar;
	}

	/**
	 * Metodo Main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		final char[] CONJUNTO1 = { 'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v' };
		final char[] CONJUNTO2 = { 'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's' };
		final Scanner sc = new Scanner(System.in);
		String frase;
		String fraseCodificada = "";
		int index = 0;

		System.out.println("Introduce una frase");
		frase = sc.nextLine().toLowerCase();

		// Codificar todos los caracteres de la frase
		while (index < frase.length()) {
			fraseCodificada += codifica(CONJUNTO1, CONJUNTO2, frase.charAt(index));
			index++;
		}

		System.out.println(fraseCodificada);

		sc.close();
	}
}
