package com.practice.designpattern.creational;

public class RunCreationalDesignPattern {

    public static void main(String[] args) {
        System.out.println("Running Creational DesignPatterns");

        runSingletonDesignPattern();
    }

    private static void runSingletonDesignPattern() {
        Singleton instance1 = Singleton.getInstance();
        instance1.testMethod();

        Singleton instance2 = Singleton.getInstance();
        instance2.testMethod();

        if(instance1 == instance2) {
            System.out.println("Both are same");
        }
    }
}
