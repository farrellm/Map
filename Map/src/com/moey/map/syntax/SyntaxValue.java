package com.moey.map.syntax;

import com.moey.map.evaluate.Environment;
import com.moey.map.util.Symbol;

import javax.lang.model.element.TypeElement;

/**
 * Created by IntelliJ IDEA.
 * User: mfarrell
 * Date: 11/23/11
 * Time: 12:53 AM
 * To change this template use File | Settings | File Templates.
 */
public class SyntaxValue implements SyntaxNode {
    final private Object _value;

    public SyntaxValue(Object value) { _value = value; }

    public Integer getInteger() { return (Integer)_value; }
    public Double getDouble()   { return (Double)_value; }
    public String getString()   { return (String)_value; }
    public Symbol getSymbol()   { return (Symbol)_value; }
    // getPair
    // getList
    // getFunction

    public SyntaxNode evaluate(Environment environment) {
        return this;
    }

    public String toString() {
        if (_value instanceof String)
            return "\"" + _value + "\"";
        return _value.toString();
    }
}
