package com.zy.patterns.template;

/**
 * ConcreteClass
 */
public class StringDisplay extends AbstractDisplay {

    private String str;

    private int width;

    public StringDisplay(String str) {
        this.str = str;
        this.width = str.length();
    }

    @Override
    protected void open() {
        printLine();
    }

    @Override
    protected void print() {
        System.out.println("|" + str + "|");
    }

    @Override
    protected void close() {
        printLine();
    }

    private void printLine() {
        StringBuilder sb = new StringBuilder(width + 2);
        sb.append("+");
        for (int i = 0; i < width; i++) {
            sb.append("-");
        }
        sb.append("+");
        System.out.println(sb.toString());
    }

}
