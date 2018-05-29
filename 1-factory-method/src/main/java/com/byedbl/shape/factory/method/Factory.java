/**
 * FileName :Factory
 * Author :zengzhijun
 * Date : 2018/5/18 15:14
 * Description:
 */
package com.byedbl.shape.factory.method;


import com.byedbl.shape.Shape;

/**
 * 定义抽象工厂方法
 * @author : zengzhijun
 * @date : 2018/5/18 15:14
 **/
public interface Factory {

    Shape create();

    void eat();
}
