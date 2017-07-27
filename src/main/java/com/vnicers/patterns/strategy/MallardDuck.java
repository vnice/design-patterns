package com.vnicers.patterns.strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MallardDuck extends Duck {


    @Override
    void display() {
        log.info("I am a real Mallard ducl ");
    }
}
