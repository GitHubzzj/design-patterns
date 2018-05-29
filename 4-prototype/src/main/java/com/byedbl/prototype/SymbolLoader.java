package com.byedbl.prototype;/*
 *  A Symbol Loader to register all prototype instance
 */
import com.byedbl.prototype.mypackage.Graphic;
import com.byedbl.prototype.mypackage.LineSymbol;
import com.byedbl.prototype.mypackage.NoteSymbol;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class SymbolLoader  {
    private Map<String, Graphic> symbols = new ConcurrentHashMap<>();
    public SymbolLoader() {
           symbols.put("Line", new LineSymbol());
           symbols.put("Note", new NoteSymbol());
    }
    public Map<String, Graphic> getSymbols() {
        return symbols;
    }
}