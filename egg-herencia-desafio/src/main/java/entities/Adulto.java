package entities;

import enums.Sexo;
import enums.Vinculos;
import java.time.LocalDate;

public class Adulto extends Joven {

    private boolean obraSocial;

    public Adulto(Integer orden, String apellido, String nombre, LocalDate fechaNacimiento, Integer DNI, Sexo sexo, Vinculos vinculo, boolean estudia, boolean practicaDeporte, boolean trabaja, boolean obraSocial) {
        super(orden, apellido, nombre, fechaNacimiento, DNI, sexo, vinculo, estudia, practicaDeporte, trabaja);
        this.obraSocial = obraSocial;
    }

    public boolean isObraSocial() {
        return obraSocial;
    }

    public void setObraSocial(boolean obraSocial) {
        this.obraSocial = obraSocial;
    }

    
    
}
