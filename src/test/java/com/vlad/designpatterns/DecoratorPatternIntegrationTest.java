package com.vlad.designpatterns;

import static org.junit.Assert.assertEquals;

import com.vlad.designpatterns.structural.decorator.BubbleLights;
import com.vlad.designpatterns.structural.decorator.ChristmasTree;
import com.vlad.designpatterns.structural.decorator.ChristmasTreeImpl;
import com.vlad.designpatterns.structural.decorator.Garland;
import org.junit.Test;

public class DecoratorPatternIntegrationTest {
    @Test
    public void givenDecoratorPattern_WhenDecoratorsInjectedAtRuntime_thenConfigSuccess() {
        ChristmasTree tree1 = new Garland(new ChristmasTreeImpl());
        assertEquals(tree1.decorate(), 
          "Christmas tree with Garland");
         
        ChristmasTree tree2 = new BubbleLights(
          new Garland(new Garland(new ChristmasTreeImpl())));
        assertEquals(tree2.decorate(), 
          "Christmas tree with Garland with Garland with Bubble Lights");
    }
}

