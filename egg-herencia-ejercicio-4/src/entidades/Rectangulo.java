package entidades;

import interfaces.CalculosFormas;

public class Rectangulo extends FormaGeometrica implements CalculosFormas {

    private int base;
    private int altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        int areaRectangulo = base*altura;
        System.out.println("\nEl area del rectangulo de base "+base+" y altura "+altura+"es "+areaRectangulo);
    }

    @Override
    public void calcularPerimetro() {
        int perimetroRectangulo = (base+altura)*2;
        System.out.println("\nEl perimetro del rectangulo de base "+base+" y altura "+altura+" es "+perimetroRectangulo);

    }
}
