package ejercicios;

import java.util.Scanner;

/**
 * Ejercicio07
 * 
 * Diseñar una función que reciba por parámetros una frase y una palabra. Debe
 * devolver cuántas veces aparece la palabra en la frase.
 */
public class Ejercicio07 {
	/**
	 * Cuenta cuantas veces se repita una palabra completa en una frase
	 * 
	 * @param frase   Frase donde buscar
	 * @param palabra Palabra que buscar
	 * @return Veces que la palabra se repite
	 */
	public static int contarPalabra(String frase, String palabra) {
		int contador = 0;
		int pos, lastPos = 0;

		// Mirar si la frase empieza por esa palabra
		if (frase.startsWith(palabra + " "))
			contador++;

		// Buscar palabras enteras
		palabra = " " + palabra + " ";

		do {
			pos = frase.indexOf(palabra, lastPos);
			lastPos = pos + 1;
			contador++;
		} while (pos != -1);

		return --contador;
	}

	/**
	 * Metodo Main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		String frase;
		String palabra;

		System.out.println("introduce una frase");
		frase = sc.nextLine();
		System.out.println("Que palabra quieres buscar?");
		palabra = sc.next();

		System.out.println(contarPalabra(frase, palabra));

		sc.close();
	}
}
