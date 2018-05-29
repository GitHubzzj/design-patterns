package com.byedbl.bridge;

/**
 *  <pre>
 *  A test client
 *  抽象工厂可以为桥梁模式提供产品创建的结构
 *  就是在Text类中的 getTextImp 方法可以用抽象工厂来实现
 *  形如: getTextImp(TextFactory factory) , TextFactory 就是客户端传入的抽象工厂
 *  这样,如果要加一种Text,那就只要添加一个TextXXX,
 *  如果要多支持一个操作系统也只要添加一个 TextImpWindows,和创建这个 TextImpWindows 的工厂
 *
 */
public class Test  {
    public Test() {
    }

    public static void main(String[] args) {
        Text myText = new TextBold("Mac");
        myText.drawText("=== A test String ===");

        myText =  new TextBold("Linux");
        myText.drawText("=== A test String ===");

        System.out.println("------------------------------------------");
        
        myText =  new TextItalic("Mac");
        myText.drawText("=== A test String ===");

        myText =  new TextItalic("Linux");
        myText.drawText("=== A test String ===");
    }
}