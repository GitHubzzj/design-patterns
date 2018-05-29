package com.byedbl.interpreter;

/**
 * The interface of our BooleanExp Interpreter
 * BooleanExp definition is:
 * BooleanExp ::= VariableExp | Constant | OrExp | AndExp
 * | NotExp | '(' BooleanExp ')'
 * AndExp ::= BooleanExp 'and' BooleanExp
 * OrExp ::= BooleanExp 'or' BooleanExp
 * NotExp ::= BooleanExp 'not' BooleanExp
 * Constant ::= 'true' | 'false'
 * VariableExp ::= 'A' | 'B' | ... | 'Z'
 */
public interface BooleanExp {
    boolean evaluate(Context c);

    BooleanExp replace(String var, BooleanExp exp);

    BooleanExp copy();
}