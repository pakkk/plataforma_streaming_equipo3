package es.iesjandula.plataforma_streaming.menus;

import es.iesjandula.plataforma_streaming.clases.*;

/**
 * this class controls the actions on data that can be executed in everything related to Actors
 * @author Juan Sutil
 */
public class MenuActores

{
	/**
	 * @attribute Audiovisual to modify
	 */
	Audiovisual audioVisual;

	/**
	 * Parametriced constructor
	 * 
	 * @param a audiovisual to modify
	 */
	public MenuActores(Audiovisual audiovisual)
	{
		this.audioVisual = audiovisual;
	}

	/**
	 * performs the printing of the information that is given to the user
	 */

	private static void printStarMenu()
	{
		System.out.println("----------------------------------------");
		System.out.println("----MENU ACTORES----");
		System.out.println("1.- Add a new actor");
		System.out.println("2.- Delete an actor");
		System.out.println("3.- Modify an actor");
		System.out.println("4.- Search an actor");
		System.out.println("5.- Exit");

	}
	/**
	 * manages the actions to be performed based on
	 *  the options given by the user, calling the 
	 *  specific method that works on that action
	 */
	public void startMenu()
	{
		int menu;
		do
		{

			MenuActores.printStarMenu();
			try 
			{
				menu = Integer.parseInt(MyScanner.scanner.nextLine());
			} catch (NumberFormatException e) 
			{
				menu = 0;
			}

			switch (menu)
			{
			case 1 ->
			{
				boolean variableBoolean = addActor();
				if (variableBoolean) {
					System.out.println("Actor introducido correctamente");
				} 
				else 
				{
					System.out.println("Actor no introducido");
				}
			}
			case 2 ->
			{
				boolean variableBoolean = deleteActor();
				if (variableBoolean) 
				{
					System.out.println("Actor borrado correctamente");
				} 
				else 
				{
					System.out.println("El actor no pudo ser borrado");
				}
			}
			case 3 -> 
			{

				boolean variableBoolean = modifyActor();
				if (variableBoolean) 
				{
					System.out.println("Actor modificado correctamente");
				} else 
				{
					System.out.println("El actor no pudo ser modificado");
				}
			}
			case 4 -> 
			{
				int positionActor = findActor();
				if (positionActor == 0) 
				{
					System.out.println("No existen actores que cumplan su condicion");
				}
			}
			case 5 ->
			{

			}
			default ->
			{
				System.out.println("Opcion invalida");
			}
			}
		}
		while (menu != 5);
	}

	/**
	 * Add a new actor to the audiovisual
	 * 
	 * @return true if the actor is added
	 */
	private boolean addActor() 
	{

		try 
		{
			System.out.println("--------------------");
			System.out.print("Introduzca el nombre: ");
			String name = MyScanner.scanner.nextLine();
			MyScanner.scanner.reset();
			System.out.print("Introduzca los apellidos: ");
			String lastname = MyScanner.scanner.nextLine();
			MyScanner.scanner.reset();
			System.out.print("Introduzca el genero: ");
			String gender = MyScanner.scanner.nextLine();
			MyScanner.scanner.reset();
			System.out.print("Introduzca la edad: ");
			int age = Integer.parseInt(MyScanner.scanner.nextLine());
			MyScanner.scanner.reset();
			System.out.print("Introduzca la nacionalidad: ");
			String nationality = MyScanner.scanner.nextLine();
			MyScanner.scanner.reset();
			Actor actor = new Actor(name, lastname, gender, age, nationality);
			this.audioVisual.addsupportingActores(actor);

			return true;
		} 
		catch (NumberFormatException exception)
		{
			return false;
		}
	}

	/**
	 * Display all the actors in audiovisual
	 */
	private void displayActores()
	{

		Actor actores[] = this.audioVisual.getSupportingActores();

		System.out.println("--------------------");
		System.out.println("Lista de actores: ");

		for (int i = 0; i < actores.length; i++) 
		{
			System.out.println(i + 1 + ".- " + actores[i].getName() + " " + actores[i].getLastName());
		}

	}

	/**
	 * Select an actor from a list
	 * 
	 * @return the position of the actor
	 */
	private int selectActor()
	{

		displayActores();

		System.out.println("--------------------");
		System.out.print("Introduzca el actor (su numero): ");
		int option;
		try 
		{
			option = Integer.parseInt(MyScanner.scanner.nextLine());
			if ((option > 0) && (option <= this.audioVisual.getSupportingActores().length))
			{
				return option - 1;
			} 
			else 
			{
				return -1;
			}
		} 
		catch (NumberFormatException exception)
		{
			return -1;
		}
	}

