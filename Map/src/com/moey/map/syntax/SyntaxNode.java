package com.moey.map.syntax;

import com.moey.map.evaluate.Environment;

/**
 * Created by IntelliJ IDEA.
 * User: mfarrell
 * Date: 11/23/11
 * Time: 12:53 AM
 * To change this template use File | Settings | File Templates.
 */
public interface SyntaxNode {
    SyntaxNode evaluate(Environment environment);
}
