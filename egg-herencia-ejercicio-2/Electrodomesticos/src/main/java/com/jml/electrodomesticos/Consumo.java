package com.jml.electrodomesticos;

public enum Consumo {

    A (1000.0),
    B(800.0),
    C(600.0),
    D(500.0),
    E(300.0),
    F(100.0);
   public final double consumo;

    private Consumo(double consumo) {
        this.consumo = consumo;
    }
    
    public double getConsumo(Consumo consumo) {
        return this.consumo;
    }
    
    
}
