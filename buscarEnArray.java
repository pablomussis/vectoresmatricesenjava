import java.util.Scanner;

public class Menues {
	/*
	JAVA, LA PUTA QUE TE PARIO ..
	Cargar enteros en un array, y buscar un valor.
	*/
	public static void main (String[] args) {
		String array[] = new String[3];
		String datoNext;
		String datoNextLine;
		Scanner teclado = new Scanner(System.in);

		// nextLine() ACEPTA espacios entre cadenas de texto
		datoNextLine = teclado.nextLine();
		array[0] = datoNextLine;
		System.out.print(datoNextLine + " nextLine \n");

		// next() NO ACEPTA espacios entre cadenas de texto
		datoNext = teclado.next();
		System.out.print(datoNext + " next \n");
		array[1] = datoNext;

		array[2] = "hola";
		System.out.print("\n");
/*
		for (int f = 0; f < 3; f++) {
			System.out.print("\n");
			System.out.print(array[f]);
			System.out.print("\n");
		}
*/


		// Debemos utilizar un método de la clase String llamado equals y pasar como parámetro el String con el que queremos compararlo:
		// if (array[f].equals("hola")) {

		// En el caso que necesitemos considerar igual caracteres mayúsculas y minúsculas podemos utilizar el método equalsIgnoreCase:
		// if (array[f].equalsIgnoreCase("HOLA")) {
		
		for (int f = 0; f < 3; f++) {
			// La asignación de "a" como CONSTANTE y la entrada de "a" desde el teclado; a un método lo considera como CHAR y al otro como String.
			// JAVA, FUCK UUUUUUU
			if (array[f].equals("hola")){
				System.out.print("\n" + f + " ES POR ACÁ\n");
				//break;
			} else if (array[f].equalsIgnoreCase("hola")){
				System.out.print("\n" + f + " ES POR ACÁ\n");
				//break;
			} else {
				System.out.print("\nJAVA, FUCK FUCK FUCK\n");
			}
		}
	}
}
