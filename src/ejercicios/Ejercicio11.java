package ejercicios;

import java.util.Scanner;

/**
 * Ejercicio11
 * 
 * 
 */
public class Ejercicio11 {
	/**
	 * Descodifica un caracter
	 * 
	 * @param conjunto1 Conjunto de caracteres originales
	 * @param conjunto2 Conjunto de caracteres codificados
	 * @param c         Caracter a descodificar
	 * @return Caracter descodificao
	 */
	public static char descodifica(char[] conjunto1, char[] conjunto2, char c) {
		char newChar = c;
		boolean found = false;
		int index = 0;

		// Buscar caracter en el conjunto de caracteres codificados
		while (!found && index < conjunto2.length) {
			// Si lo encontramos, devolver el caracter descodificado y parar bucle
			if (c == conjunto2[index]) {
				newChar = conjunto1[index];
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
		final char[] conjunto1 = { 'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v' };
		final char[] conjunto2 = { 'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's' };
		final Scanner sc = new Scanner(System.in);
		String frase;
		String fraseCodificada = "";
		int index = 0;

		System.out.println("Introduce una frase");
		frase = sc.nextLine().toLowerCase();
		
		// Descodificar todos los caracteres de la frase
		while (index < frase.length()) {
			fraseCodificada += descodifica(conjunto1, conjunto2, frase.charAt(index));
			index++;
		}

		System.out.println(fraseCodificada);

		sc.close();
	}
}
