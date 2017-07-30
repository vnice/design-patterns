package com.vnicers.patterns.decorator;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        super.description="House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
