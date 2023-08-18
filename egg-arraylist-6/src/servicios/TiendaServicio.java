package servicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TiendaServicio {

    HashMap<String, Double> productos = new HashMap();
    Scanner leer = new Scanner(System.in);

    public void introducirProducto() {

        System.out.println("Ingrese el nombre del producto: ");
        String nombreProdu = leer.next();
        System.out.println("Ingrese el precio del producto: ");
        Double precioProdu = leer.nextDouble();

        productos.put(nombreProdu, precioProdu);
    }

    public void mostrarProductos() {

        for (Map.Entry<String, Double> entry : productos.entrySet()) {
            System.out.println("Nombre: " + entry.getKey() + ", precio: " + entry.getValue());
        }
        System.out.println("");
    }

    public void modificarProducto() {

        System.out.println("Ingrese el producto a actualizar precio: ");
        String productoAActualizar = leer.next();

        // con la llave (nombre) obtiene el valor (precio):
        Double precioAntiguo = productos.get(productoAActualizar);

        if (precioAntiguo != null) {
            System.out.println("Ingrese el precio actualizado: ");
            Double precioActualizado = leer.nextDouble();

            productos.put(productoAActualizar, precioActualizado);
        } else {
            System.out.println("El producto ingresado no existe :(");
        }

        System.out.println("");
        System.out.println("Lista actualizada de productos: ");
        mostrarProductos();
    }

    public void eliminarProducto() {

        System.out.println("Ingrese el nombre del producto a eliminar: ");
        String productoAEliminar = leer.next();

        // utilizo la llave (nombre) para eliminar:
        productos.remove(productoAEliminar);

        System.out.println("");
        System.out.println("Lista actualizada de productos: ");
        mostrarProductos();
    }

    public void buscarProducto() {

        System.out.println("Ingrese el producto a encontrar: ");
        String productoAEncontrar = leer.next();

        // con ela llave (nombre) obtiene el valor (precio):
        Double precioExistente = productos.get(productoAEncontrar);

        if (precioExistente != null) {

            System.out.println("Producto: " + productoAEncontrar + " Precio: " + precioExistente);
        }
    }
}