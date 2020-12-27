package com.zy.patterns.abstractfactory;


import org.junit.Test;

public class ListFactoryTest {

    @Test
    public void main() {
        Factory factory = new ListFactory();

        Link people = factory.createLink("人民日报", "www.people.com");
        Link gmw = factory.createLink("光明日报", "www.gmw.com");
        Link yahoo = factory.createLink("雅虎", "www.yahoo.com");
        Link google = factory.createLink("谷歌", "www.google.com");

        Tray news = factory.createTray("日报");
        news.add(people);
        news.add(gmw);

        Tray search = factory.createTray("搜索");
        search.add(yahoo);
        search.add(google);

        Page page = factory.createPage("LinkPage", "zz");
        page.add(news);
        page.add(search);

        PageWriter writer = new PageWriter("H:/workspace/abstractFactoryFile");
        page.output(writer);
    }

    @Test
    public void createYahooPage() {
        Factory factory = new ListFactory();
        Page page = factory.createYahooPage();
        PageWriter writer = new PageWriter("H:/workspace/abstractFactoryFile");
        page.output(writer);
    }

}
