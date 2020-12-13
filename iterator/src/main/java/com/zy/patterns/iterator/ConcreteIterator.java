package com.zy.patterns.iterator;

public class ConcreteIterator implements Iterator<String> {

    private int index;

    private ConcreteAggregate aggregate;

    public ConcreteIterator(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public boolean hasNext() {
        return index < aggregate.getLength();
    }

    @Override
    public String next() {
        return aggregate.getIndex(index++);
    }

}
