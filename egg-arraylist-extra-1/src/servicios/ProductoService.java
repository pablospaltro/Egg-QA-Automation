package servicios;

import java.util.ArrayList;
import java.util.Scanner;

import entidades.Producto;

public class ProductoService {

    Scanner leer = new Scanner(System.in);

    public void crearProducto(ArrayList<Producto> lista) {

        Producto produ = new Producto();

        System.out.println("1 | NUEVO PRODUCTO");
        System.out.println("Ingrese el nombre del producto: ");
        produ.setNombre(leer.nextLine());
        System.out.println("Ingrese la categoria del producto: ");
        produ.setCategoria(leer.nextLine());
        System.out.println("Ingrese el precio del producto: ");
        produ.setPrecio(leer.nextDouble());
        System.out.println("Ingrese la cantidad en inventario del producto: ");
        produ.setCantidadEnInventario(leer.nextInt());
        leer.nextLine();
        System.out.println("");

        lista.add(produ);
    }

    public void mostrarProducto(ArrayList<Producto> lista) {

        System.out.println("2 | LISTA DE PRODUCTOS");
        System.out.println("");
        for (Producto produ : lista) {
            System.out.println(produ.toString() + "");
        }
        System.out.println("");
    }

    public void actualizarProducto(ArrayList<Producto> lista) {

        System.out.println("3 | ACTUALIZAR PRODUCTO");
        System.out.println("");
        System.out.println("Ingrese el nombre del producto a actualizar: ");
        String nombreIngresado = leer.nextLine();

        for (Producto produ : lista) {
            if (nombreIngresado.equalsIgnoreCase(produ.getNombre())) {
                System.out.println("Vamos a actualizar " + produ.getNombre() + " : ");
                System.out.println("Actualmente la cantidad en inventario es " + produ.getCantidadEnInventario());
                System.out.println("Ingrese la cantidad actual: ");
                produ.setCantidadEnInventario(leer.nextInt());
                leer.nextLine();
                System.out.println("Ok! La cantidad actualizada de " + produ.getNombre() + " ahora es "
                        + produ.getCantidadEnInventario());
                System.out.println("");

            }
        }
    }

    public void eliminarProducto(ArrayList<Producto> lista) {

        System.out.println("4 | ELIMINAR PRODUCTO");
        System.out.println("");
        System.out.println("Ingrese el nombre del producto a eliminar: ");
        String nombreIngresado = leer.nextLine();

        for (Producto produ : lista) {
            if (nombreIngresado.equalsIgnoreCase(produ.getNombre())) {

                lista.remove(produ);
            }
        }

        System.out.println("Producto eliminado exitosamente! ");
    }

}
