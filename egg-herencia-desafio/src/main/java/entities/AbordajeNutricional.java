package entities;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class AbordajeNutricional {

    private Integer orden;

    private Integer edad;

    private Double peso;

    private boolean Eutrofico;

    private boolean bajoPeso;

    private boolean sobrePeso;

    public AbordajeNutricional(Integrante persona,Integer orden, Integer edad, Double peso, boolean Eutrofico, boolean bajoPeso, boolean sobrePeso) {
        this.orden = persona.orden;
        this.edad = (int)ChronoUnit.YEARS.between(persona.fechaNacimiento, LocalDate.now());
        this.peso = peso;
        this.Eutrofico = Eutrofico;
        this.bajoPeso = bajoPeso;
        this.sobrePeso = sobrePeso;
    }

    public Integer getOrden() {
        return orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
    }

    public Integer getEdad() {
        return edad;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public boolean isEutrofico() {
        return Eutrofico;
    }

    public void setEutrofico(boolean Eutrofico) {
        this.Eutrofico = Eutrofico;
    }

    public boolean isBajoPeso() {
        return bajoPeso;
    }

    public void setBajoPeso(boolean bajoPeso) {
        this.bajoPeso = bajoPeso;
    }

    public boolean isSobrePeso() {
        return sobrePeso;
    }

    public void setSobrePeso(boolean sobrePeso) {
        this.sobrePeso = sobrePeso;
    }

    
}
