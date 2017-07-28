package com.vnicers.patterns.observer.subject;

import com.vnicers.patterns.observer.Observer;
import lombok.extern.slf4j.Slf4j;


@Slf4j
public class ConcreteSubject implements Subject{

    @Override
    public void registObserver(Observer observer) {
        observers.add(observer);
        log.info("registObserver:{}",observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
        log.info("removeObserver:{}",observer);
    }

    @Override
    public void notifyObservers(Object arg) {
        for (Observer observer : observers) {
            observer.update(arg);
        }
    }
}
