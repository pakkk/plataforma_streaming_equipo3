

/**
 *
 * @author alvar
 */
public class Recomendaciones {
int valoracionesPositivas;
int valoracionesNegativas;
int vecesVista;

    public Recomendaciones(int valoracionesPositivas, int valoracionesNegativas, int vecesVista) {
        this.valoracionesPositivas = valoracionesPositivas;
        this.valoracionesNegativas = valoracionesNegativas;
        this.vecesVista = vecesVista;
    }

    public int getValoracionesNegativas() {
        return valoracionesNegativas;
    }

    public int getValoracionesPositivas() {
        return valoracionesPositivas;
    }

    public int getVecesVista() {
        return vecesVista;
    }

    public void setValoracionesPositivas(int valoracionesPositivas) {
        this.valoracionesPositivas = valoracionesPositivas;
    }

    public void setValoracionesNegativas(int valoracionesNegativas) {
        this.valoracionesNegativas = valoracionesNegativas;
    }

    public void setVecesVista(int vecesVista) {
        this.vecesVista = vecesVista;
    }

    @Override
    public String toString() {
        return "Recomendaciones{" + "valoracionesPositivas=" + valoracionesPositivas + ", valoracionesNegativas=" + valoracionesNegativas + ", vecesVista=" + vecesVista + '}';
    }
    
    
    
}
