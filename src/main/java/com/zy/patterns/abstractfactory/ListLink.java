package com.zy.patterns.abstractfactory;

public class ListLink extends Link {

    public ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHtml() {
        return "  <li><a href=\"" + url + "\">" + caption + "</a></li>\n";
    }

}
