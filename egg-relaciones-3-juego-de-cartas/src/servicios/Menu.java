package servicios;

import java.util.Scanner;

public class Menu {

    JuegoServicio juego = new JuegoServicio();
    Scanner scan = new Scanner(System.in);

    public void ejecutarMenu() {
        juego.crearPalo();
        juego.crearMazo();
        int opc;
        boolean volverAlMenu = true;

        do {
            System.out.println("\n| C | A | R | T | A | S |");
            System.out.println("1 | Cantidad de cartas");
            System.out.println("2 | Barajar");
            System.out.println("3 | Ver el mazo");
            System.out.println("4 | Ver mis cartas");
            System.out.println("5 | Pedir una carta");
            System.out.println("6 | Pedir varias cartas");
            System.out.println("0 | Salir");
            opc = scan.nextInt();

            switch (opc) {
                case 1:
                    juego.cartasDisponibles();
                    break;
                case 2:
                    juego.barajar();
                    break;
                case 3:
                    juego.mostrarBaraja();
                    break;
                case 4:
                    juego.cartasMonton();
                    break;
                case 5:
                    juego.mostrarPrimeraCarta();
                    break;
                case 6:
                    juego.darCartas();
                    break;
                case 0:
                    System.out.println("\nSaliendo...\nAdiós!");
                    volverAlMenu = false;
                    break;
            }
        } while (volverAlMenu);
    }
}
