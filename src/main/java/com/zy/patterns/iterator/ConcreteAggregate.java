package com.zy.patterns.iterator;

public class ConcreteAggregate implements Aggregate<String> {

    private int last;

    private String[] data;

    public ConcreteAggregate(int maxLength) {
        data = new String[maxLength];
    }

    @Override
    public Iterator<String> iterator() {
        return new ConcreteIterator(this);
    }

    public void append(String str) {
        data[last] = str;
        last++;
    }

    public int getLength() {
        return last;
    }

    public String getIndex(int i) {
        return data[i];
    }

}
