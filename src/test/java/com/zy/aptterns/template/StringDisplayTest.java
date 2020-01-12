package com.zy.aptterns.template;

import com.zy.patterns.template.AbstractDisplay;
import com.zy.patterns.template.StringDisplay;
import org.junit.Test;

public class StringDisplayTest {

    @Test
    public void display() {
        AbstractDisplay display = new StringDisplay("Hello world!");
        display.display();
    }

}
