package com.vlad.designpatterns.structural.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DecoratorPatternDriver {
    static final Logger LOG = LoggerFactory.getLogger(DecoratorPatternDriver.class);

    public static void main(String[] args) {
        // christmas tree with just one Garland
        ChristmasTree tree1 = new Garland(new ChristmasTreeImpl());
        LOG.info(tree1.decorate());

        // christmas tree with two Garlands and one Bubble lights
        ChristmasTree tree2 = new BubbleLights(new Garland(new Garland(new ChristmasTreeImpl())));
        LOG.info(tree2.decorate());

    }

}
