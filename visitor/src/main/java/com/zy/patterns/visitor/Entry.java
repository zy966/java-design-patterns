package com.zy.patterns.visitor;



import com.zy.patterns.composite.FileTreatmentException;

import java.util.Iterator;

public abstract class Entry implements Element {

    public abstract String getName();

    public abstract int getSize();

    public void add(Entry entry) {
        throw new FileTreatmentException();
    }

    public Iterator iterator() {
        throw new FileTreatmentException();
    }

    public String toString() {
        return getName() + "(" + getSize() + ")";
    }
}
