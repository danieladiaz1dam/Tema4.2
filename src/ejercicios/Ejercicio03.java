package ejercicios;

import java.util.Scanner;

/**
 * Ejercicio 03
 * 
 * Diseña una función que recibe una frase como parámetro y devuelva cuántos
 * espacios en blanco tiene. Recuerda probar la función en un main.
 */
public class Ejercicio03 {
	public static int contarEspacios(String str) {
		return str.split(" ").length - 1;
	}

	public static int contarEspacios2(String str) {
		int espacios = 0;

		for (char c : str.toCharArray()) {
			if (c == ' ')
				espacios++;
		}

		return espacios;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase = "";

		System.out.println("Introduce una frase:");
		frase = sc.nextLine();

		System.out.printf("La frase tiene %d espacios", contarEspacios2(frase));

		sc.close();
	}
}
