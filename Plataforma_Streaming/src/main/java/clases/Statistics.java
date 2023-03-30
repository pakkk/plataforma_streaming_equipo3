package clases;

import java.util.*;
import java.util.InputMismatchException;


public class Statistics {
    /**
     * Enter by console name the actor and show the films the this actor
     * @param audioVisuals Arrays class Audiovisual
     */
    public void Actors(Audiovisual[] audioVisuals) {

        String name = "";
        boolean stop = true;
        do {
            try ( Scanner scanner = new Scanner(System.in);) {

                name = scanner.nextLine();

            } catch (InputMismatchException e) {
                System.out.println("Invalid name");
                stop = false;
            }
        } while (stop);

        for (Audiovisual a : audioVisuals) {
            if (isActor(a, name)) {
                System.out.println(a.toString());
            }
        }
    }
    /**
     * Return true or false if actor is in the array
     * @param audioVisuals Arrays class Audiovisual
     * @param name String name the actor
     */

    private boolean isActor(Audiovisual a, String name) {
        Actor[] act = a.getsupportingActores();
        for (Actor actor : act) {

            if (actor.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * Enter by console name the Genders and show the films the this Genders
     * @param audioVisuals Arrays class Audiovisual
     */
    public void Genders (Audiovisual[] audioVisuals) {

        String gender = "";
        boolean stop = true;
        do {
            try ( Scanner scanner = new Scanner(System.in);) {

            	gender = scanner.nextLine();

            } catch (InputMismatchException e) {
                System.out.println("Invalid name");
                stop = false;
            }
        } while (stop);

        for (Audiovisual a : audioVisuals) {
            if (isGender(a, gender)) {
                System.out.println(a.toString());
            }
        }
    }
    /**
     * Return true or false if Genders is in the array
     * @param audioVisuals Arrays class Audiovisual
     * @param name String Categoria
     */


    private boolean isGender (Audiovisual a, String Categorie) {
        Categoria[] act = a.getcategories();
        for (Categoria Gender : act) {

            if (Gender.getName().equals(Categorie)) {
                return true;
            }
        }
        return false;
    }
    
    
}