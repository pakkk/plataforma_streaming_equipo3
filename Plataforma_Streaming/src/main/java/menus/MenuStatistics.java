package menus;

import clases.Audiovisual;
import clases.Director;
import java.util.Scanner;

/**
 * 
 * @author Miguel
 * 
 */
public class MenuStatistics {
    
    public static void main(String[] args) {
        Audiovisual[] audioVisuals = createAudioVisuals();

        boolean exit = false;
        do {
            System.out.println("Welcome to the statistics menu:");
            System.out.println("1. Show all audiovisuals.");
            System.out.println("2. Show audiovisuals by director.");
            System.out.println("3. Exit.");
            int option = readOption();
            switch (option) {
                case 1 -> showAllAudioVisuals(audioVisuals);
                case 2 -> searchAudioVisualsByDirectors(audioVisuals);
                case 3 -> {
                    System.out.println("Goodbye!");
                    exit = true;
                }
                default -> System.out.println("Invalid option.");
            }
        } while (!exit);
    }

    private static Audiovisual[] createAudioVisuals() {
        return new Audiovisual[10];
    }

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

    private static void showAllAudioVisuals(Audiovisual[] audioVisuals) {
        System.out.println("List of all audiovisuals:");
        for (Audiovisual a : audioVisuals) {
            System.out.println(a.toString());
        }
    }

    private static void searchAudioVisualsByDirectors(Audiovisual[] audioVisuals) {
        boolean stop = true;
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
}
