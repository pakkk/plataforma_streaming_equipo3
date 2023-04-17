package es.iesjandula.plataforma_streaming.menus;

import java.util.InputMismatchException;
import es.iesjandula.plataforma_streaming.clases.Audiovisual;
import es.iesjandula.plataforma_streaming.clases.Recommendations;
import es.iesjandula.plataforma_streaming.clases.MyScanner;
/**
 * 
 * @author Alvaro Lopez Montero
 * This class takes care of add, modify delete and search recommendation in aaudiovisual
 */
public class MenuRecomendaciones 
{

    //Audiovisual that contains recomemndations
    private Audiovisual audiovisual;
    /**
     * add a Recomendacion
     *
     * @param to Audiovisual with which you want to check
     * @return an Audiovisual with the added recommendation
     */
    public MenuRecomendaciones(Audiovisual audiovisual) 
    {
        this.audiovisual = audiovisual;
    }

    public void startMenu() 
    {
        int menu;
        do 
        {

            System.out.println("----------------------------------------");
            System.out.println("----MENU RECOMMENDATIONS----");
            System.out.println("1.- Add a new recommendatios");
            System.out.println("2.- Delete an recommendatios");
            System.out.println("3.- Modify an recommendatios");
            System.out.println("4.- Search an recommendatios");
            System.out.println("5.- Exit");

            try 
            {

                menu = Integer.parseInt(MyScanner.scanner.nextLine());
            } catch (InputMismatchException ex) {
                menu = 0;
            }

            switch (menu) 
            {
                case 1 -> 
                {
                    boolean b = addRecommendation();
                    if (b) 
                    {
                        System.out.println("Recommendation entered correctly");
                    } else 
                    {
                        System.out.println("Recommendation not introduced");
                    }
                }
                case 2 -> 
                {
                    boolean b = deleteRecommendation();
                    if (b) 
                    {
                        System.out.println("Recommendation successfully deleted");
                    } else {
}
                }
                case 3 -> 
                {

                    boolean b = modifyRecommendation();
                    if (b) 
                    {
                        System.out.println("Recommendation modified successfully");
                    } else 
                    {
                        System.out.println("The Recommendation could not be modified");
                    }
                }
                case 4 -> 
                {
                    int b = findRecommendation();
                    if (b == 0) 
                    {
                        System.out.println("The Recommendation could not be introduced");
                    }
                }
                case 5 -> 
                {

                }
                default -> 
                {
                    System.out.println("invalid option");
                }
            }
        } while (menu != 5);
    }
    /**
     * This method add a recommmendation in a audiovisual
     * @return the boolean that confirm his insert
     */
    public boolean addRecommendation() 
    {

        try 
        {

            System.out.println("--------------------");
            System.out.print("Enter username: ");
            String name = MyScanner.scanner.nextLine();
            System.out.println("Enter ratings");
            int ratings = Integer.parseInt(MyScanner.scanner.nextLine());
            System.out.println("Enter comment");
            String comment = MyScanner.scanner.nextLine();

            Recommendations Recommendations = new Recommendations(name, ratings, comment);
            this.audiovisual.addRecommendations(Recommendations);
            return true;
        } catch (InputMismatchException e) 
        {
            return false;
        }
    }

    /**
     * Shows the categories that an Audiovisual has
     *
     */
    public void displayRecommendation() 
    {

        Recommendations[] Recommendations = this.audiovisual.getRecommendations();

        System.out.println("--------------------");
        System.out.println("List the Recommendation: ");

        for (int i = 0; i < Recommendations.length; i++) 
        {
            System.out.println(i + 1 + ".- " + Recommendations[i].toString());
        }

    }

    /**
     * Select a category from the list
     *
     * @return Array position where the category is located if it doesn't find
     * it, it returns -1
     */
    public int selectRecommendation() 
    {

        displayRecommendation();

        System.out.println("--------------------");
        System.out.print("Enter Recommendations (number) you want to select: ");
        int option;
        try 
        {
            option = Integer.parseInt(MyScanner.scanner.nextLine());
            if ((option > 0) && (option < this.audiovisual.getRecommendations().length)) 
            {
                return option - 1;
            } else {
                return -1;
            }
        } catch (NumberFormatException e) 
        {
            return -1;
        }
    }

    /**
     * Compare between two categories
     *
     * @return
     */
    public boolean modifyRecommendation() 
    {
        int pos = selectRecommendation();
        if (pos != -1) 
        {
            Recommendations Recommendations = this.audiovisual.getRecommendations()[pos];
            System.out.println("--------------------");
            System.out.println("""
                                        I show you the possible modifications
                                       1.Name
                                       2.Description
                                       3.Rating""");

            int atributte;

            try 
            {
                atributte = Integer.parseInt(MyScanner.scanner.nextLine());
                switch (atributte) 
                {
                    case 1 -> 
                    {
                        System.out.println("Enter new name");
                        String newText = MyScanner.scanner.nextLine();
                        Recommendations.setUsername(newText);
                        return true;
                    }

                    case 2 -> 
                    {
                        System.out.println("Enter new description");
                        String newText = MyScanner.scanner.nextLine();
                        Recommendations.setComment(newText);
                        return true;
                    }
                    case 3 -> 
                    {
                        System.out.println("Enter new Recommendation");
                        int newInt = Integer.parseInt(MyScanner.scanner.nextLine());
                        Recommendations.setRatings(newInt);
                        return true;
                    }
                    default -> 
                    {
                        return false;
                    }
                }
            } catch (NumberFormatException ex) 
            {
                return false;
            }

        } else 
        {
            return false;
        }
    }

    /**
     * Compare between two Recommendation
     *
     * @return
     */
    public boolean deleteRecommendation() 
    {
        int posicion = selectRecommendation();
        if (posicion != -1) 
        {
            this.audiovisual.deleteRecommendations(posicion);
            return true;
        } else 
        {
            return false;
        }

    }

    /**
     * Compare to Recommendations
     *
     * @return
     */
    public int findRecommendation() 
    {
        System.out.println("""
                                    I show you the possible search keys
                                   1.Name
                                   2.Description
                                   3.Rating""");

        int atributte, cant = 0;

        try 
        {
            atributte = Integer.parseInt(MyScanner.scanner.nextLine());

            switch (atributte) 
            {
                case 1 -> 
                {
                    System.out.println("Enter name");
                    String newText = MyScanner.scanner.nextLine();
                    for (Recommendations d : this.audiovisual.getRecommendations()) 
                    {
                        if (d.getUsername().equals(newText)) 
                        {
                            System.out.println(d.toString());
                            cant++;
                        }

                    }

                }
                case 2 -> 
                {                	
                    System.out.println("Enter description");
                    String newText = MyScanner.scanner.nextLine();
                    for (Recommendations d : this.audiovisual.getRecommendations())
                    {
                        if (d.getComment().contains(newText)) 
                        {
                            System.out.println(d.toString());
                            cant++;
                        }

                    }

                }
                case 3 -> 
                {
                    System.out.println("Enter Rating");
                    int newInt = Integer.parseInt(MyScanner.scanner.nextLine());
                    for (Recommendations d : this.audiovisual.getRecommendations()) 
                    {
                        if (d.getRatings() == newInt) 
                        {
                            System.out.println(d.toString());
                            cant++;
                        }

                    }

                }
                default -> 
                {
                    return -1;
                }
            }

        } catch (NumberFormatException ex) 
        {
            return -1;

        }
        return cant;
    }

}