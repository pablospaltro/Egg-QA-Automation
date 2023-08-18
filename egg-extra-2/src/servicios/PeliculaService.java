package servicios;

import java.util.Scanner;

import entidades.Pelicula;

import java.util.Date;
import java.lang.Math;
import java.util.ArrayList;

public class PeliculaService {

    Scanner leer = new Scanner(System.in);

    ArrayList<Pelicula> pelis;

    public void crearPelicula() {

        Pelicula peli = new Pelicula("Titanic", "Drama", 1999, 180);
        Pelicula peli2 = new Pelicula("Interstellar", "Ciencia Ficcion", 2014, 169);
        Pelicula peli3 = new Pelicula("Harry Potter I", "Ficcion", 2001, 152);
        Pelicula peli4 = new Pelicula("Avatar", "Ciencia Ficcion", 2010, 162);
        Pelicula peli5 = new Pelicula("Spiderman", "Aventura", 2005, 120);

        pelis = new ArrayList<Pelicula>();
        pelis.add(peli);
        pelis.add(peli2);
        pelis.add(peli3);
        pelis.add(peli4);
        pelis.add(peli5);

    }

    public void listarPeliculas() {

        System.out.println(pelis.toString());

        // corregir saltos de linea

    }

    public void buscarTitulo() {

        System.out.print("Ingrese el título de la película a buscar: ");
        String peliIngresada = leer.next();

        System.out.println("probandooooo: ");

        listarPeliculas();

        for (int i = 0; i < pelis.size(); i++) {
            System.out.println(pelis.get(i).getTitulo());

            if (peliIngresada.equalsIgnoreCase(pelis.get(i).getTitulo())) {

                System.out.println("La película esta disponible");

            } else {
                System.out.println("La película no esta disponible :(");
            }

        }

        // if (peliIngresada.equalsIgnoreCase(peli.getTitulo())) {

        // System.out.println("La película esta disponible");
        // System.out.println(peli.toString());
        // } else {
        // System.out.println("La película no esta disponible :(");
        // }

    }

    public void buscarGenero() {

        System.out.print("Ingrese el género de la película a buscar: ");
        String generoIngresado = leer.next();
        Pelicula peli = new Pelicula();
        System.out.println(peli.toString());

        if (generoIngresado.equalsIgnoreCase(peli.getGenero())) {

            System.out.println("El género esta disponible");
            System.out.println(peli.toString());
        } else {
            System.out.println("El género no esta disponible :(");
        }

    }

}
