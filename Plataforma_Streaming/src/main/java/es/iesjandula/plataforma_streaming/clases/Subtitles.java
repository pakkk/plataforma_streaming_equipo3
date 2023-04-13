package es.iesjandula.plataforma_streaming.clases;

import java.io.Serializable;

/**
 * Class representing the category to which an audiovisual object belongs
 * @author Silvia Mesa
 * */


public class Subtitles implements Comparable<Subtitles>, Serializable {
	
	/**
	 * Subtitle language, represented as a set of translations
	 * */
	
	private Language subtitleLanguage;
	
	/**
	 * Parameterized constructor
	 * @param subtitleLanguage Subtitle language
	 * */
	public Subtitles(Language subtitleLanguage) {
		this.subtitleLanguage = subtitleLanguage;
	}
	
	/**
	 * Unparameterized constructor
	 * Subtitle language not available
	 * */
	public Subtitles() {
		this.subtitleLanguage = Language.NOTAVAILABLE;
	}
		
	/**
	 * Assigns the value of the subtitleLanguage attribute
	 * @param subtitleLanguage New value for the attribute
	 * */
	public void setSubtitleLanguage(Language subtitleLanguage) {
		this.subtitleLanguage = subtitleLanguage;
	}
	
	/**
	 * Returns the value of the subtitleLanguage attribute
	 * @return Subtitle language of the object
	 * */
	public Language getSubtitleLanguage() {
		return this.subtitleLanguage;
	}
	
	/**
	 * Returns a string as a representation of the object
	 * @return String representing the object
	 * */
	@Override
	public String toString() {
	
		return "Subtitle Language: " + this.subtitleLanguage.toString() ;
	}
	
	/**
	 * Compare between two subtitle languages
	 * @param s Subtitle with which you want to check
	 * @return the value 0 if the two languages are the same;
	 * a value less than 0 if this language is less than the language of s;
	 * and a value greater than 0 if this language is greater than the language of s.
	 * */
	@Override
	public int compareTo(Subtitles s) {
		
	}
}