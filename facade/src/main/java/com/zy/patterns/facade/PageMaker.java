package com.zy.patterns.facade;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

public class PageMaker {

    private PageMaker() {
    }

    public static void makeWelcomePage() {

        try (HtmlWriter writer = new HtmlWriter(new PrintWriter(System.out));) {
            Properties prop = Database.getProperties();
            String name = prop.getProperty("name");
            String mailAddress = prop.getProperty("mailAddress");
            writer.title(name);
            writer.mailto(mailAddress);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
