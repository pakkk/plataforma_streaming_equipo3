package es.iesjandula.plataforma_streaming.menus;
 
import es.iesjandula.plataforma_streaming.clases.Audiovisual;
import es.iesjandula.plataforma_streaming.clases.Subtitles;
import es.iesjandula.plataforma_streaming.clases.MyScanner;
import es.iesjandula.plataforma_streaming.clases.Language;
/**
 * This class implements the menu for subtitle options.
 *
 * @author Miguel
 */
public class MenuSubtitles {

   private Audiovisual audiovisual = null;

    /**
     * Builder of the class.
     *
     * @param a El audiovisual al que se le van a agregar o eliminar subtítulos.
     */
    public MenuSubtitles(Audiovisual audiovisual) 
    {
        this.audiovisual = audiovisual;
    }

    /**
     * This method displays the menu and calls the corresponding methods for
     * each option.
     */
    public void mostrarMenu() 
    {
        int opcion;
        do 
        {
            //Show Options from the menu
            System.out.println("\n-- SUBTITLES MENU --");
            System.out.println("1. Add a subtitle");
            System.out.println("2. Delete a subtitle");
            System.out.println("3. Modify a subtitle");
            System.out.println("4. Search subtitles");
            System.out.println("5. Exit");

            try 
            {
                //Read the user option
                opcion = Integer.parseInt(MyScanner.scanner.nextLine());
            } catch (NumberFormatException e) 
            {
                opcion = 0;
            }

            switch (opcion) 
            {
                case 1 -> 
                {
                    //Add a subtitle
                    boolean b = addSubtitle();
                    if (b) 
                    {
                        System.out.println("Subtitle entered correctly");
                    } 
                    else 
                    {
                        System.out.println("Subtitle not entered");
                    }
                }
                case 2 -> 
                {
                    //Delete a subtitle
                    boolean b = delete();
                    if (b) 
                    {
                        System.out.println("Subtitle deleted correctly");
                    } 
                    else 
                    {
                        System.out.println("The Subtitle could not be deleted");
                    }
                }
                case 3 -> 
                {
                    //Modify a subtitle
                    boolean b = modify();
                    if (b) 
                    {
                        System.out.println("Subtitle modified correctly");
                    } 
                    else 
                    {
                        System.out.println("Subtitle could not be modified");
                    }
                }
                case 4 -> 
                {
                    //Find subtitles by language
                    boolean b = searchByLanguage();
                    if (!b) 
                    {
                        System.out.println("Error in the search");
                    }
                }
                case 5 -> 
                {
                    //Exit the subtitle menu
                    System.out.println("Exiting subtitles menu...");
                }
                default -> 
                {
                    //Invalid option
                    System.out.println("Invalid option. Enter a number from 1 to 5.");
                }
            }
        } while (opcion != 5);
    }

    /**
     * Add a subtitle to the current movie.
     *
     * @return true if the subtitle was added correctly, false if not.
     */
    private boolean addSubtitle() 
    {
        int language;

        // Show language options
        System.out.println("\n-- ADD A SUBTITLE --");
        System.out.println("Enter the subtitle language:");
        System.out.println("1. English");
        System.out.println("2. French");
        System.out.println("3. Spanish");
        System.out.println("4. Chinese");
        System.out.println("5. Not available");

        try 
        {
            language = Integer.parseInt(MyScanner.scanner.nextLine());

            Subtitles subtitle = new Subtitles();

             // Select subtitle language based on user input
            switch (language) 
            {
                case 1 -> 
                {
                    subtitle.setSubtitleLanguage(Language.ENGLISH);
                }
                case 2 -> 
                {
                    subtitle.setSubtitleLanguage(Language.FRENCH);
                }
                case 3 -> 
                {
                    subtitle.setSubtitleLanguage(Language.SPANISH);
                }
                case 4 -> 
                {
                    subtitle.setSubtitleLanguage(Language.CHINESE);
                }
                case 5 -> 
                {
                    subtitle.setSubtitleLanguage(Language.NOTAVAILABLE);
                }
                default -> 
                {
                    // If the user enters a number that is not in the option range, returns false
                    return false;
                }
            }

            // Add subtitle to current movie and return true
            this.audiovisual.addSubtitles(subtitle);
            return true;
        } 
        catch (NumberFormatException e) 
        {
            // If the user enters something that is not a number, returns false
            return false;
        }
    }

