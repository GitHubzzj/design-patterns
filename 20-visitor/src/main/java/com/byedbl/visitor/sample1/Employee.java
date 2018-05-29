package com.byedbl.visitor.sample1;

public class Employee {
    int sickDays, vacDays;
    float salary;
    String name;

    public Employee(String name, float salary, int vacdays, int sickdays) {
        vacDays = vacdays;
        sickDays = sickdays;
        this.salary = salary;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getSickdays() {
        return sickDays;
    }

    public int getVacDays() {
        return vacDays;
    }

    public float getSalary() {
        return salary;
    }

    public void accept(Visitor v) {
        v.visit(this);
    }
}
