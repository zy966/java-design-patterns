package com.zy.bridge;

import org.junit.Test;

public class IncreaseDisplayTest {

    @Test
    public void IncreaseDisplay() throws Exception {
        IncreaseDisplay display = new IncreaseDisplay(new CharDisplayImpl('<', '+', '>'));
        display.increaseDisplay(5);
    }

}
