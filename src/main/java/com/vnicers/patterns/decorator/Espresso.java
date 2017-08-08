package com.vnicers.patterns.decorator;

public class Espresso extends Beverage {
    private Beverage beverage;

    public Espresso(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
