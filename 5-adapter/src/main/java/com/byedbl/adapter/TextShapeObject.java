package com.byedbl.adapter;

/**
 *  The Object Adapter in this sample 
 */
public class TextShapeObject  implements Shape {
    private Text txt;
    public TextShapeObject(Text t) {
        txt = t;
    }
    public void draw() {
        System.out.println("Draw a shap ! Impelement Shape interface !");
    }
    public void border() {
        System.out.println("Set the border of the shap ! Impelement Shape interface !");
    }
    
    public void setContent(String str) {
        txt.setContent(str);
    }
    public String getContent() {
        return txt.getContent();
    }

    public static void main(String[] args) {
        Text myText = new Text();
        TextShapeObject myTextShapeObject = new TextShapeObject(myText);
        myTextShapeObject.draw();
        myTextShapeObject.border();
        myTextShapeObject.setContent("A test text !");
        System.out.println("The content in Text Shape is :" + myTextShapeObject.getContent());
        
    }
}