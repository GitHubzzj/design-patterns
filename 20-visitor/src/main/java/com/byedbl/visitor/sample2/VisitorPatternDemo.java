/**
 * FileName :VisitorPatternDemo
 * Author :zengzhijun
 * Date : 2018/5/28 15:36
 * Description:
 */
package com.byedbl.visitor.sample2;

import com.byedbl.visitor.sample2.entity.Computer;
import com.byedbl.visitor.sample2.entity.ComputerPart;
import com.byedbl.visitor.sample2.entity.Mouse;
import com.byedbl.visitor.sample2.visitor.ComputerPartDisplayVisitor;

/**
 *
 * <pre>
 * 备受争议的访问者模式
 * 因为增加一个Node节点就要在Visitor节点中(这里是 ComputerPartVisitor)增加一个方法支持它
 * 如果已经实现了很多Visitor那不是很坑爹?当然在java8里面可以加一个默认的方法了,情况可能好一点
 * 但是还是不能掩盖其违反了开闭原则
 *
 * 但是作为实用主义来讲,只要管用,理论就可以先一边呆着去...
 * 毕竟像中国的代码,if else if 几百行 也不是没见过的
 *
 * @author : zengzhijun
 * @date : 2018/5/28 15:51
 **/
public class VisitorPatternDemo {

    public static void main(String[] args) {

        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
        System.out.println("--------------");
        ComputerPart computerPart = new Mouse();
        computerPart.accept(new ComputerPartDisplayVisitor());
    }
}
