package com.zy.patterns.decorator;

public class StringDisplay extends Display {

    private String str;

    public StringDisplay(String str) {
        this.str = str;
    }

    @Override
    int getColumns() {
        return str.length();
    }

    @Override
    int getRows() {
        return 1;
    }

    @Override
    String getRowText(int row) {
        return str;
    }

}
