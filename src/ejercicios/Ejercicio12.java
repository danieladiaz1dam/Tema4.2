package ejercicios;

/**
 * Ejercicio12
 * 
 * Leer una frase y encontrar la palabra de mayor longitud. El programa debe
 * imprimir tanto la palabra como el número de caracteres de la misma.
 */
public class Ejercicio12 {
	public static String palabraMasLarga(String frase) {
		// Tamaño maximo actual
		int maxSize = 0;
		// Palabra mas larga actual
		String palabra = "";
		// Palabras de la frase
		String[] arr = frase.split(" ");

		// Comparar las palabras de la frase y guardar la mas larga y su tamaño
		for (String str : arr) {
			if (str.length() > maxSize) {
				maxSize = str.length();
				palabra = str;
			}
		}

		return palabra;
	}

	/**
	 * Metodo Main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		final String frase = "Frase con muchas palabras para comprobar";
		String palabraMasLarga = palabraMasLarga(frase);
		System.out.printf("La palabra mas larga es \"%s\" con %d caracteres", palabraMasLarga,
				palabraMasLarga.length());
	}
}
