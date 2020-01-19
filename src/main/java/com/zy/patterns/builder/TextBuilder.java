package com.zy.patterns.builder;

public class TextBuilder implements Builder {

    private StringBuilder buffer = new StringBuilder();

    @Override
    public void makeTitle(String title) {
        buffer.append("===================================").append('\n');
        buffer.append("[ " + title + " ]").append('\n').append('\n');
    }

    @Override
    public void makeString(String str) {
        buffer.append("*" + str).append('\n').append('\n');
    }

    @Override
    public void makeItems(String[] items) {
        for (int i = 0; i < items.length; i++) {
            buffer.append(" ." + items[i]).append('\n');
        }
        buffer.append('\n');
    }

    @Override
    public void close() {
        buffer.append("===================================").append('\n');
    }

    public String getResult() {
        return buffer.toString();
    }

}
