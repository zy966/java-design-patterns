package com.zy.patterns.strategy;

public interface Strategy {

    Hand nextHand();

    void study(boolean win);

}
