/**
 * FileName :WindowsButton
 * Author :zengzhijun
 * Date : 2018/5/18 16:26
 * Description:
 */
package com.byedbl.system;

/**
 * 定义一个具体的产品
 * Windows操作系统的按钮
 * @author : zengzhijun
 * @date : 2018/5/18 16:26
 **/
public class WindowsButton  implements Button{
    @Override
    public void show() {
        System.out.println("WindowsButton show");
    }
}
