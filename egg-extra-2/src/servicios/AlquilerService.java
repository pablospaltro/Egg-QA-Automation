package servicios;

import java.util.ArrayList;

import entidades.Alquiler;
import java.util.Date;

public class AlquilerService {

    ArrayList<Alquiler> alquileres;

    public void crearAlquiler() {

        Date tiempo = new Date();

        Alquiler alqui1 = new Alquiler(new Date(2010 - 1900, 01 - 1, 01), new Date(2010 - 1900, 01 - 1, 04), "Avatar",
                12.50);
        Alquiler alqui2 = new Alquiler(new Date(2010 - 1900, 01 - 1, 01), new Date(2010 - 1900, 01 - 1, 07), "Avatar",
                12.50);
        Alquiler alqui3 = new Alquiler(new Date(2010 - 1900, 01 - 1, 01), new Date(2010 - 1900, 01 - 1, 04), "Titanic",
                12.50);
        Alquiler alqui4 = new Alquiler(new Date(2010 - 1900, 01 - 1, 01), new Date(2010 - 1900, 01 - 1, 04),
                "Spiderman", 12.50);
        Alquiler alqui5 = new Alquiler(new Date(2010 - 1900, 01 - 1, 01), new Date(2010 - 1900, 01 - 1, 04), "Avatar",
                12.50);

        alquileres = new ArrayList<Alquiler>();
        alquileres.add(alqui1);
        alquileres.add(alqui2);
        alquileres.add(alqui3);
        alquileres.add(alqui4);
        alquileres.add(alqui5);

    }

    public void listarAlquilers() {

        System.out.println(alquileres.toString());

        // corregir saltos de linea

    }

}
