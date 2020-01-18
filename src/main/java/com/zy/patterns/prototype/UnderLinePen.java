package com.zy.patterns.prototype;

public class UnderLinePen implements Product {

    private char ulChar;

    public UnderLinePen(char ulChar) {
        this.ulChar = ulChar;
    }

    @Override
    public void use(String str) {
        int length = str.length();
        System.out.println(str);
        for (int i = 0; i < length; i++) {
            System.out.print(ulChar);
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
