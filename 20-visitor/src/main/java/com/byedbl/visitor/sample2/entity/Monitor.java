/**
 * FileName :Monitor
 * Author :zengzhijun
 * Date : 2018/5/28 15:35
 * Description:
 */
package com.byedbl.visitor.sample2.entity;

import com.byedbl.visitor.sample2.visitor.ComputerPartVisitor;

public class Monitor  implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
