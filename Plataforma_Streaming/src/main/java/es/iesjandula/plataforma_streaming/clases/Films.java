package es.iesjandula.plataforma_streaming.clases;

import java.io.Serializable;

public class Films extends Audiovisual implements Serializable
{
	/**
	 *Duration the movie
	 * */
	private int durationMinutes;
	
	
	/**
	 * Parameterized constructor
	 * @param Duration Minutes
	 * */
	public Films(String title, String originalLanguage, int yearOfCreation, int views,int durationMinutes)
	{
		super(title,originalLanguage,yearOfCreation,views);
		this.durationMinutes=durationMinutes;
	}
	/**
	 *Returns the value of the durationMinutes attribute
	 * @return Ratings of the object
	 * */
	public int getDurationMinutes()
	{
		return this.durationMinutes;
	}
	 /**
	 * Assigns the value of the durationMinutes attribute
	 * @param ratings New ratings to assign
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
