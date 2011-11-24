package com.moey.map.token;

import com.moey.map.syntax.SyntaxForm;
import com.moey.map.syntax.SyntaxNode;

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

    @Override
    SyntaxNode build() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    SyntaxForm buildForm(SyntaxForm form) {
        for (TokenNode node : _nodes)
            form.add(node.build());
        return form;
    }

    void add(TokenNode node) {
        _nodes.add(node);
    }

    public String toString() { return _nodes.toString(); }
}
