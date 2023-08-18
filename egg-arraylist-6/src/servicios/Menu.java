package servicios;

import java.util.Scanner;

public class Menu {

    Scanner leer = new Scanner(System.in);
    TiendaServicio tiendaServi = new TiendaServicio();

    public void menuProductos() {

        boolean volverAlMenu = true;

        do {

            System.out.println("MENU");
            System.out.println("1 | Ingresar producto");
            System.out.println("2 | Actualizar producto");
            System.out.println("3 | Ver productos");
            System.out.println("4 | Eliminar producto");
            System.out.println("5 | Buscar producto");
            System.out.println("0 | Salir");
            int opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    tiendaServi.introducirProducto();
                    break;
                case 2:
                    tiendaServi.modificarProducto();
                    break;
                case 3:
                    tiendaServi.mostrarProductos();
                    break;
                case 4:
                    tiendaServi.eliminarProducto();
                    break;
                case 5:
                    tiendaServi.buscarProducto();
                    break;
                case 0:
                    System.out.println("Saliendo...\n Adios!");
                    volverAlMenu = false;
                    break;
            }
        } while (volverAlMenu);
    }
}
