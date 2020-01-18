package com.zy.patterns.prototype;

public interface Product extends Cloneable{

    void use(String str);

    Product createClone();
}
