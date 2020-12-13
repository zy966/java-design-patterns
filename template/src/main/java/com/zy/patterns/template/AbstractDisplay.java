package com.zy.patterns.template;

/**
 * AbstractClass
 */
public abstract class AbstractDisplay {

    public void display() {
        open();
        print();
        close();
    }

    protected abstract void open();

    protected abstract void print();

    protected abstract void close();

}
