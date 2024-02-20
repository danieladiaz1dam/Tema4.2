package ejercicios;

/**
 * Ejericio19
 * 
 * Escribe una función que convierte una frase (que puede estar escrita con
 * cualquier combinación de mayúsculas y minúsculas) en el nombre de una
 * variable que utilice la nomenclatura Camel. Por ejemplo, la frase “Me GUsta
 * merenDAR gaLLEtas”, se convertirá en “meGustaMerendarGalletas”. Supondremos
 * que cada palabra que compone la frase está separada por un único espacio en
 * blanco. NOTA: Puedes hacer uso de las funciones estáticas toLowerCase y
 * toUpperCase definidas en la clase Character.
 */
public class Ejercicio19 {
	
	/**
	 * Comvierte una frase en un nombre de varialbe en camel case
	 * @param frase Frase a convertir
	 * @return Nombre de la variable
	 */
    public static String convertirCamelCase(String frase) {
        String resultado = "";
        boolean siguienteMayuscula = false;

        // Para cada caracter
        for (char caracter : frase.toCharArray()) {
        	// Si el caracter es un espacio
            if (Character.isWhitespace(caracter)) {
            	// La siguiente letra es en mayusculas (nueva palabra)
                siguienteMayuscula = true;
            
            // Si la siguiente letra es mayuscula, añadirla con upperCase
            } else if (siguienteMayuscula) {
                resultado += Character.toUpperCase(caracter);
                siguienteMayuscula = false;
            
            // Si no, añadirla con lowerCase
            } else {
                resultado += Character.toLowerCase(caracter);
            }
        }

        return resultado;
    }

    public static void main(String[] args) {
        String frase = "Me GUsta merenDAR gaLLEtas";
        System.out.println(convertirCamelCase(frase));
    }
}