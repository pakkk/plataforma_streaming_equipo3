package clases;

import java.util.Arrays;

/**
 * This is the class Director
 * @author Alvaro Lopez 
 */

public class Audiovisual implements Comparable<Audiovisual> {

    String titulo;
    String idiomaOriginal;
    Actores[] actoresDeReparto;
    Director[] directores;
    Categoria[] categorias;
    int anioDeCreacion;
    int visualizaciones;
    Subtitulos[] subtitulos;

    public Audiovisual() {
    	subtitulos = new Subtitulos[0];
    	Categoria[] categorias = new Categoria[0];
    	Director[] directores = new Director[0];
    	Actores [] actores = new Actores[0];
    }

    public Audiovisual(String titulo, String idiomaOriginal, Actores actoresDeReparto[], Director[] directores, Categoria[] categorias, int anioDeCreacion, int visualizaciones, Subtitulos[] subtitulos) {
        this.titulo = titulo;
        this.idiomaOriginal = idiomaOriginal;
        this.actoresDeReparto = actoresDeReparto;
        this.directores = directores;
        this.categorias = categorias;
        this.anioDeCreacion = anioDeCreacion;
        this.visualizaciones = visualizaciones;
        this.subtitulos = subtitulos;
    }

    public Actores[] getActoresDeReparto() {
        return actoresDeReparto;
    }

    public void setActoresDeReparto(Actores[] actoresDeReparto) {
        this.actoresDeReparto = actoresDeReparto;
    }
    
    public void addActoresDeReparto(Actores nuevoActor){
        this.actoresDeReparto = Arrays.copyOf(this.actoresDeReparto, this.actoresDeReparto.length+1);
        this.actoresDeReparto[this.actoresDeReparto.length-1] = nuevoActor;
    }

    public void deleteActoresDeReparto(int pos) {
        System.arraycopy(actoresDeReparto, pos, actoresDeReparto, pos +1, actoresDeReparto.length-pos+1);
        this.actoresDeReparto = Arrays.copyOf(this.actoresDeReparto, this.actoresDeReparto.length-1);
    }

    public int getAnioDeCreacion() {
        return anioDeCreacion;
    }

    public void setAnioDeCreacion(int anioDeCreacion) {
        this.anioDeCreacion = anioDeCreacion;
    }
    
    public Categoria[] getCategorias() {
        return categorias;
    }

    public void setCategorias(Categoria[] categorias) {
        this.categorias = categorias;
    }
    
    public void addCategorias(Categoria  nuevaCategorias ){
    	
        this.categorias = Arrays.copyOf(this.categorias, this.categorias.length+1);
        this.categorias[this.categorias.length-1] = nuevaCategorias;
    }

    public void deleteCategoria(int pos) {
        System.arraycopy(categorias, pos, categorias, pos +1, categorias.length-pos+1);
        this.categorias = Arrays.copyOf(this.categorias, this.categorias.length-1);
    }

    public Director[] getDirectores() {
        return directores;
    }

    public void setDirectores(Director[] directores) {
        this.directores = directores;
    }
    
    public void addDirectores(Director  nuevoDirectores ){
    	
        this.directores = Arrays.copyOf(this.directores, this.directores.length+1);
        this.directores[this.directores.length-1] = nuevoDirectores;
    }

    public void deleteDirectores(int pos) {
        System.arraycopy(directores, pos, directores, pos +1, directores.length-pos+1);
        this.directores = Arrays.copyOf(this.directores, this.directores.length-1);
    }

    public String getIdiomaOriginal() {
        return idiomaOriginal;
    }

    public void setIdiomaOriginal(String idiomaOriginal) {
        this.idiomaOriginal = idiomaOriginal;
    }

    public Subtitulos[] getSubtitulos() {
        return subtitulos;
    }

    public void setSubtitulos(Subtitulos[] subtitulos) {
        this.subtitulos = subtitulos;
    }
    
    public void addSubtitulos(Subtitulos  nuevoSubtitulos ){
    	
        this.subtitulos = Arrays.copyOf(this.subtitulos, this.subtitulos.length+1);
        this.subtitulos[this.subtitulos.length-1] = nuevoSubtitulos;
    }

    public void deleteSubtitulos(int pos) {
        System.arraycopy(subtitulos, pos, subtitulos, pos +1, subtitulos.length-pos+1);
        this.subtitulos = Arrays.copyOf(this.subtitulos, this.subtitulos.length-1);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getVisualizaciones() {
        return visualizaciones;
    }

    public void setVisualizaciones(int visualizaciones) {
        this.visualizaciones = visualizaciones;
    }

	@Override
	public int compareTo(Audiovisual o) {
		// TODO Auto-generated method stub
		return 0;
	}
    
    
    
    

}
