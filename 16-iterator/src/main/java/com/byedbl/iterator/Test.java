package com.byedbl.iterator; /**
 *
 */

public class Test  {
    public static void main(String[] args) {
        String fileName = "data.txt";
        Aggregate dataVector = new DataVector(fileName);
        Iterator iVector = dataVector.createIterator();
        for(iVector.first(); ! iVector.isDone(); iVector.next()) {
            iVector.currentItem();
        }
    }
}