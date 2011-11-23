package com.moey.map.token;

/**
 * Created by IntelliJ IDEA.
 * User: mfarrell
 * Date: 11/22/11
 * Time: 9:26 PM
 * To change this template use File | Settings | File Templates.
 */
public class TokenNode {
    final TokenBranch _parent;

    TokenNode(TokenBranch parent) { _parent = parent; }
    TokenBranch parent() { return _parent; }
}
