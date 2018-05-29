package com.byedbl.mediator;

/**
 * A concrete colleague
 */

public class ColleagueC implements Colleague {
    private final String type = "C";
    private Mediator med;

    public ColleagueC(Mediator m) {
        med = m;
        med.register(this, type);
    }

    @Override
    public void change() {
        System.out.println("-----  C changed now !  -----");
        med.changed(type);
    }

    @Override
    public void action() {
        System.out.println("  C is changed by mediator ");
    }
}