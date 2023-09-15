package entities;

import enums.Paredes;
import enums.Pisos;

public class InformacionVivienda {

    private Integer numeroDormitorios;

    private Paredes tipoParedes;

    private Pisos tipoPiso;

    private boolean Iluminacion;

    public InformacionVivienda() {
    }

    public InformacionVivienda(Integer numeroDormitorios, Paredes tipoParedes, Pisos tipoPiso, boolean Iluminacion) {
        this.numeroDormitorios = numeroDormitorios;
        this.tipoParedes = tipoParedes;
        this.tipoPiso = tipoPiso;
        this.Iluminacion = Iluminacion;
    }

    public Integer getNumeroDormitorios() {
        return numeroDormitorios;
    }

    public void setNumeroDormitorios(Integer numeroDormitorios) {
        this.numeroDormitorios = numeroDormitorios;
    }

    public Paredes getTipoParedes() {
        return tipoParedes;
    }

    public void setTipoParedes(Paredes tipoParedes) {
        this.tipoParedes = tipoParedes;
    }

    public Pisos getTipoPiso() {
        return tipoPiso;
    }

    public void setTipoPiso(Pisos tipoPiso) {
        this.tipoPiso = tipoPiso;
    }

    public boolean isIluminacion() {
        return Iluminacion;
    }

    public void setIluminacion(boolean Iluminacion) {
        this.Iluminacion = Iluminacion;
    }

    @Override
    public String toString() {
        return "InformacionVivienda{" +
                "numeroDormitorios=" + numeroDormitorios +
                ", tipoParedes=" + tipoParedes +
                ", tipoPiso=" + tipoPiso +
                ", Iluminacion=" + Iluminacion +
                '}';
    }
}
