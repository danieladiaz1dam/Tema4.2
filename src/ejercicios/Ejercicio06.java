package ejercicios;

import java.util.Scanner;

/**
 * Ejercicio06
 * 
 * Introducir por teclado una frase palabra a palabra, y mostrar la frase
 * completa separando las palabras introducidas con espacios en blanco. Terminar
 * de leer la frase cuando alguna de las palabras introducidas sea la cadena
 * “fin” escrita con cualquier combinación de mayúsculas/minúsculas. La cadena
 * “fin” no aparecerá en la frase final.
 */
public class Ejercicio06 {
	/**
	 * Metodo Main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Input del usuario
		String input;
		// String donde ir guardando las palabras
		String result = "";

		// Pedir palabras hasta que se introduzca "fin"
		System.out.println("Introduce palabras (\"fin\" para terminar)");
		do {
			System.out.printf("> ");
			// Guardar solo una palabras
			input = sc.next();
			result += input + " ";
			// Limpiar el salto de linea
			sc.nextLine();
		} while (!input.equals("fin"));
		
		// Imprimir el resultado sin espacios al final
		System.out.println(result.trim());
		
		// Cerrar scanner
		sc.close();
	}
}
