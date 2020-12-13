package com.zy.patterns.decorator;

import org.junit.Test;

public class DecoratorTest {

    @Test
    public void display() {
        Display stringDisplay = new StringDisplay("Hello world!");
        Display sideBorder = new SideBorder(stringDisplay, '#');
        Display fullBorder = new FullBorder(sideBorder);

        stringDisplay.show();
        sideBorder.show();
        fullBorder.show();

    }

}
