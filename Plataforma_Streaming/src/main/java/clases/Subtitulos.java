package clases;
/**
 * Clase que representa la categoria a la que pertenece un objeto audiovisual
 * @author Silvia Mesa
 * */
enum Idioma {INGLES,FRANCES,ESPAÑOL,CHINO,NODISPONE}

public class Subtitulos implements Comparable<Subtitulos> {
	
	/**
	 *subtitle language, represented as a set of translations
	 * */
	
	private Idioma idiomaSubtitulo;
	
	/**
	 * Parameterized constructor
	 * @param Subtitle language
	 * */
	public Subtitulos(Idioma idioma) {
		this.idiomaSubtitulo=idioma;
	}
	
	/**
	 * Unparameterized constructor
	 * Subtitle language
	 * */
	public Subtitulos() {
		this.idiomaSubtitulo=Idioma.NODISPONE;
	}
		
	/**
	* Assigns the value of the languageSubtitle attribute
	* @param name New value for the attribute
	* */
	public void setName(Idioma idioma) {
		this.idiomaSubtitulo = idioma;
	}
	
	/**
	* Returns the value of the languageSubtitle attribute
	* @return Name of the object
	* */
	public Idioma getName() {
		return idiomaSubtitulo;
	}
	
	/**
	* Returns a string as a representation of the object
	* @return String representing the object
	* */
	@Override
	public String toString() {
	
		return "Subtitle Name: " + idiomaSubtitulo.toString() ;
	}
	
	/**
	* Compare between two categories
	* @param or Category with which you want to check
	* @return the value 0 if the two languages ​​are the same;
	* a value less than 0 if this name is less than the name of o;
	* and a value greater than 0 if this name is greater than the name of o.
	* */
	@Override
	public int compareTo(Subtitulos a) {
		
		return this.idiomaSubtitulo.compareTo(a.idiomaSubtitulo);
	
	
	}

}
