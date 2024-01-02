package org.example.entities;

public class DiscountCalculator {

    public DiscountCalculator() {
    }

    public double discount10Percent(double price){
        return price * 0.9;
    }

    public double discountHalf(double price){
        return price * 0.5;
    }

    public double noDiscount(double price){
        return price;
    }
}
