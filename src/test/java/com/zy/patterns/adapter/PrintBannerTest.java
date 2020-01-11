package com.zy.patterns.adapter;

import org.junit.Test;

public class PrintBannerTest {

    @Test
    public void printWeak() {
        Banner banner = new Banner("Hello");
        Print print = new PrintBanner(banner);
        print.printWeak();
    }

    @Test
    public void printStrong() {
        Banner banner = new Banner("Hello");
        Print print = new PrintBanner(banner);
        print.printStrong();
    }

}
