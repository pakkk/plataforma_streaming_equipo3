package menus;

import java.util.InputMismatchException;
import java.util.Scanner;

import clases.Audiovisual;
import clases.Director;

public class MenuDirector
{
	/**
	 * add a director
	 * 
	 * @param a Audiovisual con la se quiere comprobar
	 * @return un Audiovisual con el director añadido
	 */
	public Audiovisual addDirector(Audiovisual a)
	{

		try (Scanner sc = new Scanner(System.in))
		{

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
			String nationality = sc.nextLine();
			Director director = new Director(name, lastname, gender, age, nationality);
			a.adddirectors(director);
			return a;
		} 
		catch (NumberFormatException e) 
		{
			return null;
		}
	}

	/**
	 * Muestra los directores que tiene un Audiovisual 
	 * 
	 * @param a Audiovisual del que extraer la lista
	 */
	public void displayDirectores(Audiovisual a) 
	{

		Director Directores[] = a.getdirectors();

		System.out.println("--------------------");
		System.out.println("Lista de Directores: ");

		for (int i = 0; i < Directores.length; i++)
		{
			System.out.println(i + 1 + ".- " + Directores[i].getName() + " " + Directores[i].getLastname());
		}

	}

	/**
	 * Selecciona un director de la lista 
	 * 
	 * @param a Audiovisual de la que se quiere seleccionar
	 * @return posicion del Array donde se encuentra el director
	 * si no lo encuentra devuelve -1
	 */
	public int selectDirector(Audiovisual a)
	{

		displayDirectores(a);

		System.out.println("--------------------");
		System.out.print("Introduzca el Director (su numero) que quiera seleccionar: ");
		int option;
		try (Scanner sc = new Scanner(System.in))
		{
			option = sc.nextInt();
			if ((option > 0) && (option < a.getdirectors().length))
				return option - 1;
			else
				return -1;
		} 
		catch (InputMismatchException e)
		{
			return -1;
		}
	}

	/**
	 * Compara entre dos categorias
	 * 
	 * @param pos int posicion del array donde se encuentra
	 * @param b Audiovisual del que obtiene el array.
	 */
	public void modifyDirector(int pos, Audiovisual b) 
	{

		Director a = b.getdirectors()[pos];
		System.out.println("--------------------");
		System.out.println(" Te muestro las posibles modificaciones" + "1.- name" + "2.- lastname" + "3.- gender"
				+ "4.- age" + "5.- nationality");

		int atributo;

		try (Scanner scanner = new Scanner(System.in))
		{
			atributo = scanner.nextInt();
			switch (atributo)
			{
			
			case 1:
			{
				System.out.println("dime el nuevo nombre");
				String newText = scanner.nextLine();
				a.setName(newText);
				break;
			}
			case 2:
				
			{
				System.out.println("dime el nuevo nombre");
				String newText = scanner.nextLine();
				a.setLastname(newText);
				break;
			}
			case 3: 
			{
				System.out.println("dime el nuevo nombre");
				String newText = scanner.nextLine();
				a.setgender(newText);
				break;
			}
			case 4: 
			{
				System.out.println("dime el nuevo nombre");
				int newInt = scanner.nextInt();
				a.setAge(newInt);
				break;
			}
			case 5:
			{
				System.out.println("dime el nuevo nombre");
				String newText = scanner.nextLine();
				a.setNationality(newText);
				break;
			}
			}
		} 
		catch (InputMismatchException ex)
		{

			System.out.println("error option");
		}
	}
	/**
	 * Compara entre dos categorias
	 * 
	 * @param a Audiovisual del que se obtiene el array que se elimina el director
	 */
	public void deleteDirector(Audiovisual a)
	{
		int posicion = selectDirector(a);
		a.deletedirectors(posicion);
	}
	/**
	 * Compara entre dos categorias
	 * @param a Audiovisual del que se obtiene el array en que se ejerce la busqueda el director
	 */
	public void findDirector(Audiovisual a)
	{
		System.out.println(" Te muestro las posibles claves de busqueda" + "1.- name" + "2.- lastname" + "3.- gender"
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
