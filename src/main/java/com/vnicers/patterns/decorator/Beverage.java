package com.vnicers.patterns.decorator;

public abstract class Beverage {
    private String description="Unknow Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
