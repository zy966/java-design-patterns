package com.zy.patterns.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Directory extends Entry {

    private String name;

    private List<Entry> dir = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size = 0;
        Iterator<Entry> iterator = dir.iterator();
        while (iterator.hasNext()) {
            Entry entry = iterator.next();
            size += entry.getSize();
        }
        return size;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
        Iterator<Entry> iterator = dir.iterator();
        while (iterator.hasNext()) {
            Entry entry = iterator.next();
            entry.printList(prefix + "/" + getName());
        }
    }

    @Override
    public Entry add(Entry entry) {
        dir.add(entry);
        entry.parent = this;
        return this;
    }

}
