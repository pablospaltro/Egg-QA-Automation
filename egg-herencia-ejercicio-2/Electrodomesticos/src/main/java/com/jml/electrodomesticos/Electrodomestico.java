package com.jml.electrodomesticos;

import java.util.Arrays;

public class Electrodomestico  {

    protected double precio;

    protected Color color;

    protected Consumo consumo;

    protected double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, Color color, char letra, double peso) {
        this.precio = precio;
        this.color = color;
        comprobarConsumoEnergetico(letra);
        this.peso = peso;
    }
    
    

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Consumo getConsumo() {
        return consumo;
    }

    public void setConsumo(Consumo consumo) {
        this.consumo = consumo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
/*Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
objeto y no será visible.*/
    
   
    private void comprobarConsumoEnergetico(char letra) {
        
        boolean verdadero = false;
         for (Consumo value : Consumo.values()) {
          
             if(value.name().equals(String.valueOf(letra))){
                 consumo=value;
                 System.out.println("Consumo asignado");
                 verdadero = true;
             }
            
        }
         if(!verdadero) {
         System.out.println("La letra del consumo no estaba disponible");
         consumo=Consumo.F;
         }
    }

    public void comprobarColor(String colorParam) {
        boolean verdadero = false;
         for (Color value : Color.values()) {
          
             if(value.name().equals(String.valueOf(colorParam))){
                 color=value;
                 System.out.println("Color asignado");
                 verdadero = true;
             }
            
        }
         if(!verdadero) {
         System.out.println("EL color no estaba disponible");
         consumo=Consumo.F;
         }
    }

    public void precioFinal() {
        
        double precioBase = 1000;
        double precioSegunLetra=consumo.getConsumo(consumo);
        double sobrePrecio=0.0;
        if(peso<=19) {
            sobrePrecio=100.0;
        } else if (peso>19 && peso <=49) {
        sobrePrecio=500.0;
        } else if (peso>49 && peso<=79) {
            sobrePrecio= 800.0;
        } else if(peso>79) {
            sobrePrecio = 1000.0;
        }
        System.out.println("EL PRECIO FINAL ES: "+(precioBase+precioSegunLetra+sobrePrecio));
        
    }
        
 
}
