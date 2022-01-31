import java.util.Scanner;

public class Menues {
	/*
	Cargar con platos y acompañamientos una matriz de 5x5, y que un cliente pueda ingresar un plato a buscar
	*/
	public static void main (String[] args) {
		String menues[][] = new String [5][5];
		Scanner teclado = new Scanner (System.in);

		String entrada;

		for (int f = 0; f < 5; f++) {
			for (int c = 0; c < 5; c++) {
				
				// Estructura de control para determinar si se ingresa nombre del plato o acompañamiento según posición de la matriz
				if (c == 0) {
					System.out.print("Ingrese nombre de un plato: ");
				} else {
					System.out.print("Ingrese nombre para un acompañamiento / Enter para 'Ninguno': ");
				}

				entrada  = teclado.nextLine();

    			if (entrada.equals("")) {
					//System.out.println("ES POR ACÁ: TECLA ENTER \n\n");
					menues[f][c] = "Ninguno";
				} else {
					//System.out.println("INTENTALO DE NUEVO \n\n");
					menues[f][c] = entrada;
				}
			}
		}

		System.out.println("\n");
		
		for (int f = 0; f < 5; f++) {
				System.out.println("El menú es " + menues[f][0] + " - " + menues[f][1] + " - " + menues[f][2] + " - " + menues[f][3] + " - " + menues[f][4] + "\n");
		}

		System.out.print("\nElija un plato: ");
		String plato = teclado.next();
		
		for (int f = 0; f < 5; f++){
			if (menues[f][0].equals(plato) || menues[f][0].equalsIgnoreCase(plato)) {
				System.out.print("\nEl menú es " + menues[f][0] + " - " + menues[f][1] + " - " + menues[f][2] + " - " + menues[f][3] + " - " + menues[f][4] + "\n");
				break;
			} 
		}

	}
}