/**
 * FileName :Square
 * Author :zengzhijun
 * Date : 2018/5/18 14:36
 * Description:
 */
package com.byedbl.shape;

/**
 * 抽象的一个实现
 * @author : zengzhijun
 * @date : 2018/5/18 14:36
 **/
public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Square draw");
    }

    @Override
    public void erase() {
        System.out.println("Square erase");
    }
}
