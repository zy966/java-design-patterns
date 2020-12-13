package com.zy.patterns.prototype;

public class MessageBox implements Product {

    private char decoChar;

    public MessageBox(char decoChar) {
        this.decoChar = decoChar;
    }

    @Override
    public void use(String str) {
        int length = str.length() + 4;
        printLine(length);
        System.out.println(decoChar + " " + str + " " + decoChar);
        printLine(length);
    }

    private void printLine(int length) {
        for (int i = 0; i < length; i++) {
            System.out.print(decoChar);
        }
        System.out.println();
    }

    @Override
    public Product createClone() {
        try {
            return (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return null;
    }
}
