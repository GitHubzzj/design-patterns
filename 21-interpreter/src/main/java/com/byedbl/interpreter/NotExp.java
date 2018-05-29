package com.byedbl.interpreter;

/**
 * A NonterminalExpression
 */
public class NotExp implements BooleanExp {
    private BooleanExp opernot1;

    public NotExp(BooleanExp oper1) {
        opernot1 = oper1;
    }

    @Override
    public boolean evaluate(Context c) {
        return !(opernot1.evaluate(c));
    }

    @Override
    public BooleanExp copy() {
        return new NotExp(opernot1.copy());
    }

    @Override
    public BooleanExp replace(String var, BooleanExp exp) {
        return new NotExp(opernot1.replace(var, exp));
    }
}