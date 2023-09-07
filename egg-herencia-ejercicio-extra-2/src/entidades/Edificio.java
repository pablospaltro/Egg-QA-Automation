package entidades;

public abstract class Edificio {

    private double ancho;
    private double alto;
    private double largo;

    public Edificio() {
    }

    public Edificio(double ancho, double alto, double largo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    @Override
    public String toString() {
        return "Edificio{" +
                "ancho=" + ancho +
                ", alto=" + alto +
                ", largo=" + largo +
                '}';
    }

    public abstract double calcularSuperficie();

    public abstract double calcularVolumen();


}
