package entidades;

public class EdificioDeOficinas extends Edificio {

    private String nombre;
    private int cantidadDeOficinas;
    private int cantidadDePersonasPorOficina;
    private int numeroDePisos;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(double ancho, double alto, double largo, int cantidadDeOficinas, int cantidadDePersonasPorOficina, int numeroDePisos, String nombre) {
        super(ancho, alto, largo);
        this.cantidadDeOficinas = cantidadDeOficinas;
        this.cantidadDePersonasPorOficina = cantidadDePersonasPorOficina;
        this.numeroDePisos = numeroDePisos;
        this.nombre = nombre;
    }

    public int getCantidadDeOficinas() {
        return cantidadDeOficinas;
    }

    public void setCantidadDeOficinas(int cantidadDeOficinas) {
        this.cantidadDeOficinas = cantidadDeOficinas;
    }

    public int getCantidadDePersonasPorOficina() {
        return cantidadDePersonasPorOficina;
    }

    public void setCantidadDePersonasPorOficina(int cantidadDePersonasPorOficina) {
        this.cantidadDePersonasPorOficina = cantidadDePersonasPorOficina;
    }

    public int getNumeroDePisos() {
        return numeroDePisos;
    }

    public void setNumeroDePisos(int numeroDePisos) {
        this.numeroDePisos = numeroDePisos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "EdificioDeOficinas{" +
                "nombre='" + nombre + '\'' +
                ", cantidadDeOficinas=" + cantidadDeOficinas +
                ", cantidadDePersonasPorOficina=" + cantidadDePersonasPorOficina +
                ", numeroDePisos=" + numeroDePisos +
                "} " + super.toString();
    }

    @Override
    public double calcularSuperficie() {
        double superficieEdificioDeOficinas = 2 * (getLargo() * getAncho() + getLargo() * getAlto() + getAncho() * getAlto());
        return superficieEdificioDeOficinas;
    }

    @Override
    public double calcularVolumen() {
        double volumenEdificioDeOficinas = getLargo() * getAncho() * getAlto();
        return volumenEdificioDeOficinas;
    }
}
