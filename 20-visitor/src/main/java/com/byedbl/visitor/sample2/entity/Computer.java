/**
 * FileName :Computer
 * Author :zengzhijun
 * Date : 2018/5/28 15:35
 * Description:
 */
package com.byedbl.visitor.sample2.entity;

import com.byedbl.visitor.sample2.visitor.ComputerPartVisitor;

public class Computer implements ComputerPart {

    ComputerPart[] parts;

    public Computer(){
        parts = new ComputerPart[] {new Mouse(), new Keyboard(), new Monitor()};
    }


    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
