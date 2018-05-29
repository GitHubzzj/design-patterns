/**
 * FileName :ComputerPartVisitor
 * Author :zengzhijun
 * Date : 2018/5/28 15:36
 * Description:
 */
package com.byedbl.visitor.sample2.visitor;

import com.byedbl.visitor.sample2.entity.Computer;
import com.byedbl.visitor.sample2.entity.Keyboard;
import com.byedbl.visitor.sample2.entity.Monitor;
import com.byedbl.visitor.sample2.entity.Mouse;

public interface ComputerPartVisitor {
    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
}
