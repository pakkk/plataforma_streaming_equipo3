package clases;

public class Peliculas extends Audiovisual {
	/**
	 *Duration the movie
	 * */
	private int duracionMinutos;
	/**
	 * Parameterized constructor
	 * @param Duration Minutes
	 * */
	public Peliculas(int duracionMinutos){
		this.duracionMinutos=duracionMinutos;
	}
	/**
	 *Returns the value of the durationMinutes attribute
	 * @return Ratings of the object
	 * */
	public int getDuracionMinutos() {
		return duracionMinutos;
	}
	 /**
	 * Assigns the value of the durationMinutes attribute
	 * @param ratings New ratings to assign
	 * */
	public void setDuracionMinutos(int duracionMinutos) {
		this.duracionMinutos=duracionMinutos;
	}
	/**
	 * Returns a string as a representation of the object
	 * @return String representing the object
	 * */
	@Override
	public String toString() {
		return "La pelicula "+titulo+"dura "+duracionMinutos;
	}
	
	
}
