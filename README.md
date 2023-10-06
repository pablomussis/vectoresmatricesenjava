
# Project name: JAVA - vectores y matrices
***
Desarrollando ejercicios en el lenguaje JAVA del marco #YoProgramo de Argentina Programa 2021-2022 con OPENJDK 11.0.14 en GNU/Linux Debian 10.


## General info
***
Cinco (5) ejercicios con vectores y cinco (5) ejercicios con matrices desarrollado en el lenguaje JAVA para el marco Argentina Programa 2021-2022.


### Author developer
***
Pablo Mussis
- gitlab @pablomussis
- github @pablomussis


### Ejercicios con vectores
***

1. Se necesita de un vector que sea capaz de almacenar 10 números enteros entre 1 y 100. 
Realizar un programa que permita la carga por teclado de los 10 números solicitados.

$ java 1V_Cargar10Numeros.java

import java.util.Scanner;

public class Carga10numeros {
	/*
	Carga números en un vector entero de 10 posiciones
	*/
	public static void main (String[] args) {
		int vector[] = new int[10];
		Scanner teclado = new Scanner(System.in);

		for (int i = 0; i < vector.length; i++){
			System.out.print("Ingrese un número para la posición: ");
			int tecla = teclado.nextInt();
			vector[i] = tecla;
		}
	}
}


2. En un vector de 15 posiciones se almacenan las edades de 15 alumnos. 
Se desea un programa que sea capaz de determinar cuál es la mayor edad y cuál es la menor edad que se encuentra entre los estudiantes.

$ java 2V_MayorMenorEdad.java

import java.util.Scanner;

public class Carga10numeros {
	/*
	Carga edades en un vector entero de 15 posiciones, y se obtiene el mayor y el menor.
	*/
	public static void main (String[] args) {
		int edades[] = new int[15];
		Scanner teclado = new Scanner(System.in);
		int edadMayor = 0;
		int edadMenor = 100;

		for (int i = 0	; i < edades.length; i++) {
			System.out.print("Ingrese una edad: ");
			int tecla = teclado.nextInt();
			edades[i] = tecla;
		
			if (edadMayor < edades[i]) {
				edadMayor = edades[i];
			}
			if (edadMenor > edades[i]) {
				edadMenor = edades[i];
			}
		}
		System.out.println("La edad mayor es: " + edadMayor);
		System.out.println("La edad menor es: " + edadMenor);
	}
}


3. Se tienen tres vectores. En el primero de ellos se guarda un número de dni, en el segundo un nombre y en el tercero un apellido. 
Se desea un programa que sea capaz de recorrer los tres vectores AL MISMO TIEMPO y mostrar cada uno de estos datos por pantalla. 
Pista: tener en cuenta que el índice de cada vector es correspondiente al índice de los demás, es decir, 
los datos contenidos en el índice cero del vector de dni, se corresponde con el índice cero del vector de nombres y el de apellidos.

$ java 3V_DatosPersonales.java

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


4. En un vector de 23 posiciones se tienen las temperaturas máximas de las capitales de las 23 provincias argentinas en el último mes. 
A partir de esta información, un noticiero desea determinar el top 5 de las temperaturas más altas para poder mostrar en la pantalla de su programa, 
para ello se necesita un programa que sea capaz de recorrer el vector de temperaturas, determinar las 5 más altas y copiarlas en un nuevo vector de 5 posiciones.

$ java 4V_Temperaturas.java

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


5. Se necesita un vector que permita cargar por teclado el nombre de 10 animales. 
A partir de esta carga, se desea otro vector que copie los mismos nombres pero en el orden inverso, es decir, 
si los nombres son: perro, gato, lagartija, el nuevo vector debe contener: lagartija, gato, perro.
Una vez realizado el cambio, mostrar por pantalla ambos vectores para compararlos.

$ java 5V_10Animales.java

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


### Ejercicios con Matrices:
***
Te dejamos algunas propuestas de prácticas que puedes realizar como desafío, para que pongas en práctica lo aprendido. 
Estos ejercicios no son obligatorios y no tienes que entregarlos. Te invitamos a que los compartas en tus redes con tus compañeros y 
observes cómo otros lo han resuelto.

