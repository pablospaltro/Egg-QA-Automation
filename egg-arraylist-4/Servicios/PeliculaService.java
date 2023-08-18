/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Pelicula;
import Utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author hesca
 */
public class PeliculaService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Pelicula> peliculas = new ArrayList();
     
    public void crearPelicula(){
   
        Pelicula p1 = new Pelicula("Indiana", "Harrison", 0.55);
        Pelicula p2 = new Pelicula("Batman", "Nolan", 1.95);
        Pelicula p3 = new Pelicula("Barbie", "Alguien", 1.45);
        Pelicula p4 = new Pelicula("Matrix", "Unos hermanos", 2.55);
        
        peliculas.add(p1);
        peliculas.add(p2);
        peliculas.add(p3);
        peliculas.add(p4);
     /*   boolean salir = false;
        
        
    do {
            System.out.println("Ingrese el título de la película:");
            Pelicula p = new Pelicula();
            p.setTitulo(leer.next());
            System.out.println("Ingrese el director de la película:");
            p.setDirector(leer.next());
            System.out.println("Ingrese la duración de la película:");
            p.setDuracion(leer.nextDouble());
            
            peliculas.add(p);
            
            System.out.println("¿Desea salir? ingrese 1.SI 2. NO");
            int opc = leer.nextInt();
            if (opc == 1) {
                salir = true;
            }
        } while (!salir);    */

    }
//    Mostrar en pantalla todas las películas.
    
    public void mostrarPeliculas(){
        for (Pelicula aux : peliculas) {
            System.out.println(aux);
        }
    }
        
    public void mostrarPeliculasLargas(){
        for (Pelicula aux : peliculas) {
            if(aux.getDuracion()>1){
            System.out.println(aux);
            }
        }    
    }
    
    public void ordenarPeliculasAsc(){
        Collections.sort(peliculas, Comparadores.ordenarPeliculasAsc);
        for (Pelicula aux : peliculas) {
            System.out.println(aux);
        }
    }
    public void ordenarPeliculasDesc(){
        Collections.sort(peliculas, Comparadores.ordenarPeliculasDesc);
        for (Pelicula aux : peliculas) {
            System.out.println(aux);
        }
    }
    public void ordenarPeliculasporTitulo(){
        Collections.sort(peliculas, Comparadores.ordenarPeliculasPorTitulo);
        for (Pelicula aux : peliculas) {
            System.out.println(aux);
        }
    }
    public void ordenarPeliculasporDirector(){
    Collections.sort(peliculas, Comparadores.ordenarPeliculasPorDirector);
        for (Pelicula aux : peliculas) {
            System.out.println(aux);
        }}
}
