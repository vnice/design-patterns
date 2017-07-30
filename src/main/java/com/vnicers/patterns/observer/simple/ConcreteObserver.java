package com.vnicers.patterns.observer.simple;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
public class ConcreteObserver implements Observer{

    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(Object arg) {
        log.info("ConcreteObserver update :{}",arg);
    }


}
