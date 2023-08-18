package servicios;

import java.util.ArrayList;
import java.util.Scanner;

import entidades.Alumno;

public class AlumnoService {

    Scanner leer = new Scanner(System.in);
    ArrayList<Alumno> alumnos = new ArrayList();

    public void crearAlumno() {

        System.out.println("");
        System.out.println("1 | CREAR ALUMNOS");
        String respuesta = null;

        do {
            Alumno alumno = new Alumno();
            System.out.println("");
            System.out.println("ALUMNO");
            System.out.println("Ingrese el nombre del alumno: ");
            alumno.setNombre(leer.nextLine());

            // agregando las notas a un nuevo arrayList local:
            ArrayList<Integer> notas = new ArrayList<>();
            System.out.println("");
            System.out.println("NOTAS");
            System.out.println("Ingrese la primer nota: ");
            notas.add(leer.nextInt());
            leer.nextLine();
            System.out.println("Ingrese la segunda nota: ");
            notas.add(leer.nextInt());
            leer.nextLine();
            System.out.println("Ingrese la tercer nota: ");
            notas.add(leer.nextInt());
            leer.nextLine();

            // pasando las notas del arrayList local al arrayList del alumno:
            alumno.setNotas(notas);

            alumnos.add(alumno);
            System.out.println("");
            System.out.println("Desea agregar otro alumno? S / N ");
            respuesta = leer.nextLine();

        } while (respuesta.equalsIgnoreCase("S"));

    }

    public void mostrarAlumnos() {
        System.out.println("");
        System.out.println("2 | LISTA DE ALUMNOS");
        System.out.println("");
        for (Alumno alumno : alumnos) {
            System.out.println(alumno.toString() + "");
        }
    }

    /*
     * otra forma de pensar los metodos, relacionadolos:
     * 
     * public double notaFinal(String nombre) {
     * Alumno alumno = mostrarAlumno(nombre);
     */

    public void notaFinal() {
        System.out.println("");
        System.out.println("3 | NOTA FINAL");
        System.out.println("");
        System.out.println("Ingrese el nombre del alumno a calcular nota final: ");
        String nombreIngresado = leer.nextLine();

        for (Alumno alumno : alumnos) {
            if (nombreIngresado.equals(alumno.getNombre())) {
                int contador = 0;
                for (Integer nota : alumno.getNotas()) {
                    contador += nota;
                }
                int notaFinal = contador / 3;
                System.out.println("");
                System.out.println("RESULTADOS");
                System.out.println("La nota final de " + alumno.getNombre() + " es: " + notaFinal);
                if (notaFinal < 7) {
                    System.out.println("No promociona, va a examen final");
                } else {
                    System.out.println("Promociona la materia, sin examen final");
                }
            }
        }
    }
}