/**
 * FileName :UnixButton
 * Author :zengzhijun
 * Date : 2018/5/18 16:25
 * Description:
 */
package com.byedbl.system;

/**
 * 具体的产品
 * Unix系统的按钮
 * @author : zengzhijun
 * @date : 2018/5/18 16:25
 **/
public class UnixButton implements Button{
    @Override
    public void show() {
        System.out.println("UnixButton show");
    }
}
