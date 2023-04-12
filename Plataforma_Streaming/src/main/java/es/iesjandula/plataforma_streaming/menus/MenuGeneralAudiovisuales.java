package es.iesjandula.plataforma_streaming.menus;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import es.iesjandula.plataforma_streaming.clases.*;

public class MenuGeneralAudiovisuales
{

	private Audiovisual[] dataBase;
	 	/**
		 * asigna un valor para la base de datos
		 * 
		 * @param dataBase Audiovisual[] copia de la base de datos al completo 
		 **/
	public MenuGeneralAudiovisuales(Audiovisual[] dataBase)
	{
		this.dataBase = dataBase;
	}
	/**
	 * devuelve la base de datos con todas sus modificaciones
	 * @return Audiovisual[]
	 **/
	public Audiovisual[] getDataBase() 
	{
		return dataBase;
	}
	/**
	 * añade un audiovisual al array
	 **/
	public void addAudiovisual() 
	{

		try
		{
			System.out.println("1:- Nueva Pelicula" + "\n" + "2:-Nueva Serie");
			int menu = Integer.parseInt(MyScanner.scanner.nextLine());

			if (menu == 1)
			{
				System.out.println("dime un titulo para el audiovisual");
				String title = MyScanner.scanner.nextLine();
				System.out.println("dime un lenguage para el audiovisual");
				String originalLanguage = MyScanner.scanner.nextLine();
				System.out.println("dime una año para el audiovisual");
				int yearOfCreation = Integer.parseInt(MyScanner.scanner.nextLine());
				int views = 0;
				System.out.println("dime una duracion para el audiovisual");
				int duration = Integer.parseInt(MyScanner.scanner.nextLine());
				dataBase = Arrays.copyOf(dataBase, dataBase.length + 1);
				dataBase[dataBase.length - 1] = new Films(title, originalLanguage, yearOfCreation, views, duration);
			} else if (menu == 2)
			{
				System.out.println("dime un titulo para el audiovisual");
				String title = MyScanner.scanner.nextLine();
				System.out.println("dime un lenguage para el audiovisual");
				String originalLanguage = MyScanner.scanner.nextLine();
				System.out.println("dime una año para el audiovisual");
				int yearOfCreation = Integer.parseInt(MyScanner.scanner.nextLine());
				int views = 0;
				System.out.println("dime las temporadas para el audiovisual");
				int episodes = Integer.parseInt(MyScanner.scanner.nextLine());
				System.out.println("dime los episodios para el audiovisual");
				int season = Integer.parseInt(MyScanner.scanner.nextLine());
				dataBase = Arrays.copyOf(dataBase, dataBase.length + 1);
				dataBase[dataBase.length - 1] = new Serie(title, originalLanguage, yearOfCreation, views, episodes,season);
			}
		} catch (NumberFormatException e) 
		{
			System.out.println(" no se ha podido crear");
		}
	}
	/**
	 * busca un audiovisual entre la lista 
	 * @return Audiovisual 
	 **/
	public Audiovisual findAudiovisual()
	{
		Audiovisual a = null;
		int position = -1;

		try
		{

			System.out.println("dime un titulo para el audiovisual");
			String clave = MyScanner.scanner.nextLine();
                        for(int i = 0; i < dataBase.length; i++){
                            if(dataBase[i].gettitle().equals(clave))
                                position = i;
                        }
                        if(position>= 0)
                            a = dataBase[position];
                        else
                            a = null;

		} catch (NumberFormatException e) 
		{
			System.out.println(" no se ha podido crear");
		}
		return a;
	}
	/**
	 * Modifica los valores de un objeto Serie o de un Objeto Pelicula 
	 **/
	public void modifyAudiovisual() 
	{
		
		try
		{
			System.out.println("1:- Modificar Pelicula"+"\n"+"2:-Modificar Serie");
			int menu = Integer.parseInt(MyScanner.scanner.nextLine());
			if(menu==1) 
			{
				System.out.println("1:-modificar titulo ");
				System.out.println("2:-Añadir lenguage ");
				System.out.println("3:-añadir año ");
				System.out.println("4:- Añadir visita");
				System.out.println("5:-Añadir duracion");
				int option=Integer.parseInt(MyScanner.scanner.nextLine());
				Films a=(Films)findAudiovisual();
				switch(option) 
				{
				case 1:
				{
					System.out.println("dime el nuevo titulo");
					String title = MyScanner.scanner.nextLine();
					a.settitle(title);
					break;
				}
				case 2:
				{
					System.out.println("dime el nuevo lenguage");
					String lenguage = MyScanner.scanner.nextLine();
					a.settitle(lenguage);
					break;
				}
				case 3:
				{
					System.out.println("dime el nuevo año");
					int anio=Integer.parseInt(MyScanner.scanner.nextLine());
					a.setyearOfCreation(anio);
					break;
				}
				case 4:
				{
					System.out.println("añadida una visita nueva");
					a.addviews();
					break;
				}
				case 5:
				{
					System.out.println("dime el nuevo valor de duracion");
					int duration = Integer.parseInt(MyScanner.scanner.nextLine());;
					a.setDurationMinutes(duration);	
					break;
				}
				}
			}else if(menu==2)
			
			{
			
					System.out.println("1:-modificar titulo ");
					System.out.println("2:-Añadir lenguage ");
					System.out.println("3:-añadir año ");
					System.out.println("4:- Añadir visita");
					System.out.println("5:-Añadir temporada");
					System.out.println("5:-Añadir capitulos");
					int option=Integer.parseInt(MyScanner.scanner.nextLine());
					Serie a=(Serie)findAudiovisual();
					switch(option)
					{
					case 1:
					{
						System.out.println("dime el nuevo titulo");
						String title = MyScanner.scanner.nextLine();
						a.settitle(title);
						break;
					}
					case 2:
					{
						System.out.println("dime el nuevo lenguage");
						String lenguage = MyScanner.scanner.nextLine();
						a.settitle(lenguage);
						break;
					}
					case 3:
					{
						System.out.println("dime el nuevo año");
						int anio=Integer.parseInt(MyScanner.scanner.nextLine());;
						a.setyearOfCreation(anio);
						break;
					}
					case 4:
					{
						System.out.println("añadida una visita nueva");
						a.addviews();
						break;
					}
					case 5:
					{
						System.out.println("dime el nuevo valor de temporadas");
						int temporadas = Integer.parseInt(MyScanner.scanner.nextLine());
						a.setEpisodes(temporadas);
						break;
					}
					case 6:
					{
					
						System.out.println("dime el nuevo valor de capitulos");
						int capitulos = Integer.parseInt(MyScanner.scanner.nextLine());
						a.setSeasons(capitulos);
						break;
					}			
		
		}
		
		}
		}
		catch (NumberFormatException e)
		{
			System.out.println(" no se ha podido crear");
	}	
	}
	/**
	 * elimina un objeto Pelicula o Serie de la lista 
	 **/
	public void deleteAudiovisual() 
	{
		Arrays.sort(dataBase);
		int  clave=Arrays.binarySearch(dataBase,findAudiovisual());
                if(clave >=0 && clave < dataBase.length){
                    if(clave != dataBase.length-1)
                        System.arraycopy(dataBase, clave+1, dataBase, clave, dataBase.length-clave-1);
                    dataBase=Arrays.copyOf(dataBase, dataBase.length-1);
                }
		
		
	}
}


		
	
		
	


	
	


