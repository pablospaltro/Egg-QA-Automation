package entities;

import enums.Sexo;
import enums.Vinculos;
import java.time.LocalDate;

public class AdultoMayor extends Integrante {

    private boolean jubilacion;

    
    public AdultoMayor(Integer orden, String apellido, String nombre, LocalDate fechaNacimiento, Integer DNI, Sexo sexo, Vinculos vinculo, boolean jubilacion) {
        super(orden, apellido, nombre, fechaNacimiento, DNI, sexo, vinculo);
        this.jubilacion = jubilacion;
    }

    public boolean isJubilacion() {
        return jubilacion;
    }

    public void setJubilacion(boolean jubilacion) {
        this.jubilacion = jubilacion;
    }
    
    
}
