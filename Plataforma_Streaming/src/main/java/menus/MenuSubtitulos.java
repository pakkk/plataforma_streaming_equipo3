package menus;

import clases.*;

/**
 * Esta clase implementa el menú para las opciones de subtítulos.
 *
 * @author Miguel
 */
public class MenuSubtitulos {

    Audiovisual a = null;

    /**
     * Constructor de la clase.
     *
     * @param a El audiovisual al que se le van a agregar o eliminar subtítulos.
     */
    public MenuSubtitulos(Audiovisual a) {
        this.a = a;
    }

<<<<<<< HEAD
    public void starMenu() {
=======
    /**
     * Este método muestra el menú y llama a los métodos correspondientes para
     * cada opción.
     */
    public void mostrarMenu() {
>>>>>>> branch 'main' of https://github.com/pakkk/plataforma_streaming_equipo3.git
        int opcion;
        do {
            //Mostrar opciones del menú
            System.out.println("\n-- SUBTITLES MENU --");
            System.out.println("1. Add a subtitle");
            System.out.println("2. Delete a subtitle");
            System.out.println("3. Modify a subtitle");
            System.out.println("4. Search subtitles");
            System.out.println("5. Exit");

            try {
                //Leer la opción del usuario
                opcion = Integer.parseInt(MyScanner.scanner.nextLine());
            } catch (NumberFormatException e) {
                opcion = 0;
            }

            switch (opcion) {
                case 1 -> {
                    //Agregar un subtítulo
                    boolean b = addSubtitle();
                    if (b) {
                        System.out.println("Subtitulo introducido correctamente");
                    } else {
                        System.out.println("Subtitulo no introducido");
                    }
                }
                case 2 -> {
                    //Eliminar un subtítulo
                    boolean b = delete();
                    if (b) {
                        System.out.println("Subtitulo borrado correctamente");
                    } else {
                        System.out.println("El Subtitulo no pudo ser borrado");
                    }
                }
                case 3 -> {
                    //Modificar un subtítulo
                    boolean b = modify();
                    if (b) {
                        System.out.println("Subtitulo modificado correctamente");
                    } else {
                        System.out.println("Subtitulo no pudo ser modificado");
                    }
                }
                case 4 -> {
                    //Buscar subtítulos por idioma
                    boolean b = searchByLanguage();
                    if (!b) {
                        System.out.println("Error en la busqueda");
                    }
                }
                case 5 -> {
                    //Salir del menú de subtítulos
                    System.out.println("Exiting subtitles menu...");
                }
                default -> {
                    //Opción inválida
                    System.out.println("Invalid option. Enter a number from 1 to 5.");
                }
            }
        } while (opcion != 5);
    }

    /**
     * Añade un subtítulo a la película actual.
     *
     * @return true si el subtítulo se agregó correctamente, false si no.
     */
    private boolean addSubtitle() {
        int language;

        // Mostrar opciones de idioma
        System.out.println("\n-- ADD A SUBTITLE --");
        System.out.println("Enter the subtitle language:");
        System.out.println("1. English");
        System.out.println("2. French");
        System.out.println("3. Spanish");
        System.out.println("4. Chinese");
        System.out.println("5. Not available");

        try {
            language = Integer.parseInt(MyScanner.scanner.nextLine());

            Subtitles subtitle = new Subtitles();

            // Seleccionar el idioma del subtítulo basado en la entrada del usuario
            switch (language) {
                case 1 -> {
                    subtitle.setSubtitleLanguage(Language.ENGLISH);
                }
                case 2 -> {
                    subtitle.setSubtitleLanguage(Language.FRENCH);
                }
                case 3 -> {
                    subtitle.setSubtitleLanguage(Language.SPANISH);
                }
                case 4 -> {
                    subtitle.setSubtitleLanguage(Language.CHINESE);
                }
                case 5 -> {
                    subtitle.setSubtitleLanguage(Language.NOTAVAILABLE);
                }
                default -> {
                    // Si el usuario ingresa un número que no está en el rango de opciones, regresa false
                    return false;
                }
            }

            // Agregar el subtítulo a la película actual y regresar true
            this.a.addSubtitulos(subtitle);
            return true;
        } catch (NumberFormatException e) {
            // Si el usuario ingresa algo que no es un número, regresa false
            return false;
        }
    }

    /**
     * Este método busca subtítulos en función del idioma especificado por el
     * usuario.
     *
     * @return true si se encontraron subtítulos, false en caso contrario.
     */
    private boolean searchByLanguage() {
        int language;
        System.out.println("\n-- SEARCH FOR SUBTITLES BY LANGUAGE --");
        System.out.println("Enter the language you want to search for:");
        System.out.println("1. English");
        System.out.println("2. French");
        System.out.println("3. Spanish");
        System.out.println("4. Chinese");
        System.out.println("5. Not available");

        try {
            language = Integer.parseInt(MyScanner.scanner.nextLine());

            Language searchLanguage;
            switch (language) {
                case 1 -> {
                    searchLanguage = Language.ENGLISH;
                }
                case 2 -> {
                    searchLanguage = Language.FRENCH;
                }
                case 3 -> {
                    searchLanguage = Language.SPANISH;
                }
                case 4 -> {
                    searchLanguage = Language.CHINESE;
                }
                case 5 -> {
                    searchLanguage = Language.NOTAVAILABLE;
                }
                default -> {
                    // Si el usuario ingresa un valor inválido, se devuelve false.
                    return false;
                }
            }

            boolean found = false;

            // Se recorre la lista de subtítulos y se busca aquellos que coincidan con el idioma seleccionado.
            for (Subtitles subtitle : this.a.getSubtitulos()) {
                if (subtitle.getSubtitleLanguage() == searchLanguage) {
                    System.out.println(subtitle.toString());
                    found = true;
                }
            }

            if (!found) {
                System.out.println("No subtitles found for the searched language.");
            }
        } catch (NumberFormatException e) {
            // Si el usuario ingresa algo que no es un número entero, se devuelve false.
            return false;
        }
        return true;
    }

    /**
     * Este método permite modificar un subtítulo existente.
     *
     * @return true si la modificación fue exitosa, false en caso contrario.
     */
    private boolean modify() {
        int option;

        System.out.println("\n-- MODIFY SUBTITLE --");
        System.out.println("Enter the index of the subtitle you want to modify:");

        // Se imprime la lista de subtítulos existentes para que el usuario pueda seleccionar uno.
        for (Subtitles s : this.a.getSubtitulos()) {
            System.out.println(s.toString());
        }

        try {
            option = Integer.parseInt(MyScanner.scanner.nextLine());

            // Si el índice seleccionado por el usuario no es válido, se devuelve false.
            if (option < 0 || option > this.a.getSubtitulos().length) {
                return false;
            } else {
                Subtitles subtitle;
                subtitle = this.a.getSubtitulos()[option - 1];
                int language;

                System.out.println("\n-- MODIFY SUBTITLE --");
                System.out.println("Select the new language:");
                System.out.println("1. English");
                System.out.println("2. French");
                System.out.println("3. Spanish");
                System.out.println("4. Chinese");
                System.out.println("5. Not available");

                language = Integer.parseInt(MyScanner.scanner.nextLine());

                switch (language) {
                    case 1 ->
                        subtitle.setSubtitleLanguage(Language.ENGLISH);
                    case 2 ->
                        subtitle.setSubtitleLanguage(Language.FRENCH);
                    case 3 ->
                        subtitle.setSubtitleLanguage(Language.SPANISH);
                    case 4 ->
                        subtitle.setSubtitleLanguage(Language.CHINESE);
                    case 5 ->
                        subtitle.setSubtitleLanguage(Language.NOTAVAILABLE);
                    default -> {
                        // Si el usuario ingresa un valor inválido, se devuelve false.
                        return false;
                    }
                }
                System.out.println("Subtitle modified successfully.");
                return true;
            }

        } catch (NumberFormatException e) {
            // Si el usuario ingresa algo que no es un número entero, se devuelve false.
            return false;
        }
    }

    /**
     * Elimina un subtítulo en función del índice especificado por el usuario.
     * Retorna `true` si se elimina correctamente, `false` si no.
     */
    private boolean delete() {
        int option;
        System.out.println("\n-- DELETE SUBTITLE --");
        System.out.println("Enter the index of the subtitle you want to delete:");
        for (Subtitles s : this.a.getSubtitulos()) {
            System.out.println(s.toString());
        }

        try {
            option = Integer.parseInt(MyScanner.scanner.nextLine());
            if (option > 0 && option <= this.a.getSubtitulos().length) { // Verifica que el índice esté dentro de los límites de la lista de subtítulos
                this.a.deleteSubtitulos(option - 1); // Elimina el subtítulo en la posición especificada por el usuario. Resta 1 porque los índices de la lista empiezan en 0.
                System.out.println("Subtitle deleted successfully.");
                return true;
            } else {
                return false;
            }
        } catch (NumberFormatException e) { // Maneja errores si el usuario ingresa un valor que no es un número entero
            return false;
        }
    }
}