package ejercicios;

import java.util.Scanner;

public class Main17 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String cadena = "if (a==3) /* igual a tres */ a++; /* incrementamos a */";
	}

	static String cadena(String cadena) {
		char char1[]=cadena.toCharArray();
		int posicion=15000;
		int posicion2;
		for (int i = 0; i < cadena.length(); i++) {
			if (char1[i]=='/') {
				posicion=i;
			}
			if (char1[i]=='/' && posicion!=15000) {
				posicion2=i;
			}
			
		}
return cadena;
		}
}
