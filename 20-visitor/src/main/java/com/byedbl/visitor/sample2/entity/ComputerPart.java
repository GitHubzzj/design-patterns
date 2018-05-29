/**
 * FileName :ComputerPart
 * Author :zengzhijun
 * Date : 2018/5/28 15:34
 * Description:
 */
package com.byedbl.visitor.sample2.entity;

import com.byedbl.visitor.sample2.visitor.ComputerPartVisitor;

public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
