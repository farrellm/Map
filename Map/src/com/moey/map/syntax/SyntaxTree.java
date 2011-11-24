package com.moey.map.syntax;

import com.moey.map.evaluate.Environment;
import com.moey.map.token.TokenTree;

/**
 * Created by IntelliJ IDEA.
 * User: mfarrell
 * Date: 11/23/11
 * Time: 12:52 AM
 * To change this template use File | Settings | File Templates.
 */
public class SyntaxTree implements SyntaxNode {
    final private SyntaxSequence _seq = new SyntaxSequence();

    public SyntaxTree(TokenTree tokenTree) {

    }

    public SyntaxNode evaluate(Environment environment) {
        return _seq.evaluate(environment);
    }
}
