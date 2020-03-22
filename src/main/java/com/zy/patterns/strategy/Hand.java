package com.zy.patterns.strategy;

public class Hand {

    public static final int HAND_VALUE_GUU = 0;
    public static final int HAND_VALUE_GHO = 1;
    public static final int HAND_VALUE_PAA = 2;

    private static final Hand[] hands = {
            new Hand(HAND_VALUE_GUU),
            new Hand(HAND_VALUE_GHO),
            new Hand(HAND_VALUE_PAA)
    };

    private static final String[] names = {
            "石头",
            "剪刀",
            "布"
    };

    public static Hand getHand(int handValue) {
        return hands[handValue];
    }

    private int handValue;

    public Hand(int handValue) {
        this.handValue = handValue;
    }

    public boolean isStrongerThan(Hand hand) {
        return compare(hand) == 1;
    }

    public boolean isWeakerThan(Hand hand) {
        return compare(hand) == -1;
    }

    private int compare(Hand hand) {
        if (this == hand) {
            return 0;
        }
        if ((this.handValue + 1) % 3 == hand.handValue) {
            return 1;
        }

        return -1;
    }

    @Override
    public String toString() {
        return names[handValue];
    }
}
