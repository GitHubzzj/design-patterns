/**
 * FileName :ShapeStaticFactory
 * Author :zengzhijun
 * Date : 2018/5/18 14:40
 * Description:
 */
package com.byedbl.shape.factory.simple;

import com.byedbl.shape.Circle;
import com.byedbl.shape.Shape;
import com.byedbl.shape.Square;

/**
 * 创建形状的静态工厂
 * @author : zengzhijun
 * @date : 2018/5/18 14:40
 **/
public class ShapeStaticFactory {

    public static Shape create(int no) {
        //一般会改成反射来创建
        Shape shape ;
        switch (no){
            case 1:
                shape = new Square();
                break;
            case 2:
                shape = new Circle();
                break;
            default:
                shape = new Square();
                break;
        }
        return shape;
    }

}
