package es.iesjandula.plataforma_streaming.clases;

import java.io.Serializable;

/**
 * Class representing the category to which an audiovisual object belongs
 * 
 * @author Silvia Mesa
 */

public class Subtitles implements Comparable<Subtitles>, Serializable {

	/**
	 * Subtitle language, represented as a set of translations
	 */

	private Language subtitleLanguage;

	/**
	 * Parameterized constructor
	 * 
	 * @param subtitleLanguage Subtitle language
	 */
	public Subtitles(Language subtitleLanguage) {
		this.subtitleLanguage = subtitleLanguage;
	}

	/**
	 * Unparameterized constructor Subtitle language not available
	 */
	public Subtitles() {
		this.subtitleLanguage = Language.NOTAVAILABLE;
	}

	/**
	 * Assigns the value of the subtitleLanguage attribute
	 * 
	 * @param subtitleLanguage New value for the attribute
	 */
	public void setSubtitleLanguage(Language subtitleLanguage) {
		this.subtitleLanguage = subtitleLanguage;
	}

	/**
	 * Returns the value of the subtitleLanguage attribute
	 * 
	 * @return Subtitle language of the object
	 */
	public Language getSubtitleLanguage() {
		return this.subtitleLanguage;
	}

	/**
	 * Returns a string as a representation of the object
	 * 
	 * @return String representing the object
	 */
	@Override
	public String toString() {

		return "Subtitle Language: " + this.subtitleLanguage.toString();
	}

	/**
	 * this compare between two subtitleLanguage,if same language
	 * 
	 * @param huespedSubtitle is an subtitle that compare this
	 * @return the value 0 if the two languages are the same; a value less than 0 if
	 *         this language is less than the language of s; and a value greater
	 *         than 0 if this language is greater than the language of s.
	 */
	@SuppressWarnings("null")
	public int compareSpanish(Subtitles huespedSubtitle) {
		if ((Language.isSpanish(this.subtitleLanguage)) && (Language.isSpanish(huespedSubtitle.subtitleLanguage)))

		{
			return 0;

		} else if ((Language.isSpanish(this.subtitleLanguage) == true)
				&& (Language.isSpanish(huespedSubtitle.subtitleLanguage) == false)) {
			return 1;
		} else if ((Language.isSpanish(this.subtitleLanguage) == false)
				&& (Language.isSpanish(huespedSubtitle.subtitleLanguage) == true)) {
			return -1;
		} else {
			return (Integer) null;
		}

	}

	/**
	 * this compare between two subtitleLanguage,if same language
	 * 
	 * @param huespedSubtitle is an subtitle that compare this
	 * @return the value 0 if the two languages are the same; a value less than 0 if
	 *         this language is less than the language of s; and a value greater
	 *         than 0 if this language is greater than the language of s.
	 */
	@SuppressWarnings("null")
	public int compareEnglish(Subtitles huespedSubtitle) {
		if ((Language.isEnglish(this.subtitleLanguage)) && (Language.isEnglish(huespedSubtitle.subtitleLanguage)))

		{
			return 0;

		} else if ((Language.isEnglish(this.subtitleLanguage) == true)
				&& (Language.isEnglish(huespedSubtitle.subtitleLanguage) == false)) {
			return 1;
		} else if ((Language.isEnglish(this.subtitleLanguage) == false)
				&& (Language.isEnglish(huespedSubtitle.subtitleLanguage) == true)) {
			return -1;
		} else {
			return (Integer) null;
		}
	}

	/**
	 * this compare between two subtitleLanguage,if same language
	 * 
	 * @param huespedSubtitle is an subtitle that compare this
	 * @return the value 0 if the two languages are the same; a value less than 0 if
	 *         this language is less than the language of s; and a value greater
	 *         than 0 if this language is greater than the language of s.
	 */
	@SuppressWarnings("null")
	public int compareFrench(Subtitles huespedSubtitle) {
		if ((Language.isFrench(this.subtitleLanguage)) && (Language.isFrench(huespedSubtitle.subtitleLanguage)))

		{
			return 0;

		} else if ((Language.isFrench(this.subtitleLanguage) == true)
				&& (Language.isFrench(huespedSubtitle.subtitleLanguage) == false)) {
			return 1;
		} else if ((Language.isFrench(this.subtitleLanguage) == false)
				&& (Language.isFrench(huespedSubtitle.subtitleLanguage) == true)) {
			return -1;
		} else {
			return (Integer) null;
		}
	}

	/**
	 * this compare between two subtitleLanguage,if same language
	 * 
	 * @param huespedSubtitle is an subtitle that compare this
	 * @return the value 0 if the two languages are the same; a value less than 0 if
	 *         this language is less than the language of s; and a value greater
	 *         than 0 if this language is greater than the language of s.
	 */
	@SuppressWarnings("null")
	public int compareChinese(Subtitles huespedSubtitle) {
		if ((Language.isChinese(this.subtitleLanguage)) && (Language.isChinese(huespedSubtitle.subtitleLanguage)))

		{
			return 0;

		} else if ((Language.isChinese(this.subtitleLanguage) == true)
				&& (Language.isChinese(huespedSubtitle.subtitleLanguage) == false)) {
			return 1;
		} else if ((Language.isChinese(this.subtitleLanguage) == false)
				&& (Language.isChinese(huespedSubtitle.subtitleLanguage) == true)) {
			return -1;
		} else {
			return (Integer) null;
		}
	}

	/**
	 * this compare between two subtitleLanguage,if same language
	 * 
	 * @param huespedSubtitle is an subtitle that compare this
	 * @return the value 0 if the two languages are the same; a value less than 0 if
	 *         this language is less than the language of s; and a value greater
	 *         than 0 if this language is greater than the language of s.
	 */
	@SuppressWarnings("null")
	public int compareNotAvailable(Subtitles huespedSubtitle) {
		if ((Language.isNotAvailable(this.subtitleLanguage))
				&& (Language.isNotAvailable(huespedSubtitle.subtitleLanguage)))
			

		{
			return 0;

		} else if ((Language.isNotAvailable(this.subtitleLanguage) == true)
				&& (Language.isNotAvailable(huespedSubtitle.subtitleLanguage) == false)) {
			return 1;
		} else if ((Language.isNotAvailable(this.subtitleLanguage) == false)
				&& (Language.isNotAvailable(huespedSubtitle.subtitleLanguage) == true)) {
			return -1;
		} else {
			return (Integer) null;
		}
	}

	/**
	 * Compare between two subtitle languages
	 * 
	 * @param s Subtitle with which you want to check
	 * @return the value 0 if the two languages are the same; a value less than 0 if
	 *         this language is less than the language of s; and a value greater
	 *         than 0 if this language is greater than the language of s. The
	 *         natutal order is Spanish,English, French,Chinesse and notAvailable.
	 */
	@SuppressWarnings("null")
	@Override
	public int compareTo(Subtitles huespedSubtitle) {

		int result = (Integer) null;

		if (this.compareSpanish(huespedSubtitle) != (Integer) null) {
			result = this.compareSpanish(huespedSubtitle);
		} else if (this.compareEnglish(huespedSubtitle) != (Integer) null) {
			result = this.compareEnglish(huespedSubtitle);
		} else if (this.compareFrench(huespedSubtitle) != (Integer) null) {
			result = this.compareFrench(huespedSubtitle);
		} else if (this.compareChinese(huespedSubtitle) != (Integer) null) {
			result = this.compareChinese(huespedSubtitle);
		} else if (this.compareNotAvailable(huespedSubtitle) != (Integer) null) {
			result = this.compareNotAvailable(huespedSubtitle);
		}

		return result;
	}
}