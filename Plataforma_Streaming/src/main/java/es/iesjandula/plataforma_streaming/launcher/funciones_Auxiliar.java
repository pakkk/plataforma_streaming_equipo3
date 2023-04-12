package es.iesjandula.plataforma_streaming.launcher;
import java.util.Arrays;
import java.util.Scanner;
import es.iesjandula.plataforma_streaming.clases.*;

public class funciones_Auxiliar {

	static int arrancarAplicacion() {

		Scanner sc = new Scanner(System.in);

		int menu;
		System.out.println("Bienvenido a PROGRAM PELIS, soy la asistente de Program Pelis");
		System.out.println(
				"Dejame ayudarte en tu esperiencia, ¿Que te apetece gestionar? ¿Una pelicula? Pulsa 1 o ¿Mejor una serie? pulsa2 ");
		menu = sc.nextInt();
		sc.close();

		if ((menu > 0) && (menu < 3)) {
			if (menu == 1) {
				return 1;
			} else {
				return 2;
			}

		} else {

			System.out.println(
					"Lo siento,tienes que decirme una pelicula o una serie, es importante para que pueda hacer mi trabajo");
			return -1;
		}
	}

	static void gestionarPeliculas(Films[] peliculas) {

		System.out.println(
				"¡Estupendo!. Te ubico, estamos en el menu para la gestion de directores de peliculas, para llevar a cabo cualquier accion primero tenemos que identificar la pelicula en la que quieres realizar las modifiicaciones");
		System.out.println("Dime el titulo de la peliculan intenta ser exact@");

		Scanner sc = new Scanner(System.in);
		String clave = sc.nextLine();

		Arrays.sort(peliculas);
		int posicion = Arrays.binarySearch(peliculas, clave);
		System.out.println("Bien, pues dime que hago" + "Si pulsas 1: Añadimos una director al catalogo de esa pelicula"
				+ "\n"
				+ "Si pulsas 2: Te habilito un espacion de esctritura para que me digas un director y vemos si esta en esta peli en concreto"
				+ "\n" + "si pulsas 3: Modificamos los datos de algun director ya esxistente "
				+ "si pulsas 4: Elimino al director que tu me dgas");

		int menu = sc.nextInt();
		sc.close();

	}

	static void gestionarSeries(Serie[] series) {
		System.out.println("¡Estupendo!. Te ubico, estamos en el menu para la gestion de directores de series"
				+ "para llevar a cabo cualquier accion primero tenemos que identificar la serie en la que quieres realizar las modifiicaciones");
		System.out.println("Dime el titulo de la serie, intenta ser exact@");

		Scanner sc = new Scanner(System.in);
		String clave = sc.nextLine();

		Arrays.sort(series);
		int posicion = Arrays.binarySearch(series, clave);
		System.out.println("Bien, pues dime que hago" + "Si pulsas 1: Añadimos una director al catalogo de esa pelicula"
				+ "\n"
				+ "Si pulsas 2: Te habilito un espacion de esctritura para que me digas un director y vemos si esta en esta peli en concreto"
				+ "\n" + "si pulsas 3: Modificamos los datos de algun director ya esxistente "
				+ "si pulsas 4: Elimino al director que tu me dgas");

		int menu = sc.nextInt();
		sc.close();

	}

}
