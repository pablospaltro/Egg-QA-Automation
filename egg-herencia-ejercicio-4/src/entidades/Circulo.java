package entidades;

import interfaces.CalculosFormas;

public class Circulo extends FormaGeometrica implements CalculosFormas {

    private int radio;
    private double diametro;

    public Circulo() {
    }

    public Circulo(int radio, double diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    @Override
    public void calcularArea() {
        double areaCirculo = Math.PI * (radio^2);
        System.out.println("\nEl area del círculo de radio "+radio+" es "+areaCirculo);
    }

    @Override
    public void calcularPerimetro() {
        double perimetroCirculo = Math.PI*diametro;
        System.out.println("\nEl perimetro del circulo de diametro "+diametro+" es "+perimetroCirculo);
    }
}
