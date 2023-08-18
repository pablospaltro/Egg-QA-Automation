package servicios;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

import entidades.CantanteFamoso;
import entidades.Disco;

public class CantanteService {

    Scanner leer = new Scanner(System.in);

    ArrayList<CantanteFamoso> cantantes = new ArrayList();

    public void agregarCantante() {

        String opcion = "";
        System.out.println("\n 1 |\n");
        do {
            CantanteFamoso cantante = new CantanteFamoso();
            HashSet<Disco> discos = new HashSet<>();
            System.out.println("\n* Ingrese el nombre del cantante: ");
            cantante.setNombre(leer.nextLine());
            System.out.println("* Ingrese la cantidad de discos del cantante: ");
            int cantidadDiscos = leer.nextInt();
            leer.nextLine();

            agregarDisco(cantidadDiscos, discos, cantante);

            cantantes.add(cantante);
            System.out.println("\n* El cantante se ha agregado correctamente");
            System.out.println("* Desea agregar otro? S/N: ");
            opcion = leer.nextLine();

        } while (opcion.equalsIgnoreCase("S"));

    }

    public void agregarDisco(int cantidad, HashSet<Disco> discos, CantanteFamoso cantante) {
        for (int i = 0; i < cantidad; i++) {
            Disco disco = new Disco();
            System.out.println("\n* Nombre del disco " + (i + 1) + ": ");
            disco.setNombre(leer.nextLine());
            System.out.println("* Cantidad de ventas: ");
            disco.setCantidadVendida(leer.nextInt());
            leer.nextLine();

            discos.add(disco);
        }
        cantante.setDiscos(discos);
    }

    public void mostrarCantante() {
        System.out.println("\n 2 |\n");
        for (CantanteFamoso cantante : cantantes) {
            System.out.println(cantante + "\n");
        }

    }

    public void eliminarCantante() {
        System.out.println("\n 3 |\n");
        System.out.println("* Ingrese el cantante que desea eliminar");
        String cantanteAEliminar = leer.next();
        for (int i = 0; i < cantantes.size(); i++) {
            if (cantantes.get(i).getNombre().equalsIgnoreCase(cantanteAEliminar)) {
                cantantes.remove(i);
                System.out.println("\n* Cantante eliminado exitosamente");
            } else {
                System.out.println("\n* El cantante no se encontro en el listado");
            }
        }
    }
}
