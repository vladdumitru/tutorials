package com.vlad.designpatterns.creational.singleton;

public class Singleton  {
    private Singleton() {}

    private static class SingletonHolder {
        static final Singleton instance = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.instance;
    }

    public static void main(String[] args) {
        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance());
    }
}