	/**
	 * Delete an actor
	 * 
	 * @return true if the actor is deleted
	 */
	public boolean deleteActor() 
	{
		int posicion = selectActor();
		if (posicion != -1)
		{
			this.audioVisual.deletesupportingActores(posicion);
			return true;
		}
		else
		{
			return false;
		}

	}

	/**
	 * Modify an actor
	 * 
	 * @return true if the actor is modify
	 */
	private boolean modifyActor() 
	{
		int position = selectActor();
		if (position != -1)
		{
			Actor actor = this.audioVisual.getSupportingActores()[position];
			System.out.println("--------------------");
			System.out.println("""
					 Campos a modificar:
					1.- name
					2.- lastname
					3.- gender
					4.- age
					5.- nationality\\n""");

			int menu;

			try 
			{
				menu = Integer.parseInt(MyScanner.scanner.nextLine());
				switch (menu)
				{
				case 1 -> 
				{
					System.out.print("Introduzca el nuevo nombre: ");
					String nombre = MyScanner.scanner.nextLine();
					actor.setName(nombre);
				}
				case 2 -> 
				{
					System.out.print("Introduzca los nuevos apellidos: ");
					String apellidos = MyScanner.scanner.nextLine();
					actor.setLastName(apellidos);
				}
				case 3 -> 
				{
					System.out.print("Introduzca el nuevo genero: ");
					String gender = MyScanner.scanner.nextLine();
					actor.setGender(gender);
				}
				case 4 -> 
				{
					System.out.print("Introduzca la nueva edad: ");
					int edad = Integer.parseInt(MyScanner.scanner.nextLine());
					actor.setAge(edad);
				}
				case 5 ->
				{
					System.out.print("Introduzca la nueva nacionalidad: ");
					String nombre = MyScanner.scanner.nextLine();
					actor.setName(nombre);
				}
				default -> 
				{
					return false;
				}
				}
			}
			catch (NumberFormatException ex)
			{
				return false;
			}

			return true;
		}
		else 
		{
			return false;
		}

	}

	/**
	 * Find an actor by a designed param
	 * 
	 * @return number of actors found, -1 if occurs an error
	 */
	public int findActor()
	{
		System.out.println("""
				Campos para buscar:
				1.- name
				2.- lastname
				3.- gender
				4.- age
				5.- nationality
				""");

		int atributo, cant = 0;

		try 
		{
			atributo = Integer.parseInt(MyScanner.scanner.nextLine());
			switch (atributo)
			{
			case 1 ->
			{
				System.out.println("dime nombre");
				String newText = MyScanner.scanner.nextLine();
				for (Actor actor : audioVisual.getSupportingActores())
				{
					if (actor.getName().equals(newText))
					{
						System.out.println(actor.toString());
						cant++;
					}
				}
			}
			case 2 ->
			{
				System.out.println("dime apellido");
				String newText = MyScanner.scanner.nextLine();
				for (Actor actor : audioVisual.getSupportingActores())
				{
					if (actor.getLastName().equals(newText))
					{
						System.out.println(actor.toString());
						cant++;
					}
				}
			}
			case 3 -> 
			{
				System.out.println("dime genero");
				String newText = MyScanner.scanner.nextLine();
				for (Actor actor : audioVisual.getSupportingActores()) 
				{
					if (actor.getGender().equals(newText))
					{
						System.out.println(actor.toString());
						cant++;
					}
				}
			}
			case 4 -> 
			{
				System.out.println("dime edad");
				int newAge = Integer.parseInt(MyScanner.scanner.nextLine());
				for (Actor actor : audioVisual.getSupportingActores())
				{
					if (actor.getAge() == (newAge))
					{
						System.out.println(actor.toString());
						cant++;
					}
				}
			}
			case 5 -> 
			{
				System.out.println("dime nacionalidad");
				String newText = MyScanner.scanner.nextLine();
				for (Actor actor : audioVisual.getSupportingActores()) 
				{
					if (actor.getNationality().equals(newText))
					{
						System.out.println(actor.toString());
						cant++;
					}
				}
			}
			default ->
			{
				return -1;
			}
			}
		}
		catch (NumberFormatException ex)
		{
			return -1;
		}

		return cant;
	}
}
