package com.byedbl.flyweight; /**
 *  A Flyweight Factory
 */
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class FontFactory  {
    private Map<String, Font> charHashTable = new ConcurrentHashMap<>();
    
    public FontFactory() {
    }

    public Font getFlyWeight(String s) {
        if(charHashTable.get(s) != null) {
            return (Font)charHashTable.get(s);
        } else {
            Font tmp = new ConcreteFont(s);
            charHashTable.put(s, tmp);
            return tmp;
        }
    }
    public Map<String, Font> getFactory() {
        return charHashTable;
    }
}