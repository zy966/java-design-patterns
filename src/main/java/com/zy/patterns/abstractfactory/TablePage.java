package com.zy.patterns.abstractfactory;

public class TablePage extends Page {
    public TablePage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHtml() {
        StringBuilder buffer = new StringBuilder();
        buffer.append("<html><head><title>" + title + "</title></head>\n");
        buffer.append("<body>\n");
        buffer.append("<h1>" + title + "</h1>\n");
        buffer.append("<table width=\"80%\" border=\"3\">\n");
        for (Item item : content) {
            buffer.append(item.makeHtml());
        }
        buffer.append("</table>\n");
        buffer.append("<hr><address>" + author + "</address>");
        buffer.append("</body></html>\n");

        return buffer.toString();
    }
}
