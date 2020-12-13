package com.zy.bridge;

import java.util.Random;

public class RandomDisplay extends CountDisplay {

    public RandomDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void randomDisplay(int times) throws Exception {
        multiDisplay(new Random().nextInt(times));
    }

}
