package com.vlad.designpatterns;

import com.vlad.designpatterns.creational.singleton.SingletonNested;
import org.junit.Assert;
import org.junit.Test;

public class SingletonNestedTest {

    @Test
    public void givenTwoObjects_ThenOnlyOneInstance() {
        SingletonNested singletonNested1 = SingletonNested.getInstance();
        SingletonNested singletonNested2 = SingletonNested.getInstance();

        Assert.assertEquals(singletonNested1, singletonNested2);
    }
}
