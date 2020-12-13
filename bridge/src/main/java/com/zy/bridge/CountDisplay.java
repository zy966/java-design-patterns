package com.zy.bridge;

public class CountDisplay extends Display {

    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void multiDisplay(int times) throws Exception {
        open();
        try {
            for (int i = 0; i < times; i++) {
                print();
            }
        } finally {
            close();
        }
    }

}
