package com.company;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
public class TreeSets {
    public static void main(String[] args) {
        TreeSet<Integer> tre=new TreeSet<>();
        Set<Integer> set=new HashSet<Integer>();
        Set<Integer> ls=new LinkedHashSet<Integer>();
        ls.add(23);
        ls.add(19);
        ls.add(25);
        ls.add(26);
        ls.add(15);
  
        set.add(200);
        set.add(500);
        set.add(100);
        set.add(10);

        tre.add(100);
        tre.add(20);
        tre.add(50);
        tre.add(70);
        tre.add(10);
        tre.add(5);
        System.out.println(tre.first());
        System.out.println(tre.last());
        System.out.println(tre);
        System.out.println(set);
        System.out.println(ls);
    }
}
