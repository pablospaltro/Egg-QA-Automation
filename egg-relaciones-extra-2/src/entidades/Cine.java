package entidades;

import java.util.ArrayList;

public class Cine {

    private Pelicula peliculaActual;
    private Espectador[][] sala = new Espectador[8][6];
    private int precio;

    public Cine() {
    }

    public Cine(Pelicula peliculaActual, Espectador[][] sala, int precio) {
        this.peliculaActual = peliculaActual;
        this.sala = sala;
        this.precio = precio;
    }

    public Cine(Pelicula peliculaActual, int precio) {
        this.peliculaActual = peliculaActual;
        this.precio = precio;
    }

    public Pelicula getPeliculaActual() {
        return peliculaActual;
    }

    public void setPeliculaActual(Pelicula peliculaActual) {
        this.peliculaActual = peliculaActual;
    }

    public Espectador[][] getSala() {
        return sala;
    }

    public void setSala(Espectador[][] sala) {
        this.sala = sala;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}