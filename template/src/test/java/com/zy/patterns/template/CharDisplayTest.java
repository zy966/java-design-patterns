package com.zy.patterns.template;

import org.junit.Test;

public class CharDisplayTest {

    @Test
    public void display() {
        AbstractDisplay display = new CharDisplay('z');
        display.display();
    }

}
