import java.util.Scanner;

public class HsExtras {
	/*
		Ingresar las horas trabajadas en una matriz de 15x6 posiciones
		Calcular las horas extras realizadas por los trabajadores
		Ingresarlas en una matriz de 15 posiciones
	*/
	public static void main (String[] args) {
				
		int horas[][] = new int [5][6];
		int hsExtras[] = new int [5];

		Scanner teclado = new Scanner (System.in);

		for (int f = 0; f < 5; f++) {
			// Acumulador de las horas extras
			int sumaHsExtras = 0;
			
			for (int c = 0; c < 6; c++) {
				System.out.print("\nIngrese la cantidad de horas trabajadas: ");
				int tecla = teclado.nextInt();
				horas[f][c] = tecla;

				if (tecla > 160) {
					sumaHsExtras = sumaHsExtras + (tecla - 160);
				}

				if (sumaHsExtras == 0) {
					hsExtras[f] = 0;
				} else {
					hsExtras[f] = sumaHsExtras;
				}
			}
		}

		for (int f = 0; f < 5; f++) {
			System.out.print("\nLa cantidad de horas extras trabajadas: " + hsExtras[f]);
		}

	}
}