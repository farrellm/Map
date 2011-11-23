package com.moey.map.syntax;

import com.moey.map.evaluate.Environment;

import javax.lang.model.element.TypeElement;

/**
 * Created by IntelliJ IDEA.
 * User: mfarrell
 * Date: 11/23/11
 * Time: 12:53 AM
 * To change this template use File | Settings | File Templates.
 */
public class SyntaxValue extends SyntaxNode {
    final private Object _value;

    SyntaxValue(Object value) { _value = value; }

    Integer getInteger() { return (Integer)_value; }
    Double getDouble()   { return (Double)_value; }
    String getString()   { return (String)_value; }
    // getPair
    // getList
    // getFunction

    @Override
    SyntaxNode evaluate(Environment environment) {
        return this;
    }
}
