/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import entities.Familia;
import entities.InformacionVivienda;
import entities.Integrante;
import enums.Paredes;
import enums.Pisos;
import enums.Sexo;
import enums.Vinculos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author brian
 */
public class ServiciosFamilia {

    ArrayList<Familia> familias = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void menuFamilias() {

        boolean volverAlMenu = true;

        do {
            System.out.println("1 | Crear familia");
            System.out.println("2 | Mostrar familias");
            System.out.println("3 | Actualizar familia");
            System.out.println("4 | Eliminar familia");
            System.out.println("0 | Salir");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    crearFamilia();
                    break;
                case 2:
                    mostrarFamilias();
                    break;
                case 3:
                    actualizarFamilia();
                    break;
                case 4:
                    eliminarFamilia();
                    break;
                case 0:
                    System.out.println("Saliendo...\nAdios!");
                    volverAlMenu=false;
                    break;

            }
        } while (volverAlMenu);
    }

    public void crearFamilia() {
        Familia familia = new Familia();

        System.out.println("FAMILIA");
        System.out.println("Direccion: ");
        familia.setDireccion(scanner.nextLine());
        System.out.println("Numero de lote: ");
        familia.setNumeroLote(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Barrio: ");
        familia.setBarrio(scanner.nextLine());
        System.out.println("Localidad: ");
        familia.setLocalidad(scanner.nextLine());
        crearVivienda(familia);
        crearIntegrantes(familia);

        familias.add(familia);
    }

    public void crearVivienda(Familia familia) {
        InformacionVivienda infoVivienda = new InformacionVivienda();
        System.out.println("\nVIVIENDA");
        System.out.println("Numero de dormitorios: ");
        infoVivienda.setNumeroDormitorios(scanner.nextInt());
        scanner.nextLine();

        infoVivienda.setTipoParedes(ingresarTipoPared());
        infoVivienda.setTipoPiso(ingresarTipoPiso());
        infoVivienda.setIluminacion(comprobarSiTieneIluminacion());

        familia.setInfoVivienda(infoVivienda);

    }

    public boolean comprobarSiTieneIluminacion() {
        System.out.println("Tiene iluminacion? S / N");
        String opcion = scanner.nextLine();
        if (opcion.equalsIgnoreCase("s")) {
            return true;
        } else {
            return false;
        }
    }

    public Paredes ingresarTipoPared() {
        System.out.println("Tipo de paredes: \n1 | MATERIAL\n2 | MADERA\n3 | LATA\n4 | OTROS ");
        int paredIngresada = scanner.nextInt();
        scanner.nextLine();

        switch (paredIngresada) {
            case 1:
                return Paredes.MATERIAL;
            case 2:
                return Paredes.MADERA;
            case 3:
                return Paredes.LATA;
            default:
                return Paredes.OTROS;

        }
    }

    public Pisos ingresarTipoPiso() {
        System.out.println("Tipo de piso: \n1 | MOSAICO\n2 | CEMENTO\n3 | TIERRA\n4 | OTROS ");
        int pisoIngresado = scanner.nextInt();
        scanner.nextLine();

        switch (pisoIngresado) {
            case 1:
                return Pisos.MOSAICO;
            case 2:
                return Pisos.CEMENTO;
            case 3:
                return Pisos.TIERRA;
            default:
                return Pisos.OTROS;

        }
    }

    public void crearIntegrantes(Familia familia) {

        System.out.println("\nCuantos integrantes tiene la familia?");
        int cantidadFamiliares = scanner.nextInt();
        scanner.nextLine();

        ArrayList<Integrante> integrantes = new ArrayList<>();

        for(int i=0; i<cantidadFamiliares; i++){

            System.out.println("\nIntegrante "+(i+1)+" :");
            Integrante integrante = new Integrante();

            System.out.println("Nombre: ");
            integrante.setNombre(scanner.nextLine());
            System.out.println("Apellido: ");
            integrante.setApellido(scanner.nextLine());
            System.out.print("Ingrese una fecha en el formato YYYY-MM-DD: ");
            String fechaTexto = scanner.nextLine();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

            try {
                LocalDate fecha = LocalDate.parse(fechaTexto, formatter);
                System.out.println("Fecha ingresada: " + fecha);
            } catch (Exception e) {
                System.out.println("Formato de fecha incorrecto. Asegúrese de usar el formato YYYY-MM-DD.");
            }
            System.out.println("Sexo: M / F");
            integrante.setSexo(Sexo.valueOf(scanner.nextLine().toUpperCase()));
            System.out.println("Vínculo: Madre, Padre, Hijo/a, Abuelo/a");
            integrante.setVinculo(Vinculos.valueOf(scanner.nextLine().toUpperCase()));
            ingresarProblemaDeSalud(integrante);
            ingresarAbordajeNutricional(integrante);

            integrantes.add(integrante);
        }

        familia.setListaIntegrantes(integrantes);
    }

    public void ingresarProblemaDeSalud(Integrante integrante){


    }

    public void ingresarAbordajeNutricional(Integrante integrante){

    }

    public void mostrarFamilias() {
        for (Familia familia : familias) {
            System.out.println(familia + "");
        }

    }

    public void actualizarFamilia() {
        System.out.println("Ingrese el IDE de la familia a actualizar: ");
        int ideIngresado = scanner.nextInt();
        scanner.nextLine();

        for(Familia familia : familias){
            if(familia.getIDE() == ideIngresado){
                System.out.println("Ok, vamos a actualizar: \n"+familia.toString());
                System.out.println("Direccion: ");
                familia.setDireccion(scanner.nextLine());
                System.out.println("Numero de lote: ");
                familia.setNumeroLote(scanner.nextInt());
                scanner.nextLine();
                System.out.println("Barrio: ");
                familia.setBarrio(scanner.nextLine());
                System.out.println("Localidad: ");
                familia.setLocalidad(scanner.nextLine());
                crearVivienda(familia);
                crearIntegrantes(familia);

                familias.add(familia);

            }
        }

    }

    public void eliminarFamilia() {
        System.out.println("Ingrese el IDE de la familia a eliminar: ");
        int ideIngresado = scanner.nextInt();
        scanner.nextLine();

        familias.removeIf(familia -> familia.getIDE() == ideIngresado);
    }
}

