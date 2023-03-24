package clases;

/**
 *
 * @author alvar
 */
public class Recomendaciones implements Comparable <Recomendaciones> {
	/**
	 *Username
	 * */
	private String nombreUsuario;
	/**
	 *Ratings
	 * */
	private int valoraciones;
	/**
	 *Comment
	 * */
	private String comentario;
	/**
	 * Parameterized constructor
	 * */
	public Recomendaciones() {
		
	}
	/**
	 * Parameterized constructor
	 * @param Username 
	 * @param Ratings 
	 * @param Comment 
	 * */
    public Recomendaciones(String username,int valoraciones, String comentario) {
    	
    	if(!(valoraciones>10 || valoraciones<0)) {
    		this.valoraciones= valoraciones;
    	
    	}else {
    		this.valoraciones= 5;
    	}
        
    	nombreUsuario=username;
        this.comentario=comentario;
    }
    /**
	 *Returns the value of the ratings attribute
	 * @return Ratings of the object
	 * */
    public int getValoraciones(){
        return valoraciones;
    }

    /**
	 *Returns the value of the comment attribute
	 * @return Comment of the object
	 * */
    public String getComentario() {
		return comentario;
	}
    /**
	 * Assigns the value of the comment attribute
	 * @param comment New comment to assign
	 * */
    public void setComentario(String comentario) {
		this.comentario = comentario;
	}
    /**
	 * Assigns the value of the ratings attribute
	 * @param ratings New ratings to assign
	 * */
    public boolean setValoraciones(int valoraciones) {
    	if(!(valoraciones>10 || valoraciones<0)) {
    		this.valoraciones= valoraciones;
    		return true;
    	}else {
    		return false;
    	}
        
    }
    /**
	 *Returns the value of the username attribute
	 * @return Username of the object
	 * */
    public String getNombreUsuario() {
        return nombreUsuario;
    }
    /**
	 * Assigns the value of the username attribute
	 * @param name New username to assign
	 * */
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    /**
	 * Returns a string as a representation of the object
	 * @return String representing the object
	 * */
    @Override
    public String toString() {
        return "Recomendaciones{" + "nombreUsuario=" + nombreUsuario + ", valoraciones=" + valoraciones + ", comentario=" + comentario + '}';
    }
    /**
	 * Compare between two Ratings
	 * @return The value 0 if the two valuations are equal
	 * a value less than 0 if this value is less than the name of o
	 * and a value greater than 0 if this value is greater than the name of o.
	 * 
	 * */
    @Override
    public int compareTo(Recomendaciones o) {
    	Recomendaciones e=(Recomendaciones)o;
		return valoraciones-o.valoraciones;
	}
    
    
}
