package com.moey.map.util;

/**
 * Created by IntelliJ IDEA.
 * User: mfarrell
 * Date: 11/24/11
 * Time: 3:11 AM
 * To change this template use File | Settings | File Templates.
 */
public class Symbol {
    final private String _sym;

    public Symbol(String symbol) { _sym = symbol; }

    public boolean equals(Object other) {
        if (!(other instanceof Symbol))
            return false;
        Symbol symbol = (Symbol)other;
        return symbol._sym.equals(_sym);
    }
    public int hashCode() { return _sym.hashCode(); }

    public String toString() { return "'" + _sym; }
}
