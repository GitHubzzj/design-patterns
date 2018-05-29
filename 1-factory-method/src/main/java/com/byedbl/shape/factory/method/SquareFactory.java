/**
 * FileName :SquareFactory
 * Author :zengzhijun
 * Date : 2018/5/18 15:15
 * Description:
 */
package com.byedbl.shape.factory.method;

import com.byedbl.shape.Shape;
import com.byedbl.shape.Square;

public class SquareFactory implements Factory{
    @Override
    public Shape create() {
        return new Square();
    }

    @Override
    public void eat() {
        System.out.println("Square eat");
    }
}
