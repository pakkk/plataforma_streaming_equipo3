package menus;

import clases.*;

/**
 *
 * @author Miguel
 */
public class MenuSubtitulos {

    Audiovisual a = null;

    public MenuSubtitulos(Audiovisual a) {
        this.a = a;
    }

    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("\n-- SUBTITLES MENU --");
            System.out.println("1. Add a subtitle");
            System.out.println("2. Delete a subtitle");
            System.out.println("3. Modify a subtitle");
            System.out.println("4. Search subtitles");
            System.out.println("5. Exit");

            try {
                opcion = Integer.parseInt(MyScanner.scanner.nextLine());
            } catch (NumberFormatException e) {
                opcion = 0;
            }

            switch (opcion) {
                case 1 -> {
                    boolean b = addSubtitle();
                    if (b) {
                        System.out.println("Subtitulo introducido correctamente");
                    } else {
                        System.out.println("Subtitulo no introducido");
                    }
                }
                case 2 -> {
                    boolean b = delete();
                    if (b) {
                        System.out.println("Subtitulo borrado correctamente");
                    } else {
                        System.out.println("El Subtitulo no pudo ser borrado");
                    }
                }
                case 3 -> {

                    boolean b = modify();
                    if (b) {
                        System.out.println("Subtitulo modificado correctamente");
                    } else {
                        System.out.println("Subtitulo no pudo ser modificado");
                    }
                }
                case 4 -> {
                    boolean b = searchByLanguage();
                    if (!b) {
                        System.out.println("Error en la busqueda");
                    }
                }
                case 5 -> {
                    System.out.println("Exiting subtitles menu...");
                }
                default -> {
                    System.out.println("Invalid option. Enter a number from 1 to 5.");
                }
            }
        } while (opcion != 5);
    }

    private boolean addSubtitle() {
        int language;

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
                    return false;
                }
            }
            this.a.addSubtitulos(subtitle);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

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
                case 1 ->
                {searchLanguage = Language.ENGLISH;}
                case 2 ->
                {searchLanguage = Language.FRENCH;}
                case 3 ->
                {searchLanguage = Language.SPANISH;}
                case 4 ->
                {searchLanguage = Language.CHINESE;}
                case 5 ->
                {searchLanguage = Language.NOTAVAILABLE;}
                default -> {
                    return false;
                }
            }

            boolean found = false;

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
            return false;
        }
        return true;
    }

    private boolean modify() {
        int option;
        
        System.out.println("\n-- MODIFY SUBTITLE --");
        System.out.println("Enter the index of the subtitle you want to modify:");
        for(Subtitles s : this.a.getSubtitulos()){
            System.out.println(s.toString());
        }
        
        try{
            option = Integer.parseInt(MyScanner.scanner.nextLine());
            if (option < 0 || option > this.a.getSubtitulos().length) {
                return false;
            }else{
                Subtitles subtitle;
                subtitle = this.a.getSubtitulos()[option-1];
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
                        return false;
                    }
                }
                System.out.println("Subtitle modified successfully.");
                return true;
            }
            
        }catch(NumberFormatException e){
            return false;
        }    
    }

    private boolean delete() {
        int option;
        System.out.println("\n-- DELETE SUBTITLE --");
        System.out.println("Enter the index of the subtitle you want to delete:");
        for(Subtitles s : this.a.getSubtitulos()){
            System.out.println(s.toString());
        }
        
        try{
            option = Integer.parseInt(MyScanner.scanner.nextLine());
            if (option > 0 && option <= this.a.getSubtitulos().length) {
                this.a.deleteSubtitulos(option -1);
                System.out.println("Subtitle deleted successfully.");
                return true;
            }else{
                return false;
            }
        }catch(NumberFormatException e){
            return false;
        }
    }
}