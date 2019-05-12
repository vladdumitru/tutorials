package com.vlad.designpatterns.creational.singleton;

public class ThreadSafeSingleton {
    private static volatile ThreadSafeSingleton instance;

    private ThreadSafeSingleton(){}

    public static synchronized ThreadSafeSingleton getInstance(){
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        System.out.println(ThreadSafeSingleton.getInstance());
        System.out.println(ThreadSafeSingleton.getInstance());
    }
}
