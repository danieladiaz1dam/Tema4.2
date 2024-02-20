package ejercicios;

/**
 * Ejercicio17
 * 
 * El preprocesador del lenguaje C elimina los comentarios del código fuente
 * antes de compilar. Diseña una función que reciba como parámetro una sentencia
 * en C,y devuelva una cadena sin los comentarios:
 */
public class Ejercicio17 {
	public static String eliminarComentarios(String frase) {
		String result = "";
		boolean comment = false;
		
		for (int i = 0; i < frase.length(); i++) {
			// Si estamos dentro del comentario
			if (comment) {
				// fin comentario
				if(frase.charAt(i) == '*' && frase.charAt(i+1) == '/') {
					comment = false;
					i++; // Saltarnos la barra
				}
			}
			// si no estamos dentro del comentario
			else {
				// inicio comentario
				if (frase.charAt(i) == '/' && frase.charAt(i+1) == '*') {
					comment = true;
					i++; // Saltarnos l abarra
				} else {
					result += frase.charAt(i);
				}
			}
		}
		
		return result;
	}

	public static void main(String[] args) {
		final String frase = "if (a==3) /* igual a tres */ a++; /* incrementamos a */";
		System.out.println(eliminarComentarios(frase));
	}
}
