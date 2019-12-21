package com.zy.patterns.iterator.visitor;

public interface Visitor {

    void visit(File file);

    void visit(Directory directory);

}
