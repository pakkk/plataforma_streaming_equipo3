package es.iesjandula.plataforma_streaming.clases;

import java.io.Serializable;

/**
 *Class recommendation from audiovisual
 * @author alvaro
 */
public class Recommendations implements Comparable <Recommendations> , Serializable
{
	
	//Username
	private String username;
	
	//Ratings
	private int ratings;
	
	//Comment
	private String comment;
	
	/**
	 * Default constructor
	 * */
	public Recommendations() 
	{
		this.username= "whitout username";
		this.ratings=0;
		this.comment="whitout comment";
	}
	
	/**
	 * Parameterized constructor
	 * @param Username 
	 * @param Ratings 
	 * @param Comment 
	 * */
    public Recommendations(String username,int ratings, String comment) 
    {
    	
    	this.ratings= ratings;
    	this.fixRatings();
    	this.username=username;
        this.comment=comment;
    }
    /**
	 *Returns the value of the ratings attribute
	 * @return Ratings of the object
	 * */
    public int getRatings()
    {
        return this.ratings;
    }

    /**
	 *Returns the value of the comment attribute
	 * @return Comment of the object
	 * */
    public String getComment() 
    {
		return this.comment;
	}
    /**
	 * Assigns the value of the comment attribute
	 * @param comment New comment to assign
	 * */
    public void setComment(String comment) 
    {
		this.comment = comment;
	}
    /**
	 * Assigns the value of the ratings attribute
	 * @param ratings New ratings to assign
	 * */
    public void setRatings(int ratings) 
    {
    	this.ratings=ratings;
    	this.fixRatings();
        
    }
    /**
	 *Returns the value of the username attribute
	 * @return Username of the object
	 * */
    public String getUsername() 
    {
        return this.username;
    }
    /**
	 * Assigns the value of the username attribute
	 * @param name New username to assign
	 * */
    public void setUsername(String username)
    {
        this.username = username;
    }
    /**
	 * Returns a string as a representation of the object
	 * @return String representing the object
	 * */
    @Override
    public String toString()
    {
        return "Recommendations{" + "Username=" + this.username + ", ratings=" + this.ratings + ", comment=" + this.comment + '}';
    }
    /**
	 * Compare between two Ratings
	 * @return The value 0 if the two valuations are equal
	 * a value less than 0 if this value is less than the name of o
	 * and a value greater than 0 if this value is greater than the name of o.
	 * 
	 * */
    @Override
    public int compareTo(Recommendations o) 
    {
    	int result=this.ratings-o.ratings;
    	if(result==0) 
    	{
    		result=this.username.compareTo(o.getUsername());
    		
    		if (result==0)
    		{
    			result=this.comment.compareTo(o.getComment());
    		}
    	}
    	return result;
		
	}        
    /**
     * Method to fix rating if the user set his value wrong 
     * 
     */
    private void fixRatings()
    {
    	if(!(this.ratings>10 || this.ratings<0))
    	{
    		this.ratings= 5;
    	
    	}	
    }
}
