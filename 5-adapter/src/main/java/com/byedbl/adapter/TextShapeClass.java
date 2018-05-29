package com.byedbl.adapter;

/**
 *  The Class Adapter in this sample 
 */
public class TextShapeClass  extends Text implements Shape {
    public TextShapeClass() {
    }
    public void draw() {
        System.out.println("Draw a shap ! Impelement Shape interface !");
    }
    public void border() {
        System.out.println("Set the border of the shap ! Impelement Shape interface !");
    }
    public static void main(String[] args) {
        TextShapeClass myTextShapeClass = new TextShapeClass();
        myTextShapeClass.draw();
        myTextShapeClass.border();
        myTextShapeClass.setContent("A test text !");
        System.out.println("The content in Text Shape is :" + myTextShapeClass.getContent());
    }
}