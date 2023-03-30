package clases;

import java.util.*;
import java.util.InputMismatchException;


public class Statistics {

    public void Actors(Audiovisual[] audioVisuals) {

        String nombre = "";
        boolean stop = true;
        do {
            try ( Scanner scanner = new Scanner(System.in);) {

                nombre = scanner.nextLine();

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