package com.vnicers.patterns.factory;

import com.vnicers.patterns.factory.entity.Pizza;
import com.vnicers.patterns.factory.simple.SimplePizzaFactory;

public class SimplePizzaStore {
    SimplePizzaFactory simplePizzaFactory;

    public SimplePizzaStore(SimplePizzaFactory factory){
        this.simplePizzaFactory=factory;
    }

    public Pizza orderPizza(String type){
        Pizza pizza=this.simplePizzaFactory.createPizza(type);
        return pizza;
    }
}
