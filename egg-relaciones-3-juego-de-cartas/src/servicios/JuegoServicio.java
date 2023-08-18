package servicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import entidades.Carta;
import entidades.Jugador;

public class JuegoServicio {

    Scanner leer = new Scanner(System.in);
    Jugador jugador = new Jugador();

    List<String> palo;
    List<Carta> cartasSalidas = new ArrayList<>();
    List<Carta> mazo = new ArrayList();

    public void crearPalo() {
        palo = new ArrayList();
        palo.add("Espada");
        palo.add("Basto");
        palo.add("Oro");
        palo.add("Copas");
    }

    public void crearMazo() {
        for (String paloString : palo) {
            for (int i = 1; i <= 12; i++) {
                Carta carta = new Carta();
                if (i != 8 && i != 9) {
                    carta.setNumero(i);
                    carta.setPalo(paloString);
                    mazo.add(carta);
                }
            }
        }
    }

    public void mostrarBaraja() {
        System.out.println("4 |\n" + mazo.toString());
    }

    public void barajar() {
        Collections.shuffle(mazo);
        System.out.println("6 |\nMezclando...\nListo!");
    }

    public Carta siguienteCarta() {
        if (mazo.isEmpty()) {
            System.out.println("No hay más cartas en la baraja.");
            return null;
        }
        return mazo.get(0);
    }

    public void mostrarPrimeraCarta() {
        System.out.println(mazo.get(0));
        cartasSalidas.add(mazo.get(0));
        jugador.setCartasEnMano(cartasSalidas);
        mazo.remove(0);
    }

    public void darCartas() {
        System.out.println("3 |\nCuántas cartas desea?");
        int cantCartas = leer.nextInt();

        if (mazo.size() < cantCartas) {
            System.out.println("No hay cartas suficientes.");
            darCartas();
        } else {
            for (int i = 0; i < cantCartas; i++) {
                System.out.println(mazo.get(0));
                cartasSalidas.add(mazo.get(0));
                jugador.setCartasEnMano(cartasSalidas);
                mazo.remove(0);
            }
        }

    }

    public void cartasDisponibles() {
        System.out.println("1 |");
        System.out.println("Actualmente hay " + mazo.size() + " cartas.");
    }

    public void cartasMonton() {
        System.out.println("5 |\n");
        if (cartasSalidas.size() == 0) {
            System.out.println("No hay cartas salidas.");
        } else {
            System.out.println(jugador.getCartasEnMano());
        }
    }
}
