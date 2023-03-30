package menus;

import clases.*;
import java.util.Scanner;

/**
 * This class provides a menu for displaying statistics on a collection of Audiovisual objects.
 * Users can choose to view all audiovisuals or filter by director or category.
 * 
 * @author Miguel
 */
public class MenuStatistics {
    
    /**
     * Initializes the Audiovisual array and displays the menu until the user chooses to exit.
     * 
     * @param args the command line arguments (not used)
     */
    public static void main(String[] args) {
        Audiovisual[] audioVisuals = createAudioVisuals();

        boolean exit = false;
        do {
            // Display the menu options
            System.out.println("Welcome to the statistics menu:");
            System.out.println("1. Show all audiovisuals.");
            System.out.println("2. Show audiovisuals by director.");
            System.out.println("3. Show audiovisuals by category.");
            System.out.println("4. Exit.");
            
            // Get the user's choice and execute the corresponding method
            int option = readOption();
            switch (option) {
                case 1 -> showAllAudioVisuals(audioVisuals);
                case 2 -> searchAudioVisualsByDirectors(audioVisuals);
                case 3 -> searchAudioVisualsByCategory(audioVisuals);
                case 4 -> {
                    System.out.println("Goodbye!");
                    exit = true;
                }
                default -> System.out.println("Invalid option.");
            }
        } while (!exit);
    }

    /**
     * Initializes the Audiovisual array.
     * 
     * @return an empty Audiovisual array with 10 elements
     */
    private static Audiovisual[] createAudioVisuals() {
        return new Audiovisual[10];
    }

    /**
     * Prompts the user to enter a menu option and validates the input.
     * 
     * @return the user's chosen option as an integer
     */
    private static int readOption() {
        boolean valid = false;
        int option = 0;
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter an option: ");
                option = scanner.nextInt();
                valid = true;
            } catch (Exception e) {
                System.out.println("Invalid option.");
            }
        } while (!valid);
        return option;
    }

    /**
     * Displays all Audiovisual objects in the array.
     * 
     * @param audioVisuals the Audiovisual array to display
     */
    private static void showAllAudioVisuals(Audiovisual[] audioVisuals) {
        System.out.println("List of all audiovisuals:");
        for (Audiovisual a : audioVisuals) {
            System.out.println(a.toString());
        }
    }

    /**
     * Prompts the user to enter one or more director names and displays all Audiovisual objects that have at least one of those directors.
     * 
     * @param audioVisuals the Audiovisual array to search
     */
    private static void searchAudioVisualsByDirectors(Audiovisual[] audioVisuals) {
        boolean stop;
        do {
            try (Scanner scanner = new Scanner(System.in)) {
                System.out.print("Enter the name of one or more directors separated by commas: ");
                String directors = scanner.nextLine();
                String[] directorNames = directors.split(",");
                for (Audiovisual a : audioVisuals) {
                    if (isDirector(a, directorNames)) {
                        System.out.println(a.toString());
                    }
                }
                stop = true;
            } catch (Exception e) {
                System.out.println("Invalid option.");
                stop = false;
            }
        } while (!stop);
    }
    
    /**
    This method checks whether the given audiovisual was directed by one or more of the directors whose names are provided.
    @param a the audiovisual to check
    @param directorNames an array of director names to search for
    @return true if the audiovisual was directed by at least one of the directors, false otherwise
    */
    private static boolean isDirector(Audiovisual a, String[] directorNames) {
        Director[] directors = a.getdirectors();
        for (Director director : directors) {
            for (String name : directorNames) {
                if (director.getName().equals(name)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private static void searchAudioVisualsByCategory(Audiovisual[] audioVisuals)
    {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a list of categories separated by commas: ");
    String input = scanner.nextLine();
    boolean found = false;
    for (Audiovisual a : audioVisuals)
    {
        for (Categoria c : a.getcategories())
        {
            if (input.contains(c.getName())){
                System.out.println(a.toString());
                found = true;
            }
        }
    }
    if (!found){
        System.out.println("No audiovisuals found with the specified categories.");
    }
    }
}