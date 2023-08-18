package servicios;

import java.util.Scanner;

public class Menu {

    Scanner leer = new Scanner(System.in);
    CantanteService cantaService = new CantanteService();

    public void menuCantantes() {

        boolean volverAlMenu = true;

        do {
            System.out.println("\nMENU\n");
            System.out.println("1 | Ingresar un cantante");
            System.out.println("2 | Mostrar los cantantes");
            System.out.println("3 | Eliminar un cantante");
            System.out.println("0 | Salir \n");
            int opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    cantaService.agregarCantante();
                    break;
                case 2:
                    cantaService.mostrarCantante();
                    break;
                case 3:
                    cantaService.eliminarCantante();
                    break;
                case 0:
                    System.out.println("\n 0 | Saliendo... \n * Adiós!");
                    volverAlMenu = false;
                    break;
                default:
                    System.out.println("* Opcion no valida");
            }
        } while (volverAlMenu);
    }
}
