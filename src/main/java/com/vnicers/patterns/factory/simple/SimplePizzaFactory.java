package com.vnicers.patterns.factory.simple;

import com.vnicers.patterns.factory.entity.ClamPizza;
import com.vnicers.patterns.factory.entity.GreekPizza;
import com.vnicers.patterns.factory.entity.Pizza;

public class SimplePizzaFactory {
    public Pizza createPizza(String type){
        Pizza pizza=null;
        if("".equals(type)){
            pizza= new CheesePizza();
        }else if ("Clam".equals(type)){
            pizza=new ClamPizza();
        }else if ("Greek".equals(type)){
            pizza=new GreekPizza();
        }
        return pizza;
    }
}
