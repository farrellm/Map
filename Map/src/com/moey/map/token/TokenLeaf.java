package com.moey.map.token;

import com.moey.map.syntax.SyntaxNode;
import com.moey.map.syntax.SyntaxValue;
import com.moey.map.util.Symbol;

/**
 * Created by IntelliJ IDEA.
 * User: mfarrell
 * Date: 11/22/11
 * Time: 9:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class TokenLeaf extends TokenNode {
    final private String _token;

    public TokenLeaf(TokenBranch parent, String token) {
        super(parent);
        _token = token;
    }

    public String token() { return _token; }

    public String toString() { return _token; }

    @Override
    SyntaxNode build() {
        try {
            Integer i = new Integer(_token);
            return new SyntaxValue(i);
        } catch (NumberFormatException exc) {}

        try {
            Double d = new Double(_token);
            return new SyntaxValue(d);
        } catch (NumberFormatException exc) {}

        if (_token.startsWith("\""))
            return new SyntaxValue(_token.replaceAll("\"", ""));

        return new SyntaxValue(new Symbol(_token));
    }
}
