package menus;

import java.util.InputMismatchException;
import java.util.Scanner;

import clases.Audiovisual;
import clases.Categoria;

public class MenuCategorias {
	/**
	 * add a director
	 * 
	 * @param to Audiovisual with which you want to check
	 * @return an Audiovisual with the added category
	 */
	public Audiovisual addCategorias(Audiovisual a)
	{

		try (Scanner sc = new Scanner(System.in))
		{

			System.out.println("--------------------");
			System.out.print("Enter name: ");
			String name = sc.nextLine();
			System.out.print("Enter the description");
			String description = sc.next();
			Categoria categorie = new Categoria(name,description);
			a.addcategories(categorie);
			return a;
		} 
		catch (NumberFormatException e) 
		{
			return null;
		}
	}

	/**
	 * Shows the categories that an Audiovisual has
	 * 
	 * @param a Audiovisual del que extraer la lista
	 */
	public void displayCategories(Audiovisual a) 
	{

		Categoria Categories[] = a.getcategories();

		System.out.println("--------------------");
		System.out.println("List the Categories: ");

		for (int i = 0; i < Categories.length; i++)
		{
			System.out.println(i + 1 + ".- " + Categories[i].getName()+ " " + Categories[i].getDescription());
		}

	}

	/**
	 * Select a category from the list
	 * 
	 * @param a Audiovisual from which you want to select
	 * @return Array position where the category is located
	 * if it doesn't find it, it returns -1
	 */
	public int selectCategories(Audiovisual a)
	{

		displayCategories(a);

		System.out.println("--------------------");
		System.out.print("Enter categories (number) you want to select: ");
		int option;
		try (Scanner sc = new Scanner(System.in))
		{
			option = sc.nextInt();
			if ((option > 0) && (option < a.getcategories().length))
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
	 * Compare between two categories
	 * 
	 * @param pos int position of the array where it is located
	 * @param b Audiovisual from which gets the array.
	 */
	public void modifyCategories(int pos, Audiovisual b) 
	{
		
		Categoria a = b.getcategories()[pos];
		System.out.println("--------------------");
		System.out.println(" I show you the possible modifications\n"
				+ "1.Name\n"
				+ "2.Description");
		
		int atributte;

		try (Scanner scanner = new Scanner(System.in))
		{
			atributte = scanner.nextInt();
			switch (atributte)
			{
			case 1:
			{
				System.out.println("Enter ne name");
				String newText = scanner.nextLine();
				a.setName(newText);
				break;
			}
			case 2: 
			{
				System.out.println("dime la nueva descripcion");
				String newText = scanner.next();
				a.setDescription(newText);
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
	 * Compare between two categories
	 * 
	 * @param a Audiovisual from which the array is obtained from which the category is eliminated
	 */
	public void deleteCategories(Audiovisual a)
	{
		int posicion = selectCategories(a);
		a.deleteCategoria(posicion);
	}
	/**
	 * Compara entre dos categorias
	 * @param a Audiovisual del que se obtiene el array en que se ejerce la busqueda el director
	 */
	public void findCategories(Audiovisual a)
	{
		System.out.println(" I show you the possible search keys\n"
				+ "1.Name");

		int atributte;

		try (Scanner scanner = new Scanner(System.in)) 
		{
			atributte = scanner.nextInt();
			
			
			System.out.println("Enter name");
			String newText = scanner.nextLine();
			for (Categoria d : a.getcategories())
			{
				if (d.getName().equals(newText))
				{
					System.out.println(d.toString());
				}
			
			}
		} 
		catch (InputMismatchException ex) 
		{

			System.out.println("error option");
		}
	}

}

