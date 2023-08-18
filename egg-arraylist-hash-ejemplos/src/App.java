import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import entidades.Persona;
import servicios.Menu;

public class App {
    public static void main(String[] args) throws Exception {

        int cantidadPalabras = 10000;
        int cantidadLetras = 5;

        Random random = new Random();
        Menu menu = new Menu();

        // generamos 1000 palabras con 5 letras (aleatorias):
        String[] palabras = menu.generar(cantidadPalabras, cantidadLetras);

        // nombramos personas con esas palabras aleatorias:
        ArrayList<Persona> personasArrayList = new ArrayList();
        HashMap<String, Persona> personasHashMap = new HashMap();

        for (int i = 0; i < cantidadPalabras; i++) {
            personasArrayList.add(new Persona(palabras[i]));
            personasHashMap.put(palabras[i], new Persona(palabras[i]));
        }

        String palabraABuscar = "";
        long total = 0;
        long inicio = 0;
        long finall = 0;

        // comparamos el tiempo de busqueda en ArrayList:
        for (int i = 0; i < 1000; i++) {
            palabraABuscar = palabras[random.nextInt(palabras.length)];
            inicio = System.nanoTime();
            int valor = personasArrayList.indexOf(palabraABuscar);
            finall = System.nanoTime();
            total += finall - inicio;
        }

        System.out.println(total / 1000);

        total = 0;
        // comparamos el tiempo de busqueda en HashMap:
        for (int i = 0; i < 1000; i++) {
            palabraABuscar = palabras[random.nextInt(palabras.length)];
            inicio = System.nanoTime();
            String valor = personasHashMap.get(palabraABuscar).nombre;
            finall = System.nanoTime();
            total += finall - inicio;
        }

        System.out.println(total / 1000);

        /*
         * // momento actual:
         * inicio = System.nanoTime();
         * System.out.println(personasArrayList.indexOf(palabraABuscar));
         * // momento actual:
         * finall = System.nanoTime();
         * System.out.println("Tiempo consumido " + (finall - inicio));
         * 
         * // momento actual:
         * inicio = System.nanoTime();
         * System.out.println(personasHashMap.get(palabraABuscar).nombre);
         * // momento actual:
         * finall = System.nanoTime();
         * System.out.println("Tiempo consumido " + (finall - inicio));
         */

    }
}
