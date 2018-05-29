/**
 * FileName :Component
 * Author :zengzhijun
 * Date : 2018/5/23 10:16
 * Description:
 */
package com.byedbl.composite;

import java.util.Enumeration;

/**
 * <pre>
 * 透明式的实现合成模式
 * 对子类的管理方法 add,remove,getChild,elements(iterator)都放在接口内,
 * 安全式的实现方法是放在Composite角色里的
 *
 * @author : zengzhijun
 * @date : 2018/5/23 14:38
 **/
public interface Component {
    void setLeaf(boolean b);

    float getSalary();

    String getName();

    float getSalaries();

    boolean add(Employee e);

    void remove(Employee e);

    Enumeration elements();

    Employee getChild(String s);
}
