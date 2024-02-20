package ejercicios;

import java.util.Arrays;

/**
 * Ejercicio20
 * 
 * Construir una función que convierta una palabra pasada por parámetro en
 * secuencias de n letras. El valor n también debe ser un parámetro de entrada.
 */
public class Ejercicio20 {
	/*ng palabra, int n) {
		String[] arr = new String[(int)ng palabra, int n) {
		String[] arr = new String[(int)*
	 * Separa una palabra cachitos de n letras
	 * 
	 * @param palabra Palabra a separar
	 * @param n       Cuantas letras hay en cada cachito
	 * @return Array de Strings con n caracteres cada uno
	 */
	public static String[] separar(String palabra, int n) {
		// Nuevo array con huecos necesarios
		String[] arr = new String[(int) Math.ceil((float) palabra.length() / n)];

		// Recorrer el array
		for (int i = 0; i < arr.length; i++) {
			// Si no se pueden coger las n leras, coger las q se puedan
			if (i * n + n > palabra.length())
				arr[i] = palabra.substring(i * n);
			else
				arr[i] = palabra.substring(i * n, i * n + n);
		}

		return arr;
	}

	public static void main(String[] args) {
		final String palabra = "Destornillador";
		System.out.println(Arrays.toString(separar(palabra, 4)));
	}
}
