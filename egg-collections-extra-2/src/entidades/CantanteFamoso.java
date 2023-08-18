package entidades;

import java.util.HashSet;

public class CantanteFamoso {

    private String nombre;
    private HashSet<Disco> discos;

    public CantanteFamoso() {
    }

    public CantanteFamoso(String nombre, HashSet<Disco> discoConMasVentas) {
        this.nombre = nombre;
        this.discos = discoConMasVentas;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashSet<Disco> getDiscos() {
        return discos;
    }

    public void setDiscos(HashSet<Disco> discos) {
        this.discos = discos;
    }

    @Override
    public String toString() {
        return "* nombre = \n" + nombre + "\n* discos (ordenados por más vendido) = \n" + discos;
    }
}
