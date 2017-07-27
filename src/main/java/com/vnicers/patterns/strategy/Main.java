package com.vnicers.patterns.strategy;

import com.vnicers.patterns.strategy.behaviors.FlyNoWayBehaviorImpl;
import com.vnicers.patterns.strategy.behaviors.MuteQuackBehaviorImpl;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {
        Duck duck=new MallardDuck();

        log.info("默认行为>>>>>>>.");

        duck.display();
        duck.performFly();
        duck.performQuack();

        log.info("动态改变行为>>>>>>>.");

        duck.setFlyBehavior(new FlyNoWayBehaviorImpl());
        duck.setQuackBehavior(new MuteQuackBehaviorImpl());


        duck.display();
        duck.performFly();
        duck.performQuack();
    }
}
