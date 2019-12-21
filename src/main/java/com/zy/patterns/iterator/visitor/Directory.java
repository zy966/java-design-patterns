package com.zy.patterns.iterator.visitor;


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
//        int size = 0;
//        Iterator<Entry> iterator = iterator();
//        while (iterator.hasNext()) {
//            Entry entry = iterator.next();
//            size += entry.getSize();
//        }
//        return size;
        SizeVisitor visitor = new SizeVisitor();
        accept(visitor);
        return visitor.getSize();
    }

    @Override
    public void add(Entry entry) {
        dir.add(entry);
    }

    @Override
    public Iterator<Entry> iterator() {
        return dir.iterator();
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
