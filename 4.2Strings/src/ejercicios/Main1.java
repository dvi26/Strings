package ejercicios;

import java.util.Scanner;

public class Main1 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Cadena 1:");
		String cadena1 = sc.next();
		System.out.println("Cadena 2:");
		String cadena2 = sc.next();
		if (cadena2.length() > cadena1.length()) {
			System.out.println(cadena1 + " es la cadena más pequeña");
		} else if (cadena2.length() < cadena1.length()) {
			System.out.println(cadena2 + " es la cadena más pequeña");
		} else {
			System.out.println("Son iguales las cadenas introducidas");
		}
	}

}
