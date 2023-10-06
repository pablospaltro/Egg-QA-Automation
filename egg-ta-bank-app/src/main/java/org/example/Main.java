package org.example;
//import lombok.Data;

import org.example.entidades.Usuario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        Usuario usuario1 = new Usuario("Roberto", "contrasenia", 1000);

        String usuarioNombre = usuario1.getUsuarioNombre();
        String usuarioPassword = usuario1.getUsuarioPassword();
        int usuarioFondos = usuario1.getUsuarioFondos();

        System.out.println("Ingrese su contrasenia: ");
        String contraIngresada = leer.nextLine();

        if (contraIngresada.equalsIgnoreCase(usuarioPassword)){

            System.out.println("Bienvenido, "+usuarioNombre);
            boolean volverAlMenu = true;

            while(volverAlMenu){
                System.out.println("Qué haremos hoy?");
                System.out.println("1 | Depositar");
                System.out.println("2 | Retirar");
                System.out.println("3 | Transferir dinero a otra cuenta");
                System.out.println("0 | Salir");
                int opcion = leer.nextInt();
                leer.nextLine();

                switch(opcion){
                    case 1:
                        System.out.println("Ingrese la cantidad a depositar: ");
                        int cantidadIngresada = leer.nextInt();
                        leer.nextLine();
                        usuarioFondos += cantidadIngresada;
                        System.out.println("Trascacción exitosa!");
                        System.out.println("Total actual de fondos: "+usuarioFondos);
                        break;
                    case 2:
                        System.out.println("Ingrese la cantidad a retirar: ");
                        int cantidadARetirarIngresada = leer.nextInt();
                        leer.nextLine();
                        if (usuarioFondos >= cantidadARetirarIngresada){
                            usuarioFondos -= cantidadARetirarIngresada;
                            System.out.println("Transacción exitosa!");
                            System.out.println("Cantidad retirada: "+cantidadARetirarIngresada);
                            System.out.println("Saldo actual: "+usuarioFondos);
                            break;
                        } else {
                            System.out.println("Fondos insuficientes");
                            break;
                        }
                    case 3:
                        System.out.println("Ingrese la cantidad a transferir: ");
                        int cantidadATransferir = leer.nextInt();
                        leer.nextLine();
                        if (usuarioFondos >= cantidadATransferir){
                            usuarioFondos -= cantidadATransferir;
                            System.out.println("Transacción exitosa!");
                            System.out.println("Cantidad transferida: "+cantidadATransferir);
                            System.out.println("Saldo actual: "+usuarioFondos);
                            break;
                        } else {
                            System.out.println("Fondos insuficientes");
                            break;
                        }
                    case 0:
                        System.out.println("Saliendo...");
                        volverAlMenu=false;
                        break;

                }
            }

        }


    }
}