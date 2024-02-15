package ejercicios;

import java.util.Scanner;
import helper.Helper;

/**
 * Ejercicio02
 * 
 * Diseña el juego “Acierta la contraseña”. La mecánica del juego es la
 * siguiente: el primer jugador introduce la contraseña; a continuación, el
 * segundo jugador debe teclear palabras hasta que la acierte. El juego debe
 * indicar si la palabra introducida es mayor o menor alfabéticamente que la
 * contraseña.
 * 
 * VERSIÓN AVANZADA: El juego, en vez de indicar si la palabra es mayor o menor
 * alfabéticamente que la contraseña, debe mostrar una cadena con los caracteres
 * acertados en sus lugares respectivos y asteriscos en los no acertados.
 */
public class Ejercicio02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Guarda la contraseña
		String password = "";
		// Guarda los caracteres acertados
		String guessed = "";
		// Guarda el input del usuario
		String input = "";
		// Guarda los intentos que ha necesitado el usuario
		int intentos = 0;
		// Resulatdo de comparar las cadenas
		int res;
		
		System.out.print("Cual es la contraseña?:\n > ");
		password = sc.nextLine();
		
		// Inicializar guessed
		guessed = Helper.RED + "?".repeat(password.length()) + Helper.RESET;
		
		System.out.println(guessed);
		
		while (!input.equals(password) ) {
			// Pedir intento al usuario
			System.out.printf("Intento #%d: ", ++intentos);
			input = sc.nextLine();
			
			
			// Comparar el input y la contraseña
			res = password.compareTo(input);
			
			if (res > 0) {
				System.out.println("La contraseña es mayor alfabeticamente");
			} else if (res < 0) {
				System.out.println("La contraseña es menor alfabeticamente");
			}
			
			// Construir la cadena de caracteres acertados
			guessed = "";
			for (int i = 0; i < password.length(); i++) {
				if (password.charAt(i) == input.charAt(i))
					guessed += Helper.GREEN + password.charAt(i);
				else
					guessed += Helper.RED + "?";
			}
			guessed += Helper.RESET;
			
			System.out.println(guessed);
		}
		
		System.out.printf("Has acertado la contraesña en %d intentos !!", intentos);

		sc.close();
	}
}
