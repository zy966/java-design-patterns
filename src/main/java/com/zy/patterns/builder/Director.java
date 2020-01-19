package com.zy.patterns.builder;

public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.makeTitle("Greeting");
        builder.makeString("Morning");
        builder.makeItems(new String[]{"Good morning.", "早上好。"});
        builder.makeString("Afternoon");
        builder.makeItems(new String[]{"Good afternoon.", "中午好。"});
        builder.makeString("Evening");
        builder.makeItems(new String[]{"Good evening.", "晚上好。"});
        builder.close();
    }

}
