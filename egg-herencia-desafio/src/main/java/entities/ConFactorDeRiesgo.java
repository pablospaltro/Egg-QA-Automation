package entities;

import java.util.ArrayList;

public class ConFactorDeRiesgo extends Familia {

    private Integer[] factores;

    public ConFactorDeRiesgo(String direccion, Integer IDE, Integer numeroLote, String barrio, String localidad, ArrayList<Integrante> listaIntegrantes, InformacionVivienda infoVivienda) {
        super(direccion, IDE, numeroLote, barrio, localidad, listaIntegrantes, infoVivienda);
        asignarFactores();
    }

    public Integer[] getFactores() {
        return factores;
    }
    
    public void asignarFactores(){
        
        Integer cantidadRiesgos = (int)(Math.random()*12)+1;
        Integer riesgos;
        for (int i = 0; i < cantidadRiesgos; i++) {
            
            do {
                riesgos = (int)(Math.random()*12)+1;
            } while(validarRiesgos(riesgos));
            this.factores[i]=riesgos;
        }
    }
    
    private boolean validarRiesgos(int num){
        for (Integer factore : factores) {
            if (factore.equals(num)) {
                return true;
            }
        }
        return false;
    }
    
    
    
    
}
