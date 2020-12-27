package com.zy.patterns.facade;

import java.io.Closeable;
import java.io.IOException;
import java.io.Writer;

public class HtmlWriter implements Closeable {

    private Writer writer;

    public HtmlWriter(Writer writer) {
        this.writer = writer;
    }

    @Override
    public void close() throws IOException {
        writer.write("</body>\n");
        writer.write("</html>\n");
        writer.close();
    }

    public void title(String title) throws IOException {
        writer.write("<html>");
        writer.write("<head>");
        writer.write("<title>" + title + "</title>");
        writer.write("</head>");
        writer.write("<body>\n");
        writer.write("<h1>" + title + "<h1>\n");
    }

    public void mailto(String mailAddress) throws IOException {
        writer.write("<h1>" + mailAddress + "<h1>\n");
    }

}
