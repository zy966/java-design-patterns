package com.zy.patterns.builder;

public class HtmlBuilder implements Builder {

    private StringBuilder buffer = new StringBuilder();

    @Override
    public void makeTitle(String title) {
        buffer.append("<html>").append('\n');
        buffer.append("<head><tile>" + title + "</tile></head>").append('\n');
        buffer.append("<body>").append('\n');
        buffer.append("<hl>" + title + "</hl>").append('\n');
    }

    @Override
    public void makeString(String str) {
        buffer.append("<p>" + str + "</p>").append('\n');
    }

    @Override
    public void makeItems(String[] items) {
        buffer.append("<ul>").append('\n');
        for (String item : items) {
            buffer.append("<li>" + item + "</li>").append('\n');
        }
        buffer.append("</ul>").append('\n');
    }

    @Override
    public void close() {
        buffer.append("</body></html>").append('\n');
    }

    public String getResult() {
        return buffer.toString();
    }

}
