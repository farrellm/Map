package com.moey.map.token;

import com.moey.map.syntax.SyntaxNode;

/**
 * Created by IntelliJ IDEA.
 * User: mfarrell
 * Date: 11/22/11
 * Time: 9:26 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class TokenNode {
    final TokenBranch _parent;

    TokenNode(TokenBranch parent) { _parent = parent; }
    TokenBranch parent() { return _parent; }

    abstract SyntaxNode build();
}
