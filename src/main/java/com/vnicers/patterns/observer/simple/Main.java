package com.vnicers.patterns.observer.simple;

import com.vnicers.patterns.observer.simple.subject.ConcreteSubject;
import com.vnicers.patterns.observer.simple.subject.Subject;

public class Main {
    public static void main(String[] args) {
        Subject subject=new ConcreteSubject();

        subject.registObserver(new ConcreteObserver("xxx"));
        subject.registObserver(new ConcreteObserver("yyy"));
        subject.registObserver(new ConcreteObserver("zzz"));

        subject.notifyObservers("aaa");
    }
}
