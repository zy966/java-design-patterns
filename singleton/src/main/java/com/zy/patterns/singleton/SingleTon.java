package com.zy.patterns.singleton;

public class SingleTon {

    private static SingleTon instance = new SingleTon();

    private SingleTon() {
    }

    public SingleTon getInstance() {
        return instance;
    }
}
