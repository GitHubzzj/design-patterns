package com.byedbl.prototype.mypackage;

import com.byedbl.prototype.mypackage.Graphic;

/*
 *  A concrete prototype to draw a note
 */
public class NoteSymbol extends Graphic {
    public NoteSymbol() {
    }

    public void doSomething() {
        System.out.println("I am used to draw a note !");
    }
}