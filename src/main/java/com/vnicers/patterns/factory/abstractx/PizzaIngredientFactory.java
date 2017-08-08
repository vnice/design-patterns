package com.vnicers.patterns.factory.abstractx;

import com.vnicers.patterns.factory.entity.Cheese;
import com.vnicers.patterns.factory.entity.Clam;
import com.vnicers.patterns.factory.entity.Dough;
import com.vnicers.patterns.factory.entity.Sauce;

public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Clam createClam();
}
