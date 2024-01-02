package org.example.services;

import org.example.entities.Rectangulo;

public class RectanguloService {

    public double calcularArea(Rectangulo rectangulo){
        return rectangulo.getAncho() * rectangulo.getLargo();
    }

    public double calcularPerimetro(Rectangulo rectangulo){
        return (rectangulo.getAncho() * 2) + (rectangulo.getLargo() * 2);
    }
}
