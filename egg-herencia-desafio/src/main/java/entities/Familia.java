package entities;

import java.util.ArrayList;

public class Familia {

    protected String direccion;

    protected Integer IDE;

    protected Integer numeroLote;

    protected String barrio;

    protected String localidad;

    protected ArrayList<Integrante> listaIntegrantes;

    protected InformacionVivienda infoVivienda;
    static int contador = 0;

    public Familia() {
        incrementarContador();
        this.IDE = contador;
    }

    public Familia(String direccion, Integer IDE, Integer numeroLote, String barrio, String localidad, ArrayList<Integrante> listaIntegrantes, InformacionVivienda infoVivienda) {
        this.direccion = direccion;
        this.IDE = contador;
        this.numeroLote = numeroLote;
        this.barrio = barrio;
        this.localidad = localidad;
        this.listaIntegrantes = listaIntegrantes;
        this.infoVivienda = infoVivienda;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getIDE() {
        return IDE;
    }

    public void setIDE(Integer IDE) {
        this.IDE = IDE;
    }

    public Integer getNumeroLote() {
        return numeroLote;
    }

    public void setNumeroLote(Integer numeroLote) {
        this.numeroLote = numeroLote;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public ArrayList<Integrante> getListaIntegrantes() {
        return listaIntegrantes;
    }

    public void setListaIntegrantes(ArrayList<Integrante> listaIntegrantes) {
        this.listaIntegrantes = listaIntegrantes;
    }

    public InformacionVivienda getInfoVivienda() {
        return infoVivienda;
    }

    public void setInfoVivienda(InformacionVivienda infoVivienda) {
        this.infoVivienda = infoVivienda;
    }

    private static void incrementarContador() {
        contador++;
    }
    @Override
    public String toString() {
        return "Familia{" +
                "direccion='" + direccion + '\'' +
                ", IDE=" + IDE +
                ", numeroLote=" + numeroLote +
                ", barrio='" + barrio + '\'' +
                ", localidad='" + localidad + '\'' +
                ", listaIntegrantes=" + listaIntegrantes +
                ", infoVivienda=" + infoVivienda +
                '}';
    }
}
