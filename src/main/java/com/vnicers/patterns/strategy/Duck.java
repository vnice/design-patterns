package com.vnicers.patterns.strategy;

import com.vnicers.patterns.strategy.behaviors.FlyBehavior;
import com.vnicers.patterns.strategy.behaviors.FlyBehaviorDefualtImpl;
import com.vnicers.patterns.strategy.behaviors.QuackBehavior;
import com.vnicers.patterns.strategy.behaviors.QuackBehaviorDefaultImpl;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class Duck {

    private FlyBehavior flyBehavior;

    private QuackBehavior quackBehavior;


    public Duck() {
        this.flyBehavior=new FlyBehaviorDefualtImpl();
        this.quackBehavior=new QuackBehaviorDefaultImpl();
    }

    public void performFly(){
        this.flyBehavior.fly();
    }

    public void performQuack(){
        this.quackBehavior.quack();
    }

    public void swim(){
        log.info("All ducks float, event decoys");
    }

    abstract void display();

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
