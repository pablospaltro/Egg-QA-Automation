package entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Tienda {

    Scanner leer = new Scanner(System.in);

    public void venta(ArrayList<Producto> lista, ArrayList<Producto> carrito) {

        System.out.println("Buen día!");
        String opcion = null;

        do {
            System.out.println("\n Qué andas buscando? ");
            String productoIngresado = leer.nextLine();

            for (Producto produ : lista) {
                if (productoIngresado.equalsIgnoreCase(produ.getCategoria()) && produ.getCantidadEnInventario() > 0) {
                    System.out.println("");
                    System.out.println("Tengo " + produ.getCategoria() + " ! Ya te digo cuales tengo...");
                    for (Producto produc : lista) {
                        if (produc.getCategoria().equalsIgnoreCase(productoIngresado)) {
                            System.out.println(produc.toString() + "");
                        }
                    }

                    System.out.println("\n Cual queres llevar? ");
                    String produIngresado = leer.nextLine();
                    System.out.println("Bueno. Cuantos llevas?");
                    int cantidadDeseada = leer.nextInt();
                    leer.nextLine();
                    for (Producto produc : lista) {
                        if (produc.getNombre().equalsIgnoreCase(produIngresado)) {
                            int nuevoStock = produc.getCantidadEnInventario() - cantidadDeseada;
                            produc.setCantidadEnInventario(nuevoStock);
                            carrito.add(produc);
                        }
                    }
                    System.out.println("Dale. Algo mas? S / N");
                    opcion = leer.nextLine();

                } else {
                    System.out.println("No me quedó más :( \n");
                }

            }
        } while (opcion.equalsIgnoreCase("S"));

    }

    public void verCarrito(ArrayList<Producto> carrito) {

        double total = 0;

        for (Producto produ : carrito) {
            total += produ.getPrecio();
            System.out.println(produ.getNombre() + " $" + produ.getPrecio() + "");
            System.out.println("TOTAL: $" + total);
            System.out.println("");
        }

    }

}
