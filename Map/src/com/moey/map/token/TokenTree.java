package com.moey.map.token;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by IntelliJ IDEA.
 * User: mfarrell
 * Date: 11/22/11
 * Time: 9:26 PM
 * To change this template use File | Settings | File Templates.
 */
public class TokenTree {
    private static final Pattern REGEX =
            Pattern.compile("(\\(|\\)|'|[^\\s\"'\\(\\)]+)|\"([^\"]*)\"");

    final private TokenBranch _root = new TokenBranch(null);
    private TokenBranch _cur = _root;

    public boolean isReady() { return _cur == _root; }

    public void parse(String code) {
        List<String> tokens = new LinkedList<String>();

        Matcher regexMatcher = REGEX.matcher(code);
        while (regexMatcher.find()) {
            if (regexMatcher.group(2) != null) {
                // Add double-quoted string without the quotes
                tokens.add(regexMatcher.group(2));
            } else {
                // Add unquoted word
                tokens.add(regexMatcher.group(1));
            }
        }

        for (String token : tokens) {
            if ("(".equals(token)) {
                TokenBranch next = new TokenBranch(_cur);
                _cur.add(next);
                _cur = next;
            } else if (")".equals(token)) {
                _cur = _cur.parent();
            } else {
                _cur.add(new TokenLeaf(_cur, token));
            }
        }

        System.out.println(_root);
    }
}
