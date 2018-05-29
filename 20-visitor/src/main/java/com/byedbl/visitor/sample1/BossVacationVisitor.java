package com.byedbl.visitor.sample1;

public class BossVacationVisitor extends Visitor {
    int totalDays;

    public BossVacationVisitor() {
        totalDays = 0;
    }

    public int getTotalDays() {
        return totalDays;
    }

    public void visit(Boss boss) {
        totalDays += boss.getVacDays();
        totalDays += boss.getBonusDays();
    }

    public void visit(Employee emp) {
        totalDays += emp.getVacDays();
    }
}
