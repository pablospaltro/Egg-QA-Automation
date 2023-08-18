import java.util.ArrayList;

import entidades.Pelicula;
import servicios.AlquilerService;
import servicios.PeliculaService;

public class App {
    public static void main(String[] args) throws Exception {

        PeliculaService servi = new PeliculaService();
        AlquilerService serviAlqui = new AlquilerService();

        System.out.println("Peliculas creadas: ");
        System.out.println("");
        servi.crearPelicula();
        System.out.println("Mostrando pelis:");
        System.out.println("");

        servi.listarPeliculas();

        System.out.println("");
        System.out.println("");

        serviAlqui.crearAlquiler();
        serviAlqui.listarAlquilers();

        System.out.println("");
        System.out.println("");

        servi.buscarTitulo();

    }
}
