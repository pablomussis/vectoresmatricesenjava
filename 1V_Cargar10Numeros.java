import java.util.Scanner;

public class Carga10numeros {
/*
	Carga números en un vector entero de 10 posiciones
*/
	public static void main (String[] args) {
		int vector[] = new int[10];
		Scanner teclado = new Scanner(System.in);

		for (int i = 0; i < vector.length; i++){
			System.out.print("Ingrese un número: ");
			int entrada = teclado.nextInt();
			vector[i] = entrada;
		}

	}
}
