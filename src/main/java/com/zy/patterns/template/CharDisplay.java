package com.zy.patterns.template;

/**
 * ConcreteClass
 */
public class CharDisplay extends AbstractDisplay {

    private char c;

    public CharDisplay(char c) {
        this.c = c;
    }

    @Override
    protected void open() {
        System.out.print("<<");
    }

    @Override
    protected void print() {
        System.out.print(c);
    }

    @Override
    protected void close() {
        System.out.print(">>");
    }

}
