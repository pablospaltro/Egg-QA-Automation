package entities;

import enums.Sexo;
import enums.Vinculos;
import java.time.LocalDate;

public class Ninio extends Integrante {

    public Ninio(Integer orden, String apellido, String nombre, LocalDate fechaNacimiento, Integer DNI, Sexo sexo, Vinculos vinculo) {
        super(orden, apellido, nombre, fechaNacimiento, DNI, sexo, vinculo);
    }

}
