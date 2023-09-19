package entidades;

import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class DivisionNumero {

    Scanner scanner = new Scanner(System.in);

    public void divisionEntreNumeros() {

        boolean intento = true;
        boolean volverADividir = true;
        System.out.println("D I V I S I O N E S");
        do {
            try {
                System.out.println("\nIngrese un numero entero como dividendo: ");
                int dividendo = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Ingrese un numero entero como divisor: ");
                int divisor = scanner.nextInt();
                scanner.nextLine();


                int resultado = dividendo / divisor;

                System.out.println(dividendo + " / " + divisor + " = " + resultado);
                intento = false;
                System.out.println("Hacer otra division? S / N");
                String opcion = scanner.nextLine();

                if (opcion.equalsIgnoreCase("N")) {
                    volverADividir = false;
                }

            } catch (ArithmeticException e) {
                System.err.println("¡Cuidado, no se puede dividir por cero! Intente nuevamente");
            } catch (InputMismatchException e) {
                System.out.println("-- Valor ingresado no válido, Intente nuevamente --");
                scanner.nextLine();
            }
        } while (intento || volverADividir);
    }
}
