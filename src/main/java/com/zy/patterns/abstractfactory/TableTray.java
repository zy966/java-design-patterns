package com.zy.patterns.abstractfactory;

public class TableTray extends Tray {
    public TableTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHtml() {
        StringBuilder buffer = new StringBuilder();
        buffer.append("<td>\n");
        buffer.append("<table width=\"100%\" border=\"1\"><tr>");
        buffer.append("<td bgcolor=\"#cccccc\" + align=\"center\" colspan=\"" + tray.size() + "\"><b>" + caption + "</b></td>");
        buffer.append("</tr>\n");
        buffer.append("<tr>\n");
        for (Item item : tray) {
            buffer.append(item.makeHtml());
        }
        buffer.append("</tr>\n").append("</td>\n");
        return buffer.toString();
    }
}
