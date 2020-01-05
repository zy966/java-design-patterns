package com.zy.patterns.abstractfactory;

public abstract class Link extends Item {

    protected String url;

    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }

}
