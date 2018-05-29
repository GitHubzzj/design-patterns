package com.byedbl.prototype;/*
 *  As  a Test Client to test our pattern
 */

import com.byedbl.prototype.mypackage.Graphic;

import java.util.Map;

public class GraphicTool {
    public GraphicTool() {
    }

        public static void main(String[] args) {
        //-----  Initial our prototype instance  ----------
        SymbolLoader myLoader = new SymbolLoader();
        Map<String,Graphic> mySymbols = myLoader.getSymbols();

        //-----  Draw a Line  -------------------------------
        Graphic myLine = (Graphic)((Graphic)mySymbols.get("Line")).clone();
        myLine.doSomething();
    }
//    public static void main(String[] args) {
//        LineSymbol lineSymbol = new LineSymbol();
//        NoteSymbol noteSymbol = new NoteSymbol();
//        Graphic myLine = (Graphic) lineSymbol.clone();
//        myLine.doSomething();
//        Graphic myNote= (Graphic)noteSymbol.clone();
//        myNote.doSomething();
//    }
}