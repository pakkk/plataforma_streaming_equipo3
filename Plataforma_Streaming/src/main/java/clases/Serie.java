package clases;

/**
 * This is the class for Series. It extends the Audiovisual class and implements the Comparable interface.
 * 
 * @author Miguel
 */
public class Serie extends Audiovisual implements Comparable<Audiovisual> {

    // instance variables
    private int episodes; // number of episodes in the series
    private int seasons; // number of seasons in the series

    // constructor
    public Serie(int episodes, int seasons, String title, String originalLanguage, Actor[] cast, Director[] directors, Category[] categories, int yearOfCreation, int views, Subtitles[] subtitles) {
        // call the constructor of the superclass with the given arguments
        super(title, originalLanguage, cast, directors, categories, yearOfCreation, views, subtitles);
        // set the values of the instance variables
        this.episodes = episodes;
        this.seasons = seasons;
    }

    // getter and setter methods for the instance variables
    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    /**
     * Returns a string representation of the Serie object.
     * 
     * @return a string representation of the object
     */
    @Override
    public String toString() {
        return super.toString(); // call the toString method of the superclass
    }

    /**
     * Compares two Audiovisual objects. This method is required to implement the Comparable interface.
     * 
     * @param o the other Audiovisual object to compare to
     * @return an integer representing the comparison result
     */
    @Override
    public int compareTo(Audiovisual o) {
        return super.compareTo(o); // call the compareTo method of the superclass
    }   
}