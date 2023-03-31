
import clases.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import menus.*;
import comparadores.*;

public class main {

    public static void write(Audiovisual[] a) {

        try ( ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("audiovisuals.dat"))) {
            out.writeObject(a);
        } catch (IOException e) {
        }

    }
    
    public static Audiovisual[] load(){
        Audiovisual[] a = null;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("audiovisuals.dat"))){
            a = (Audiovisual[]) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            a = new Audiovisual[0];
            System.out.println("Error maquinote");
        }
        return a;
    }
    

    public static void main(String[] args) {

        Audiovisual[] dataBase = load();
        MenuGeneralAudiovisuales mga = new MenuGeneralAudiovisuales(dataBase);
        Audiovisual devuelto = null;
        boolean seguir = true;
        int menu;
        System.out.println("Hola bienvenid@ a nuestra plataforma, ya sabes que estamos en PELIS PLUS.Dejanos ayudarte a mejorar tu esperiencia con nosotros. Te mostramos el menú principal");
        while (seguir) {

            System.out.println("----------------------------------------");
            System.out.println("----MENU GENERAL----");
            System.out.println("1.- Acciones en Referencia a Pelicula o serie");
            System.out.println("2.- Obtener datos estadisticos sobre nuestra filmoteca");
            System.out.println("3.- salir y apagar");

            try {
                menu = Integer.parseInt(MyScanner.scanner.nextLine());
            } catch (NumberFormatException e) {
                menu = 0;
            }
            switch (menu) {
                case 1 -> {
                    boolean s1 = true;
                    while (s1) {
                        System.out.println("----------------------------------------");
                        System.out.println("----MENU AUDIOVISUALES----");
                        System.out.println("1.- Dar de alta Pelicula o serie");
                        System.out.println("2.- Eliminar Pelicula o serie");
                        System.out.println("3.- Buscar Pelicula o serie");
                        System.out.println("4.- Modificar Pelicula o serie");
                        System.out.println("5.- Salir");

                        try {
                            menu = Integer.parseInt(MyScanner.scanner.nextLine());
                        } catch (NumberFormatException e) {
                            menu = 0;
                        }
                        switch (menu) {
                            case 1 -> {
                                mga.addAudiovisual();
                            }
                            case 2 -> {
                                mga.deleteAudiovisual();
                            }
                            case 3 -> {
                                devuelto = mga.findAudiovisual();
                                System.out.println("-------------------------------------------------------------");
                                if(devuelto != null)
                                    System.out.println(devuelto.toString());
                            }
                            case 4 -> {

                                System.out.println("----------------------------------------");
                                System.out.println("----MENU AUDIOVISUAl----");
                                System.out.println("1.- Gestionar Actores");
                                System.out.println("2.- Gestionar Categoria");
                                System.out.println("3.- Gestionar Directores");
                                System.out.println("4.- Gestionar Recomendaciones");
                                System.out.println("5.- Gestionar Subtitulos");
                                System.out.println("6.- Modificar atributos");
                                System.out.println("7.- Salir");

                                try {
                                    menu = Integer.parseInt(MyScanner.scanner.nextLine());
                                } catch (NumberFormatException e) {
                                    menu = 0;
                                }

                                switch (menu) {
                                    case 1 -> {
                                        System.out.println("----------------------------------------");
                                        System.out.print("Sobre que audiovisual quieres hacer esta modificacion: ");
                                        devuelto = mga.findAudiovisual();
                                        MenuActores ma = new MenuActores(devuelto);
                                        ma.startMenu();
                                    }
                                    case 2 -> {
                                        System.out.println("----------------------------------------");
                                        System.out.print("Sobre que audiovisual quieres hacer esta modificacion: ");
                                        devuelto = mga.findAudiovisual();
                                        MenuCategorias mc = new MenuCategorias(devuelto);
                                        mc.startMenu();
                                    }
                                    case 3 -> {
                                        System.out.println("----------------------------------------");
                                        System.out.print("Sobre que audiovisual quieres hacer esta modificacion: ");
                                        devuelto = mga.findAudiovisual();
                                        MenuDirector md = new MenuDirector(devuelto);
                                        md.startMenu();
                                    }
                                    case 4 -> {
                                        System.out.println("----------------------------------------");
                                        System.out.print("Sobre que audiovisual quieres hacer esta modificacion: ");
                                        devuelto = mga.findAudiovisual();
                                        MenuRecomendaciones mrc = new MenuRecomendaciones(devuelto);
                                        mrc.startMenu();
                                    }
                                    case 5 -> {
                                        System.out.println("----------------------------------------");
                                        System.out.print("Sobre que audiovisual quieres hacer esta modificacion: ");
                                        devuelto = mga.findAudiovisual();
                                        MenuSubtitulos ms = new MenuSubtitulos(devuelto);
                                        ms.mostrarMenu();
                                    }
                                    case 6 -> {
                                        mga.modifyAudiovisual();
                                    }
                                    case 7 -> {
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
                    }
                }
                case 2 -> {
                    boolean s1 = true;
                    while (s1) {

                        System.out.println("----------------------------------------");
                        System.out.println("----MENU ESTADISTICAS----");
                        System.out.println("1.- Numero de audiovisuales");
                        System.out.println("2.- Buscar audiovisuales por genero");
                        System.out.println("3.- Buscar audiovisuales por directores");
                        System.out.println("4.- Buscar audiovisuales por actores");
                        System.out.println("5.- Buscar audiovisuales por subtitulos");
                        System.out.println("6.- Mejores recomendaciones");
                        System.out.println("7.- Peores recomendaciones");
                        System.out.println("8.- Salir");

                        try {
                            menu = Integer.parseInt(MyScanner.scanner.nextLine());
                            Statistics st = new Statistics();
                            switch (menu) {
                                case 1 -> {
                                    System.out.println("Existen " + dataBase.length + " audiovisuales distintos en nuestra plataforma;");
                                }
                                case 2 -> {
                                    st.Genders(dataBase);
                                }
                                case 3 -> {
                                    st.searchByDirectors(dataBase);
                                }
                                case 4 -> {
                                    st.Actors(dataBase);
                                }
                                case 5 -> {
                                    st.Subtitles(dataBase);
                                }
                                case 6 -> {
                                    Arrays.sort(dataBase, new ComparaRecomendaciones());
                                    System.out.println("Los audiovisuales con mejores recomendaciones son: ");
                                    for(int i = 0; i < 10; i++){
                                        System.out.println( (i+1) + ".- " + dataBase[i].toString());
                                    }
                                }
                                case 7 -> {
                                    Arrays.sort(dataBase, new ComparaRecomendaciones());
                                    System.out.println("Los audiovisuales con peores recomendaciones son: ");
                                    for(int i = 1; i <= 10; i++){
                                        System.out.println( i + ".- " + dataBase[dataBase.length-i].toString());
                                    }
                                }
                                case 8 -> {
                                    s1 = false;
                                }
                                default ->
                                    System.out.println("Opcion incorrecta");
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

        }
        MyScanner.scanner.close();
        write(dataBase);
    }
}
