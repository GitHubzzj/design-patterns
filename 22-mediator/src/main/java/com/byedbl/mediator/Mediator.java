package com.byedbl.mediator;

/**
 *  An abstract Mediator
 */
public interface Mediator  {
    public void register(Colleague c, String type);
    public void changed(String type);
}