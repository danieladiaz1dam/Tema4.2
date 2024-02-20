package ejercicios;

import java.util.Scanner;

/**
 * Ejercicio15
 * 
 * Implementar el juego del anagrama, que consiste en que un jugador escribe una
 * palabra o frase, y la aplicación muestra un anagrama (transposición de los
 * caracteres) del texto introducido generado al azar. A continuación otro
 * jugador tiene que acertar cuál es el texto original. La aplicación no debe
 * permitir que el texto introducido por el jugador 1 sea la cadena vacía. Por
 * ejemplo, si el jugador 1 escribe “teclado”, la aplicación muestra como pista
 * un anagrama al azar: “etcloda”. Crea una función que realice la desordenación
 * del texto.
 */
public class Ejercicio15 {
	/**
	 * Devuelve un String que contiene los caracteres acertados y los noacertados se
	 * sustituyen por '?'
	 * 
	 * @param palabra
	 * @param input
	 */
	public static String acertado(char[] palabra, char[] input) {
		char[] acertado = new char[palabra.length];

		for (int i = 0; i < palabra.length; i++) {
			if (palabra[i] == input[i])
				acertado[i] = palabra[i];
			else
				acertado[i] = '?';
		}

		return String.valueOf(acertado);
	}

	/**
	 * Desordena una palabra para hacer un anagrama
	 * 
	 * @param palabra
	 * @return anagrama
	 */
	public static String desordenar(String palabra) {
		char[] anagrama = new char[palabra.length()];

		// Posicion aleatoria y index para leer y escribir respectivamente
		int pos = 0, i = 0;

		// Vamos recorreindo las letras de la palabra
		while (i < palabra.length()) {
			// La intentamos guardar en una posicion random
			pos = (int) (Math.random() * palabra.length());
			// Si no hemos escrito ya en esa posicion
			if (anagrama[pos] == 0) {
				// Guardar la letra
				anagrama[pos] = palabra.charAt(i);
				// Pasar a la siguiente letra
				i++;
			}
		}

		return new String(anagrama);
	}

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		String palabra;
		String anagrama;
		String input = "";
		String acertado;

		System.out.println("Introduce una palabra: ");
		palabra = sc.next();
		sc.nextLine();

		anagrama = desordenar(palabra);

		do {
			System.out.printf("El anagrama es %s\n", anagrama);
			System.out.println("Intenta adivinarlo: ");
			input = sc.nextLine();
			acertado = acertado(palabra.toCharArray(), input.toCharArray());
			System.out.printf("Has acertado %s\n", acertado);
		} while (!palabra.equals(input));

		sc.close();
	}
}
