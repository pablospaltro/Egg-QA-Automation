import servicios.RaicesServicio;
import entidades.Raices;
import servicios.RaicesServicio;

public class App {
    public static void main(String[] args) throws Exception {

        Raices raiz1 = new Raices();
        RaicesServicio servi = new RaicesServicio();

        servi.crearRaiz(raiz1);
        servi.obtenerRaices(raiz1);

    }
}
