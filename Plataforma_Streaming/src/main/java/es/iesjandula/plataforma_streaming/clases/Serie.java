package es.iesjandula.plataforma_streaming.clases; 

import java.io.Serializable;

/**
 * This is the class for Series. It extends the Audiovisual class and implements the Comparable interface.
 * @author Miguel
 */
public class Serie extends Audiovisual implements Comparable<Audiovisual>, Serializable
{

    // instance variables
    private int episodes; // number of episodes in the series
    private int seasons; // number of seasons in the series
    /**
     * Parameterized builder
     * @param title
     * @param originalLanguage
     * @param yearOfCreation
     * @param views
     * @param episodes
     * @param seasons 
     */
    public Serie(String title, String originalLanguage, int yearOfCreation, int views,int episodes ,int seasons)
    {
        super(title, originalLanguage, yearOfCreation, views);
        this.episodes = episodes;
	this.seasons = seasons;
    }
    /**
     * Returns the value of the seasons attribute
     * @return 
     */
    public int getSeasons()
    {
        return this.seasons;
    }
    /**
     * Assigns the value of the seasons attribute
     * @param seasons 
     */
    public void setSeasons(int seasons)
    {
        this.seasons = seasons;
    }
    /**
     * Returns the value of the episodes attribute
     * @return 
     */
    public int getEpisodes()
    {
        return this.episodes;
    }
/**
     * Assigns the value of the episodes attribute
     * @param episodes 
     */
    public void setEpisodes(int episodes)
    {
        this.episodes = episodes;
    }

    /**
     * Returns a string representation of the Serie object.
     * 
     * @return a string representation of the object
     */
    @Override
    public String toString()
    {
        return super.toString(); // call the toString method of the superclass
    }

    /**
     * Compares two Audiovisual objects. This method is required to implement the Comparable interface.
     * @param o the other Audiovisual object to compare to
     * @return an integer representing the comparison result
     */
    @Override
    public int compareTo(Audiovisual o)
    {
        return super.compareTo(o); // call the compareTo method of the superclass
    }
}