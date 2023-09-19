package entidades;

import org.w3c.dom.ls.LSOutput;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Juego {

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    public void juegoAdivinarNumero(){
        boolean volverAJugar = true;
        System.out.println("A D I V I N A D O R");
        System.out.println("Adivine el numero entre 1 y 500!");

        do {
            int numeroAleatorio = random.nextInt(500) + 1;
            int contadorIntentos = 0;
            boolean entradaValida = true;

            try {
                while (true) {
                    System.out.println("\nIngrese un numero: ");
                    int numeroIngresado = scanner.nextInt();
                    scanner.nextLine();

                    if (numeroIngresado == numeroAleatorio) {
                        System.out.println("\n-- ¡Adivinaste! --");
                        System.out.println("El numero buscado era "+numeroAleatorio);
                        System.out.println("Cantidad de intentos realizados: " + contadorIntentos);
                        break;
                    } else if (numeroIngresado < numeroAleatorio) {
                        System.out.println("\n-- El numero que tenes que adivinar es MAYOR al ingresado --");
                    } else {
                        System.out.println("\n-- El numero que tenes que adivinar es MENOR al ingresado --");
                    }
                    contadorIntentos++;
                }
            } catch (InputMismatchException e) {
                System.out.println("\n(Ups! Valor ingresado no válido, asegurate de ingresar un número)");
                entradaValida = false;
                scanner.nextLine();
            }

            if (!entradaValida) {
                continue;
            }

            System.out.println("\nJugar otra vez? S / N");
            String opcion = scanner.nextLine();
            if (opcion.equalsIgnoreCase("N")) {
                volverAJugar = false;
            }
        } while (volverAJugar);
    }

}

