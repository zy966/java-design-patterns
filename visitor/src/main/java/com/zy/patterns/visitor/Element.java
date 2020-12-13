package com.zy.patterns.visitor;

public interface Element {

    void accept(Visitor visitor);

}
