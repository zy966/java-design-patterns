package com.zy.patterns.visitor;

public interface Visitor {

    void visit(File file);

    void visit(Directory directory);

}
