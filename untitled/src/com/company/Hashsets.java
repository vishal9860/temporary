package com.company;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Hashsets {
    public static void main(String[] args) {
        HashSet<String> hs=new HashSet<>();
        hs.add("sudhir");
        hs.add("saurabh");
        hs.add("sushant");
        hs.add("vishal");//duplicates are not allowed
        hs.contains("vishal");
        System.out.println(hs.isEmpty());
        System.out.println(hs);
        LinkedHashSet<Integer>hl=new LinkedHashSet<>();
        hl.add(20);
        hl.add(30);
        hl.add(40);
        hl.add(50);
        hl.add(50);
        System.out.println(hl);

    }
}