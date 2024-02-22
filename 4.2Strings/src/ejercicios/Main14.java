package ejercicios;

import java.util.Scanner;

public class Main14 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String cadena = sc.nextLine();
		int letras = 0;
		char[] char1 = cadena.toCharArray();

		for (int i = 0; i - 1 < cadena.length(); i++) {
			if (i != 0 && char1[i - 1] != ' ') {
				System.out.println("La letra " + char1[i - 1] + " se repite " + letras + " veces");
			}
			letras = 0;
			if (i == cadena.length()) {
				break;
			}
			for (int j = 0; j < cadena.length(); j++) {
				if (char1[i] != ' ') {
					if (char1[i] == char1[j]) {
						letras++;
						if (j != 0 + i) {
							char1[j] = ' ';
						}
					}
				}
			}
		}
	}

}
