package servicios;

import entidades.Edificio;
import entidades.EdificioDeOficinas;
import entidades.Polideportivo;

import java.util.ArrayList;
import java.util.Scanner;

public class EdificioServicio {

    Scanner scanner = new Scanner(System.in);

    ArrayList<Polideportivo> polideportivos = new ArrayList<>();
    ArrayList<EdificioDeOficinas> edificiosDeOficinas = new ArrayList<>();


    public void crearEdificio(){

        boolean volverACrear = true;

        do {
            System.out.println("\nElija el edificio a crear: \n");
            System.out.println("1 | Polideportivo");
            System.out.println("2 | Edificio de oficinas");
            System.out.println("0 | Volver al menu\n");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch(opcion){
                case 1:
                    crearPolideportivo();
                    break;
                case 2:
                    crearEdificioDeOficinas();
                    break;
                case 0:
                    volverACrear = false;
                    break;
            }
        } while(volverACrear);
    }

    public void crearPolideportivo(){

        Polideportivo poli = new Polideportivo();
        System.out.print("Nombre del Polideportivo: ");
        poli.setNombre(scanner.nextLine());
        System.out.print("Tipo de instalación (Techado / Abierto): ");
        poli.setTipoDeInstalacion(scanner.nextLine());
        System.out.print("Ancho: ");
        poli.setAncho(scanner.nextDouble());
        System.out.print("Largo: ");
        poli.setLargo(scanner.nextDouble());
        System.out.print("Alto: ");
        poli.setAlto(scanner.nextDouble());

        polideportivos.add(poli);
        System.out.println("-- Polideportivo generado exitosamente. --");
    }

    public void crearEdificioDeOficinas (){

        EdificioDeOficinas edificio = new EdificioDeOficinas();
        System.out.print("Nombre del edificio: ");
        edificio.setNombre(scanner.nextLine());
        System.out.print("Ancho: ");
        edificio.setAncho(scanner.nextDouble());
        System.out.print("Largo: ");
        edificio.setLargo(scanner.nextDouble());
        System.out.print("Alto: ");
        edificio.setAlto(scanner.nextDouble());
        System.out.print("Cantidad de oficinas por piso: ");
        edificio.setCantidadDeOficinas(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Cantidad de personas por oficina: ");
        edificio.setCantidadDePersonasPorOficina(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Numero de pisos: ");
        edificio.setNumeroDePisos(scanner.nextInt());
        scanner.nextLine();
        establecerTotalDePersonasEnEdificio(edificio);

        edificiosDeOficinas.add(edificio);
        System.out.println("-- Edificio generado exitosamente. --");
    }

    public void mostrarEdificio(){

        boolean volverAMostrar = true;

        do {
            System.out.println("\nElija el edificio a mostrar: \n");
            System.out.println("1 | Polideportivo");
            System.out.println("2 | Edificio de oficinas");
            System.out.println("0 | Volver al menu\n");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    mostrarPolideportivos(polideportivos);
                    break;
                case 2:
                    mostrarEdificiosDeOfinas(edificiosDeOficinas);
                    break;
                case 0:
                    volverAMostrar = false;
                    break;
            }
        } while (volverAMostrar);
    }

    public void mostrarPolideportivos(ArrayList<Polideportivo> polis){

        if (polis.isEmpty()) {
            System.out.println("Aun no hay polideportivos ingresados.");
        } else {
            for(Polideportivo polideportivo : polis){
                System.out.println(polideportivo + " ");
            }
        }
    }

    public void mostrarEdificiosDeOfinas(ArrayList<EdificioDeOficinas> edificios){

        if (edificios.isEmpty()) {
            System.out.println("Aun no hay edificios de oficinas ingresados.");
        } else {
            for(EdificioDeOficinas edificio : edificios){
                System.out.println(edificio + " ");
            }
        }
    }

    public void establecerTotalDePersonasEnEdificio(EdificioDeOficinas edificio){

        int totalPersonasEnPiso = edificio.getCantidadDePersonasPorOficina()*edificio.getCantidadDeOficinas();
        int totalPersonasEnEdificio = totalPersonasEnPiso*edificio.getNumeroDePisos();
        System.out.println("(Total de personas en el edificio: "+totalPersonasEnEdificio+")");
    }


}
