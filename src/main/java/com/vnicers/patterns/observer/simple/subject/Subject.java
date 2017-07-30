package com.vnicers.patterns.observer.simple.subject;

import com.vnicers.patterns.observer.simple.Observer;

import java.util.ArrayList;
import java.util.List;

public interface Subject {

    List<Observer> observers =new ArrayList<>();

    void registObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers(Object arg);
}
