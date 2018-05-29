/**
 * FileName :CircleFactory
 * Author :zengzhijun
 * Date : 2018/5/18 15:16
 * Description:
 */
package com.byedbl.shape.factory.method;

import com.byedbl.shape.Circle;
import com.byedbl.shape.Shape;

public class CircleFactory implements Factory {
    @Override
    public Shape create() {
        return new Circle();
    }

    @Override
    public void eat() {
        System.out.println("Circle eat");
    }
}
