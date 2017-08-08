package com.vnicers.patterns.factory;

import com.vnicers.patterns.factory.abstractx.NYPizzaIngredientFactory;
import com.vnicers.patterns.factory.abstractx.PizzaIngredientFactory;
import com.vnicers.patterns.factory.entity.CheesePizza;
import com.vnicers.patterns.factory.entity.ClamPizza;
import com.vnicers.patterns.factory.entity.Pizza;

public class NYPizzaStore extends AbstractPizzaStore {

    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza=null;
        PizzaIngredientFactory ingredientFactory=new NYPizzaIngredientFactory();
        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (item.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        }
        return pizza;
    }
}
