package com.zy.bridge;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;

public class FileDisplayImpl implements DisplayImpl {

    private String fileName;

    private BufferedReader reader;

    public FileDisplayImpl(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void open() throws Exception {
        reader = new BufferedReader(new FileReader(fileName));
        reader.mark(4096);
    }

    @Override
    public void print() throws IOException {
        reader.reset();
        String line;
        while (Objects.nonNull(line = reader.readLine())) {
            System.out.println(line);
        }
    }

    @Override
    public void close() throws IOException {
        reader.close();
    }
}
