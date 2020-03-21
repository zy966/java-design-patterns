package com.zy.patterns.bridge;

public interface DisplayImpl {

    public void open() throws Exception;

    public void print() throws Exception;

    public void close() throws Exception;
}
