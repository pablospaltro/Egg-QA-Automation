import entidades.Biblioteca;

public class Main {
    public static void main(String[] args) {

        Biblioteca biblio = new Biblioteca();

        biblio.agregarLibros();
        biblio.mostrarLibros();

        //al pedir el valor 0, deberia mostrar el unico libro y detenerse
        //al pedir otro valor, deberia mostrar la excepcion y repetir el bucle


    }
}