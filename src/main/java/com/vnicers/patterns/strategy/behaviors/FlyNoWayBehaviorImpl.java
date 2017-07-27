package com.vnicers.patterns.strategy.behaviors;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FlyNoWayBehaviorImpl implements FlyBehavior {

    @Override
    public void fly() {
        log.info("I canot fly!");
    }
}
