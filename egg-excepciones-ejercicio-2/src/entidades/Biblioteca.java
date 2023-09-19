package entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {

    private ArrayList<Libro> libros = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    public void agregarLibros (){
        Libro libro1 = new Libro("Harry Potter", "Rowling", 500);
        libros.add(libro1);
    }

    public void mostrarLibros(){
        boolean contador = true;
        do {
            try {
                System.out.println("Ingrese qué libro quiere ver: ");
                int libroAMostrar = scanner.nextInt();
                scanner.nextLine();

                for (int i = 0; i < libros.size(); i++) {
                    System.out.println(libros.get(libroAMostrar).toString());
                }
                contador = false;
            } catch (IndexOutOfBoundsException e) {
                System.out.println("El libro ingresado no esta disponible");
            }
        } while(contador);
    }


}
