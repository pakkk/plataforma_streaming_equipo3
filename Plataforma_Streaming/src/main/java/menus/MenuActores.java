package menus;

import java.util.InputMismatchException;
import java.util.Scanner;

import clases.*;

public class MenuActores {
	
	static boolean addActor(Audiovisual a) {
		
		try (Scanner sc = new Scanner(System.in)){

			System.out.println("--------------------");
			System.out.print("Introduzca el nombre: ");
			String name = sc.nextLine();
			System.out.print("Introduzca los apellidos: ");
			String lastname = sc.nextLine();
			System.out.print("Introduzca el genero: ");
			String gender = sc.nextLine();
			System.out.print("Introduzca la edad: ");
			int age = Integer.valueOf(sc.nextLine());
			System.out.print("Introduzca la nacionalidad: ");
			String nationality= sc.nextLine();
			Actores actor = new Actores(name, lastname, gender, age, nationality);
			a.addActoresDeReparto(actor);
			return true;
		}catch(NumberFormatException e) {
			return false;
		}
	}
	
	static void displayActores(Audiovisual a) {
		
		Actores actores[] = a.getActoresDeReparto();
		
		System.out.println("--------------------");
		System.out.println("Lista de actores: ");
		
		for(int i = 0; i < actores.length; i++) {
			System.out.println(i + ".- " + actores[i].getName() + " " + actores[i].getLastname());
		}
		
	}
	
	static Actores selectActor(Audiovisual a) {
		
		displayActores(a);
		
		System.out.println("--------------------");
		System.out.print("Introduzca el actor (su numero) que quiera eliminar: ");
		int opcion;
		try (Scanner sc = new Scanner(System.in)){
			opcion = sc.nextInt();
			return a.getActoresDeReparto()[opcion];
		} catch (InputMismatchException e) {
			return null;
		}
	}
	
	static void modifyActor(Actores a) {
		
		System.out.println("--------------------");
		
		
	}
	
}
