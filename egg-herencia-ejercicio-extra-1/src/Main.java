import entidades.BarcoAMotor;
import entidades.Velero;
import entidades.Yate;
import servicios.AlquilerServicio;
import servicios.BarcoServicio;

public class Main {
    public static void main(String[] args) {

        AlquilerServicio alquilerServicio = new AlquilerServicio();

        Velero velero = new Velero("Matricula1", 20.00, "1990", 1.00);
        BarcoAMotor barcoAMotor = new BarcoAMotor("Matricula2", 40.00, "2003", 100.00);
        Yate yate = new Yate("Matricula3", 100.00, "2010", 200.00, 50.00);


        alquilerServicio.menuAlquiler(velero, barcoAMotor, yate);




    }
}