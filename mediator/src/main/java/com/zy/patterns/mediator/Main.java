package com.zy.patterns.mediator;

public class Main {

    public static void main(String[] args) {
        LoginFrame mediator = new LoginFrame("Mediator Sample");
        mediator.init();
        mediator.run();
    }

}
