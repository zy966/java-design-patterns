package com.zy.patterns.decorator;

public class FullBorder extends Border {

    public FullBorder(Display display) {
        super(display);
    }

    @Override
    int getColumns() {
        return display.getColumns() + 2;
    }

    @Override
    int getRows() {
        return display.getRows() + 2;
    }

    @Override
    String getRowText(int row) {
        if (0 == row) {
            return "+" + makeLine("-", display.getColumns()) + "+";
        }
        if (display.getRows() + 1 == row) {
            return "+" + makeLine("-", display.getColumns()) + "+";
        }
        return "|" + display.getRowText(row) + "|";
    }

    private String makeLine(String s, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(s);
        }
        return sb.toString();
    }
}
