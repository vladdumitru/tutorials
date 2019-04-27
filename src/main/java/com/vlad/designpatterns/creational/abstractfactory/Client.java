package com.vlad.designpatterns.creational.abstractfactory;

public class Client {

    public static void main(String[] args) {
        AbstractFactory<Animal> animalAbstractFactory = FactoryProvider.getFactory("animal");
        Dog dog = (Dog)animalAbstractFactory.create("dog");
        System.out.println(dog.getType() + " " + dog.makeSound());

    }
}
