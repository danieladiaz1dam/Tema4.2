package ejercicios;

import java.util.Scanner;

/**
 * Ejercicio01
 */
public class Ejercicio01 {
	/**
	 * Metodo Main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		String str1;
		String str2;
		
		System.out.println("Introduce una frase:");
		str1 = sc.nextLine();
		System.out.println("Introduce otra frase");
		str2 = sc.nextLine();
		
		if (str1.length() < str2.length()) {
			System.out.println("La primera frase es mas larga");
		} else {
			System.out.println("La segunda frase es mas larga");
		}
		
		sc.close();
	}
}
