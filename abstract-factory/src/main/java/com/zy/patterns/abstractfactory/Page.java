package com.zy.patterns.abstractfactory;

import java.util.ArrayList;
import java.util.List;

public abstract class Page {

    protected String title;

    protected String author;

    protected List<Item> content = new ArrayList<>();

    public Page(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void add(Item item) {
        content.add(item);
    }

    public void output(PageWriter writer) {
        String fileName = title + ".html";
        writer.write(fileName, makeHtml());
        System.out.println(fileName + "编写完成");

    }

    public abstract String makeHtml();

}
