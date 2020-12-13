package com.zy.bridge;

import org.junit.Test;

public class RandomDisplayTest {

    @Test
    public void display() throws Exception {
        RandomDisplay display = new RandomDisplay(new StringDisplayImpl("Hello world!"));
        display.display();
        display.multiDisplay(5);
        display.randomDisplay(5);
    }

}
