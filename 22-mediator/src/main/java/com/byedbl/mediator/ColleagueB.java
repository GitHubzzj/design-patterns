package com.byedbl.mediator;

/**
 * A concrete colleague
 */

public class ColleagueB implements Colleague {
    private final String type = "B";
    private Mediator med;

    public ColleagueB(Mediator m) {
        med = m;
        med.register(this, type);
    }

    @Override
    public void change() {
        System.out.println("-----  B changed now !  -----");
        med.changed(type);
    }

    @Override
    public void action() {
        System.out.println("  B is changed by mediator ");
    }
}