package com.company;

import java.util.PriorityQueue;

public class ParityQueues {
    public static void main(String[] args) {
        PriorityQueue<String>pri =new PriorityQueue<>();
        pri.add("Vishal");
        pri.add("Chandrakant");
        pri.add("Sushant");
        pri.add("Tushar");
        System.out.println(pri);
        System.out.println(pri.remove());
        System.out.println(pri.remove());
        System.out.println(pri.remove());
        System.out.println(pri.remove());
        PriorityQueue<Integer>pr=new PriorityQueue<Integer>();
        pr.add(50);
        pr.add(10);
        pr.add(20);
        pr.add(30);
        pr.add(40);
        System.out.println(pr);
        System.out.println(pr.remove());
        System.out.println(pr.remove());
        System.out.println(pr.remove());
        System.out.println(pr.remove());
        System.out.println(pr.remove());




    }
}
