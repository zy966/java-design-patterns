package com.zy.patterns.builder;

import org.junit.Test;

public class HtmlBuilderTest {

    @Test
    public void build() {
        HtmlBuilder builder = new HtmlBuilder();
        Director director = new Director(builder);
        director.construct();
        System.out.println(builder.getResult());
    }

}
