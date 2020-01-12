package com.zy.aptterns.template;

import com.zy.patterns.template.AbstractDisplay;
import com.zy.patterns.template.CharDisplay;
import org.junit.Test;

public class CharDisplayTest {

    @Test
    public void display() {
        AbstractDisplay display = new CharDisplay('z');
        display.display();
    }

}
