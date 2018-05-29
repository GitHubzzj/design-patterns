package com.byedbl.mediator;

/**
 * A concrete colleague
 */

public class ColleagueA implements Colleague {
    private final String type = "A";
    private Mediator med;

    public ColleagueA(Mediator m) {
        med = m;
        med.register(this, type);
    }

    @Override
    public void change() {
        System.out.println("-----  A changed now !  -----");
        med.changed(type);
    }

    @Override
    public void action() {
        System.out.println("  A is changed by mediator ");
    }
}