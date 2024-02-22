package ejercicios;

import java.util.Random;
import java.util.Scanner;

public class Main16 {
	static Scanner sc = new Scanner(System.in);
	static Random random = new Random();

	public static void main(String[] args) {
		String cadena = sc.nextLine();
		char[] char1 = anagrama(cadena);
		String res = "";
		int letras = 0;
		while (!res.equals(cadena)) {
			System.out.println("¿Cual es la palabra original?");
			res = sc.nextLine();
			if (!res.equals(cadena)) {
				System.out.println(char1);
			}
			for (int i = 0; i < cadena.length(); i++) {
				if (i == cadena.length()-1) {
					System.out.println("Hay " + letras + " letras en la misma posicion que en la palabra original");
				}
				letras = 0;
				if (char1[i] == cadena.toCharArray()[i]) {
					letras++;
				}
			}
			char1 = anagrama(cadena);
		}
	}

	static char[] anagrama(String cadena) {
		char[] char1 = cadena.toCharArray();
		char[] char2 = new char[cadena.length()];
		int nrandom = random.nextInt(0, char1.length);
		for (int i = 0; i < cadena.length(); i++) {
			while (char1[nrandom] == ' ') {
				nrandom = random.nextInt(0, char1.length);
			}
			char2[i] = char1[nrandom];
			char1[nrandom] = ' ';

		}
		return char2;
	}
}
