package servicios;

import entidades.Cine;
import entidades.Espectador;
import entidades.Pelicula;

public class CineServicio {


    private Cine cine;

    public CineServicio() {

        Pelicula peli = new Pelicula("Barbie", 1.5, "Anderson", 13);
        int precio = 900;
        cine = new Cine(peli, 900);

    }

    public void crearSala() {

        Espectador[][] sala = new Espectador[8][6];

        String columna = "";
        int minimo = 6;
        int maximo = 80;
        int minimo1 = 200;
        int maximo1 = 8000;

        for (int i = 0; i < sala.length; i++) {
            for (int j = 0; j < sala[i].length; j++) {

                switch (j) {
                    case 0:
                        columna = "A";
                        break;
                    case 1:
                        columna = "B";
                        break;
                    case 2:
                        columna = "C";
                        break;
                    case 3:
                        columna = "D";
                        break;
                    case 4:
                        columna = "E";
                        break;
                    case 5:
                        columna = "F";
                        break;
                }


                Espectador espectador = generarEspectadorAleatorio(i, j, minimo, maximo, minimo1, maximo1);
                comprobarEdadDinero(espectador, sala, i, j, columna);
            }
        }
        cine.setSala(sala);
    }

    public Espectador generarEspectadorAleatorio(int i, int j, int minimo, int maximo, int minimo1, int maximo1){

        int edad = minimo + (int) (Math.random() * (maximo - minimo + 1));
        int dinero = minimo + (int) (Math.random() * (maximo1 - minimo1 + 1));
        Espectador espectador = new Espectador("Fulano"+String.valueOf(i+1)+String.valueOf(j+1), edad, dinero);

        return espectador;    }

    public void comprobarEdadDinero(Espectador espectador, Espectador[][] sala, int i, int j, String columna){

        if(cine.getPrecio()<= espectador.getDinero() && cine.getPeliculaActual().getEdadMin()<= espectador.getEdad()) {

            sala[i][j] = (espectador);

            if (j != 5) {
                System.out.print(columna + (i + 1)+": X ");
            } else {
                System.out.println(columna + (i + 1)+": X ");
            }
        }else{
            if (j != 5) {
                System.out.print(columna + (i + 1)+":   ");
            } else {
                System.out.println(columna + (i + 1)+":   ");
            }
        }
    }

    public Cine mostrarCine() {


        System.out.println("Pelicula: " + cine.getPeliculaActual().getTitulo());
        System.out.println("Precio: " + cine.getPrecio());

        System.out.println("-------------------SALA-------------------");
        crearSala();
        return cine;
    }
}