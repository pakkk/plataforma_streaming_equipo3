package es.iesjandula.plataforma_streaming.clases;

import java.io.Serializable;
import java.util.Arrays;

/**
 * This is the class Audiovisual
 * @author Alvaro Lopez Montero 
 */

public class Audiovisual implements Comparable<Audiovisual>, Serializable
{

	//Title of the audiovisual
    private String title;
    //Original language of the audiovisual
    private String originalLanguage;
    //Actors that work in the audiovisual
    private Actor[] supportingActores;
    //Directors that work in the audiovisual
    private Director[] directors;
    //Categories that is found in the audiovisual
    private Category[] categories;
    //Recommendation that is found in the audiovisual
    private Recommendations[] recommendations;
    //Year where the audiovisual was created
    private int yearOfCreation;
    //Views that have the audiovisual
    private int views;
    //Subtitles that have the audiovisual
    private Subtitles[] subtitles;

    /**
     * Default constructor
     */
    public Audiovisual()
    {
    	this.subtitles = new Subtitles[0];
    	this.categories = new Category[0];
    	this.directors = new Director[0];
    	this.supportingActores = new Actor[0];
    	this.recommendations= new Recommendations[0];
        this.title = "Without title";
        this.originalLanguage = "English";
        this.yearOfCreation = 2019;
        this.views = 0;
    }
    
    /**
     *Parametrized constructor to this  class
     */
    public Audiovisual(String title, String originalLanguage, int yearOfCreation, int views) 
    {
    	
    	subtitles = new Subtitles[0];
    	categories = new Category[0];
    	directors = new Director[0];
    	supportingActores = new Actor[0];
    	recommendations= new Recommendations[0];
    	
    	
        this.title = title;
        this.originalLanguage = originalLanguage;
        this.yearOfCreation = yearOfCreation;
        this.views = views;
       
    }
    
