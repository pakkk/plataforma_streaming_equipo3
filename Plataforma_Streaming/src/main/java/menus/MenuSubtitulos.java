/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menus;

import clases.Subtitulos;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 1DAM
 */
public class MenuSubtitulos {
    private ArrayList<Subtitulos> listaSubtitulos;
    private Scanner scanner;

    public MenuSubtitulos() {
        listaSubtitulos = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        int opcion = 0;
        do {
            System.out.println("\n-- MENÚ SUBTÍTULOS --");
            System.out.println("1. Dar de alta un subtítulo");
            System.out.println("2. Buscar subtítulos");
            System.out.println("3. Modificar un subtítulo");
            System.out.println("4. Borrar un subtítulo");
            System.out.println("5. Mostrar todos los subtítulos");
            System.out.println("6. Salir");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    darDeAlta();
                    break;
                case 2:
                    buscar();
                    break;
                case 3:
                    modificar();
                    break;
                case 4:
                    borrar();
                    break;
                case 5:
                    mostrarTodos();
                    break;
                case 6:
                    System.out.println("Saliendo del menú de subtítulos...");
                    break;
                default:
                    System.out.println("Opción no válida. Introduce un número del 1 al 6.");
                    break;
            }

        } while (opcion != 6);
    }

    private void darDeAlta() {
        int idioma;

        System.out.println("\n-- DAR DE ALTA UN SUBTÍTULO --");
        System.out.println("Introduce el idioma del subtítulo:");
        System.out.println("1. Inglés");
        System.out.println("2. Francés");
        System.out.println("3. Español");
        System.out.println("4. Chino");
        System.out.println("5. No disponible");

        idioma = scanner.nextInt();

        Subtitulos subtitulo = new Subtitulos();

        switch (idioma) {
            case 1:
                subtitulo.setIdioma(Idioma.INGLES);
                break;
            case 2:
                subtitulo.setIdioma(Idioma.FRANCES);
                break;
            case 3:
                subtitulo.setIdioma(Idioma.ESPAÑOL);
                break;
            case 4:
                subtitulo.setIdioma(Idioma.CHINO);
                break;
            case 5:
                subtitulo.setIdioma(Idioma.NODISPONE);
                break;
            default:
                System.out.println("Opción no válida. Introduce un número del 1 al 5.");
                return;
        }

        listaSubtitulos.add(subtitulo);

        System.out.println("Subtítulo añadido correctamente.");
    }

    private void buscar() {
        int opcion;

        do {
            System.out.println("\n-- BUSCAR SUBTÍTULOS --");
            System.out.println("¿Por qué atributo quieres buscar?");
            System.out.println("1. Idioma");
            System.out.println("2. Volver al menú principal");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    buscarPorIdioma();
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Opción no válida. Introduce un número del 1 al 2.");
                    break;
            }
        } while (opcion != 2);
    }

    private void buscarPorIdioma() {
        int idioma;

        System.out.println("\n-- BUSCAR SUBTÍTULOS POR IDIOMA --");
        System.out.println("Introduce el idioma que quieres buscar:");
        System.out.println("1. Inglés");
        System.out.println("2. Francés");
        System.out.println("3. Español");
        System.out.println("4. Chino");
        System.out.println("5. No disponible");

        idioma = scanner.nextInt();

        Idioma idiomaBusqueda;

        switch (idioma) {
            case 1:
                idiomaBusqueda = Idioma.INGLES;
                break;
            case 2:
                idiomaBusqueda = Idioma.FRANCES;
                break;
            case 3:
                idiomaBusqueda = Idioma.ESPAÑOL;
                break;
            case 4:
                idiomaBusqueda = Idioma.CHINO;
                break;
            case 5:
                idiomaBusqueda = Idioma.NODISPONE;
                break;
            default:
                System.out.println("Opción no válida. Introduce un número del 1 al 5.");
                return;
        }

        boolean encontrado = false;

        for (Subtitulos subtitulo : listaSubtitulos) {
            if (subtitulo.getIdioma() == idiomaBusqueda) {
                System.out.println(subtitulo.toString());
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se han encontrado subtítulos para el idioma buscado.");
        }
    }

    private void modificar() {
        int opcion;

        do {
            System.out.println("\n-- MODIFICAR SUBTÍTULO --");
            System.out.println("Introduce el índice del subtítulo que quieres modificar (empezando desde 1):");
            System.out.println("(0 para cancelar)");

            opcion = scanner.nextInt();

            if (opcion == 0) {
                return;
            }

            opcion--;

            if (opcion < 0 || opcion >= listaSubtitulos.size()) {
                System.out.println("Índice no válido. Introduce un número entre 1 y " + listaSubtitulos.size() + ".");
            }

        } while (opcion < 0 || opcion >= listaSubtitulos.size());

        Subtitulos subtitulo = listaSubtitulos.get(opcion);

        int idioma;

        System.out.println("\n-- MODIFICAR SUBTÍTULO --");
        System.out.println("Selecciona el nuevo idioma:");
        System.out.println("1. Inglés");
        System.out.println("2. Francés");
        System.out.println("3. Español");
        System.out.println("4. Chino");
        System.out.println("5. No disponible");

        idioma = scanner.nextInt();

        switch (idioma) {
            case 1:
                subtitulo.setIdioma(Idioma.INGLES);
                break;
            case 2:
                subtitulo.setIdioma(Idioma.FRANCES);
                break;
            case 3:
                subtitulo.setIdioma(Idioma.ESPAÑOL);
                break;
            case 4:
                subtitulo.setIdioma(Idioma.CHINO);
                break;
            case 5:
                subtitulo.setIdioma(Idioma.NODISPONE);
                break;
            default:
                System.out.println("Opción no válida. Introduce un número del 1 al 5.");
                return;
        }

        System.out.println("Subtítulo modificado correctamente.");
    }

    private void borrar() {
        int opcion;

        do {
            System.out.println("\n-- BORRAR SUBTÍTULO --");
            System.out.println("Introduce el índice del subtítulo que quieres borrar (empezando desde 1):");
            System.out.println("(0 para cancelar)");

            opcion = scanner.nextInt();

            if (opcion == 0) {
                return;
            }

            opcion--;

            if (opcion < 0 || opcion >= listaSubtitulos.size()) {
                System.out.println("Índice no válido. Introduce un número entre 1 y " + listaSubtitulos.size() + ".");
            }

        } while (opcion < 0 || opcion >= listaSubtitulos.size());

        listaSubtitulos.remove(opcion);

        System.out.println("Subtítulo borrado correctamente.");
    }

    private void mostrarTodos() {
        System.out.println("\n-- LISTA DE SUBTÍTULOS --");

        if (listaSubtitulos.isEmpty()) {
            System.out.println("No hay subtítulos disponibles.");
            return;
        }

        for (Subtitulos subtitulo : listaSubtitulos) {
            System.out.println(subtitulo.toString());
        }
    }

}