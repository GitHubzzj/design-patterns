package com.byedbl.visitor.sample1;

public class VacationVisitor extends Visitor {
    protected int totalDays;

    public VacationVisitor() {
        totalDays = 0;
    }

    public void visit(Employee emp) {
        totalDays += emp.getVacDays();
    }

    public void visit(Boss boss) {
        totalDays += boss.getVacDays();
    }

    public int getTotalDays() {
        return totalDays;
    }
}
