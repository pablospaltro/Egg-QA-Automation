import entidades.Circulo;
import entidades.Rectangulo;

public class Main {
    public static void main(String[] args) {

    //Usando interfaces

    Circulo circulo1 = new Circulo(5, 10);
    Circulo circulo2 = new Circulo(10, 20);

    Rectangulo rectangulo1 = new Rectangulo(2, 5);
    Rectangulo rectangulo2 = new Rectangulo(4, 20);

    circulo1.calcularPerimetro();
    circulo1.calcularArea();

    rectangulo2.calcularPerimetro();
    rectangulo2.calcularArea();

    }
}