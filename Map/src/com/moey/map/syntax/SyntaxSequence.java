package com.moey.map.syntax;

import com.moey.map.evaluate.Environment;

/**
 * Created by IntelliJ IDEA.
 * User: mfarrell
 * Date: 11/24/11
 * Time: 2:56 AM
 * To change this template use File | Settings | File Templates.
 */
public class SyntaxSequence extends SyntaxForm {
    public SyntaxNode evaluate(Environment environment) {
        SyntaxNode ret = null;
        for (SyntaxNode node : _args)
            ret = node.evaluate(environment);
        assert (ret != null);
        return ret;
    }
}
