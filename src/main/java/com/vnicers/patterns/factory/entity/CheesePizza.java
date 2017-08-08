package com.vnicers.patterns.factory.entity;

import com.vnicers.patterns.factory.abstractx.PizzaIngredientFactory;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CheesePizza extends AbstractPizza {
    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory factory) {
        this.ingredientFactory = factory;
    }

    @Override
    void prepare() {
        log.info("Preparing ....");
        super.dough = this.ingredientFactory.createDough();
        super.cheese = this.ingredientFactory.createCheese();
        super.clam = this.ingredientFactory.createClam();
        super.sauce = this.ingredientFactory.createSauce();
    }
}
