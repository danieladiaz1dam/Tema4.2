package ejercicios;

import java.util.Arrays;

/**
 * Ejercicio13
 * 
 * Un anagrama es una palabra, o frase, que resulta de la transposición de otra
 * palabra o frase. Ejemplos de anagramas para la palabra roma son: amor, ramo o
 * mora. Construir una función que recibe dos palabras por parámetro e indique
 * si son anagramas una de otra.
 */
public class Ejercicio13 {
	/**
	 * Comprueba si dos palabras son anagramas
	 * 
	 * @param palabra1
	 * @param palabra2
	 * @return true si son anagramas, false en caso contrario
	 */
	public static boolean esAnagrama(String palabra1, String palabra2) {
		// Mirar si al ordenar las letras de las dos palabras alfabeticamente son
		// iguales
		char[] cPalabra1 = palabra1.toCharArray();
		char[] cPalabra2 = palabra2.toCharArray();
		Arrays.sort(cPalabra1);
		Arrays.sort(cPalabra2);
		return Arrays.equals(cPalabra1, cPalabra2);
	}

	public static void main(String[] args) {
		final String palabra1 = "ramo";
		final String palabra2 = "amor";
		System.out.println(esAnagrama(palabra1, palabra2) ? "Es un anagrama" : "No es un anagrma");
	}
}
