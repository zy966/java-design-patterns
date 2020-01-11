package com.zy.patterns.adapter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class FileProperties implements FileIO {

    private Properties properties = new Properties();

    @Override
    public void readFromFile(String fileName) throws IOException {
        try (FileReader reader = new FileReader(fileName)) {
            properties.load(reader);
        }
    }

    @Override
    public void writeToFile(String fileName) throws IOException {
        try (FileWriter writer = new FileWriter(fileName)) {
            properties.store(writer, "");
        }
    }

    @Override
    public void setValue(String key, String value) {
        properties.setProperty(key, value);
    }

    @Override
    public String getValue(String key) {
        return properties.getProperty(key);
    }

}
