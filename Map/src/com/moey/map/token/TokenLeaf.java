package com.moey.map.token;

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
}
