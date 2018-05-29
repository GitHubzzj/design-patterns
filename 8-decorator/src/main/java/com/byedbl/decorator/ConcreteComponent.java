package com.byedbl.decorator;
/**
 *  A Concrete Component
 */
public class ConcreteComponent implements Component {
    public ConcreteComponent() {
    }
    public void printString(String s) {
        System.out.println("Input String is:" + s);
    }
}