package clases;
import java.util.*;
import java.util.InputMismatchException;
public class Statistics extends Audiovisual{
	/**
	 * Parameterized constructor
	 * @param Name the Actor
	 * */
		public String Actors(String nombreActor) 
		{
			try(Scanner scanner = new Scanner(System.in);){
				
				Audiovisual filmOrSeries = new Audiovisual();
				Actor[] ActorsList=filmOrSeries.supportingActores;
				for(int i=0;i<ActorsList.length;i++) {
					if(ActorsList[i].getName().equals(nombreActor)) {
						System.out.println(filmOrSeries.toString());
					}
				}
			}catch(InputMismatchException e) {
			System.out.println("Unregistered actor");
	}
		return "";
		}
	
	
}
