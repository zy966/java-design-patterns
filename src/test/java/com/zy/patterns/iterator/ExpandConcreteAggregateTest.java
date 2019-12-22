package com.zy.patterns.iterator;

import com.zy.patterns.iterator.ExpandConcreteAggregate;
import com.zy.patterns.iterator.Iterator;
import org.junit.Test;

public class ExpandConcreteAggregateTest {

    @Test
    public void next() {
        ExpandConcreteAggregate aggregate = new ExpandConcreteAggregate();
        aggregate.append("a");
        aggregate.append("b");
        aggregate.append("c");
        Iterator iterator = aggregate.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        } }

}
