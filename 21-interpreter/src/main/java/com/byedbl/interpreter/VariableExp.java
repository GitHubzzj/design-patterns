package com.byedbl.interpreter;

/**
 * A variable expression implements BooleanExp
 * A terminal expression
 */
public class VariableExp implements BooleanExp {
    private String name;

    public VariableExp(String _name) {
        name = _name;
    }

    @Override
    public boolean evaluate(Context c) {
        return c.lookUp(name);
    }

    @Override
    public BooleanExp copy() {
        return new VariableExp(name);
    }

    @Override
    public BooleanExp replace(String var, BooleanExp exp) {
        if (var.equals(name)) {
            return exp.copy();
        } else {
            return new VariableExp(name);
        }
    }

}