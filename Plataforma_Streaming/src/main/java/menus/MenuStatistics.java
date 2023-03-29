/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menus;

import clases.Audiovisual;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 1DAM
 */
public class MenuStatistics {
    private static final ArrayList<Audiovisual> audiovisuales = new ArrayList<>();

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int opcion;
            
            do {
                System.out.println("MENÚ DE ESTADÍSTICAS");
                System.out.println("1. Añadir película");
                System.out.println("2. Añadir serie");
                System.out.println("3. Mostrar información de todas las películas y/o series");
                System.out.println("4. Mostrar información de películas y/o series por director");
                System.out.println("5. Salir");
                
                System.out.print("Seleccione una opción: ");
                opcion = scanner.nextInt();
                
                switch(opcion) {
                    case 1 -> addAudiovisual(new Pelicula());
                    case 2 -> addAudiovisual(new Serie());
                    case 3 -> showAllAudiovisuals();
                    case 4 -> showAudiovisualsByDirector();
                    case 5 -> System.out.println("¡Hasta luego!");
                    default -> System.out.println("Opción no válida");
                }
            } while(opcion != 5);
        }
    }
}
