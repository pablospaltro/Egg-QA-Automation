package entidades;

public class Hotel {

    protected int cantidadHabitaciones;
    protected int cantidadCamas;
    protected double precioHabitacion;

    public Hotel() {
    }

    public Hotel(int cantidadHabitaciones, int cantidadCamas, double precioHabitacion) {
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.cantidadCamas = cantidadCamas;
        this.precioHabitacion = precioHabitacion;
    }

    public double precioHabitacion (){
        double precio = 50;
        return precio;
    }
}
