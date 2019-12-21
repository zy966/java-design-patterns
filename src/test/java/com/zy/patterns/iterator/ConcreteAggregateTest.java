package com.zy.patterns.iterator;

import com.zy.patterns.iterator.ConcreteAggregate;
import com.zy.patterns.iterator.Iterator;
import org.junit.Test;

public class ConcreteAggregateTest {

    @Test
    public void next() {
        ConcreteAggregate aggregate = new ConcreteAggregate(10);
        aggregate.append("a");
        aggregate.append("b");
        aggregate.append("c");
        Iterator iterator = aggregate.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
