package com.byedbl.flyweight;
/**
 *  A shared ConcreteFlyweight
 */
public class ConcreteFont implements Font {
    private String color;
    private int size;
    private String key;
    
    public ConcreteFont(String s) {
        key = s;
        //id = "The char is: " + s;
    }
    public void setFont(String _color, int _size) {
        color = _color;
        size = _size;
    }
    public void getFont() {
        System.out.println("String :" + key + "--- color is:" + color + "--- size is:" + size);
    }
}