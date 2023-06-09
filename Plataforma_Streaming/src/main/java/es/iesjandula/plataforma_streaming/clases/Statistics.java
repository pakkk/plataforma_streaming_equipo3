package es.iesjandula.plataforma_streaming.clases;
import java.util.InputMismatchException;
/**
 * This class save the statistics of the system
 * @author Alvaro Marmol
 * @author Alvaro Lopez
 * @author Miguel
 */
public class Statistics 
{
    /**
     * Enter by console name the actor and show the films the this actor
     * @param audioVisuals Arrays class Audiovisual
     */
    public void actors(Audiovisual[] audioVisuals) 
    {

        String name = "";
        boolean stop = true;
        do 
        {
            try
            {
                name = MyScanner.scanner.nextLine();
                stop = false;
            } catch (InputMismatchException e) 
            {
                System.out.println("Invalid name");
            }
        } 
        while (stop);

        for (Audiovisual a : audioVisuals) 
        {
            if (isActor(a, name)) 
            {
                System.out.println(a.toString());
            }
        }
    }
    /**
     * Return true or false if actor is in the array
     * @param audioVisuals Arrays class Audiovisual
     * @param name String name the actor
     * @return boolean true or false
     */

    private boolean isActor(Audiovisual audiovisual, String name) 
    {
        Actor[] actor = audiovisual.getSupportingActores();
        for (Actor ForActor : actor) 
        {

            if (ForActor.getName().equals(name)) 
            {
                return true;
            }
        }
        return false;
    }
    
    /**
     * Enter by console name the Genders and show the films the this Genders
     * @param audioVisuals Arrays class Audiovisual
     */
    public void genders (Audiovisual[] audioVisuals) 
    {

        String gender = "";
        boolean stop = true;
        do 
        {
            try 
            { 
            	gender = MyScanner.scanner.nextLine();
                stop = false;
            } catch (InputMismatchException e) {
                System.out.println("Invalid name");
            }
        } 
        while (stop);

        for (Audiovisual a : audioVisuals) 
        {
            if (isGender(a, gender)) 
            {
                System.out.println(a.toString());
            }
        }
    }
    
    /**
     * Return true or false if Gender is in the array
     * @param audioVisuals Arrays class Audiovisual
     * @param name String Gender
     */

    private boolean isGender (Audiovisual a, String categories) 
    {
        Category[] category = a.getcategories();
        for (Category Gender : category) 
        {

            if (Gender.getName().equals(categories)) 
            {
                return true;
            }
        }
        return false;
    }
    
    /**
     * Enter by console name the Subtitles and show the films the this Subtitles
     * @param audioVisuals Arrays class Audiovisual
     */
    
    public void subtitles (Audiovisual[] audioVisuals) 
    {

        String subtitles = "";
        boolean stop = true;
        do 
        {
            try  
            {
            	subtitles = MyScanner.scanner.nextLine();
                stop = false;
            } catch (InputMismatchException e) 
            {
                System.out.println("Invalid subtitle");
            }
        } while (stop);
        
        for (Audiovisual a : audioVisuals) 
        {
            if (isSubtitles(a, subtitles)) 
            {
                System.out.println(a.toString());
            }
        }
    }
    
    /**
     * Return true or false if Subtitles is in the array
     * @param audioVisuals Arrays class Audiovisual
     * @param name String Subtitles.
     */

    private boolean isSubtitles (Audiovisual a, String LanguajeSubtitle) 
    {
    	Subtitles[] act = a.getSubtitles();
        for (Subtitles subtitles : act) 
        {

            if (subtitles.getSubtitleLanguage().equals(LanguajeSubtitle))
            {
                return true;
            }
        }
        return false;
    }    
    
    /**
     * Prompts the user to enter one or more director names and displays all
     * Audiovisual objects that have at least one of those directors.
     *
     * @param audioVisuals the Audiovisual array to search
     */
    public void searchByDirectors(Audiovisual[] audioVisuals) 
    {
        String name = "";
        boolean stop = true;
        do 
        {
            try
            {
                name = MyScanner.scanner.nextLine();
                stop = false;
            } catch (InputMismatchException e) 
            {
                System.out.println("Invalid name");
            }
        } while (stop);

        for (Audiovisual a : audioVisuals) 
        {
            if (isDirector(a, name)) 
            {
                System.out.println(a.toString());
            }
        }
    }

    /**
     * This method checks whether the given audiovisual was directed by one or
     * more of the directors whose names are provided.
     *
     * @param a the audiovisual to check
     * @param directorNames an array of director names to search for
     * @return true if the audiovisual was directed by at least one of the
     * directors, false otherwise
     */
    private static boolean isDirector(Audiovisual a, String directorNames) 
    {
        Director[] dir = a.getdirectors();
        for (Director director : dir) 
        {
            if (director.getName().equals(directorNames)) 
            {
                return true;
            }
        }
        return false;
    }
}