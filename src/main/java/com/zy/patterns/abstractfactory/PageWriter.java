package com.zy.patterns.abstractfactory;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class PageWriter {

    private String storagePath;

    public PageWriter(String storagePath) {
        this.storagePath = storagePath;
    }

    public void write(String fileName, String page) {
        try {
            Writer writer = new FileWriter(storagePath + File.separator + fileName);
            writer.write(page);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
