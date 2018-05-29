package com.byedbl.mediator;

/**
 *  A test client
 */
public class Test  {
    public static void main(String[] args) {
        Mediator myMed = new ConcreteMediator();
        ColleagueA a = new ColleagueA(myMed);
        ColleagueB b = new ColleagueB(myMed);
        ColleagueC c = new ColleagueC(myMed);

        a.change();
        System.out.println("----------------");

        b.change();
        System.out.println("****************");
        c.change();
    }
}