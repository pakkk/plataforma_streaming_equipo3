
import java.io.IOException;
import java.util.Scanner;

import clases.*;
import menus.*;

public class main {

    public static void main(String[] args) {

        Audiovisual[] dataBase = new Audiovisual[0];
        MenuGeneralAudiovisuales mga = new MenuGeneralAudiovisuales(dataBase);
        Audiovisual devuelto = new Audiovisual();
        boolean seguir = true;
        int menu;

        while (seguir) {
            System.out.println("Hola bienvenid@ a nnuestra plataforma, ya sabes que estamos en PELIS PLUS.Dejanos ayudarte"
                    + "a mejorar tu esperiencia con nosotros. Te mostramos el menú principal");
            System.out.println("\r\n"
                    + "		System.out.println(\"----------------------------------------\");\r\n"
                    + "		System.out.println(\"----MENU GENERAL----\");\r\n"
                    + "		System.out.println(\"1.- Acciones en Referencia a Pelicula o serie\");\r\n"
                    + "		System.out.println(\"2.- Obtener datos estadisticos sobre nuestra filmoteca\");\r\n"
                    + "		System.out.println(\"3.- salir y apagar");

            try {
                menu = Integer.parseInt(MyScanner.scanner.nextLine());

                switch (menu) {
                    case 1 -> {
                        boolean s1 = true;
                        while (s1) {
                            System.out.println("Bien, que hacemos con esta pelicula?");
                            System.out.println("\r\n"
                                    + "		System.out.println(\"----------------------------------------\");\r\n"
                                    + "		System.out.println(\"----MENU AUDIOVISUALES----\");\r\n"
                                    + "		System.out.println(\"1.- Dar de alta Pelicula o serie\");\r\n"
                                    + "		System.out.println(\"2.- Eliminar Pelicula o serie\");\r\n"
                                    + "		System.out.println(\"3.- Buscar Pelicula o serie"
                                    + "		System.out.println(\"4.- Modificar Pelicula o serie"
                                    + "		System.out.println(\"5.- Salir");

                            try {
                                menu = Integer.parseInt(MyScanner.scanner.nextLine());

                                switch (menu) {
                                    case 1 -> {
                                        mga.addAudiovisual();
                                    }
                                    case 2 -> {
                                        mga.deleteAudiovisual();
                                    }
                                    case 3 -> {
                                        devuelto = mga.findAudiovisual();
                                        System.out.println("Veo que tienes interes en este ejemplar, tienes habilitadas varias opciones"
                                                + "te lo voy a mostrar toda su informacion"
                                                + "-------------------------------------------------------------");
                                        System.out.println(devuelto.toString());
                                    }
                                    case 4 -> {
                                        System.out.println("Un audiovisual se compone de lo siguiente, se puede hacer Acceso, Modificacion,Borrado y Consulta de cualquier coponente, pero primero, dime cual");
                                        System.out.println("\r\n"
                                                + "		System.out.println(\"----------------------------------------\");\r\n"
                                                + "		System.out.println(\"----MENU AUDIOVISUAl----\");\r\n"
                                                + "		System.out.println(\"1.- Actores\");\r\n"
                                                + "		System.out.println(\"2.- Categoria\");\r\n"
                                                + "		System.out.println(\"3.- Directores\");\r\n"
                                                + "		System.out.println(\"4.- Recomendaciones\");\r\n"
                                                + "		System.out.println(\"5.- Subtitulos\");\r\n"
                                                + "		System.out.println(\"6.- Salir");
                                        
                                        menu = Integer.parseInt(MyScanner.scanner.nextLine());
                                        System.out.println("Sobre que audiovisual quieres hacer esta modificacion");
                                        devuelto = mga.findAudiovisual();

                                        switch (menu) {
                                            case 1 -> {
                                                MenuActores ma = new MenuActores(devuelto);
                                                ma.startMenu();
                                            }
                                            case 2 -> {
                                                MenuCategorias mc = new MenuCategorias(devuelto);
                                                mc.startMenu();
                                            }
                                            case 3 -> {
                                                MenuDirector md = new MenuDirector(devuelto);
                                                md.startMenu();
                                            }
                                            case 4 -> {
                                                MenuRecomendaciones mrc = new MenuRecomendaciones(devuelto);
                                                mrc.startMenu();
                                            }
                                            case 5 -> {
                                                MenuSubtitulos ms = new MenuSubtitulos(devuelto);
                                                ms.mostrarMenu();
                                            }
                                            case 6 ->{
                                                s1 = false;
                                            }
                                            default -> {
                                                System.out.println("Opcion Incorrecta");
                                            }
                                        }
                                    }
                                    case 5 -> {
                                        s1 = false;
                                    }
                                    default ->
                                        System.out.println("Opcion Incorrecta");
                                }
                            } catch (NumberFormatException e) {
                            }
                        }
                    }
                    case 2 -> {
                        boolean s1 = true;
                        while(s1){
                            
                            System.out.println("\r\n"
                                    + "		System.out.println(\"----------------------------------------\");\r\n"
                                    + "		System.out.println(\"----MENU ESTADISTICAS----\");\r\n"
                                    + "		System.out.println(\"1.- Numero de audiovisuales\");\r\n"
                                    + "		System.out.println(\"2.- Buscar audiovisuales por genero\");\r\n"
                                    + "		System.out.println(\"3.- Buscar audiovisuales por directores\");\r\n"
                                    + "		System.out.println(\"4.- Buscar audiovisuales por actores\");\r\n"
                                    + "		System.out.println(\"5.- Buscar audiovisuales por subtitulos\");\r\n"
                                    + "		System.out.println(\"6.- Mejores recomendaciones\");\r\n"
                                    + "		System.out.println(\"7.- Peores recomendaciones\");\r\n"
                                    + "		System.out.println(\"8.- Salir");
                            
                            try {
                                menu = Integer.parseInt(MyScanner.scanner.nextLine());
                                
                                switch (menu) {
                                    case 1 -> {
                                    }
                                    case 2 -> {
                                    }
                                    case 3 -> {
                                    }
                                    case 4 -> {
                                    }
                                    case 5 -> {
                                    }
                                    case 6 -> {
                                    }
                                    case 7 -> {
                                    }
                                    case 8 -> {
                                        s1 = false;
                                    }
                                    default -> System.out.println("Opcion incorrecta");
                                }
                                
                            } catch (NumberFormatException e) {
                            }
                        }
                    }
                    case 3 -> {
                        System.out.println("Adios");
                        seguir = false;
                    }
                    default ->
                        System.out.println("Opcion incorrecta");
                }
            } catch (NumberFormatException e) {
            }
        }
    }
}
