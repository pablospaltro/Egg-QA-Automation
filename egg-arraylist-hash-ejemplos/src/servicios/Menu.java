package servicios;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Menu {

    public Menu() {

    }

    public String generarPalabra(int letras) {

        String letters = "0123456789abcedfghijklmnopqrstuvewxyzABCDEFGHIJKLMNOPQRSTUVWXIZ";
        Random random = new Random();
        int index = 0;
        String palabra = "";

        for (int i = 0; i < letras; i++) {
            index = random.nextInt(letters.length());
            palabra += letters.charAt(index);
        }

        return palabra;
    }

    public String[] generar(int cantidadAleatorias, int letras) {

        Set<String> palabras = new HashSet();

        /*
         * //se va a repetir, pero no necesariamente van a salir
         * //palabras distintas:
         * 
         * for (int i = 0; i < cantidadAleatorias; i++) {
         * palabras.add(generarPalabra(letras));
         * }
         */

        // salen todas palabras distintas:
        do {
            palabras.add(generarPalabra(letras));
        } while (palabras.size() < cantidadAleatorias);

        return palabras.toArray(new String[palabras.size()]);
    }

}
