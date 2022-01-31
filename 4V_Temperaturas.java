import java.util.Scanner;

public class Temperaturas {
	/*
	Carga temperaturas en un vector de 23 posiciones, se obtiene las 5 más elevadas y se imprimen.
	*/
	public static void main (String[] args) {
		int mayor = 0;
		int temperaturas[] = new int [23];
		int altaTemperaturas[] = new int [5];

		Scanner teclado = new Scanner(System.in);

		for (int i = 0; i < temperaturas.length; i++) {
			System.out.print("Ingrese una temperatura: ");
			temperaturas[i] = teclado.nextInt();
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				if (temperaturas[i] > temperaturas[j]) {
					mayor = temperaturas[i];
				} else {
					mayor = temperaturas[j];
				}
				altaTemperaturas[i] = mayor;
			}
		}

		for (int i = 0; i < altaTemperaturas.length; i++) {
			System.out.println(altaTemperaturas[i]);
		}
	}
} 
