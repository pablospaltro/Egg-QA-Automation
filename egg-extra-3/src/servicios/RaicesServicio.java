package servicios;

import java.util.Scanner;

import entidades.Raices;

public class RaicesServicio {

    public void crearRaiz(Raices raiz) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el valor de a: ");
        raiz.setA(leer.nextDouble());
        System.out.println("Ingrese el valor de b: ");
        raiz.setB(leer.nextDouble());
        System.out.println("Ingrese el valor de c: ");
        raiz.setC(leer.nextDouble());
    }

    public double getDiscriminante(Raices raiz) {
        double resultado = 0;

        resultado = Math.pow(raiz.getB(), 2) - 4 * raiz.getA() * raiz.getC();

        return resultado;
    }

    public boolean tieneRaices(Raices raiz) {

        return getDiscriminante(raiz) > 0;
    }

    public boolean tieneRaiz(Raices raiz) {

        return getDiscriminante(raiz) == 0;
    }

    public void calcular(Raices raiz) {

        double raiz1;
        double raiz2;

        raiz1 = ((raiz.getB() * -1) + getDiscriminante(raiz)) / (raiz.getA() * 2);
        raiz2 = ((raiz.getB() * -1) - getDiscriminante(raiz)) / (raiz.getA() * 2);

        System.out.println("La raiz 1 es " + raiz1);
        System.out.println("La raiz 2 es " + raiz2);

    }

    public void obtenerRaices(Raices raiz) {

        if (tieneRaices(raiz)) {

            calcular(raiz);

        } else if (tieneRaiz(raiz)) {

            obtenerRaiz(raiz);
        } else {
            System.out.println("No tiene raices reales :()");
        }

    }

    public void obtenerRaiz(Raices raiz) {

        if (tieneRaiz(raiz)) {
            System.out.println("La raiz es " + (raiz.getB() * -1) / (raiz.getA() * 2));
        }

    }

}
