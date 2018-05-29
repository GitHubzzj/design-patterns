/**
 * FileName :ComputerPartDisplayVisitor
 * Author :zengzhijun
 * Date : 2018/5/28 15:36
 * Description:
 */
package com.byedbl.visitor.sample2.visitor;

import com.byedbl.visitor.sample2.entity.Computer;
import com.byedbl.visitor.sample2.entity.Keyboard;
import com.byedbl.visitor.sample2.entity.Monitor;
import com.byedbl.visitor.sample2.entity.Mouse;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

    @Override
    public void visit(Computer computer) {
        System.out.println("Displaying Computer.");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Displaying Mouse.");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Displaying Keyboard.");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Displaying Monitor.");
    }
}
