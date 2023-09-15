package entities;


import java.util.ArrayList;

public class SinFactorDeRiesgo extends Familia {

    private boolean mejora;

    public SinFactorDeRiesgo(boolean mejora, String direccion, Integer IDE, Integer numeroLote, String barrio, String localidad, ArrayList<Integrante> listaIntegrantes, InformacionVivienda infoVivienda) {
        super(direccion, IDE, numeroLote, barrio, localidad, listaIntegrantes, infoVivienda);
        this.mejora = mejora;
    }

    public boolean isMejora() {
        return mejora;
    }

    public void setMejora(boolean mejora) {
        this.mejora = mejora;
    }
    
    
}
