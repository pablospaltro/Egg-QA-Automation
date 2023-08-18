import entidades.Persona;
import servicios.PersonaServicio;

public class App {
    public static void main(String[] args) throws Exception {

        PersonaServicio serv = new PersonaServicio();
        Persona pers1 = new Persona();

        serv.crearPersona(pers1);
        serv.mostrarPersona(pers1);

    }
}
