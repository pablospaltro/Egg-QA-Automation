package entidades;

import java.time.LocalDate;

public class Alquiler {

    private String nombreUsuario;
    private String documentoUsuario;
    private LocalDate fechaInicio;
    private LocalDate fechaDevolucion;
    private int posicionAmarre;
    private Barco tipoDeEmbarcacion;

    public Alquiler() {
    }

    public Alquiler(String nombreUsuario, String documentoUsuario, LocalDate fechaInicio, LocalDate fechaDevolucion, int posicionAmarre, Barco tipoDeEmbarcacion) {
        this.nombreUsuario = nombreUsuario;
        this.documentoUsuario = documentoUsuario;
        this.fechaInicio = fechaInicio;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.tipoDeEmbarcacion = tipoDeEmbarcacion;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getDocumentoUsuario() {
        return documentoUsuario;
    }

    public void setDocumentoUsuario(String documentoUsuario) {
        this.documentoUsuario = documentoUsuario;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public int getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(int posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Barco getTipoDeEmbarcacion() {
        return tipoDeEmbarcacion;
    }

    public void setTipoDeEmbarcacion(Barco tipoDeEmbarcacion) {
        this.tipoDeEmbarcacion = tipoDeEmbarcacion;
    }
}
