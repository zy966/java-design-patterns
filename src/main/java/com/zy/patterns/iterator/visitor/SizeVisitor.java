package com.zy.patterns.iterator.visitor;


import java.util.Iterator;

public class SizeVisitor implements Visitor {

    private int size;

    @Override
    public void visit(File file) {
        size += file.getSize();
    }

    @Override
    public void visit(Directory directory) {
        Iterator<Entry> iterator = directory.iterator();
        while (iterator.hasNext()) {
            Entry entry = iterator.next();
            entry.accept(this);
        }
    }

    public int getSize() {
        return size;
    }

}
