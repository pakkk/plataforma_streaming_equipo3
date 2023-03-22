

/**
 *
 * @author alvar
 */
public class Recomendaciones implements Comparable<Recomendaciones> {
private String nombreUsuario;
private int valoraciones;
private String comentario;
	public Recomendaciones() {
		
	}
    public Recomendaciones(int valoraciones, String comentario) {
    	
    	if(!(valoraciones>10 || valoraciones<0)) {
    		this.valoraciones= valoraciones;
    	
    	}else {
    		this.valoraciones= 5;
    	}
        
       
        this.comentario=comentario;
    }

    public int getValoraciones(){
        return valoraciones;
    }

    
    public String getComentario() {
		return comentario;
	}
    
    public void setComentario(String comentario) {
		this.comentario = comentario;
	}

    public boolean setValoraciones(int valoraciones) {
    	if(!(valoraciones>10 || valoraciones<0)) {
    		this.valoraciones= valoraciones;
    		return true;
    	}else {
    		return false;
    	}
        
    }

   

   

    @Override
    public String toString() {
        return "Recomendaciones{" + "valoracionesPositivas=" + valoraciones + ", valoracionesNegativas=" + valoraciones + ", vecesVista=" + vecesVista + '}';
    }
    @Override
    public int compareTo(Object o) {
    	Recomendaciones e=(Recomendaciones)o;
		return this.vecesVista.compareTo(vecesVista);
	}
    
    
}
