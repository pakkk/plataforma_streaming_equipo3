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
    }

    public Audiovisual(String titulo, String idiomaOriginal, Actores[] actoresDeReparto, Director[] directores, Categoria[] categorias, int anioDeCreacion, int visualizaciones, Subtitulos[] subtitulos) {
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

    public Director[] getDirectores() {
        return directores;
    }

    public void setDirectores(Director[] directores) {
        this.directores = directores;
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
