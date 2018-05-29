package com.byedbl.interpreter; /**
 * A Context to record variable value
 */

import java.util.Hashtable;

public class Context {
    private Hashtable<String,Boolean> context = new Hashtable<>();

    public void assign(String name, boolean val) {
        context.put(name, val);
    }

    public boolean lookUp(String name) {
        return context.get(name);
    }

    public Context() {
    }
}