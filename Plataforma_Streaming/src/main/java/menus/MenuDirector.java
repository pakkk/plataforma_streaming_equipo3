package menus;


import clases.Audiovisual;
import clases.Director;
import clases.MyScanner;
/**
 * 
 * @author Silvia Mesa.
 * This class have got as finallity 
 * The purpose of this class is to manage the actions
 *  of accessing data from the array of directors that each audiovisual has as an attribute. 
 *
 */

public class MenuDirector
{
	/**
	 * initialize the menu, it is the first stream fork
	 * 
	 * @param a Audiovisual with which you want to modifycate
	 */
    public void startMenu(Audiovisual a) 
    {
        int menu;
        do {

            System.out.println("----------------------------------------");
            System.out.println("----MENU ACTORES----");
            System.out.println("1.- Add a new actor");
            System.out.println("2.- Delete an actor");
            System.out.println("3.- Modify an actor");
            System.out.println("4.- Search an actor");
            System.out.println("5.- Exit");

            try {
                menu = Integer.parseInt(MyScanner.scanner.nextLine());
            } catch (NumberFormatException e) {
                menu = 0;
            }

            switch (menu) {
                case 1 -> {
                    boolean b = addDirector(a);
                    if (b) {
                        System.out.println("Actor introducido correctamente");
                    } else {
                        System.out.println("Actor no introducido");
                    }
                }
                case 2 -> {
                    boolean b = deleteDirector(a);
                    if (b) {
                        System.out.println("Actor borrado correctamente");
                    } else {
                        System.out.println("El actor no pudo ser borrado");
                    }
                }
                case 3 -> {

                    boolean b = modifyDirector(a);
                    if (b) {
                        System.out.println("Actor modificado correctamente");
                    } else {
                        System.out.println("El actor no pudo ser modificado");
                    }
                }
                case 4 -> {
                    int b = findDirector(a);
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
    
    
	/**
	 * add a director
	 * 
	 * @param a Audiovisual con la se quiere comprobar
	 * @return true or false depending on whether it has been executed or not
	 */
	public boolean addDirector(Audiovisual a)
	{

		try
		{

			System.out.println("--------------------");
			System.out.print("Introduzca el nombre: ");
			String name = MyScanner.scanner.nextLine();
			System.out.print("Introduzca los apellidos: ");
			String lastname = MyScanner.scanner.nextLine();
			System.out.print("Introduzca el genero: ");
			String gender = MyScanner.scanner.nextLine();
			System.out.print("Introduzca la edad: ");
			int age = Integer.parseInt(MyScanner.scanner.nextLine());
			System.out.print("Introduzca la nacionalidad: ");
			String nationality = MyScanner.scanner.nextLine();
			Director director = new Director(name, lastname, gender, age, nationality);
			a.adddirectors(director);
			return true;
		} 
		catch (NumberFormatException e) 
		{
			return false;
		}
	}

	/**
	* Shows the directors who have an Audiovisual
	*
	* @param a Audiovisual to extract the list from
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
	* Select a director from the list
	*
	* @param a Audiovisual from which you want to select
	* @return position of the Array where the director is located
	* if it doesn't find it, it returns -1
	*/
	public int selectDirector(Audiovisual a)
	{

		displayDirectores(a);

		System.out.println("--------------------");
		System.out.print("Introduzca el Director (su numero) que quiera seleccionar: ");
		int option;
		try
		{
			option = Integer.parseInt(MyScanner.scanner.nextLine());
			if ((option > 0) && (option <= a.getdirectors().length))
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
	* @param b Audiovisual from which gets the array.
	*/
	public boolean modifyDirector(Audiovisual b) 
	{
                int pos = selectDirector(b);
                if(pos != -1)
                {
                    Director a = b.getdirectors()[pos];
                    System.out.println("--------------------");
                    System.out.println(" Te muestro las posibles modificaciones" + "1.- name" + "2.- lastname" + "3.- gender"
                                    + "4.- age" + "5.- nationality");

                    int atributo;

                    try
                    {
                            atributo = Integer.parseInt(MyScanner.scanner.nextLine());
                            switch (atributo)
                            {

                            case 1 ->                             
                            {
                                    System.out.println("dime el nuevo nombre");
                                    String newText = MyScanner.scanner.nextLine();
                                    a.setName(newText);
                            }
                            case 2 ->                             
                            {
                                    System.out.println("dime el nuevo nombre");
                                    String newText = MyScanner.scanner.nextLine();
                                    a.setLastname(newText);
                            }
                            case 3 ->                             
                            {
                                    System.out.println("dime el nuevo nombre");
                                    String newText = MyScanner.scanner.nextLine();
                                    a.setgender(newText);
                            }
                            case 4 ->                             
                            {
                                    System.out.println("dime el nuevo nombre");
                                    int newInt = Integer.parseInt(MyScanner.scanner.nextLine());
                                    a.setAge(newInt);
                            }
                            case 5 ->                             
                            {
                                    System.out.println("dime el nuevo nombre");
                                    String newText = MyScanner.scanner.nextLine();
                                    a.setNationality(newText);
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
		return true;
	}
	/**
	* Compare between two categories
	*
	* @param to Audiovisual from which to obtain the array that the director removes
	*/
	public boolean deleteDirector(Audiovisual a)
	{
		int posicion = selectDirector(a);
                if (posicion != -1) {
                    a.deletedirectors(posicion);
                    return true;
                } else {
                    return false;
                }
	}
	/**
	* Compare between two categories
	* @param a Audiovisual from which the array in which the director performs the search is obtained
	*/
	public int findDirector(Audiovisual a)
	{
		System.out.println(" Te muestro las posibles claves de busqueda" + "1.- name" + "2.- lastname" + "3.- gender"
				+ "4.- age" + "5.- nationality");

		int atributo, cant = 0;

		try
		{
			atributo = Integer.parseInt(MyScanner.scanner.nextLine());
			switch (atributo) 
			{
			case 1: 
			{
				System.out.println("dime nombre");
				String newText = MyScanner.scanner.nextLine();
				for (Director d : a.getdirectors())
				{
					if (d.getName().equals(newText))
					{
						System.out.println(d.toString());
                                                cant++;
					}
				}
				break;
			}
			case 2: 
			{
				System.out.println("dime apellido");
				String newText = MyScanner.scanner.nextLine();
				for (Director d : a.getdirectors())
				{
					if (d.getLastname().equals(newText))
					{
						System.out.println(d.toString());
                                                cant++;
					}
				}
				break;
			}
			case 3: 
			{
				System.out.println("dime genero");
				String newText = MyScanner.scanner.nextLine();
				for (Director d : a.getdirectors())
				{
					if (d.getgender().equals(newText))
					{
						System.out.println(d.toString());
                                                cant++;
					}
				}
			}
			case 4: 
			{
				System.out.println("dime edad");
				int newText = Integer.parseInt(MyScanner.scanner.nextLine());
				for (Director d : a.getdirectors())
				{
					if (d.getAge() == (newText)) 
					{
						System.out.println(d.toString());
                                                cant++;
					}
				}
				break;
			}
			case 5:
			{
				System.out.println("dime nacionalidad");
				String newText = MyScanner.scanner.nextLine();
				for (Director d : a.getdirectors())
				{
					if (d.getNationality().equals(newText))
					{
						System.out.println(d.toString());
                                                cant++;
					}
				}
                                break;
			}
                        default:
                        {
                            return -1;
                        }
			}
                        return cant;
		} 
		catch (NumberFormatException ex) 
		{
			return -1;
		}
	}

}
