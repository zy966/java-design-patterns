package com.zy.patterns.strategy;

import org.junit.Test;

public class PlayerTest {

    @Test
    public void play() {
        Player li = new Player("Li", new WinningStrategy());
        Player sa = new Player("Sa", new ProStrategy());

        for (int i = 0; i < 100; i++) {
            Hand liHand = li.nextHand();
            Hand saHand = sa.nextHand();

            if (liHand.isStrongerThan(saHand)) {
                li.win();
                sa.lose();
                System.out.println("Winner: " + li);
            } else if (saHand.isStrongerThan(liHand)) {
                sa.win();
                li.lose();
                System.out.println("Winner: " + sa);
            } else {
                li.even();
                sa.even();
                System.out.println("Even");
            }
        }

        System.out.println("Result: ");
        System.out.println(li);
        System.out.println(sa);

    }

}
