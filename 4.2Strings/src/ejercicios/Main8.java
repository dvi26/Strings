package ejercicios;

import java.util.Arrays;

public class Main8 {

	public static void main(String[] args) {
		String cadena = "Dabale arroz a la zorra el abad";
		Cadena(cadena);

	}

	public static void Cadena(String cadena) {

		char[] letras = cadena.toCharArray();
		System.out.println(Arrays.toString(letras));
		char[] letrasI = new char[letras.length];
		for (int i = 0; i < letras.length; i++) {
			letrasI[i] = letras[letras.length - (i + 1)];

		}
		System.out.println(Arrays.toString(letrasI));
	}
}
