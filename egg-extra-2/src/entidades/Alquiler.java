package entidades;

import java.util.Date;

public class Alquiler {

    private Date fechaInicio;
    private Date fechaFin;
    private String peliculaAlquilada;
    private double precio;

    public Alquiler() {
    }

    public Alquiler(Date fechaInicio, Date fechaFin, String peliculaAlquilada, double precio) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.peliculaAlquilada = peliculaAlquilada;
        this.precio = precio;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getPeliculaAlquilada() {
        return peliculaAlquilada;
    }

    public void setPeliculaAlquilada(String peliculaAlquilada) {
        this.peliculaAlquilada = peliculaAlquilada;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Alquiler [fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", peliculaAlquilada="
                + peliculaAlquilada + ", precio=" + precio + "]";
    }

}