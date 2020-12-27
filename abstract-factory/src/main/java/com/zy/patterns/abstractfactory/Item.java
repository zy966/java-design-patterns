package com.zy.patterns.abstractfactory;

public abstract class Item {

    protected String caption;

    public Item(String caption) {
        this.caption = caption;
    }

    public abstract String makeHtml();

}
