package menus;

import java.util.InputMismatchException;


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
            
            try{
               
                menu = Integer.parseInt(MyScanner.scanner.nextLine());
            } catch (InputMismatchException ex) {
                menu = 0;
            }

            switch (menu) {
                case 1 -> {
                    boolean b = addCategorias();
                    if (b) {
                        System.out.println("Actor introducido correctamente");
                    } else {
                        System.out.println("Actor no introducido");
                    }
                }
                case 2 -> {
                    boolean b = deleteCategories();
                    if (b) {
                        System.out.println("Actor borrado correctamente");
                    } else {
                        System.out.println("El actor no pudo ser borrado");
                    }
                }
                case 3 -> {

                    boolean b = modifyCategories();
                    if (b) {
                        System.out.println("Actor modificado correctamente");
                    } else {
                        System.out.println("El actor no pudo ser modificado");
                    }
                }
                case 4 -> {
                    int b = findCategories();
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
	public boolean addCategorias()
	{

		try 
		{

			System.out.println("--------------------");
			System.out.print("Enter name: ");
			String name = MyScanner.scanner.nextLine();
			System.out.print("Enter the description");
			String description =  MyScanner.scanner.nextLine();
			Categoria categorie = new Categoria(name,description);
			this.a.addcategories(categorie);
			return true;
		} 
		catch (InputMismatchException e) 
		{
			return false;
		}
	}

	/**
	 * Shows the categories that an Audiovisual has
	 * 
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
				return option -1;
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
     * @return 
	 */
	public boolean modifyCategories() 
	{
		int pos=selectCategories();
                if (pos != -1) {
                    Categoria cat = this.a.getcategories()[pos];
                    System.out.println("--------------------");
                    System.out.println("""
                                        I show you the possible modifications
                                       1.Name
                                       2.Description""");

                    int atributte;

                    try 
                    {
                            atributte = Integer.parseInt(MyScanner.scanner.nextLine());
                            switch (atributte)
                            {
                            case 1 -> 			{
                                    System.out.println("Enter new name");
                                    String newText = MyScanner.scanner.nextLine();
                                    cat.setName(newText);
                                    return true;
                            }
                            
                            case 2 -> 			{
                                    System.out.println("Enter new description");
                                    String newText = MyScanner.scanner.next();
                                    cat.setDescription(newText);
                                    return true;
                            }
                            default->{
                                return false;
                            }
                            }
                    } 
                    catch (NumberFormatException ex)
                    {


                            return false;
                    }
                  
                }else{
                    return false;
                }
            }
	/**
	 * Compare between two categories
	 * 
        * @return 
	 */
	public boolean deleteCategories() {
        int posicion = selectCategories();
        if (posicion != -1) {
            this.a.deleteCategoria(posicion);
            return true;
        } else {
            return false;
        }

    }
	/**
	 * Compara entre dos categorias
     * @return 
	 */
	public int findCategories()
	{
		System.out.println("""
                                    I show you the possible search keys
                                   1.Name
                                   2.Description""");

		int atributte,cant=0;

		try 
		{
			atributte = Integer.parseInt(MyScanner.scanner.nextLine());
			
			switch(atributte) {
				case 1 -> {
					System.out.println("Enter name");
					String newText = MyScanner.scanner.nextLine();
					for (Categoria d : a.getcategories())
					{
						if (d.getName().equals(newText))
						{
							System.out.println(d.toString());
                                                        cant++;
						}
					
					}

				}
				case 2 -> {
					System.out.println("Enter description");
					String newText = MyScanner.scanner.nextLine();
					for (Categoria d : a.getcategories())
					{
						if (d.getDescription().contains(newText))
						{
							System.out.println(d.toString());
                                                        cant++;
						}
					
					}

				}
                                default->{
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

