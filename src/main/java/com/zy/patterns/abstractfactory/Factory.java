package com.zy.patterns.abstractfactory;

public abstract class Factory {

    public abstract Link createLink(String caption, String url);

    public abstract Tray createTray(String caption);

    public abstract Page createPage(String title, String author);

    public Page createYahooPage() {
        Link link = createLink("Yahoo", "www.yahoo.com");
        Page page = createPage("Yahoo", "Yahoo");
        page.add(link);
        return page;
    }

}
