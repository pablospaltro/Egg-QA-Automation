package servicios;

import java.util.Scanner;

public class EdificioMenu {

    Scanner scanner = new Scanner(System.in);
    EdificioServicio edificioServicio = new EdificioServicio();

    public void menu() {

        boolean volverAlMenu = true;

        do {
            System.out.println("\nE d i f i c i o s \n");
            System.out.println("1 | Crear edificio");
            System.out.println("2 | Ver edificios");
            System.out.println("0 | Salir\n");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    edificioServicio.crearEdificio();
                    break;
                case 2:
                    edificioServicio.mostrarEdificio();
                    break;
                case 0:
                    System.out.println("Saliendo...\nAdiós!");
                    volverAlMenu = false;
                    break;
            }
        } while (volverAlMenu);
    }
}
