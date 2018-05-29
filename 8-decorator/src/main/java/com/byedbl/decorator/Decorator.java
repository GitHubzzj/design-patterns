package com.byedbl.decorator;

/**
 *  The Decorator
 */
public class Decorator implements Component {
    private Component component;
    public Decorator(Component c) {
        component = c;
    }
    public void printString(String s) {
        component.printString(s);
    }
}