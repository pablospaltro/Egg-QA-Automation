package entidades;

public class Producto {

    private String nombre;
    private String categoria;
    private double precio;
    private int cantidadEnInventario;

    public Producto() {
    }

    public Producto(String nombre, String categoria, double precio, int cantidadEnInventario) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.cantidadEnInventario = cantidadEnInventario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadEnInventario() {
        return cantidadEnInventario;
    }

    public void setCantidadEnInventario(int cantidadEnInventario) {
        this.cantidadEnInventario = cantidadEnInventario;
    }

    @Override
    public String toString() {
        return "Producto [nombre=" + nombre + ", categoria=" + categoria + ", precio=" + precio
                + ", cantidadEnInventario=" + cantidadEnInventario + "]";
    }

}