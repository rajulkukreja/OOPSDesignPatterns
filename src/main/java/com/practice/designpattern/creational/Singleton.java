package com.practice.designpattern.creational;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public synchronized static Singleton getInstance() {
        if(instance == null) {
            System.out.println("getInstance is called");
            instance = new Singleton();
        }
        return instance;
    }

    public void testMethod() {
        System.out.println("This is a test method");
    }
}
