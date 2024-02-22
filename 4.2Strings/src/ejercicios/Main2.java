package ejercicios;

import java.util.Scanner;

public class Main2 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Introduce la contraseña (J1)");
		String contraseña = sc.next();
		System.out.println("Introduzca la contraseña (J2)");
		String contraseñaJ2 = sc.next();
		while (!contraseña.equals(contraseñaJ2)) {
			System.out.println("Contraseña incorrecta, intenalo de nuevo");
			if (contraseña.compareTo(contraseñaJ2) < 0) {
				System.out.println("La cadena correcta es menor alfabeticamente");
			} else if (contraseña.compareTo(contraseñaJ2) > 0) {
				System.out.println("La cadena correcta es mayor alfabeticamente");
			}

			System.out.println("Introduzca la contraseña (J2)");
			contraseñaJ2 = sc.next();

		}

	}

}