1. Una matriz de 5 filas x 3 columnas almacena el total de goles de 5 jugadores de futbol en los últimos 3 partidos que jugaron, 
donde cada fila representa a un jugador y cada columna a la cantidad de goles que hizo. 
Se necesita un programa que sea capaz de permitir la carga de los goles, calcular el promedio de goles realizado por cada jugador y 
almacenar el resultado en un vector de 5 posiciones, donde cada posición representará a un jugador. 
Tener en cuenta el siguiente diagrama para llevar a cabo el planteo:
Nota: tener en cuenta que el promedio de goles puede dar como resultado un número que NO SEA ENTERO.

$ java 1M_CargarGoles.java

import java.util.Scanner;

public class CargarGoles {
	/*
	Cargar goles en una matriz de 5x3 y en un vector de 5 posiciones.
	*/
	public static void main (String[] args) {
		int goles[][] = new int [5][3];
		float promediosGoles[] = new float [5];

		Scanner teclado = new Scanner (System.in);

		for (int f = 0; f < 5; f++) {
			for (int c = 0; c < 3; c++) {
				System.out.print("Ingrese cantidad de goles: ");
				int tecla = teclado.nextInt();
				goles[f][c] = tecla;
			}
		}

		for (int f = 0; f < 5; f++) {
			float prom = 0;
			for (int c = 0; c < 3; c++) {
				prom = prom + goles[f][c];
			}
			promediosGoles[f] = prom / 3;
		}
		
		for (int f = 0; f < 5; f++) {
			System.out.println("Los promedios de goles es: " + promediosGoles[f]);
		}

	}
}


2. Una escuela primaria utiliza una matriz para calcular los promedios de sus alumnos. 
Para ello tienen una matriz de 10 filas, donde cada fila representa a un alumno y 4 columnas. 
Las primeras 3 columnas representan las notas de cada uno de los alumnos, mientras que la 4 es el promedio de las mismas. 
Se desea un programa que sea capaz de permitir la carga por teclado de las 3 notas de cada alumno, 
de realizar el cálculo automático del promedio, de guardar el mismo en la 4 columna y luego mostrar por pantalla cada una de las notas y 
el promedio obtenido. Por ejemplo.
Nota: tener en cuenta que generalmente las calificaciones y los promedios no suelen ser números enteros, sino que pueden tener decimales.

$ java 2M_NotasPromedios.java

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
					int tecla = teclado.nextInt();
					notasPromedios[f][c] = tecla;
					suma = suma + tecla;
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


3. Se desea un programa que sea capaz de rellenar completamente con números 1 una matriz de 4 x 4 a excepción de su diagonal principal, 
la cual debe ser rellenada con números 0. Una vez realizada la carga, se desea mostrar la matriz de forma ordenada por pantalla. 
Tener como ejemplo la matriz que se presenta a continuación. 

$ java 3M_Diagonal0.java

import java.util.Scanner;

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


4. Una casa de comida rápida utiliza una matriz de 20 filas y 5 columnas para determinar cada plato del menú y sus correspondientes ingredientes que contiene. 
Para ello, cada fila representa un plato principal en donde en la primera columna se especifica su nombre (por ejemplo: Milanesa), 
y en las demás los posibles acompañamientos que puede tener el plato (por ejemplo, puré, ensalada rusa, papas fritas, 
ensalada de lechuga y tomate, ensalada de zanahoria, etc). 
En caso de que tenga el plato menos de 4 tipos de acompañamiento, en la matriz se cargará la palabra "Ninguno" en las posiciones que queden vacías.
Se desea un programa que sea capaz de permitir la carga de la matriz, de buscar un plato en particular que un cliente ingrese por teclado y 
mostrarle de forma automática los posibles acompañamientos del mismo. 

$ java 4M_Menues.java

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


5. Una empresa constructora desea llevar a cabo un premio para sus obreros que hayan realizado horas extras en los últimos 6 meses. 
Para ello, lleva una matriz de control de 15 filas x 6 columnas, donde cada fila corresponde a un empleado distinto y 
donde cada columna representa el total de horas trabajadas por mes. El monto de horas normal trabajado x mes es de 8 horas diarias, 
5 días a la semana, 4 semanas por mes, es decir: 160 horas. Todo monto superior a este es considerado como horas extras.
Se desea un programa que permita la carga de horas trabajadas por cada obrero y que sea capaz de determinar aquellos que hayan realizado horas extras. 
Para registrar las horas extras realizadas se utilizará un vector de 15 posiciones en donde se deberá calcular y almacenar la cantidad de horas extras de cada obrero. 
En caso de que no haya realizado horas extras, deberá incluirse un número 0. Tomar como ejemplo la siguiente imagen:

$ java 5M_HsExtras.java

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

