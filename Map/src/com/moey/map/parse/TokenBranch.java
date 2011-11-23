package com.moey.map.parse;

import sun.org.mozilla.javascript.Token;

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

    void add(TokenNode node) {
        _nodes.add(node);
    }
}