    /**
     * getsupportingActores
     * @return Actor[] array to actors
     */
    public Actor[] getSupportingActores() 
    {
        return this.supportingActores;
    }
    /**
     * stsupportingActores
     *@param Actor[] supportingActores array to actors
     */
    public void setsupportingActores(Actor[] supportingActores) 
    {
        this.supportingActores = supportingActores;
    }
    /**
     * addsupportingActores
     *@param Actor actor added to the collection
	 *
     */
    public void addsupportingActores(Actor newActor)
    {
        this.supportingActores = Arrays.copyOf(this.supportingActores, this.supportingActores.length+1);
        this.supportingActores[this.supportingActores.length-1] = newActor;
    }
    /**
     * deletesupportingActores
     *@param int pos position to array to delete
	 *
     */
    public void deletesupportingActores(int pos)
    {
        if(pos < this.supportingActores.length)
            System.arraycopy(supportingActores, pos+1, supportingActores, pos, supportingActores.length-pos-1);
        this.supportingActores = Arrays.copyOf(this.supportingActores, this.supportingActores.length-1);
    }
    /**
     * 
     * @return the year of the audiovisual creation
     */
    public int getyearOfCreation()
    {
        return this.yearOfCreation;
    }
    /**
     * 
     * @param yearOfCreation to update 
     */
    public void setyearOfCreation(int yearOfCreation) 
    {
        this.yearOfCreation = yearOfCreation;
    }
    /**
     * 
     * @return the categories of the audiovisual
     */
    public Category[] getcategories() 
    {
        return this.categories;
    }
    /**
     * 
     * @param categories to update
     */
    public void setcategories(Category[] categories) 
    {
        this.categories = categories;
    }
    /**
     * 
     * @param nuevacategories to add in the audiovisual 
     */
    public void addcategories(Category newCategories )
    {
    	
        this.categories = Arrays.copyOf(this.categories, this.categories.length+1);
        this.categories[this.categories.length-1] = newCategories;
    }
    /**
     * 
     * @param pos to search the categories to delete
     */
    public void deleteCategoria(int pos) 
    {
        if(pos < this.categories.length)
            System.arraycopy(categories, pos+1, categories, pos, categories.length-pos-1);
        this.categories = Arrays.copyOf(this.categories, this.categories.length-1);
    }
    /**
     * 
     * @return the directors of the audiovisual
     */
    public Director[] getdirectors() 
    {
        return this.directors;
    }
    /**
     * 
     * @param directors to update
     */
    public void setdirectors(Director[] directors) 
    {
        this.directors = directors;
    }
    /**
     * 
     * @param newdirectors to add in a audiovisual
     */
    public void adddirectors(Director  newdirectors )
    {
        this.directors = Arrays.copyOf(this.directors, this.directors.length+1);
        this.directors[this.directors.length-1] = newdirectors;
    }
    /**
     * 
     * @param pos to delete a director
     */
    public void deletedirectors(int pos) 
    {
        if(pos < this.directors.length)
            System.arraycopy(directors, pos+1, directors, pos, directors.length-pos-1);
        this.directors = Arrays.copyOf(this.directors, this.directors.length-1);
    }
    /**
     * 
     * @return the original language of the audiovisual
     */
    public String getoriginalLanguage() 
    {
        return this.originalLanguage;
    }
    /**
     * 
     * @param originalLanguage to update
     */
    public void setoriginalLanguage(String originalLanguage) 
    {
        this.originalLanguage = originalLanguage;
    }
    /**
     * 
     * @return the subtitles of the audiovisual
     */
    public Subtitles[] getSubtitles() 
    {
        return this.subtitles;
    }
    /**
     * 
     * @param Subtitles to update
     */
    public void setSubtitles(Subtitles[] Subtitles) 
    {
        this.subtitles = Subtitles;
    }
    /**
     * 
     * @param newSubtitles to add on a audiovisual
     */
    public void addSubtitles(Subtitles newSubtitles )
    {
    	
        this.subtitles = Arrays.copyOf(this.subtitles, this.subtitles.length+1);
        this.subtitles[this.subtitles.length-1] = newSubtitles;
    }
    /**
     * 
     * @param pos to delete a subtitles of a audiovisual
     */
    public void deleteSubtitles(int pos) 
    {
        if(pos < this.subtitles.length)
            System.arraycopy(subtitles, pos+1, subtitles, pos, subtitles.length-pos-1);
        this.subtitles = Arrays.copyOf(this.subtitles, this.subtitles.length-1);
    }
    /**
     * 
     * @return the title of the audiovisual
     */
    public String getTitle() 
    {
        return this.title;
    }
    /**
     * 
     * @param title to update
     */
    public void setTitle(String title) 
    {
        this.title = title;
    }
    /**
     * 
     * @return the views of a audiovisual
     */
    public int getViews() 
    {
        return this.views;
    }
    /**
     * 
     * @param views to update
     */
    public void setViews(int views) 
    {
        this.views = views;
    }
    /**
     * This method add 1 view to the audiovisual
     */
    public void addViews() 
    {
    	this.views++;
    }
	@Override
	/**
	 * @param o to compare with this audiovisual
	 * @return the number to compare
	 */
	public int compareTo(Audiovisual o) 
	{
		int result = this.yearOfCreation-o.getyearOfCreation();
		if(result == 0)
		{
			result = this.title.compareTo(o.getTitle());
		}
		return result;
	}
		/**
		 * 
		 * @return the recommendation of the audiovisual
		 */
		public Recommendations[] getRecommendations()
	    {
			return this.recommendations;
	    	
	    }
	 	/**
	 	 * 
	 	 * @param recommendations to update
	 	 */
	    public void setRecommendations(Recommendations[] recommendations) 
	    {
	        this.recommendations = recommendations;
	    }
	    /**
	     * 
	     * @param nuevarecommendations to add 
	     */
	    public void addRecommendations(Recommendations  nuevarecommendations )
	    {
	    	
	        this.recommendations = Arrays.copyOf(this.recommendations, this.recommendations.length+1);
	        this.recommendations[this.recommendations.length-1] = nuevarecommendations;
	    }
	    /**
	     * 
	     * @param pos to delete a recommendation 
	     */
	    public void deleteRecommendations(int pos) 
	    {
                if(pos < this.recommendations.length)
                    System.arraycopy(recommendations, pos+1, recommendations, pos, recommendations.length-pos-1);
	        this.recommendations = Arrays.copyOf(this.recommendations, this.recommendations.length-1);
	    }

    @Override
    /**
     * @return the value of the all attributes
     */
    public String toString() 
    {
        return "Audiovisual{" + "title=" + title + ", originalLanguage=" + originalLanguage + ", yearOfCreation=" + yearOfCreation + ", views=" + views + '}';
    }
}
