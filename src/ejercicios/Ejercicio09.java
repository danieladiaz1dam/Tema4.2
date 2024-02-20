package ejercicios;

/**
 * Ejercicio09
 * 
 * Los habitantes de Javalandia tienen un idioma algo extraño; cuando hablan
 * siempre comienzan sus frases con “Javalín, javalón”, para después hacer una
 * pausa más o menos larga (la pausa se representa mediante espacios en blanco o
 * tabuladores) y a continuación expresan el mensaje. Existe un dialecto que no
 * comienza sus frases con la muletilla anterior, pero siempre las terminan con
 * un silencio, más o menos prolongado y la coletilla “javalén, len, len”. Se
 * pide diseñar un traductor que, en primer lugar, nos diga si la frase
 * introducida está escrita en el idioma de Javalandia (en cualquiera de sus
 * dialectos), y en caso afirmativo, nos muestre solo el mensaje sin muletillas.
 * 
 */
public class Ejercicio09 {
	private static final String JAVALIN = "Javalin, javalon";
	private static final String JAVALEN = "javalen, len, len.";

	/**
	 * Chekear si una frase pertenece a algun dialecto
	 * @param frase Frase para analizar
	 * @return 0 no pertenece, 1 dialecto javalin, javalon, 2 dialecto javalen, len, len
	 */
	public static int esJavalandia(String frase) {
		int ret = 0;
		if (frase.startsWith(JAVALIN))
			ret = 1;
		else if (frase.endsWith(JAVALEN))
			ret = 2;
		return ret;
	}
	
	/**
	 * Traduce una frase si es posible
	 * @param frase Frase para traducir
	 * @return frase traducida
	 */
	public static String traducir(String frase) {
		String result = "";
		switch (esJavalandia(frase)) {
		case 0: 
			result = frase;
			break;
		case 1:
			result = frase.replace(JAVALIN, "").trim();
			break;
		case 2:
			result = frase.replace(JAVALEN, "").trim();
			break;
		}
		
		return result;
	}

	public static void main(String[] args) {
		final String fraseJavalin = JAVALIN + "       hola buenos dias.";
		final String fraseJavalen = "Hola como estas?              " + JAVALEN;
		final String fraseSinDialecto = "Que buen dia hace hoy.";
		
		System.out.println(traducir(fraseJavalin));
		System.out.println(traducir(fraseJavalen));
		System.out.println(traducir(fraseSinDialecto));
	}
}
