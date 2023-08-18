import servicios.AlumnoService;
import servicios.Menu;

public class App {
    public static void main(String[] args) throws Exception {

        /*
         * AlumnoService alumServi = new AlumnoService();
         * 
         * alumServi.crearAlumno();
         * alumServi.mostrarAlumnos();
         * alumServi.notaFinal();
         */

        Menu menu = new Menu();

        menu.MenuAlumnos();

    }
}
