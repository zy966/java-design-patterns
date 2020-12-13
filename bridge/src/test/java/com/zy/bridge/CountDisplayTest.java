package com.zy.bridge;

import org.junit.Test;

public class CountDisplayTest {

    @Test
    public void stringDisplay() throws Exception {
        CountDisplay display = new CountDisplay(new StringDisplayImpl("Hello world!"));
        display.display();
        display.multiDisplay(5);
    }

    @Test
    public void testDisplay() throws Exception {
        CountDisplay display = new CountDisplay(new FileDisplayImpl("C:\\Users\\Administrator\\Desktop\\中间件信息.txt"));
        display.multiDisplay(2);
    }

}
