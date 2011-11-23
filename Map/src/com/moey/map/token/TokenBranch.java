package com.moey.map.token;

import java.util.Collection;
import java.util.LinkedList;

/**
 * Created by IntelliJ IDEA.
 * User: mfarrell
 * Date: 11/22/11
 * Time: 9:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class TokenBranch extends TokenNode {
    final private Collection<TokenNode> _nodes = new LinkedList<TokenNode>();

    TokenBranch(TokenBranch parent) {
        super(parent);
    }

    void add(TokenNode node) {
        _nodes.add(node);
    }

    public String toString() { return _nodes.toString(); }
}
