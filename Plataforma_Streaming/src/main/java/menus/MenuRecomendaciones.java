package menus;

import java.util.InputMismatchException;
import java.util.Scanner;

import clases.Audiovisual;
import clases.Recommendations;

public class MenuRecomendaciones {
	/**
	 * add a Recomendacion
	 * 
	 * @param to Audiovisual with which you want to check
	 * @return an Audiovisual with the added recomendations
	 */
	public Audiovisual addRecomendations(Audiovisual a)
	{

		try (Scanner sc = new Scanner(System.in))
		{

			System.out.println("--------------------");
			System.out.print("Enter recommendatios: ");
			String name = sc.nextLine();
			System.out.print("Enter the description");
			String description = sc.next();
			Recommendations recommendations = new Recommendations(name, 0, description);
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
	public void showRecommendations(Audiovisual a) 
	{

		Recommendations recommendations[] = a.getRecommendations(); 

		System.out.println("--------------------");
		System.out.println("List the Recommendations: ");

		for (int i = 0; i < recommendations.length; i++)
		{
			System.out.println(i + 1 + ".- " + recommendations[i].getUsername()+ " " + recommendations[i].getRatings()+"	"+recommendations[i].getComment());
		}

	}

	/**
	 * Select a Recommendatios from the list
	 * 
	 * @param a Audiovisual from which you want to select
	 * @return Array position where the recommendatios is located
	 * if it doesn't find it, it returns -1
	 */
	public int selectCategories(Audiovisual a)
	{

		showRecommendations(a);

		System.out.println("--------------------");
		System.out.print("Enter Recommendatiost: ");
		int option;
		try (Scanner sc = new Scanner(System.in))
		{
			option = sc.nextInt();
			if ((option > 0) && (option < a.getRecommendations().length))
				return option - 1;
			else
				return -1;
		} 
		catch (InputMismatchException e)
		{
			return -1;
		}
	}

	}



