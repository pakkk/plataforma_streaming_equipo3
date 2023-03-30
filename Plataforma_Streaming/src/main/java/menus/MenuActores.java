package menus;

import java.util.InputMismatchException;
import java.util.Scanner;
import clases.*;

public class MenuActores {

    Audiovisual audioVisual;

    public MenuActores(Audiovisual a) {
        this.audioVisual = a;
    }

    public void startMenu() {
        int menu;
        do {

            System.out.println("----------------------------------------");
            System.out.println("----MENU ACTORES----");
            System.out.println("1.- Add a new actor");
            System.out.println("2.- Delete an actor");
            System.out.println("3.- Modify an actor");
            System.out.println("4.- Search an actor");
            System.out.println("5.- Exit");

            try {
                menu = Integer.parseInt(MyScanner.scanner.nextLine());
            } catch (NumberFormatException e) {
                menu = 0;
            }

            switch (menu) {
                case 1 -> {
                    boolean b = addActor();
                    if (b) {
                        System.out.println("Actor introducido correctamente");
                    } else {
                        System.out.println("Actor no introducido");
                    }
                }
                case 2 -> {
                    boolean b = deleteActor();
                    if (b) {
                        System.out.println("Actor borrado correctamente");
                    } else {
                        System.out.println("El actor no pudo ser borrado");
                    }
                }
                case 3 -> {

                    boolean b = modifyActor();
                    if (b) {
                        System.out.println("Actor modificado correctamente");
                    } else {
                        System.out.println("El actor no pudo ser modificado");
                    }
                }
                case 4 -> {
                    int b = findActor();
                    if (b == 0) {
                        System.out.println("No existen actores que cumplan su condicion");
                    }
                }
                case 5 -> {

                }
                default -> {
                    System.out.println("Opcion invalida");
                }
            }
        } while (menu != 5);
    }

    private boolean addActor() {

        try {
            System.out.println("--------------------");
            System.out.print("Introduzca el nombre: ");
            String name = MyScanner.scanner.nextLine();
            MyScanner.scanner.reset();
            System.out.print("Introduzca los apellidos: ");
            String lastname = MyScanner.scanner.nextLine();
            MyScanner.scanner.reset();
            System.out.print("Introduzca el genero: ");
            String gender = MyScanner.scanner.nextLine();
            MyScanner.scanner.reset();
            System.out.print("Introduzca la edad: ");
            int age = Integer.parseInt(MyScanner.scanner.nextLine());
            MyScanner.scanner.reset();
            System.out.print("Introduzca la nacionalidad: ");
            String nationality = MyScanner.scanner.nextLine();
            MyScanner.scanner.reset();
            Actor actor = new Actor(name, lastname, gender, age, nationality);
            this.audioVisual.addsupportingActores(actor);

            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private void displayActores() {

        Actor actores[] = this.audioVisual.getsupportingActores();

        System.out.println("--------------------");
        System.out.println("Lista de actores: ");

        for (int i = 0; i < actores.length; i++) {
            System.out.println(i+1 + ".- " + actores[i].getName() + " " + actores[i].getLastname());
        }

    }

    private int selectActor() {

        displayActores();

        System.out.println("--------------------");
        System.out.print("Introduzca el actor (su numero): ");
        int option;
        try {
            option = Integer.parseInt(MyScanner.scanner.nextLine());
            if ((option > 0) && (option <= this.audioVisual.getsupportingActores().length)) {
                return option - 1;
            } else {
                return -1;
            }
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public boolean deleteActor() {
        int posicion = selectActor();
        if (posicion != -1) {
            this.audioVisual.deletesupportingActores(posicion);
            return true;
        } else {
            return false;
        }

    }

    private boolean modifyActor() {
        int pos = selectActor();
        if (pos != -1) {
            Actor a = this.audioVisual.getsupportingActores()[pos];
            System.out.println("--------------------");
            System.out.println("""
                                            Campos a modificar: 
                                           1.- name
                                           2.- lastname
                                           3.- gender
                                           4.- age
                                           5.- nationality\\n""");

            int menu;

            try {
                menu = Integer.parseInt(MyScanner.scanner.nextLine());;

                switch (menu) {
                    case 1 ->  {
                        System.out.print("Introduzca el nuevo nombre: ");
                        String nombre = MyScanner.scanner.nextLine();
                        a.setName(nombre);
                    }
                    case 2 ->  {
                        System.out.print("Introduzca los nuevos apellidos: ");
                        String apellidos = MyScanner.scanner.nextLine();
                        a.setLastname(apellidos);
                    }
                    case 3 ->  {
                        System.out.print("Introduzca el nuevo genero: ");
                        String gender = MyScanner.scanner.nextLine();
                        a.setGender(gender);
                    }
                    case 4 ->  {
                        System.out.print("Introduzca la nueva edad: ");
                        int edad = Integer.parseInt(MyScanner.scanner.nextLine());
                        a.setAge(edad);
                    }
                    case 5 ->  {
                        System.out.print("Introduzca la nueva nacionalidad: ");
                        String nombre = MyScanner.scanner.nextLine();
                        a.setName(nombre);
                    }
                    default -> {
                        return false;
                    }
                }
            } catch (NumberFormatException ex) {
                return false;
            }

            return true;
        } else {
            return false;
        }

    }

    public int findActor() {
        System.out.println("Campos para buscar: \n" + "1.- name\n" + "2.- lastname\n" + "3.- gender\n" + "4.- age\n"
                + "5.- nationality\n");

        int atributo, cant = 0;

        try {
            atributo = Integer.parseInt(MyScanner.scanner.nextLine());
            switch (atributo) {
                case 1: {
                    System.out.println("dime nombre");
                    String newText = MyScanner.scanner.nextLine();
                    for (Actor d : audioVisual.getsupportingActores()) {
                        if (d.getName().equals(newText)) {
                            System.out.println(d.toString());
                            cant++;
                        }
                    }
                    break;
                }
                case 2: {
                    System.out.println("dime apellido");
                    String newText = MyScanner.scanner.nextLine();
                    for (Actor d : audioVisual.getsupportingActores()) {
                        if (d.getLastname().equals(newText)) {
                            System.out.println(d.toString());
                            cant++;
                        }
                    }
                    break;
                }
                case 3: {
                    System.out.println("dime genero");
                    String newText = MyScanner.scanner.nextLine();
                    for (Actor d : audioVisual.getsupportingActores()) {
                        if (d.getGender().equals(newText)) {
                            System.out.println(d.toString());
                            cant++;
                        }
                    }
                    break;
                }
                case 4: {
                    System.out.println("dime edad");
                    int newAge = Integer.parseInt(MyScanner.scanner.nextLine());
                    for (Actor d : audioVisual.getsupportingActores()) {
                        if (d.getAge() == (newAge)) {
                            System.out.println(d.toString());
                            cant++;
                        }
                    }
                    break;
                }
                case 5: {
                    System.out.println("dime nacionalidad");
                    String newText = MyScanner.scanner.nextLine();
                    for (Actor d : audioVisual.getsupportingActores()) {
                        if (d.getNationality().equals(newText)) {
                            System.out.println(d.toString());
                            cant++;
                        }
                    }
                    break;
                }
                default: {
                    return -1;
                }
            }
        } catch (NumberFormatException ex) {
            return -1;
        }

        return cant;
    }
}
