package com.vnicers.patterns.factory;

import com.vnicers.patterns.factory.entity.Pizza;

public abstract class AbstractPizzaStore {
    public final  Pizza orderPizza(String type){
        Pizza pizza=createPizza(type);
        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
