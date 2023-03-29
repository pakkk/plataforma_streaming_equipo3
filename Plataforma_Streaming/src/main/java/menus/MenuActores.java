package menus;

import java.util.InputMismatchException;
import java.util.Scanner;

import clases.*;

public class MenuActores {
	
	private Audiovisual a;
	
	public MenuActores(Audiovisual a) {
		this.a = a;
	}
	
	public void startMenu(){
		
		
		
		
	}
	
	static boolean addActor() {
		
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
			Actor actor = new Actor(name, lastname, gender, age, nationality);
			a.addsupportingActores(actor);
			return true;
		}catch(NumberFormatException e) {
			return false;
		}
	}
	
	static void displayActores() {
		
		Actor actores[] = a.getsupportingActores();
		
		System.out.println("--------------------");
		System.out.println("Lista de actores: ");
		
		for(int i = 0; i < actores.length; i++) {
			System.out.println(i + ".- " + actores[i].getName() + " " + actores[i].getLastname());
		}
		
	}
	
	static Actor selectActor() {
		
		displayActores(a);
		
		System.out.println("--------------------");
		System.out.print("Introduzca el actor (su numero) que quiera eliminar: ");
		int opcion;
		try (Scanner sc = new Scanner(System.in)){
			opcion = sc.nextInt();
			return a.getsupportingActores()[opcion];
		} catch (InputMismatchException e) {
			return null;
		}
	}
	
	public boolean deleteActor(Audiovisual a)
	{
		int posicion = selectActor(a);
		a.deletesupportingActores(int pos);
		return true;
	}
	
	
	public void findActor()
	{
		System.out.println("Find a director by: " + "1.- name\n" + "2.- lastname\n" + "3.- gender\n"
				+ "4.- age" + "5.- nationality");

		int atributo;

		try (Scanner scanner = new Scanner(System.in)) 
		{
			atributo = scanner.nextInt();
			switch (atributo) 
			{
			case 1: 
			{
				System.out.println("dime nombre");
				String newText = scanner.nextLine();
				for (Director d : a.getdirectors())
				{
					if (d.getName().equals(newText))
					{
						System.out.println(d.toString());
					}
				}
				break;
			}
			case 2: 
			{
				System.out.println("dime apellido");
				String newText = scanner.nextLine();
				for (Director d : a.getdirectors())
				{
					if (d.getLastname().equals(newText))
					{
						System.out.println(d.toString());
					}
				}
				break;
			}
			case 3: 
			{
				System.out.println("dime genero");
				String newText = scanner.nextLine();
				for (Director d : a.getdirectors())
				{
					if (d.getgender().equals(newText))
					{
						System.out.println(d.toString());
					}
				}
			}
			case 4: 
			{
				System.out.println("dime edad");
				int newText = scanner.nextInt();
				for (Director d : a.getdirectors())
				{
					if (d.getAge() == (newText)) 
					{
						System.out.println(d.toString());
					}
				}
				break;
			}
			case 5:
			{
				System.out.println("dime nacionalidad");
				String newText = scanner.nextLine();
				for (Director d : a.getdirectors())
				{
					if (d.getNationality().equals(newText))
					{
						System.out.println(d.toString());
					}
				}
			}
			}
		} 
		catch (InputMismatchException ex) 
		{

			System.out.println("error option");
		}
	}
	
}
