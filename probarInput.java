import java.util.Scanner;

public class Menues {
	/*
	Probando el input de java
	*/
	public static void main (String[] args) {

		Scanner teclado = new Scanner(System.in);

/*		
		System.out.print("Ingrese un ENTER: ");
		String entrada = teclado.nextLine();

		if (entrada == "") {
			System.out.println("Esto es un ENTER: " + entrada);
		}
*/
//		String entrada  ="";

		String entrada;
		//do{
    	entrada  = teclado.nextLine();
    	//	System.out.println(entrada);
 		//}
 		//while(!entrada.equals("")); 
 		//System.out.println("SE PRESIONÓ LA TECLA ENTER \n\n");


		if (entrada.equals("")) {
			System.out.println("ES POR ACÁ: TECLA ENTER \n\n");
		} else {
			System.out.println("INTENTALO DE NUEVO \n\n");
		}

	}
}
