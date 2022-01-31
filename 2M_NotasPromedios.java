import java.util.Scanner;

public class NotasPromedios {
	/*
	Solicitar tres notas de alumnos y calcular el promedio, almacenar en la matriz
	*/
	public static void main (String[] args) {

		float notasPromedios[][] = new float [10][4];
		Scanner teclado = new Scanner (System.in);

		for (int f = 0; f < 10; f++) {
			float suma = 0;
			float prom = 0;
			
			for (int c = 0; c < 4; c++) {
				if (c < 3) {
					System.out.print("Ingrese una nota: ");
					int entrada = teclado.nextInt();
					notasPromedios[f][c] = entrada;
					suma = suma + entrada;
				} else { 
					prom = suma / 3;
					notasPromedios[f][c] = prom;
				}				
			}
		}

		for (int f = 0; f < 2; f++) {
			System.out.println("Las notas son: " + notasPromedios[f][0] + " " + notasPromedios[f][1] + " " + notasPromedios[f][2] + " y su promedio: " + notasPromedios[f][3]);
		}

	}
}