/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import Entidades.Pelicula;
import Servicios.PeliculaService;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hesca
 */
public class MainPeliculas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           PeliculaService ps = new PeliculaService();
           ps.crearPelicula();
           System.out.println("MOSTRAR PELIS");
           ps.mostrarPeliculas();
           System.out.println("----------------");
           System.out.println("MOSTRAR PELIS +1 HORA");
           ps.mostrarPeliculasLargas();
           System.out.println("----------------");
           System.out.println("MOSTRAR PELIS X TITULO");
           ps.ordenarPeliculasporTitulo();
           System.out.println("----------------");
           System.out.println("MOSTRAR PELIS X DIRECTOR");
           ps.ordenarPeliculasporDirector();
           System.out.println("----------------");
           System.out.println("MOSTRAR PELIS X ORDEN ASCENDENTE");
           ps.ordenarPeliculasAsc();
           System.out.println("----------------");
           System.out.println("MOSTRAR PELIS X ORDEN DESCENDENTE");
           ps.ordenarPeliculasDesc();
    }
    
}
