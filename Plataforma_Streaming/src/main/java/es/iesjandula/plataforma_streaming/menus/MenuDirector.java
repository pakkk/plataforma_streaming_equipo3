package es.iesjandula.plataforma_streaming.menus;


import es.iesjandula.plataforma_streaming.clases.Audiovisual;
import es.iesjandula.plataforma_streaming.clases.Director;
import es.iesjandula.plataforma_streaming.clases.MyScanner;
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
	Audiovisual audiovisual;
	private boolean find;
	
	/**
	 * Parametized constructor
	 * @param audiovisual to save directors
	 */
	public MenuDirector(Audiovisual audiovisual) 
	{
		this.audiovisual = audiovisual;
		this.find = false;
	}
	/**
	 * Default constructor
	 */
	public MenuDirector()
	{
		this.audiovisual = null;
		this.find = false;
	}

	/**
	 * This method contains the menu to add,delete,modify and search a director
	 */
	
    public void startMenu() 
    {
        int menu;
        do 
        {

            System.out.println("----------------------------------------");
            System.out.println("----MENU DIRECTOR----");
            System.out.println("1.- Add a new director");
            System.out.println("2.- Delete an director");
            System.out.println("3.- Modify an director");
            System.out.println("4.- Search an director");
            System.out.println("5.- Exit");

            try 
            {
                menu = Integer.parseInt(MyScanner.scanner.nextLine());
            } catch (NumberFormatException e) {
                menu = 0;
            }

            switch (menu) 
            {
                case 1 -> 
                {
                    this.find = this.addDirector();
                    if (this.find) 
                    {
                        System.out.println("Director insert succesfully");
                    } else 
                    {
                        System.out.println("The director not introduce");
                    }
                }
                case 2 -> 
                {
                    this.find = this.deleteDirector();
                    if (this.find) 
                    {
                        System.out.println("Director deleted succesfully");
                    } else 
                    {
                        System.out.println("The director isn't deleted ");
                    }
                }
                case 3 -> 
                {

                    this.find = this.modifyDirector();
                    if (this.find)
                    {
                        System.out.println("Director modified succesfully");
                    } else 
                    {
                        System.out.println("The director isn't modified");
                    }
                }
                case 4 -> 
                {
                    int searchId = this.findDirector();
                    if (searchId == 0) 
                    {
                        System.out.println("Not existent directors that do the condition");
                    }
                }
                case 5 -> 
                {
                	System.out.println("Exit from the menu");
                }
                default -> 
                {
                    System.out.println("Wrong option");
                }
            }
        } while (menu != 5);
    }
    

	/**
	 * 
	 * add a director
	 * @return true or false depending on whether it has been executed or not
	 */
	public boolean addDirector()
	{

		try
		{

			System.out.println("--------------------");
			System.out.print("Select the name: ");
			String name = MyScanner.scanner.nextLine();
			System.out.print("Select the last name: ");
			String lastname = MyScanner.scanner.nextLine();
			System.out.print("Select the gender: ");
			String gender = MyScanner.scanner.nextLine();
			System.out.print("Select the age: ");
			int age = Integer.parseInt(MyScanner.scanner.nextLine());
			System.out.print("Select the nationality: ");
			String nationality = MyScanner.scanner.nextLine();
			Director director = new Director(name, lastname, gender, age, nationality);
			this.audiovisual.adddirectors(director);
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
	public void displayDirectores() 
	{

		Director [] Directores = this.audiovisual.getdirectors();

		System.out.println("--------------------");
		System.out.println("List of directors: ");

		for (int i = 0; i < Directores.length; i++)
		{
			System.out.println(i + 1 + ".- " + Directores[i].getName() + " " + Directores[i].getLastName());
		}

	}

	/**
	* Select a director from the list
	*
	* @return position of the Array where the director is located
	* if it doesn't find it, it returns -1
	*/
	public int selectDirector()
	{

		this.displayDirectores();

		System.out.println("--------------------");
		System.out.print("Introduce the id of the director that will be search: ");
		int option;
		try
		{
			option = Integer.parseInt(MyScanner.scanner.nextLine());
			if ((option > 0) && (option <= this.audiovisual.getdirectors().length))
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
	* @return a boolean that verify if found the director
	*/
	public boolean modifyDirector() 
	{
                int pos = selectDirector();
                if(pos != -1)
                {
                    Director director = this.audiovisual.getdirectors()[pos];
                    System.out.println("--------------------");
                    System.out.println(" Posiible modifications" + "1.- name" + "2.- lastname" + "3.- gender"
                                    + "4.- age" + "5.- nationality");

                    int atributo;

                    try
                    {
                            atributo = Integer.parseInt(MyScanner.scanner.nextLine());
                            switch (atributo)
                            {

                            case 1 ->                             
                            {
                                System.out.println("Select the new name");
                                String newText = MyScanner.scanner.nextLine();
                                director.setName(newText);
                            }
                            case 2 ->                             
                            {
                                System.out.println("Select the new last name");
                                String newText = MyScanner.scanner.nextLine();
                                director.setLastName(newText);
                            }
                            case 3 ->                             
                            {
                                System.out.println("Select the new gender");
                                String newText = MyScanner.scanner.nextLine();
                                director.setGender(newText);
                            }
                            case 4 ->                             
                            {
                                System.out.println("Select the new age");
                                int newInt = Integer.parseInt(MyScanner.scanner.nextLine());
                                director.setAge(newInt);
                            }
                            case 5 ->                             
                            {
                                System.out.println("Select the new nationality");
                                String newText = MyScanner.scanner.nextLine();
                                director.setNationality(newText);
                            }
                            default ->
                            {
                            	System.out.println("Error selecting option");
                            }
                            }
                    } 
                    catch (NumberFormatException ex)
                    {
                            return false;
                    }
                }else
                {
                    return false;
                }
		return true;
	}
	/**
	* Compare between two categories
	*
	* @return a boolean that verify if the director is found
	*/
	public boolean deleteDirector()
	{
		int posicion = selectDirector();
                if (posicion != -1) 
                {
                    this.audiovisual.deletedirectors(posicion);
                    return true;
                } else 
                {
                    return false;
                }
	}
	/**
	* Compare between two categories
	* @param a Audiovisual from which the array in which the director performs the search is obtained
	*/
	public int findDirector()
	{
		System.out.println(" Attributes of director to search" + "1.- name" + "2.- lastname" + "3.- gender"
				+ "4.- age" + "5.- nationality");

		int atributo = 0;
		int cant = 0;

		try
		{
			atributo = Integer.parseInt(MyScanner.scanner.nextLine());
			switch (atributo) 
			{
			case 1: 
			{
				System.out.println("Select the name");
				String newText = MyScanner.scanner.nextLine();
				for (Director d : this.audiovisual.getdirectors())
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
				System.out.println("Select the last name");
				String newText = MyScanner.scanner.nextLine();
				for (Director d : this.audiovisual.getdirectors())
				{
					if (d.getLastName().equals(newText))
					{
						System.out.println(d.toString());
                        cant++;
					}
				}
				break;
			}
			case 3: 
			{
				System.out.println("Select the gender");
				String newText = MyScanner.scanner.nextLine();
				for (Director d : this.audiovisual.getdirectors())
				{
					if (d.getGender().equals(newText))
					{
						System.out.println(d.toString());
                        cant++;
					}
				}
				break;
			}
			case 4: 
			{
				System.out.println("Select the age");
				int newText = Integer.parseInt(MyScanner.scanner.nextLine());
				for (Director d : this.audiovisual.getdirectors())
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
				System.out.println("Select the nationality");
				String newText = MyScanner.scanner.nextLine();
				for (Director d : this.audiovisual.getdirectors())
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
