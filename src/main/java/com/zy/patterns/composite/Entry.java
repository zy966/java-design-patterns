package com.zy.patterns.composite;

import java.util.Objects;

public abstract class Entry {

    protected Entry parent;

    public abstract String getName();

    public abstract int getSize();

    public void printList() {
        printList("");
    }

    protected abstract void printList(String prefix);

    public Entry add(Entry entry) {
        throw new FileTreatmentException();
    }

    public String getFullName() {
        StringBuilder sb = new StringBuilder();
        Entry entry = this;
        do {
            sb.insert(0, "/" + entry.getName());
            entry = entry.parent;
        } while (Objects.nonNull(entry));
        return sb.toString();
    }

    @Override
    public String toString() {
        return getName() + "(" + getSize() + ")";
    }

}
