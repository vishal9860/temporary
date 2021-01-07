package com.company.Addition;

import java.util.HashMap;
import java.util.HashSet;

public class Linked_hashset {
    public void removeduplicates(String str){
        HashSet<Character>h=new HashSet<>();
        for(int i=0;i<str.length();i++){
            h.add(str.charAt(i));
        }
        for (Character ch:h
             ) {System.out.print(ch);

        }
    }
    public static void main(String[] args) {
        String a=new String("geeskforgeeks");
        Linked_hashset hs=new Linked_hashset();
        String s="geek@for@gee@ks";
        String st[]=s.split("@");
        System.out.println(st);
        for (String ar:st
             ) {
            System.out.println(ar);

        }
        hs.removeduplicates(a);
    }
}

