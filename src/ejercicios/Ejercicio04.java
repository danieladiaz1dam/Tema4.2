package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Ejercicio04
 * 
 * Implementa un programa que lea una frase y muestre todas sus palabras
 * ordenadas de forma alfabética. Suponemos que cada palabra de la frase se
 * separa de otra por un único espacio.
 */
public class Ejercicio04 {
	public static String[] ordenarFrase(String str) {
		final String[] listaPalabras = str.split(" ");
		
		Arrays.sort(listaPalabras);
		
		return listaPalabras;
	}
	
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		String frase = "";

		System.out.println("Introduce una frase:");
		frase = sc.nextLine();

		System.out.println(Arrays.toString(ordenarFrase(frase)));
		
		sc.close();
	}
}
