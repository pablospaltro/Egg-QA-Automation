package servicios;

import java.util.Scanner;

public class Menu {

    Scanner leer = new Scanner(System.in);
    AlumnoService alumServ = new AlumnoService();

    public void MenuAlumnos() {

        boolean volverAlMenu = true;

        while (volverAlMenu) {
            System.out.println("");
            System.out.println("MENU");
            System.out.println("1 | Crear alumno");
            System.out.println("2 | Mostrar alumnos");
            System.out.println("3 | Calcular nota final de un alumno");
            System.out.println("0 | Salir");
            int opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    alumServ.crearAlumno();
                    break;
                case 2:
                    alumServ.mostrarAlumnos();
                    break;
                case 3:
                    alumServ.notaFinal();
                    break;
                case 0:
                    System.out.println("\n Saliendo...\n Adiós!");
                    volverAlMenu = false;
                    break;
            }
        }
    }
}
