package com.zy.patterns.bridge;

public class Display {

    private DisplayImpl impl;

    public Display(DisplayImpl impl) {
        this.impl = impl;
    }

    protected void open() throws Exception {
        impl.open();
    }

    protected void print() throws Exception {
        impl.print();
    }

    protected void close() throws Exception {
        impl.close();
    }

    public final void display() throws Exception {
        open();
        try {
            print();
        } finally {
            close();
        }
    }

}
