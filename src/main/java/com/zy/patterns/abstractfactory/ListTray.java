package com.zy.patterns.abstractfactory;

import java.util.List;

public class ListTray extends Tray {

    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHtml() {
        StringBuilder buffer = new StringBuilder();
        buffer.append("<li>\n");
        buffer.append(caption + "\n");
        buffer.append("<ui>\n");
        for (Item item : tray) {
            buffer.append(item.makeHtml());
        }
        buffer.append("</ui>\n").append("</li>\n");
        return buffer.toString();
    }

}
