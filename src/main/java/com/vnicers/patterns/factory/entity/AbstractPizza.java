package com.vnicers.patterns.factory.entity;

public abstract class AbstractPizza extends Pizza {
    private String name;
    Dough dough;
    Sauce sauce;
    Cheese cheese;
    Clam clam;

    abstract void prepare();

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "AbstractPizza{" +
                "name='" + name + '\'' +
                ", dough=" + dough +
                ", sauce=" + sauce +
                ", cheese=" + cheese +
                ", clam=" + clam +
                '}';
    }
}
