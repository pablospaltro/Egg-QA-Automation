package entidades;

public class Libro {

    private String titulo;
    private String autor;
    private int cantidadPaginas;

    public Libro() {
    }

    public Libro(String titulo, String autor, int cantidadPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.cantidadPaginas = cantidadPaginas;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", cantidadPaginas=" + cantidadPaginas +
                '}';
    }
}
