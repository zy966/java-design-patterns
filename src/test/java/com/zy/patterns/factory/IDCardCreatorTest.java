package com.zy.patterns.factory;

import org.junit.Test;

public class IDCardCreatorTest {

    @Test
    public void create() {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("Pain");
        Product card2 = factory.create("Luna");
        Product card3 = factory.create("Lina");
        card1.use();
        card2.use();
        card3.use();
    }

}
