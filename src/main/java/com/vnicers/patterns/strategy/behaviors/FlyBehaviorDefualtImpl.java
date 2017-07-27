package com.vnicers.patterns.strategy.behaviors;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FlyBehaviorDefualtImpl implements FlyBehavior {

    @Override
    public void fly() {
        log.info("I'am flying !");
    }
}
