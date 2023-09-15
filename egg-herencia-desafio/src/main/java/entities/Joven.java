package entities;

import enums.Sexo;
import enums.Vinculos;
import java.time.LocalDate;

public class Joven extends Integrante {

    protected boolean estudia;

    protected boolean practicaDeporte;

    protected boolean trabaja;

    public Joven(Integer orden, String apellido, String nombre, LocalDate fechaNacimiento, Integer DNI, Sexo sexo, Vinculos vinculo, boolean estudia, boolean practicaDeporte, boolean trabaja) {
        super(orden, apellido, nombre, fechaNacimiento, DNI, sexo, vinculo);
        this.estudia = estudia;
        this.practicaDeporte = practicaDeporte;
        this.trabaja = trabaja;
    }

    public boolean isEstudia() {
        return estudia;
    }

    public void setEstudia(boolean estudia) {
        this.estudia = estudia;
    }

    public boolean isPracticaDeporte() {
        return practicaDeporte;
    }

    public void setPracticaDeporte(boolean practicaDeporte) {
        this.practicaDeporte = practicaDeporte;
    }

    public boolean isTrabaja() {
        return trabaja;
    }

    public void setTrabaja(boolean trabaja) {
        this.trabaja = trabaja;
    }
    
    
}
