package com.zy.patterns.iterator.visitor;

public interface Element {

    void accept(Visitor visitor);

}
