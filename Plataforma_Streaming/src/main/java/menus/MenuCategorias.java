package menus;

import java.util.InputMismatchException;
import java.util.Scanner;

import clases.*;

public class MenuCategorias {
	/**
	 * add a director
	 * 
	 * @param to Audiovisual with which you want to check
	 * @return an Audiovisual with the added category
	 */
    Audiovisual a;

    public MenuCategorias(Audiovisual a) {
        this.a = a;
    }
        public void startMenu() {
        int menu;
        do {

            System.out.println("----------------------------------------");
            System.out.println("----MENU CATEGORIES----");
            System.out.println("1.- Add a new categories");
            System.out.println("2.- Delete an categories");
            System.out.println("3.- Modify an categories");
            System.out.println("4.- Search an categories");
            System.out.println("5.- Exit");
            Scanner scanner = null;
            try{
                scanner = new Scanner(System.in);
                menu = scanner.nextInt();
            } catch (InputMismatchException ex) {
                menu = 0;
            }finally{
                scanner.close();
            }

            switch (menu) {
                case 1 -> {
                    boolean b = addActor();
                    if (b) {
                        System.out.println("Actor introducido correctamente");
                    } else {
                        System.out.println("Actor no introducido");
                    }
                }
                case 2 -> {
                    boolean b = deleteActor();
                    if (b) {
                        System.out.println("Actor borrado correctamente");
                    } else {
                        System.out.println("El actor no pudo ser borrado");
                    }
                }
                case 3 -> {

                    boolean b = modifyActor();
                    if (b) {
                        System.out.println("Actor modificado correctamente");
                    } else {
                        System.out.println("El actor no pudo ser modificado");
                    }
                }
                case 4 -> {
                    int b = findActor();
                    if (b == 0) {
                        System.out.println("No existen actores que cumplan su condicion");
                    }
                }
                case 5 -> {
                    
                }
                default -> {
                    System.out.println("Opcion invalida");
                }
            }
        } while (menu != 5);
    }
	public Audiovisual addCategorias()
	{

		try 
		{

			System.out.println("--------------------");
			System.out.print("Enter name: ");
			String name = MyScanner.scanner.nextLine();
			System.out.print("Enter the description");
			String description =  MyScanner.scanner.next();
			Categoria categorie = new Categoria(name,description);
			this.a.addcategories(categorie);
			return this.a;
		} 
		catch (InputMismatchException e) 
		{
			return null;
		}
	}

	/**
	 * Shows the categories that an Audiovisual has
	 * 
	 * @param a Audiovisual del que extraer la lista
	 */
	public void displayCategories() 
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
	public int selectCategories()
	{

		displayCategories();

		System.out.println("--------------------");
		System.out.print("Enter categories (number) you want to select: ");
		int option;
		try 
		{
			option = Integer.parseInt(MyScanner.scanner.nextLine());
			if ((option > 0) && (option < a.getcategories().length))
				return option - 1;
			else
				return -1;
		} 
		catch (NumberFormatException e)
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
	public void modifyCategories(int pos) 
	{
		
		Categoria a = this.a.getcategories()[pos];
		System.out.println("--------------------");
		System.out.println(" I show you the possible modifications\n"
				+ "1.Name\n"
				+ "2.Description");
		
		int atributte;

		try 
		{
			atributte = Integer.parseInt(MyScanner.scanner.nextLine());
			switch (atributte)
			{
			case 1:
			{
				System.out.println("Enter new name");
				String newText = MyScanner.scanner.nextLine();
				this.a.setName(newText);
				break;
			}
			case 2: 
			{
				System.out.println("Enter new description");
				String newText = MyScanner.scanner.next();
				this.a.setDescription(newText);
				break;
			}
			
			}
		} 
		catch (NumberFormatException ex)
		{

			System.out.println("error option");
		}
	}
	/**
	 * Compare between two categories
	 * 
	 * @param a Audiovisual from which the array is obtained from which the category is eliminated
	 */
	public void deleteCategories()
	{
		int posicion = selectCategories();
		a.deleteCategoria(posicion);
	}
	/**
	 * Compara entre dos categorias
	 * @param a Audiovisual del que se obtiene el array en que se ejerce la busqueda el director
	 */
	public void findCategories()
	{
		System.out.println(" I show you the possible search keys\n"
				+ "1.Name"
				+ "2.Description");

		int atributte;

		try 
		{
			atributte = Integer.parseInt(MyScanner.scanner.nextLine());
			
			switch(atributte) {
				case 1:{
					System.out.println("Enter name");
					String newText = MyScanner.scanner.nextLine();
					for (Categoria d : a.getcategories())
					{
						if (d.getName().equals(newText))
						{
							System.out.println(d.toString());
						}
					
					}

				}
				break;
				case 2:{
					System.out.println("Enter description");
					String newText = MyScanner.scanner.nextLine();
					for (Categoria d : a.getcategories())
					{
						if (d.getDescription().contains(newText))
						{
							System.out.println(d.toString());
						}
					
					}

				}
				break;
			}
			
			
					} 
		catch (NumberFormatException ex) 
		{

			System.out.println("error option");
		}
	}

}

