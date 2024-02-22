package ejercicios;

public class Main3 {

	public static void main(String[] args) {
		String cadena = "En esta frase hay 5 espacios";
		int nEspacios = Cadena(cadena);
		System.out.println("Hay " + nEspacios + " espacios");
	}

	public static int Cadena(String cadena) {
		int espacios = 0;
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.equals("")) {
				espacios++;
			}
		}
		return espacios;
	}
}
