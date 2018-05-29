/**
 * FileName :Factory
 * Author :zengzhijun
 * Date : 2018/5/18 16:29
 * Description:
 */
package com.byedbl.system;

/**
 * 定义工厂的抽象
 * 定义创建不同操作系统的按钮和文本框
 * @author : zengzhijun
 * @date : 2018/5/18 16:29
 **/
public interface Factory {

    Button createButton();

    Text createText();
}
