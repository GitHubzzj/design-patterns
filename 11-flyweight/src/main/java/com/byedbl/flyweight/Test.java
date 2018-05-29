package com.byedbl.flyweight;
/**
 *  A test client
 */
import java.util.*;

public class Test  {
    public static void main(String[] args) {
        int[] size = {8, 9, 10, 11, 12};
        String[] color = {"FFFFFF", "000000", "FF00FF", "CCCCCC", "111111"};
        FontFactory myFontFactory = new FontFactory();
        String aString = "A test string";
        for(int i = 0; i < aString.length(); i++) {
            int j = 0;
            j = (int)Math.floor(Math.random()*5);
            //System.out.println("j is:" + j + "---" +aString.substring(i, i+1));
            myFontFactory.getFlyWeight(aString.substring(i, i+1)).setFont(color[j], size[j]);
        }

        Map<String, Font> map = myFontFactory.getFactory();
        System.out.println("Hash table size is:" + map.size());
        for(int i = 0; i < aString.length(); i++) {
            ((Font)map.get(aString.substring(i, i+1))).getFont();
        }
    }
}