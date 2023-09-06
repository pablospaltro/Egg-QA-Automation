package servicios;

import entidades.Barco;
import entidades.BarcoAMotor;
import entidades.Velero;
import entidades.Yate;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class AlquilerServicio {

    Scanner scanner = new Scanner(System.in);
    public void menuAlquiler(Velero velero, BarcoAMotor barcoAMotor, Yate yate){

        boolean volverAlMenu = true;
        do {
            System.out.println("\nB A R C O S");
            System.out.println("Seleccione la embarcación: ");
            System.out.println("1 | Velero");
            System.out.println("2 | Barco a motor");
            System.out.println("3 | Yate de lujo");
            System.out.println("0 | Salir");
            int embarcacionElegida = scanner.nextInt();
            scanner.nextLine();

            switch (embarcacionElegida) {
                case 1:
                    calcularAlquiler(velero);
                    break;
                case 2:
                    calcularAlquiler(barcoAMotor);
                    break;
                case 3:
                    calcularAlquiler(yate);
                    break;
                case 0:
                    System.out.println("Saliendo...\nHasta pronto!");
                    volverAlMenu = false;
                    break;
                default:
                    System.out.println("Opcion incorrecta, intente nuevamente. ");
                    break;
            }
        } while (volverAlMenu);


    }

    public void calcularAlquiler(Barco barco){
        System.out.println("Ingrese la fecha de inicio del alquiler (AAAA-MM-DD): ");
        String fechaInicioStr = scanner.nextLine();
        LocalDate fechaInicio = LocalDate.parse(fechaInicioStr);

        System.out.println("Ingrese la fecha de devolución (AAAA-MM-DD): ");
        String fechaDevolucionStr = scanner.nextLine();
        LocalDate fechaDevolucion = LocalDate.parse(fechaDevolucionStr);

        long diasDeOcupacion = ChronoUnit.DAYS.between(fechaInicio, fechaDevolucion);

        double costoAlquiler = diasDeOcupacion * barco.calcularModulo();

        System.out.println("Costo del alquiler del "+barco+": " + costoAlquiler);
    }

}