    /**
     * This method looks for subtitles based on the language specified by the
     * user.
     *
     * @return true if subtitles were found, false otherwise.
     */
    private boolean searchByLanguage() 
    {
        int language;
        System.out.println("\n-- SEARCH FOR SUBTITLES BY LANGUAGE --");
        System.out.println("Enter the language you want to search for:");
        System.out.println("1. English");
        System.out.println("2. French");
        System.out.println("3. Spanish");
        System.out.println("4. Chinese");
        System.out.println("5. Not available");

        try 
        {
            language = Integer.parseInt(MyScanner.scanner.nextLine());

            Language searchLanguage;
            switch (language) 
            {
                case 1 -> 
                {
                    searchLanguage = Language.ENGLISH;
                }
                case 2 -> 
                {
                    searchLanguage = Language.FRENCH;
                }
                case 3 -> 
                {
                    searchLanguage = Language.SPANISH;
                }
                case 4 -> 
                {
                    searchLanguage = Language.CHINESE;
                }
                case 5 -> 
                {
                    searchLanguage = Language.NOTAVAILABLE;
                }
                default -> 
                {
                    // If the user enters an invalid value, false is returned.
                    return false;
                }
            }

            boolean found = false;

            // Browse through the list of subtitles and search for those that match the selected language.
            for (Subtitles subtitle : this.audiovisual.getSubtitles()) 
            {
                if (subtitle.getSubtitleLanguage() == searchLanguage) 
                {
                    System.out.println(subtitle.toString());
                    found = true;
                }
            }

            if (!found) 
            {
                System.out.println("No subtitles found for the searched language.");
            }
        } 
        catch (NumberFormatException e) 
        {
            // If the user enters something that is not an integer, false is returned.
            return false;
        }
        return true;
    }

    /**
     * This method allows you to modify an existing subtitle.
     *
     * @return true if the modification was successful, false otherwise.
     */
    private boolean modify() 
    {
        int option;

        System.out.println("\n-- MODIFY SUBTITLE --");
        System.out.println("Enter the index of the subtitle you want to modify:");

        // Print the list of existing subtitles so that the user can select one.
        for (Subtitles s : this.audiovisual.getSubtitles()) 
        {
            System.out.println(s.toString());
        }

        try 
        {
            option = Integer.parseInt(MyScanner.scanner.nextLine());

            // If the user-selected index is invalid, false is returned.
            if (option < 0 || option > this.audiovisual.getSubtitles().length) 
            {
                return false;
            } 
            else 
            {
                Subtitles subtitle;
                subtitle = this.audiovisual.getSubtitles()[option - 1];
                int language;

                System.out.println("\n-- MODIFY SUBTITLE --");
                System.out.println("Select the new language:");
                System.out.println("1. English");
                System.out.println("2. French");
                System.out.println("3. Spanish");
                System.out.println("4. Chinese");
                System.out.println("5. Not available");

                language = Integer.parseInt(MyScanner.scanner.nextLine());

                switch (language) 
                {
                    case 1 ->
                    {    
                        subtitle.setSubtitleLanguage(Language.ENGLISH);
                    }    
                    case 2 ->
                    {
                        subtitle.setSubtitleLanguage(Language.FRENCH);
                    }
                    case 3 ->
                    {
                        subtitle.setSubtitleLanguage(Language.SPANISH);
                    }
                    case 4 ->
                    {
                        subtitle.setSubtitleLanguage(Language.CHINESE);
                    }
                    case 5 ->
                    {
                        subtitle.setSubtitleLanguage(Language.NOTAVAILABLE);
                    }
                    default -> 
                    {
                        // If the user enters an invalid value, false is returned.
                        return false;
                    }
                }
                System.out.println("Subtitle modified successfully.");
                return true;
            }

        }
        catch (NumberFormatException e) 
        {
            // If the user enters something that is not an integer, false is returned.
            return false;
        }
    }

    /**
     * Removes a subtitle based on the user-specified index.
     * @return true and it eliminates corrections, false and no.
     */
    private boolean delete() 
    {
        int option;
        System.out.println("\n-- DELETE SUBTITLE --");
        System.out.println("Enter the index of the subtitle you want to delete:");
        for (Subtitles s : this.audiovisual.getSubtitles()) 
        {
            System.out.println(s.toString());
        }

        try 
        {
            option = Integer.parseInt(MyScanner.scanner.nextLine());
            if (option > 0 && option <= this.audiovisual.getSubtitles().length) 
            { // Verify that the index is within the limits of the subtitle list
                this.audiovisual.deleteSubtitles(option - 1); // Remove the subtitle at the position specified by the user. Subtract 1 because the indexes in the list start at 0.
                System.out.println("Subtitle deleted successfully.");
                return true;
            } 
            else 
            {
                return false;
            }
        } 
        catch (NumberFormatException e) 
        { // Handles errors if the user enters a value that is not an integer
            return false;
        }
    }
}