package clases;

import java.util.*;
import java.util.InputMismatchException;


public class Statistics {

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

    private boolean isActor(Audiovisual a, String name) {
        Actor[] act = a.getsupportingActores();
        for (Actor actor : act) {

            if (actor.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

}