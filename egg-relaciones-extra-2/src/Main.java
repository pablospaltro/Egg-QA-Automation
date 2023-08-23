import entidades.Cine;
import servicios.CineServicio;

public class Main {
    public static void main(String[] args) {


        CineServicio cS= new CineServicio();
        Cine cine;
        cine= cS.mostrarCine();
        System.out.println(cine.getSala()[3][4].toString());


    }
}