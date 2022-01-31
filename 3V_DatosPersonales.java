import java.util.Scanner;

public class DatosPersonales {
	/*
	Carga datos personales en tres vectores de 15 posiciones, y se imprimen.
	*/
	public static void main (String[] args) {
		int dni[] = new int[15];
		String nombres[] = new String[15];
		String apellidos[] = new String[15];
		
		Scanner teclado = new Scanner(System.in);

		for (int i = 0	; i < dni.length; i++) {

			System.out.print("Ingrese un dni: ");
			dni[i] = teclado.nextInt();

			System.out.print("Ingrese un nombre: ");
			nombres[i] = teclado.next();

			System.out.print("Ingrese un apellido: ");
			apellidos[i] = teclado.next();
		}

		for (int i = 0; i < dni.length; i++){
			System.out.println("El dni es: " + dni[i] + ", el nombre es: " + nombres[i] + ", el apellido es: " + apellidos[i]);
		}
	}
}
