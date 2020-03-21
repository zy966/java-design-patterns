package com.zy.patterns.bridge;

public class CharDisplayImpl implements DisplayImpl{

    private char head;
    private char body;
    private char foot;

    public CharDisplayImpl(char head, char body, char foot) {
        this.head = head;
        this.body = body;
        this.foot = foot;
    }

    @Override
    public void open() throws Exception {
        System.out.print(head);
    }

    @Override
    public void print() throws Exception {
        System.out.print(body);
    }

    @Override
    public void close() throws Exception {
        System.out.println(foot);
    }

}
