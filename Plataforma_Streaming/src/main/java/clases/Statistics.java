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
            try{

                name = MyScanner.scanner.nextLine();

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
            try { 

            	gender = MyScanner.scanner.nextLine();

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
     * Return true or false if Gender is in the array
     * @param audioVisuals Arrays class Audiovisual
     * @param name String Gender
     */

    private boolean isGender (Audiovisual a, String Categorie) {
        Category[] act = a.getcategories();
        for (Category Gender : act) {

            if (Gender.getName().equals(Categorie)) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * Enter by console name the Subtitles and show the films the this Subtitles
     * @param audioVisuals Arrays class Audiovisual
     */
    
    public void Subtitles (Audiovisual[] audioVisuals) {

        String subtitles = "";
        boolean stop = true;
        do {
            try  {

            	subtitles = MyScanner.scanner.nextLine();

            } catch (InputMismatchException e) {
                System.out.println("Invalid subtitle");
                stop = false;
            }
        } while (stop);

        for (Audiovisual a : audioVisuals) {
            if (isSubtitles(a, subtitles)) {
                System.out.println(a.toString());
            }
        }
    }
    
    /**
     * Return true or false if Subtitles is in the array
     * @param audioVisuals Arrays class Audiovisual
     * @param name String Subtitles.
     */

    private boolean isSubtitles (Audiovisual a, String LanguajeSubtitle) {
    	Subtitles[] act = a.getSubtitulos();
        for (Subtitles subtitles : act) {

            if (subtitles.getSubtitleLanguage().equals(LanguajeSubtitle)){
                return true;
            }
        }
        return false;
    }
    
    
    
}