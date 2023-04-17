package es.iesjandula.plataforma_streaming.menus;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import es.iesjandula.plataforma_streaming.clases.*;
/**
 * 
 * @author Silvia Cofrades Mesa
 *
 */
public class MenuGeneralAudiovisuales
{

	private Audiovisual[] dataBase;
	 	/**
		 * Assigns a value to the database
		 * 
		 * DataBase Audiovisual[] full copy of the database 
		 **/
	public MenuGeneralAudiovisuales(Audiovisual[] dataBase)
	{
		this.dataBase = dataBase;
	}
	/**
	 * Returns the database with all its modifications
	 * @return Audiovisual[]
	 **/
	public Audiovisual[] getDataBase() 
	{
		return this.dataBase;
	}
	/**
	 * Add an audiovisual to the array
	 **/
	public void addAudiovisual() 
	{

		try
		{
			System.out.println("1:- New Movie"+"\n" + "2:-New Series");
			int menu = Integer.parseInt(MyScanner.scanner.nextLine());

			if (menu == 1)
			{
				System.out.println("Give me a title for the audiovisual");
				String title = MyScanner.scanner.nextLine();
				System.out.println("Tell me a language for the audiovisual");
				String originalLanguage = MyScanner.scanner.nextLine();
				System.out.println("Give me a year for the audiovisual");
				int yearOfCreation = Integer.parseInt(MyScanner.scanner.nextLine());
				int views = 0;
				System.out.println("Tell me a duration for the audiovisual");
				int duration = Integer.parseInt(MyScanner.scanner.nextLine());
				this.dataBase = Arrays.copyOf(this.dataBase, this.dataBase.length + 1);
				this.dataBase[this.dataBase.length - 1] = new Films(title, originalLanguage, yearOfCreation, views, duration);
			} 
			else if (menu == 2)
			{
				System.out.println("Give me a title for the audiovisual");
				String title = MyScanner.scanner.nextLine();
				System.out.println("Tell me a language for the audiovisual");
				String originalLanguage = MyScanner.scanner.nextLine();
				System.out.println("Give me a year for the audiovisual");
				int yearOfCreation = Integer.parseInt(MyScanner.scanner.nextLine());
				int views = 0;
				System.out.println("Tell me the seasons for the audiovisual");
				int episodes = Integer.parseInt(MyScanner.scanner.nextLine());
				System.out.println("Tell me the episodes for the audiovisual");
				int season = Integer.parseInt(MyScanner.scanner.nextLine());
				this.dataBase = Arrays.copyOf(this.dataBase, this.dataBase.length + 1);
				this.dataBase[this.dataBase.length - 1] = new Serie(title, originalLanguage, yearOfCreation, views, episodes,season);
			}
		}
		catch (NumberFormatException e) 
		{
			System.out.println("Could not create");
		}
	}
	/**
	 * Search for an audiovisual among the list
	 * @return Audiovisual 
	 **/
	public Audiovisual findAudiovisual()
	{
		Audiovisual a = null;
		int position = -1;
		try
		{
			System.out.println("Give me a title for the audiovisual");
			String clave = MyScanner.scanner.nextLine();
                        for(int i = 0; i < this.dataBase.length; i++){
                            if(this.dataBase[i].getTitle().equals(clave))
                                position = i;
                        }
                        if(position>= 0)
                            a = this.dataBase[position];
                        else
                            a = null;

		} 
		catch (NumberFormatException e) 
		{
			System.out.println("Could not create");
		}
		return a;
	}
	/**
	 * Modifies the values ​​of a Series object or a Movie Object 
	 **/
	public void modifyAudiovisual() 
	{
		
		try
		{
			System.out.println("1:- Modify Movie"+"\n"+"2:-Modify Series");
			int menu = Integer.parseInt(MyScanner.scanner.nextLine());
			if(menu==1) 
			{
				System.out.println("1:- Modify title");
				System.out.println("2:- Add language ");
				System.out.println("3:- Add year ");
				System.out.println("4:- Add visit");
				System.out.println("5:- Add duration");
				int option=Integer.parseInt(MyScanner.scanner.nextLine());
				Films a=(Films)this.findAudiovisual();
				switch(option) 
				{
				case 1:
				{
					System.out.println("Tell me the new title");
					String title = MyScanner.scanner.nextLine();
					a.setTitle(title);
					break;
				}
				case 2:
				{
					System.out.println("Tell me the new lenguage");
					String lenguage = MyScanner.scanner.nextLine();
					a.setTitle(lenguage);
					break;
				}
				case 3:
				{
					System.out.println("Tell me the new year");
					int anio=Integer.parseInt(MyScanner.scanner.nextLine());
					a.setyearOfCreation(anio);
					break;
				}
				case 4:
				{
					System.out.println("Add new visit");
					a.addViews();
					break;
				}
				case 5:
				{
					System.out.println("Tell me the new duration value");
					int duration = Integer.parseInt(MyScanner.scanner.nextLine());;
					a.setDurationMinutes(duration);	
					break;
				}
				}
			}
			else if(menu==2)
			{
			
					System.out.println("1:- Modify title");
					System.out.println("2:- Add lenguage");
					System.out.println("3:- Add year");
					System.out.println("4:- Add visit");
					System.out.println("5:- Add new season");
					System.out.println("5:- Add new chapter");
					int option=Integer.parseInt(MyScanner.scanner.nextLine());
					Serie a=(Serie)this.findAudiovisual();
					switch(option)
					{
					case 1:
					{
						System.out.println("Tell me the new title");
						String title = MyScanner.scanner.nextLine();
						a.setTitle(title);
						break;
					}
					case 2:
					{
						System.out.println("Tell me the new lenguage");
						String lenguage = MyScanner.scanner.nextLine();
						a.setTitle(lenguage);
						break;
					}
					case 3:
					{
						System.out.println("Tell me the new year");
						int anio=Integer.parseInt(MyScanner.scanner.nextLine());;
						a.setyearOfCreation(anio);
						break;
					}
					case 4:
					{
						System.out.println("Add new visit");
						a.addViews();
						break;
					}
					case 5:
					{
						System.out.println("Tell me the new value of seasons");
						int temporadas = Integer.parseInt(MyScanner.scanner.nextLine());
						a.setEpisodes(temporadas);
						break;
					}
					case 6:
					{
					
						System.out.println("Tell me the new value of chapters");
						int capitulos = Integer.parseInt(MyScanner.scanner.nextLine());
						a.setSeasons(capitulos);
						break;
					}			
		
		}
		}
		}
		catch (NumberFormatException e)
		{
			System.out.println("Could not create");
	}	
	}
	/**
	 * Removes a Movie or Series object from the list
	 **/
	public void deleteAudiovisual() 
	{
		Arrays.sort(this.dataBase);
		int  clave=Arrays.binarySearch(this.dataBase,this.findAudiovisual());
                if(clave >=0 && clave < this.dataBase.length){
                    if(clave != this.dataBase.length-1)
                        System.arraycopy(this.dataBase, clave+1, this.dataBase, clave, this.dataBase.length-clave-1);
                    this.dataBase=Arrays.copyOf(this.dataBase, this.dataBase.length-1);
                }		
	}
}