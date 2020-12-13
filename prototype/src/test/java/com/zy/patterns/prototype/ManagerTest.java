package com.zy.patterns.prototype;

import org.junit.Test;

public class ManagerTest {

    @Test
    public void main() {
        Manager manager = new Manager();
        Product uPen = new UnderLinePen('~');
        Product mBox = new MessageBox('*');
        Product sBox = new MessageBox('/');

        manager.register("strong message", uPen);
        manager.register("warning box", mBox);
        manager.register("slash box", sBox);

        manager.create("strong message").createClone().use("Hello World!");
        manager.create("warning box").createClone().use("Hello World!");
        manager.create("slash box").createClone().use("Hello World!");
    }

}
