package com.byedbl.bridge;

/**
 *  The Abstract of Text 
 */
public abstract class Text  {
    public abstract void drawText(String text);
    protected TextImp getTextImp(String type) {
        if(type.equals("Mac")) {
            return new TextImpMac();
        } else if(type.equals("Linux")) {
            return new TextImpLinux();
        } else {
            return new TextImpMac();
        }
    }
}