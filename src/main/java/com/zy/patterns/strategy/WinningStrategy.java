package com.zy.patterns.strategy;

import java.util.Random;

public class WinningStrategy implements Strategy {

    private Random random = new Random();

    private boolean won = false;

    private Hand prevHand;

    @Override
    public Hand nextHand() {
        if (won) {
            return prevHand;
        }

        Hand hand = Hand.getHand(random.nextInt(3));
        prevHand = hand;
        return hand;
    }

    @Override
    public void study(boolean win) {
        won = win;
    }
}
