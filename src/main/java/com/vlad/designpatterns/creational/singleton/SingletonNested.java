package com.vlad.designpatterns.creational.singleton;

public class SingletonNested {

    private SingletonNested() {};

    private static class InstanceHolder {
        private static final SingletonNested INSTANCE = new SingletonNested();
    }
    public static SingletonNested getInstance() {
        return InstanceHolder.INSTANCE;
    }
}
