package servicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

import entidades.Perro;

public class PerroServicio {

    ArrayList<String> razas = new ArrayList();
    Scanner leer = new Scanner(System.in);

    public void agregarRazas() {

        Perro perro = new Perro();
        String respuesta = null;
        do {
            System.out.println("Ingrese la raza: ");
            String raza = leer.nextLine();
            razas.add(raza);
            System.out.println("Desea agregar otra raza? (S / N)");
            respuesta = leer.next().toUpperCase();
            leer.nextLine();
        } while (respuesta.equals("S"));

        mostrarRazas();
    }

    public void mostrarRazas() {

        System.out.println("\nPerros guardados:");
        for (String razaPerro : razas) {
            System.out.println(razaPerro);
        }
    }

    public void eliminarRaza() {

        System.out.print("\nIngrese el perro que desea buscar y eliminar: ");
        String perroABuscar = leer.nextLine();

        Iterator<String> iterator = razas.iterator();
        boolean encontrado = false;

        while (iterator.hasNext()) {
            String razaPerro = iterator.next();
            if (razaPerro.equalsIgnoreCase(perroABuscar)) {
                iterator.remove();
                encontrado = true;
            }
        }

        System.out.println("\nLista de perros después de la eliminación:");
        if (encontrado) {
            Collections.sort(razas);
            for (String razaPerro : razas) {
                System.out.println(razaPerro);
            }
        } else {
            System.out.println("El perro no se encontró en la lista.");
        }
    }
}
