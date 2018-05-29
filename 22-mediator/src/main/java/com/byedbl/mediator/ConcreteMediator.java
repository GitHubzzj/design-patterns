package com.byedbl.mediator;

/**
 * A concrete mediator
 */
public class ConcreteMediator implements Mediator {
    private ColleagueA a;
    private ColleagueB b;
    private ColleagueC c;

    public ConcreteMediator() {
    }

    @Override
    public void register(Colleague colleague, String type) {
        if (type == "A") {
            a = (ColleagueA) colleague;
        } else if (type == "B") {
            b = (ColleagueB) colleague;
        } else if (type == "C") {
            c = (ColleagueC) colleague;
        }
    }

    @Override
    public void changed(String type) {
        if (type == "A") {
            b.action();
            c.action();
        } else if (type == "B") {
            a.action();
            c.action();
        } else if (type == "C") {
            a.action();
            b.action();
        }
    }
}