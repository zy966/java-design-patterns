package com.zy.patterns.adapter;

/**
 * Adapter
 */
public class PrintBanner implements Print {

    private Banner banner;

    public PrintBanner(Banner banner) {
        this.banner = banner;
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }

}
