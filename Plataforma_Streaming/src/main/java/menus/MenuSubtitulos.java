/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menus;

import clases.Subtitles;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 1DAM
 */
public class MenuSubtitulos {
    private final ArrayList<Subtitles> listaSubtitulos;
    private final Scanner scanner;

    public MenuSubtitulos() {
        listaSubtitulos = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        int opcion = 0;
        do {
            System.out.println("\n-- SUBTITLES MENU --");
            System.out.println("1. Add a subtitle");
            System.out.println("2. Search subtitles");
            System.out.println("3. Modify a subtitle");
            System.out.println("4. Delete a subtitle");
            System.out.println("5. Show all subtitles");
            System.out.println("6. Exit");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> addSubtitle();
                case 2 -> search();
                case 3 -> modify();
                case 4 -> delete();
                case 5 -> showAll();
                case 6 -> System.out.println("Exiting subtitles menu...");
                default -> System.out.println("Invalid option. Enter a number from 1 to 6.");
            }

        } while (opcion != 6);
    }

    private void addSubtitle() {
        int language;

        System.out.println("\n-- ADD A SUBTITLE --");
        System.out.println("Enter the subtitle language:");
        System.out.println("1. English");
        System.out.println("2. French");
        System.out.println("3. Spanish");
        System.out.println("4. Chinese");
        System.out.println("5. Not available");

        language = scanner.nextInt();

        Subtitles subtitle = new Subtitles();

        switch (language) {
            case 1 -> subtitle.setIdioma(Idioma.ENGLISH);
            case 2 -> subtitle.setIdioma(Idioma.FRENCH);
            case 3 -> subtitle.setIdioma(Idioma.SPANISH);
            case 4 -> subtitle.setIdioma(Idioma.CHINESE);
            case 5 -> subtitle.setIdioma(Idioma.NOTAVAILABLE);
            default -> {
                System.out.println("Invalid option. Enter a number from 1 to 5.");
                return;
            }
        }

        listaSubtitles.add(subtitle);

        System.out.println("Subtitle added successfully.");
    }

    private void search() {
        int option;

        do {
            System.out.println("\n-- SEARCH SUBTITLES --");
            System.out.println("Which attribute do you want to search by?");
            System.out.println("1. Language");
            System.out.println("2. Return to the main menu");

            option = scanner.nextInt();

            switch (option) {
                case 1 -> searchByLanguage();
                case 2 -> {
                }
                default -> System.out.println("Invalid option. Enter a number from 1 to 2.");
            }
        } while (option != 2);
    }

    private void searchByLanguage() {
        int language;
        System.out.println("\n-- SEARCH FOR SUBTITLES BY LANGUAGE --");
        System.out.println("Enter the language you want to search for:");
        System.out.println("1. English");
        System.out.println("2. French");
        System.out.println("3. Spanish");
        System.out.println("4. Chinese");
        System.out.println("5. Not available");

        language = scanner.nextInt();

        Language searchLanguage;

        switch (language) {
            case 1 -> searchLanguage = Language.ENGLISH;
            case 2 -> searchLanguage = Language.FRENCH;
            case 3 -> searchLanguage = Language.SPANISH;
            case 4 -> searchLanguage = Language.CHINESE;
            case 5 -> searchLanguage = Language.NOTAVAILABLE;
            default -> {
                System.out.println("Invalid option. Enter a number between 1 and 5.");
                return;
            }
        }

        boolean found = false;

        for (Subtitles subtitle : subtitlesList) {
            if (subtitle.getSubtitleLanguage() == searchLanguage) {
                System.out.println(subtitle.toString());
                found = true;
            }
        }

        if (!found) {
            System.out.println("No subtitles found for the searched language.");
        }
        }

        private void modify() {
        int option;
        do {
            System.out.println("\n-- MODIFY SUBTITLE --");
            System.out.println("Enter the index of the subtitle you want to modify (starting from 1):");
            System.out.println("(0 to cancel)");

            option = scanner.nextInt();

            if (option == 0) {
                return;
            }

            option--;

            if (option < 0 || option >= subtitlesList.size()) {
                System.out.println("Invalid index. Enter a number between 1 and " + subtitlesList.size() + ".");
            }

        } while (option < 0 || option >= subtitlesList.size());

        Subtitles subtitle = subtitlesList.get(option);

        int language;

        System.out.println("\n-- MODIFY SUBTITLE --");
        System.out.println("Select the new language:");
        System.out.println("1. English");
        System.out.println("2. French");
        System.out.println("3. Spanish");
        System.out.println("4. Chinese");
        System.out.println("5. Not available");

        language = scanner.nextInt();

        switch (language) {
            case 1 -> subtitle.setLanguage(Language.ENGLISH);
            case 2 -> subtitle.setLanguage(Language.FRENCH);
            case 3 -> subtitle.setLanguage(Language.SPANISH);
            case 4 -> subtitle.setLanguage(Language.CHINESE);
            case 5 -> subtitle.setLanguage(Language.NOTAVAILABLE);
            default -> {
                System.out.println("Invalid option. Enter a number between 1 and 5.");
                return;
            }
        }

        System.out.println("Subtitle modified successfully.");
        }
        private void delete() {
        int option;
        do {
            System.out.println("\n-- DELETE SUBTITLE --");
            System.out.println("Enter the index of the subtitle you want to delete (starting from 1):");
            System.out.println("(0 to cancel)");

            option = scanner.nextInt();

            if (option == 0) {
                return;
            }

            option--;

            if (option < 0 || option >= listaSubtitles.size()) {
                System.out.println("Invalid index. Enter a number between 1 and " + listaSubtitles.size() + ".");
            }

        } while (option < 0 || option >= listaSubtitles.size());

        listaSubtitles.remove(option);

        System.out.println("Subtitle deleted successfully.");
    }

    private void showAll() {
        System.out.println("\n-- LIST OF SUBTITLES --");

        if (listaSubtitulos.isEmpty()) {
            System.out.println("No subtitles available.");
            return;
        }
        for (Subtitles subtitle : listaSubtitles) {
            System.out.println(subtitle.toString());
        }
    }
}