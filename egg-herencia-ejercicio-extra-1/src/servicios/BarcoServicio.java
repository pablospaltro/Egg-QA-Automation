package servicios;

import entidades.BarcoAMotor;
import entidades.Velero;
import entidades.Yate;

public class BarcoServicio {
    public void generarBarcos (){
        Velero velero = new Velero("Matricula1", 20.00, "1990", 1.00);
        BarcoAMotor barcoAMotor = new BarcoAMotor("Matricula2", 40.00, "2003", 100.00);
        Yate yate = new Yate("Matricula3", 100.00, "2010", 200.00, 50.00);

    }
}
