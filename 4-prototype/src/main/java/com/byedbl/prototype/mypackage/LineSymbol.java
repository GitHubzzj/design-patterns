package com.byedbl.prototype.mypackage;

import com.byedbl.prototype.mypackage.Graphic;

/*
 *  A concrete prototype to draw a line
 */
public class LineSymbol extends Graphic {
    public LineSymbol() {
    }

    public void doSomething() {
        System.out.println("I am used to draw a line !");
    }
}