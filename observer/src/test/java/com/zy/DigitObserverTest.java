package com.zy;

import com.zy.patterns.observer.DigitObserver;
import com.zy.patterns.observer.Observer;
import com.zy.patterns.observer.Person;
import org.junit.Test;

public class DigitObserverTest {

    @Test
    public void main() throws Exception {
        Person p = new Person();
        Observer<Person> observer= new DigitObserver();
        p.addObserver(observer);
        for (int i = 0; i < 15; i++) {
            p.increasesSpeed();
            Thread.sleep(1000);
        }
        for (int i = 0; i < 15; i++) {
            p.reducesSpeed();
            Thread.sleep(1000);
        }
    }

}
