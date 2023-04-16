package es.iesjandula.plataforma_streaming.launcher;
import es.iesjandula.plataforma_streaming.launcher.funciones_Auxiliar;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import es.iesjandula.plataforma_streaming.menus.MenuDirector;
import es.iesjandula.plataforma_streaming.menus.MenuActores;
import es.iesjandula.plataforma_streaming.menus.MenuCategories;
import es.iesjandula.plataforma_streaming.menus.MenuRecomendaciones;
import es.iesjandula.plataforma_streaming.menus.MenuSubtitles;
import es.iesjandula.plataforma_streaming.menus.MenuGeneralAudiovisuales;
import es.iesjandula.plataforma_streaming.comparators.ComparaRecomendaciones;
import es.iesjandula.plataforma_streaming.clases.Audiovisual;
import es.iesjandula.plataforma_streaming.clases.Statistics;
import es.iesjandula.plataforma_streaming.clases.MyScanner;
/**
 * 
 * @author Silvia Cofrades Mesa
 * @author Juan Sutil Mesa
 * @author Alvaro Marmol Romero
 * @author Miguel Rios Gutierrez
 * @author Alvaro Lopez Montero
 * This class execute the entire project
 *
 */
public class Launcher 
{
	/**
	 * 
	 * @param audiovisual that have the information of the .dat
	 */
    public static void write(Audiovisual[] audiovisual)
    {

        try ( ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("audiovisuals.dat"))) 
        {
            out.writeObject(audiovisual);
        }catch (IOException e) 
        {
        	System.out.println(e);
        }

    }
    /**
     * 
     * @return the audiovisual that contain the info 
     */
    public static Audiovisual[] load()
    {
        Audiovisual[] audiovisual = null;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("audiovisuals.dat")))
        {
            audiovisual = (Audiovisual[]) in.readObject();
        } catch (IOException | ClassNotFoundException e) 
        {
            audiovisual = new Audiovisual[0];
        }
        return audiovisual;
    }
    
    /**
     * 
     * @param args start the main
     */
    public static void main(String[] args)
    {

        Audiovisual[] dataBase= load();
        MenuGeneralAudiovisuales mga = new MenuGeneralAudiovisuales(dataBase);
        Audiovisual devuelto = null;
        boolean seguir = true;
        int menu;
        System.out.println("Hola bienvenid@ a nuestra plataforma, ya sabes que estamos en PELIS PLUS.Dejanos ayudarte a mejorar tu esperiencia con nosotros. Te mostramos el menú principal");
        //Starts the menu
        while (seguir) 
        {

            System.out.println("----------------------------------------");
            System.out.println("----MENU GENERAL----");
            System.out.println("1.- Acciones en Referencia a Pelicula o serie");
            System.out.println("2.- Obtener datos estadisticos sobre nuestra filmoteca");
            System.out.println("3.- salir y apagar");
            //Use the scanner in a try-catch structure
            try
            {
                menu = Integer.parseInt(MyScanner.scanner.nextLine());
            } catch (NumberFormatException e) {
                menu = 0;
            }
            //General menu
            switch (menu) 
            {
                case 1 -> 
                {
                    boolean s1 = true;
                    while (s1) 
                    {
                        System.out.println("----------------------------------------");
                        System.out.println("----MENU AUDIOVISUALES----");
                        System.out.println("1.- Dar de alta Pelicula o serie");
                        System.out.println("2.- Eliminar Pelicula o serie");
                        System.out.println("3.- Buscar Pelicula o serie");
                        System.out.println("4.- Modificar Pelicula o serie");
                        System.out.println("5.- Salir");
                        //Use the scanner in a try-catch structure
                        try 
                        {
                            menu = Integer.parseInt(MyScanner.scanner.nextLine());
                        } catch (NumberFormatException e) 
                        {
                            menu = 0;
                        }
                        //Add a film or serie
                        switch (menu) 
                        {
                            case 1 -> 
                            {
                                mga.addAudiovisual();
                            }
                            //Delete a film or serie
                            case 2 -> 
                            {
                                mga.deleteAudiovisual();
                            }
                            //Modify a film or serie
                            case 3 -> 
                            {
                                devuelto = mga.findAudiovisual();
                                System.out.println("-------------------------------------------------------------");
                                if(devuelto != null)
                                    System.out.println(devuelto.toString());
                            }
                            //Menu inside film and series
                            case 4 -> 
                            {

                                System.out.println("----------------------------------------");
                                System.out.println("----MENU AUDIOVISUAl----");
                                System.out.println("1.- Gestionar Actores");
                                System.out.println("2.- Gestionar Categoria");
                                System.out.println("3.- Gestionar Directores");
                                System.out.println("4.- Gestionar Recomendaciones");
                                System.out.println("5.- Gestionar Subtitulos");
                                System.out.println("6.- Modificar atributos");
                                System.out.println("7.- Salir");
                                //Use the scanner in a try-catch structure
                                try 
                                {
                                    menu = Integer.parseInt(MyScanner.scanner.nextLine());
                                } catch (NumberFormatException e) 
                                {
                                    menu = 0;
                                }
                               
                                switch (menu) 
                                {
                                	//Menu of actors
                                    case 1 -> 
                                    {
                                        System.out.println("----------------------------------------");
                                        System.out.print("Sobre que audiovisual quieres hacer esta modificacion: ");
                                        devuelto = mga.findAudiovisual();
                                        MenuActores ma = new MenuActores(devuelto);
                                        ma.startMenu();
                                    }
                                    //Menu of directors
                                    case 2 -> 
                                    {
                                        System.out.println("----------------------------------------");
                                        System.out.print("Sobre que audiovisual quieres hacer esta modificacion: ");
                                        devuelto = mga.findAudiovisual();
                                        MenuCategories mc = new MenuCategories(devuelto);
                                        mc.startMenu();
                                    }
                                    //Menu of categories
                                    case 3 -> 
                                    {
                                        System.out.println("----------------------------------------");
                                        System.out.print("Sobre que audiovisual quieres hacer esta modificacion: ");
                                        devuelto = mga.findAudiovisual();
                                        MenuDirector md = new MenuDirector(devuelto);
                                        md.startMenu();
                                    }
                                    //Menu of recommendations
                                    case 4 -> 
                                    {
                                        System.out.println("----------------------------------------");
                                        System.out.print("Sobre que audiovisual quieres hacer esta modificacion: ");
                                        devuelto = mga.findAudiovisual();
                                        MenuRecomendaciones mrc = new MenuRecomendaciones(devuelto);
                                        mrc.startMenu();
                                    }
                                    //Menu of subtitles
                                    case 5 -> 
                                    {
                                        System.out.println("----------------------------------------");
                                        System.out.print("Sobre que audiovisual quieres hacer esta modificacion: ");
                                        devuelto = mga.findAudiovisual();
                                        MenuSubtitles ms = new MenuSubtitles(devuelto);
                                        ms.mostrarMenu();
                                    }
                                    //Modify a audiovisual
                                    case 6 -> 
                                    {
                                        mga.modifyAudiovisual();
                                    }
                                    //Exit the menu
                                    case 7 -> 
                                    {
                                        s1 = false;
                                    }
                                    //Incorrect option
                                    default -> 
                                    {
                                        System.out.println("Opcion Incorrecta");
                                    }
                                }
                            }
                            //Exit of the program
                            case 5 -> 
                            {
                                s1 = false;
                            }
                            //Incorrect option
                            default ->
                                System.out.println("Opcion Incorrecta");
                        }
                    }
                }
                //Menu of statistics
                case 2 -> 
                {
                    boolean s1 = true;
                    while (s1) 
                    {

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
                        //Use the scanner in a try-catch structure
                        try {
                            menu = Integer.parseInt(MyScanner.scanner.nextLine());
                            Statistics st = new Statistics();
                            switch (menu) {
                            	
                                case 1 -> 
                                {
                                    System.out.println("Existen " + mga.getDataBase().length + " audiovisuales distintos en nuestra plataforma;");
                                }
                                case 2 -> 
                                {
                                    st.genders(mga.getDataBase());
                                }
                                case 3 -> 
                                {
                                    st.searchByDirectors(mga.getDataBase());
                                }
                                case 4 -> 
                                {
                                    st.actors(mga.getDataBase());
                                }
                                case 5 -> 
                                {
                                    st.subtitles(mga.getDataBase());
                                }
                                case 6 -> 
                                {
                                    Arrays.sort(mga.getDataBase(), new ComparaRecomendaciones());
                                    System.out.println("Los audiovisuales con mejores recomendaciones son: ");
                                    int n = mga.getDataBase().length;
                                    if(n>10)
                                    {
                                    	n=10;
                                    }
                                    for(int i = 0; i < n; i++)
                                    {
                                        System.out.println( (i+1) + ".- " + mga.getDataBase()[i].toString());
                                    }
                                }
                                case 7 -> 
                                {
                                    Arrays.sort(mga.getDataBase(), new ComparaRecomendaciones());
                                    System.out.println("Los audiovisuales con peores recomendaciones son: ");
                                    int n = mga.getDataBase().length;
                                    if(n>10)
                                    {
                                    	n=10;
                                    }
                                    for(int i = 1; i <= n; i++)
                                    {
                                        System.out.println( i + ".- " + mga.getDataBase()[mga.getDataBase().length-i].toString());
                                    }
                                }
                                case 8 -> 
                                {
                                    s1 = false;
                                }
                                default ->
                                    System.out.println("Opcion incorrecta");
                            }

                        } catch (NumberFormatException e)
                        {
                        }
                    }
                }
                case 3 -> 
                {
                    System.out.println("Adios");
                    seguir = false;
                }
                default ->
                    System.out.println("Opcion incorrecta");
            }

        }
        MyScanner.scanner.close();
        write(mga.getDataBase());
    }
}