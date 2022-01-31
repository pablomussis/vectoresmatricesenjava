import java.util.Scanner;

public class CargarGoles {
	/*
	Cargar goles en una matriz de 5x3 y en un vector de 5 posiciones.
	*/
	public static void main (String[] args) {
		int goles[][] = new int [5][3];
		float promediosGoles[] = new float [5];

		Scanner teclado = new Scanner (System.in);

		for (int f = 0; f < 5; f++) {
			for (int c = 0; c < 3; c++) {
				System.out.print("Ingrese cantidad de goles: ");
				int entrada = teclado.nextInt();
				goles[f][c] = entrada;
			}
		}

		for (int f = 0; f < 5; f++) {
			float prom = 0;
			for (int c = 0; c < 3; c++) {
				prom = prom + goles[f][c];
			}
			promediosGoles[f] = prom / 3;
		}
		
		for (int f = 0; f < 5; f++) {
			System.out.println("Los promedios de goles es: " + promediosGoles[f]);
		}

	}
}