package menus;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

import clases.Director;
import clases.Audiovisual;
import clases.Serie;

public class MenuDirector
{
	
static boolean addDirector(Audiovisual a) {
		
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
			Director director = new Director(name, lastname, gender, age, nationality);
			a.addDirectores(director);
			return true;
		}catch(NumberFormatException e) {
			return false;
		}
	}
	
	static void displayDirectores(Audiovisual a) {
		
		Director Directores[] = a.getDirectores();
		
		System.out.println("--------------------");
		System.out.println("Lista de Directores: ");
		
		for(int i = 0; i < Directores.length; i++) {
			System.out.println(i+1 + ".- " + Directores[i].getName() + " " + Directores[i].getLastname());
		}
		
	}
	
	static Director selectDirector(Audiovisual a) {
		
		displayDirectores(a);
		
		System.out.println("--------------------");
		System.out.print("Introduzca el Director (su numero) que quiera eliminar: ");
		int opcion;
		try (Scanner sc = new Scanner(System.in)){
			opcion = sc.nextInt();
			return a.getDirectores()[opcion-1];
		} catch (InputMismatchException e) {
			return null;
		}
	}
	
	static void modifyDirector(Director a) {
		
		System.out.println("--------------------");
		System.out.println(" Te muestro las posibles modificaciones"+
		"1.- lastname"+
		"2.- name"+
		"2.- sex"+
		"3.- age"+
		"4.- nationality");
		
		int menu;
		
		try(Scanner scanner = new  Scanner (System.in)) {
			menu=scanner.nextInt();
		}catch (InputMismatchException ex) {
			menu=0;
		}
		
		switch(menu) {
		case 1:{
			
		}
		}
	}
	

}
