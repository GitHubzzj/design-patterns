package com.byedbl.decorator;

/**
 *  <pre>
 *  A simple test
 *  利用装饰类的排列组合可以产生不同效果,比继承功能强大
 *
 *  合成模式的区别:
 *  合成模式,树型结构,分树枝和树叶,
 *  和合成模式类似都是传递一个实现了共同接口的类进去,
 *  但是合成模式一般是树枝包含很多个(所以它要add,remove等方法),这个装饰模式就一个
 *
 *  装饰模式可以为合成模式添加新的行为
 *
 *  装饰模式比继承强大可以随便排列组合,但是也容易出错,比如弄个死循环或者奇葩的东东出来
 *
 *  装饰模式和适配器模式的区别在于,装饰器是为了增强所考虑对象的功能,
 *      而适配器是为了改变所考虑对象的接口而不改变其功能
 *
 */
public class Test1  {
    public static void main(String[] args) {
        Component myComponent = new ConcreteComponent();
        myComponent.printString("A test String");
        Decorator myDecorator = new ConcreteDecoratorA(myComponent);
        myDecorator.printString("A test String");
        myDecorator = new ConcreteDecoratorB(myDecorator);
        myDecorator.printString("B test String");
        myDecorator = new ConcreteDecoratorA(myDecorator);
        myDecorator.printString("AAAAAAAAAAAAAAAa");
    }
}