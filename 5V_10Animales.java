import java.util.Scanner;

public class Animales {
	/*
	Carga nombre de animales en un vector de 10 posiciones, se carga otro al inverso y se comparan.
	*/
	public static void main (String[] args) {

		String animales[] = new String [10];
		String inverso[] = new String [10];
		Scanner teclado = new Scanner(System.in);

		for (int x = 0; x < 10; x++) {
			System.out.print("Ingrese un nombre de un animal: ");
			String entrada = teclado.next();
			animales[x] = entrada;
			inverso[9 - x] = entrada;
		}

		for (int i = 0; i < 10; i++) {
			System.out.println("Los nombres de los animales son: " + animales[i] + " " + inverso[i]);
		}

	}
}