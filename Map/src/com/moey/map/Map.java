package com.moey.map;

import com.moey.map.syntax.SyntaxSequence;
import com.moey.map.token.TokenTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by IntelliJ IDEA.
 * User: mfarrell
 * Date: 11/22/11
 * Time: 9:21 PM
 * To change this template use File | Settings | File Templates.
 */
public class Map {
    public static void main(String[] args) throws IOException {
        System.out.println("Map");

        final BufferedReader bufferRead =
                new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            TokenTree tokenTree = new TokenTree();
            do {
                String code = bufferRead.readLine();
                if ("q".equals(code))
                    break;
                tokenTree.parse(code);
            } while (! tokenTree.isReady());
            System.out.println(tokenTree);

            SyntaxSequence syntaxSequence = tokenTree.build();
        }
    }
}
