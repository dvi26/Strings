package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Main13 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Introduzca la palabra 1");
		String palabra1 = sc.nextLine();
		System.out.println("Introduzca la palabra 2");
		String palabra2 = sc.nextLine();
		if (anagrama(palabra1,palabra2)){
			System.out.println("Es un anagrama");
		}else {
			System.out.println("No es un anagrama");
		}
	}

	static boolean anagrama(String palabra1, String palabra2) {
		boolean res=false;
		char[] char1=palabra1.toCharArray();
		char[] char2=palabra2.toCharArray();
		Arrays.sort(char1);
		Arrays.sort(char2);
		if (Arrays.equals(char1, char2)) {
			res=true;
		}
		return res;
	}
}