package com.byedbl.decorator;
/**
 *  The Concrete Decorator
 */
public class ConcreteDecoratorB extends Decorator {
    public ConcreteDecoratorB(Component c) {
        super(c);
    }
    public void printString(String s) {
        super.printString(s);
        printStringLen(s);
    }
    public void printStringLen(String s) {
        System.out.println("BBBBBBBBBBBBBBBBBBB");

    }
}