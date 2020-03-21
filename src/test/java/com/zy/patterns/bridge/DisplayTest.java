package com.zy.patterns.bridge;

import org.junit.Test;

public class DisplayTest {

    @Test
    public void stringDisplay() throws Exception {
        Display display = new Display(new StringDisplayImpl("Hello world!"));
        display.display();
    }

    @Test
    public void testDisplay() throws Exception {
        Display display = new Display(new FileDisplayImpl("C:\\Users\\Administrator\\Desktop\\中间件信息.txt"));
        display.display();
    }

}
