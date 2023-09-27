package entidades;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Juego {

    private final Scanner scanner = new Scanner(System.in);
    private final Random random = new Random();

    public void juegoAdivinarNumero() {
        System.out.println("A D I V I N A D O R");
        System.out.println("Adivine el número entre 1 y 500!");

        boolean volverAJugar;
        do {
            jugarUnaPartida();

            System.out.println("\nJugar otra vez? S / N");
            String opcion = scanner.nextLine();
            volverAJugar = opcion.equalsIgnoreCase("S");
        } while (volverAJugar);
    }

    private void jugarUnaPartida() {
        int numeroAleatorio = random.nextInt(500) + 1;
        int contadorIntentos = 0;

        while (true) {
            System.out.println("\nIngrese un número: ");
            int numeroIngresado = obtenerNumeroIngresado();

            if (numeroIngresado == numeroAleatorio) {
                mostrarResultadoExitoso(numeroAleatorio, contadorIntentos);
                break;
            } else if (numeroIngresado < numeroAleatorio) {
                System.out.println("\n-- El número que tienes que adivinar es MAYOR al ingresado --");
            } else {
                System.out.println("\n-- El número que tienes que adivinar es MENOR al ingresado --");
            }

            contadorIntentos++;
        }
    }

    private int obtenerNumeroIngresado() {
        while (true) {
            try {
                int numeroIngresado = scanner.nextInt();
                scanner.nextLine();
                return numeroIngresado;
            } catch (InputMismatchException e) {
                System.out.println("\n(Ups! Valor ingresado no válido, asegúrate de ingresar un número)");
                scanner.nextLine();
            }
        }
    }

    private void mostrarResultadoExitoso(int numeroAleatorio, int contadorIntentos) {
        System.out.println("\n-- ¡Adivinaste! --");
        System.out.println("El número buscado era " + numeroAleatorio);
        System.out.println("Cantidad de intentos realizados: " + contadorIntentos);
    }
}


