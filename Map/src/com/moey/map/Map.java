package com.moey.map;

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
            TokenTree tree = new TokenTree();
	        String code = bufferRead.readLine();
            tree.parse(code);
        }
    }
}
