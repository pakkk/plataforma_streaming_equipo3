package menus;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;


import clases.*;

public class MenuGeneralAudiovisuales {

	Audiovisual[] dataBase;

	public MenuGeneralAudiovisuales(Audiovisual[] dataBase) {
		this.dataBase = dataBase;
	}


	public void addAudiovisual() {

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("1:- Modificar Pelicula" + "\n" + "2:-Modificar Serie");
			int menu = scanner.nextInt();

			if (menu == 1) {
				System.out.println("dime un titulo para el audiovisual");
				String title = scanner.nextLine();
				System.out.println("dime un lenguage para el audiovisual");
				String originalLanguage = scanner.nextLine();
				System.out.println("dime una año para el audiovisual");
				int yearOfCreation = scanner.nextInt();
				int views = 0;
				System.out.println("dime una duracion para el audiovisual");
				int duration = scanner.nextInt();
				dataBase = Arrays.copyOf(dataBase, dataBase.length + 1);
				dataBase[dataBase.length - 1] = new Films(title, originalLanguage, yearOfCreation, views, duration);
			} else if (menu == 2) {
				System.out.println("dime un titulo para el audiovisual");
				String title = scanner.nextLine();
				System.out.println("dime un lenguage para el audiovisual");
				String originalLanguage = scanner.nextLine();
				System.out.println("dime una año para el audiovisual");
				int yearOfCreation = scanner.nextInt();
				int views = 0;
				System.out.println("dime las temporadas para el audiovisual");
				int episodes = scanner.nextInt();
				System.out.println("dime los episodios para el audiovisual");
				int season = scanner.nextInt();
				dataBase = Arrays.copyOf(dataBase, dataBase.length + 1);
				dataBase[dataBase.length - 1] = new Serie(title, originalLanguage, yearOfCreation, views, episodes,season);
			}
		} catch (InputMismatchException e) {
			System.out.println(" no se ha podido crear");
		}
	}

	public Audiovisual findAudiovisual() {
		Audiovisual a = null;
		int position = 0;

		try (Scanner escanner = new Scanner(System.in)) {

			System.out.println("dime un titulo para el audiovisual");
			String clave = escanner.nextLine();
			Arrays.sort(dataBase);
			position = Arrays.binarySearch(dataBase, clave);
			a = dataBase[position];

		} catch (InputMismatchException e) {
			System.out.println(" no se ha podido crear");
		}
		return a;
	}

	public void modifyAudiovisual() {
		
		try(Scanner scanner=new Scanner (System.in)){
			System.out.println("1:- Modificar Pelicula"+"\n"+"2:-Modificar Serie");
			int menu=scanner.nextInt();
			if(menu==1) {
				System.out.println("1:-modificar titulo ");
				System.out.println("2:-Añadir lenguage ");
				System.out.println("3:-añadir año ");
				System.out.println("4:- Añadir visita");
				System.out.println("5:-Añadir duracion");
				int option=scanner.nextInt();
				Films a=(Films)findAudiovisual();
				switch(option) {
				case 1:
				{
					System.out.println("dime el nuevo titulo");
					String title = null;
					a.settitle(title);
					break;
				}
				case 2:
				{
					System.out.println("dime el nuevo lenguage");
					String lenguage = null;
					a.settitle(lenguage);
					break;
				}
				case 3:
				{
					System.out.println("dime el nuevo año");
					int anio=0;
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
					int duration = 0;
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
					int option=scanner.nextInt();
					Serie a=(Serie)findAudiovisual();
					switch(option)
					{
					case 1:
					{
						System.out.println("dime el nuevo titulo");
						String title = null;
						a.settitle(title);
						break;
					}
					case 2:
					{
						System.out.println("dime el nuevo lenguage");
						String lenguage = null;
						a.settitle(lenguage);
						break;
					}
					case 3:
					{
						System.out.println("dime el nuevo año");
						int anio=0;
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
						int temporadas = scanner.nextInt();
						a.setEpisodes(option);
						break;
					}
					case 6:
					}
						System.out.println("dime el nuevo valor de capitulos");
						int capitulos = scanner.nextInt();
						a.setSeasons(capitulos);
						break;
					{
				
				}
			
		
		}catch (InputMismatchException e) {
			System.out.println(" no se ha podido crear");	
		}
		}
		
	
		
	


	
	


