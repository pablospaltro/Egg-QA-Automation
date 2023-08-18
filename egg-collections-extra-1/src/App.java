import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner leer = new Scanner(System.in);
        double suma = 0, pormedio;
        Integer num = 0;
        ArrayList<Integer> lista = new ArrayList<>();
        do {
            System.out.println("Esriba un numero");
            num = leer.nextInt();

            if (num != -99) {
                lista.add(num);
                suma += num;

            } else {
                break;
            }
        } while (true);

        System.out.println("La cantidad de numeros ingresados es: " + lista.size());
        System.out.println("La suma de los numeros ingresados es: " + suma);
        System.out.println("El promedio de los numeros ingreados es: " + suma / lista.size());
        System.out.println("Los numeros ingresados son: " + lista.toString());
    }

}
