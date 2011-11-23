package com.moey.map.syntax;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by IntelliJ IDEA.
 * User: mfarrell
 * Date: 11/23/11
 * Time: 1:06 AM
 * To change this template use File | Settings | File Templates.
 */
public abstract class SyntaxForm extends SyntaxNode {
    final private ArrayList<SyntaxNode> _args;

    protected SyntaxForm()          { _args = new ArrayList<SyntaxNode>(); }
    protected SyntaxForm(int nArgs) { _args = new ArrayList<SyntaxNode>(nArgs); }

    public void add(SyntaxNode arg) { _args.add(arg); }
    protected SyntaxNode arg(int index) { return _args.get(index); }
}
