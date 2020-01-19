package com.zy.patterns.builder;

import org.junit.Test;

public class TextBuilderTest {

    @Test
    public void build() {
        TextBuilder builder = new TextBuilder();
        Director director = new Director(builder);
        director.construct();
        System.out.println(builder.getResult());
    }

}
