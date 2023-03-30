package clases;

import java.util.InputMismatchException;


public class Statistics {
    /**
     *Constructor parametrized
     * Show the representation the object for if enter name the actor 
     * the programming show the films the this actor
     * @param audioVisuals Arrays class Audiovisuales
     */
    public void Actors(Audiovisual[] audioVisuals) {

        String nombre = "";
        boolean stop = true;
        do {
            try  {

                nombre = MyScanner.scanner.nextLine();

            } catch (InputMismatchException e) {
                System.out.println("Invalid name");
                stop = false;
            }
        } while (stop);

        for (Audiovisual a : audioVisuals) {
            if (isActor(a, nombre)) {
                System.out.println(a.toString());
            }
        }
    }
    /**
     *Constructor parametrized
     * Method for know if is Actor the one films
     * @param audioVisuals Arrays class Audiovisuales
     */
    private boolean isActor(Audiovisual a, String nombre) {
        Actor[] act = a.getsupportingActores();
        for (Actor actor : act) {

            if (actor.getName().equals(nombre)) {
                return true;
            }
        }
        return false;
    }

}