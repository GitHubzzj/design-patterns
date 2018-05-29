/**
 * FileName :Circle
 * Author :zengzhijun
 * Date : 2018/5/18 14:38
 * Description:
 */
package com.byedbl.shape;

/**
 * Shape 抽象的一个实现
 * @author : zengzhijun
 * @date : 2018/5/18 14:38
 **/
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle draw");
    }

    @Override
    public void erase() {
        System.out.println("Circle erase");
    }
}
