package com.zy.patterns.template;

import org.junit.Test;

public class StringDisplayTest {

    @Test
    public void display() {
        AbstractDisplay display = new StringDisplay("Hello world!");
        display.display();
    }

}
