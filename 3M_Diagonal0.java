public class Diagonal0 {
	/*
	Cargar con unos una matriz de 4x4, y con 0 su diagonal principal
	*/
	public static void main (String[] args) {
		
		int matriz[][] = new int [4][4];

		for (int f = 0; f < 4; f++) {
			for (int c = 0; c < 4; c++) {
				if (f == c) {
					matriz[f][c] = 0;
				} else {
					matriz[f][c] = 1;
				}
			}
		}

		for (int f = 0; f < 4; f++) {
			System.out.println(matriz[f][0] + " " + matriz[f][1] + " " + matriz[f][2] + " " + matriz[f][3]);
		}

	}
}