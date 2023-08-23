package entidades;

public class Pelicula {

    private String titulo;
    private double duracion;
    private String director;
    private int edadMin;

    public Pelicula() {
    }

    public Pelicula(String titulo, double duracion, String director, int edadMin) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.director = director;
        this.edadMin = edadMin;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getEdadMin() {
        return edadMin;
    }

    public void setEdadMin(int edadMin) {
        this.edadMin = edadMin;
    }


}