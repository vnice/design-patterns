package com.vnicers.patterns.factory;

import com.vnicers.patterns.factory.entity.ChineseStyleCheesePizza;
import com.vnicers.patterns.factory.entity.ChineseStyleClamPizza;
import com.vnicers.patterns.factory.entity.Pizza;

public class ChinesePizzaStore extends AbstractPizzaStore {
    @Override
    protected Pizza createPizza(String type) {

        if ("chesses".equals(type)) {
            return new ChineseStyleCheesePizza();
        } else if ("clam".equals(type)) {
            return new ChineseStyleClamPizza();
        } else {
            return new ChineseStyleCheesePizza();
        }

    }
}
