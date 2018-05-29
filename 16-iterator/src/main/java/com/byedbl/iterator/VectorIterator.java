package com.byedbl.iterator;
/**
 *  A vector iterator to print data reverse
 */
import java.util.*;

public class VectorIterator implements Iterator {
    private Vector data = new Vector();
    private int cursor = 0;

    public VectorIterator(Vector _data) {
        data = _data;
    }
    @Override
    public void first() {
        //cursor = 0;
        cursor = (data.size() - 1);
    }
    @Override
    public void next() {
        //cursor++;
        cursor--;
    }
    @Override
    public boolean isDone() {
        //return (cursor >= data.size());
        return (cursor < 0);
    }

    @Override
    public void currentItem() {
        if(isDone()) {
            System.out.println("Reach the end of the vector");
        } else {
            System.out.println("Number " + cursor + ": " + data.get(cursor));
        }
    }
}