package com.zy.patterns.visitor;

import java.util.ArrayList;
import java.util.Iterator;

public class ElementArrayList extends ArrayList<Entry> implements Element {

    @Override
    public void accept(Visitor visitor) {
        Iterator<Entry> iterator = iterator();
        while (iterator.hasNext()) {
            Entry entry = iterator.next();
            entry.accept(visitor);
        }
    }

}
