/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.jml.electrodomesticos;

/**
 *
 * @author jmlucero
 */
public class Main {

    public static void main(String[] args) {
         
        Electrodomestico electro = new Electrodomestico(25.52, Color.ROJO,'C',30.0);
        electro.comprobarColor("BLANCO");
        electro.precioFinal();
    }
}
