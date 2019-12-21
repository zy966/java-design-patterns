package com.zy.patterns.bridge;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.reflect.Field;

/**
 * @author zy
 * @date 2019/6/29 15:23
 */
public class AbstractionTest {

    @Test
    public void implementor() {
        Implementor implementor = Mockito.mock(Implementor.class);
        Mockito.when(implementor.method1()).thenReturn("Hello method1");
        Mockito.when(implementor.method2()).thenReturn("Hello method2");

        Assert.assertEquals("Hello method1", implementor.method1());
        Assert.assertEquals("Hello method2", implementor.method2());
    }

    @Test
    public void mutil() throws NoSuchFieldException, IllegalAccessException {
        RefinedAbstraction refinedAbstraction = new RefinedAbstraction();
        Implementor implementor = Mockito.mock(Implementor.class);
        Mockito.when(implementor.method1()).thenReturn("Hello method1");
        Mockito.when(implementor.method2()).thenReturn("Hello method2");

        Field implementorField = RefinedAbstraction.class.getSuperclass().getDeclaredField("implementor");

        implementorField.setAccessible(true);
        implementorField.set(refinedAbstraction, implementor);

        refinedAbstraction.mutil(3);
    }
}
