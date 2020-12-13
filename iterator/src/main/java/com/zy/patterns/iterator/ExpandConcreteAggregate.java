package com.zy.patterns.iterator;

import java.util.ArrayList;
import java.util.List;

public class ExpandConcreteAggregate implements Aggregate {

    private List<String> data;

    public ExpandConcreteAggregate() {
        data = new ArrayList<>();
    }

    @Override
    public Iterator<String> iterator() {
        return new ExpandConcreteIterator(this);
    }

    public void append(String str) {
        data.add(str);
    }

    public int getLength() {
        return data.size();
    }

    public String getIndex(int i) {
        return data.get(i);
    }
}
