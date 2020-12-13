package com.zy.patterns.strategy;

import java.util.Random;

public class RandomStrategy implements Strategy{

    private Random random = new Random();

    @Override
    public Hand nextHand() {
        return Hand.getHand(random.nextInt(3));
    }

    @Override
    public void study(boolean win) {
        // Do nothing
    }

}
