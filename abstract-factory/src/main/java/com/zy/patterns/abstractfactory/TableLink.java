package com.zy.patterns.abstractfactory;

public class TableLink extends Link {
    public TableLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHtml() {
        return "  <td><a href=\"" + url + "\">" + caption + "</a></td>\n";
    }
}
