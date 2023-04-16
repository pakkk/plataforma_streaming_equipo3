package es.iesjandula.plataforma_streaming.clases;

import java.io.Serializable;
/**
 * This is the class for Films. It extends the Audiovisual class and implements the Comparable interface.
 * @author AUTOR 
 */
public class Films extends Audiovisual implements Serializable
{
   //Duration of the movie
    private int durationMinutes;

    
    /**
     * Parameterized constructor
     * @param title
     * @param originalLanguage
     * @param yearOfCreation
     * @param views
     * @param durationMinutes 
     */
    public Films(String title, String originalLanguage, int yearOfCreation, int views,int durationMinutes)
    {
        super(title,originalLanguage,yearOfCreation,views);
        this.durationMinutes=durationMinutes;
    }
    /**
     * Returns the value of the durationMinutes attribute
     * @return
     * */
    public int getDurationMinutes()
    {
        return this.durationMinutes;
    }
     /**
     * Assigns the value of the durationMinutes attribute
     * @param durationMinutes
     * */
    public void setDurationMinutes(int durationMinutes)
    {
        this.durationMinutes=durationMinutes;
    }
    /**
     * Returns a string as a representation of the object
     * @return String representing the object
     * */
    @Override
    public String toString() 
    {
        return super.toString()+" has a duration of "+this.durationMinutes;
    }
	
	
}
