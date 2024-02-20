package ejercicios;

import java.util.Scanner;

/**
 * Ejercicio18
 * 
 * Escribe una función que reciba el título y el contenido de una página web. La
 * función devolverá una cadena con un código HTML, donde el título será un
 * encabezado de primer nivel (
 * <h1>), y el resto del contenido será un párrafo (
 * <p>
 * ). El documento HTML debe contar con todas las etiquetas mínimas que todo
 * documento HTML tiene.
 */
public class Ejercicio18 {
	// Plantilla de documento HTML
	final static String HTML_TEMPLATE = "<!DOCTYPE html>\n"
			+ "<html lang=\"en\">\n"
			+ "<head>\n"
			+ "    <meta charset=\"UTF-8\">\n"
			+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
			+ "    <title>%s</title>\n"
			+ "</head>\n"
			+ "<body>\n"
			+ "    <h1>%s</h1>\n"
			+ "    <p>%s</p>\n"
			+ "</body>\n"
			+ "</html>";
	
	public static void main(String[] args) {
		String title;
		String content;
		final Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el titulo de tu pagina");
		title = sc.nextLine();
		System.out.println("Introduce el contenido:");
		content = sc.nextLine();
		
		// Formatear el string introduciendo el titulo y el contenido
		System.out.println(HTML_TEMPLATE.formatted(title, title, content));
		
		sc.close();
	}
}
