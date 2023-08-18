package servicios;

import java.util.ArrayList;
import java.util.Scanner;

import entidades.Producto;
import entidades.Tienda;

public class Menu {

    Scanner leer = new Scanner(System.in);
    ArrayList<Producto> productos = new ArrayList();
    ArrayList<Producto> carrito = new ArrayList();
    ProductoService produServi = new ProductoService();
    Tienda tienda = new Tienda();

    public void Menu() {

        boolean volverAlMenu = true;

        while (volverAlMenu) {

            System.out.println("MENU");
            System.out.println("Indique si ingresa como Cliente o Empleado: ");
            String nombreIngresado = leer.nextLine();

            if (nombreIngresado.equalsIgnoreCase("Empleado")) {

                System.out.println("\n EMPLEADOS");
                System.out.println("1 | Ingresar nuevo producto");
                System.out.println("2 | Ver productos");
                System.out.println("3 | Actualizar inventario de producto");
                System.out.println("4 | Eliminar producto");
                System.out.println("0 | Volver al menu principal");
                int opcion = leer.nextInt();
                leer.nextLine();

                switch (opcion) {
                    case 1:
                        produServi.crearProducto(productos);
                        break;
                    case 2:
                        produServi.mostrarProducto(productos);
                        break;
                    case 3:
                        produServi.actualizarProducto(productos);
                        break;
                    case 4:
                        produServi.eliminarProducto(productos);
                        break;
                    case 0:
                        System.out.println("\n Volviendo al menu principal... \n");
                        break;
                }

            } else if (nombreIngresado.equalsIgnoreCase("Cliente")) {

                System.out.println("\n CLIENTES");
                System.out.println("1 | Ver góndolas");
                System.out.println("2 | Ver mi carrito");
                System.out.println("3 | Ir a la caja");
                System.out.println("0 | Volver al menu principal");
                int opcion = leer.nextInt();
                leer.nextLine();

                switch (opcion) {
                    case 1:
                        tienda.venta(productos, carrito);
                        break;
                    case 2:
                        tienda.verCarrito(carrito);
                        break;
                    case 3:
                        System.out.println("en construccion");
                        break;
                    case 0:
                        System.out.println("\n Volviendo al menu principal... \n");
                        break;
                }

            }
        }
    }
}
