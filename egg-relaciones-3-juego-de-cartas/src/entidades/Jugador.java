package entidades;

import java.util.List;

public class Jugador {

    private List<Carta> cartasEnMano;

    public Jugador() {
    }

    public Jugador(List<Carta> cartasEnMano) {
        this.cartasEnMano = cartasEnMano;
    }

    public List<Carta> getCartasEnMano() {
        return cartasEnMano;
    }

    public void setCartasEnMano(List<Carta> cartasEnMano) {
        this.cartasEnMano = cartasEnMano;
    }

    @Override
    public String toString() {
        return "Jugador [cartasEnMano=" + cartasEnMano + "]";
    }
}
