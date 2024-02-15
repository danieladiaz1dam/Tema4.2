package ejercicios;

/**
 * Ejercicio08
 * 
 * Realizar una función que reciba una frase como parámetro de entrada y nos
 * indique si es palíndroma, es decir, que la frase sea igual leyendo de
 * izquierda a derecha, que de derecha a izquierda, sin tener en cuenta los
 * espacios. Un ejemplo de frase palíndroma es: “Dábale arroz a la zorra el
 * abad”. Las vocales con tilde hacen que un algoritmo tome una frase palíndroma
 * como si no lo fuese. Por esto, supondremos que el usuario introduce la frase
 * sin tildes.
 */
public class Ejercicio08 {
	public static boolean esPalindroma(String frase) {
		String[] palabras = frase.split(" ");
		int i = 0;
		boolean palindroma = true;
		
		while (palindroma && i < palabras.length / 2) {
			if (palabras[i] != palabras[palabras.length-1-i])
				palindroma = false;
			
			i++;
		}
		
		return palindroma;
	}
	
	public static void main(String[] args) {
		final String frase = "Esta frase no es palidroma";
		System.out.println(esPalindroma(frase));
	}
}
