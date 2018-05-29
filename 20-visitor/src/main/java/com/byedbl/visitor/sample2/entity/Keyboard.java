/**
 * FileName :Keyboard
 * Author :zengzhijun
 * Date : 2018/5/28 15:34
 * Description:
 */
package com.byedbl.visitor.sample2.entity;

import com.byedbl.visitor.sample2.visitor.ComputerPartVisitor;

public class Keyboard  implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}