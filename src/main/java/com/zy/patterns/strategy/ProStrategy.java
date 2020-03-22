package com.zy.patterns.strategy;

import java.util.Random;

public class ProStrategy implements Strategy {

    private Random random = new Random();

    private int prevHandValue = 0;
    private int currentHandValue = 0;

    private int[][] history = {
            {1, 1, 1},
            {1, 1, 1},
            {1, 1, 1}
    };

    @Override
    public Hand nextHand() {
        int bet = random.nextInt(sum(currentHandValue));
        if (bet < history[currentHandValue][Hand.HAND_VALUE_GUU]) {
            return getHand(Hand.HAND_VALUE_GUU);
        }
        if (bet < history[currentHandValue][Hand.HAND_VALUE_GUU] + history[currentHandValue][Hand.HAND_VALUE_GHO]) {
            return getHand(Hand.HAND_VALUE_GHO);
        }
        return getHand(Hand.HAND_VALUE_PAA);
    }

    private Hand getHand(int handValue) {
        prevHandValue = currentHandValue;
        currentHandValue = handValue;
        return Hand.getHand(handValue);
    }

    private int sum(int handValue) {
        return history[handValue][Hand.HAND_VALUE_GUU] + history[handValue][Hand.HAND_VALUE_GHO] + history[handValue][Hand.HAND_VALUE_PAA];
    }

    @Override
    public void study(boolean win) {
        if (win) {
            history[prevHandValue][currentHandValue]++;
        } else {
            history[prevHandValue][(currentHandValue + 1) % 3]++;
            history[prevHandValue][(currentHandValue + 2) % 3]++;
        }
    }

}
