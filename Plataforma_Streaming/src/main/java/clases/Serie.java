package clases;
/**
 * This is class of Actores
 * @author Miguel
 */

public class Serie extends Audiovisual implements Comparable<Audiovisual>{
    int capitulos;
    int temporadas;

    public Serie(int capitulos, int temporadas, String titulo, String idiomaOriginal, Actores[] actoresDeReparto, Director[] directores, Categoria[] categorias, int anioDeCreacion, int visualizaciones, Subtitulos[] subtitulos) {
        super(titulo, idiomaOriginal, actoresDeReparto, directores, categorias, anioDeCreacion, visualizaciones, subtitulos);
        this.capitulos = capitulos;
        this.temporadas = temporadas;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(int capitulos) {
        this.capitulos = capitulos;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int compareTo(Audiovisual o) {
        return super.compareTo(o);
    }
    
}
