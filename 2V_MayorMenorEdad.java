import java.util.Scanner;

public class Carga10numeros {
	/*
	Carga edades en un vector entero de 15 posiciones, y se imprime el mayor y el menor.
	*/
	public static void main (String[] args) {
		int edades[] = new int[15];
		Scanner teclado = new Scanner(System.in);
		int edadMayor = 0;
		int edadMenor = 100;

		for (int i = 0	; i < edades.length; i++) {
			System.out.print("Ingrese una edad: ");
			int entrada = teclado.nextInt();
			edades[i] = entrada;
		
			if (edadMayor < edades[i]) {
				edadMayor = edades[i];
			}
			if (edadMenor > edades[i]) {
				edadMenor = edades[i];
			}
		}
		System.out.println("La edad mayor es: " + edadMayor);
		System.out.println("La edad menor es: " + edadMenor);
	}
}
