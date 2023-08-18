package servicios;

import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import entidades.Persona;

public class PersonaServicio {

    public void crearPersona(Persona persona) throws ParseException {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        SimpleDateFormat fechaIngresada;
        int dia, mes, anio;

        System.out.print("Ingrese el nombre: ");
        persona.setNombre(leer.next());

        // System.out.print("Ingrese el fecha de nacimiento: ");
        // persona.setFecha(leer.);
        /*
         * System.out.println("Día de nacimiento: ");
         * dia = leer.nextInt();
         * System.out.println("Mes de nacimiento: ");
         * mes = leer.nextInt();
         * System.out.println("Año de nacimiento: ");
         * anio = leer.nextInt();
         */

        // SimpleDateFormat dateFormat = new SimpleDateFormat("DD/MM/AAAA");
        // fechaIngresada = new SimpleDateFormat(anio-1900, mes-1, dia);
        // fechaIngresada = new SimpleDateFormat();
        SimpleDateFormat sdf = new SimpleDateFormat();

        System.out.print("Ingrese la fecha de nacimiento: ");
        String dateInString = leer.nextLine();
        Date fecha = sdf.parse(dateInString);
        persona.setFecha(fecha);

        // Date fecha = sdf.parse(dateInString);

    }

    public void mostrarPersona(Persona persona) {

        System.out.println(persona.toString());

    }

}
