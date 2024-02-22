package ejercicios;

import java.util.Arrays;

public class Main10 {

	public static void main(String[] args) {
		char conjunto1[]= {'e','i','k','m', 'p', 'q', 'r', 's', 't', 'u', 'v'};
		char conjunto2[]={'p','v','i','u', 'm', 't', 'e', 'r', 'k', 'q', 's'};
		char c;
		String cadena="PaquiTo";
		cadena=cadena.toLowerCase();
		char cadena3[]=new char [cadena.length()];
		char[] letras = cadena.toCharArray();
		for (int i=0;i<letras.length;i++) {
			c=letras[i];
			cadena3[i]=codifica(conjunto1,conjunto2,c);
			
			}	
		System.out.println(cadena3);
	}
	 static char codifica(char conjunto1[],char conjunto2[], char c) {
		for (int i=0;i<conjunto1.length;i++) {
			if (conjunto1[i]==c) {
				c=conjunto2[i];
				break;
			}
		}
			
		
		
		return c;
	}

}
