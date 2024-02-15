package ejercicios;

/**
 * Ejercicio05
 * 
 * Diseñar una función a la que se le pase una cadena de caracteres y la
 * devuelva invertida. Un ejemplo, la cadena “Hola mundo” quedaría “odnum aloH”.
 * Recuerda probar la función en un main.
 */
public class Ejercicio05 {

	public static String bubbleSort(char[] palabra) {
		int index = 1;
		char tmp;

		while (index < palabra.length) {
			for (int i = 0; i < palabra.length - index; i++) {
				if (palabra[i] > palabra[i + 1]) {
					tmp = palabra[i];
					palabra[i] = palabra[i + 1];
					palabra[i + 1] = tmp;
				}
			}

			index++;
		}

		return String.valueOf(palabra);
	}

	public static String ordenarPalabrasFrase(String frase) {
		String[] palabras = frase.split(" ");
		String result = "";

		for (String palabra : palabras) {
			result += bubbleSort(palabra.toCharArray()) + " ";
		}

		return result.trim();
	}

	/**
	 * Metodo Main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		final String hello = "Hola mundo";
		for (int i = hello.length() - 1; i >= 0; i--)
			System.out.printf("%c", hello.charAt(i));

	}
}
