package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Main12 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String frase = sc.nextLine();
		int letras = 0;
		int maximo=0;
		char[] fraseC = frase.toCharArray();
		System.out.println(Arrays.toString(fraseC));
		for (int i = 0; i < fraseC.length; i++) {

			if (fraseC[i] != ' ' ) {
				letras++;
			} else {

				System.out.println("La palabra " + "tiene " + maximo + " letras");
				if (maximo<letras || maximo==0) {
				maximo=maximo+letras;
				}
				letras = 0;
			}

		}

	}

}
