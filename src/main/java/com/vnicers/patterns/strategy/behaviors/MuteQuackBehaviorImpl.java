package com.vnicers.patterns.strategy.behaviors;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MuteQuackBehaviorImpl implements QuackBehavior {

    @Override
    public void quack() {
        log.info("<< Silence >>");
    }
}
