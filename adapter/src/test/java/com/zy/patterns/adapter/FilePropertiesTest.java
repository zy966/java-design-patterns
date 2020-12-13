package com.zy.patterns.adapter;

import org.junit.Test;

import java.io.IOException;

public class FilePropertiesTest {

    @Test
    public void main() {
        FileIO fileIO = new FileProperties();
        try {
            fileIO.readFromFile("H:/workspace/adapter/fileProperties.txt");
            fileIO.setValue("year", "2020");
            fileIO.setValue("month", "1");
            fileIO.setValue("day", "11");
            fileIO.writeToFile("H:/workspace/adapter/newFileProperties.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
