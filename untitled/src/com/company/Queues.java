package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        Queue<String>Q=new LinkedList<String>();
        Q.add("vishal");
        Q.add("sachin");
        Q.add("saurabh");
        Queue<String>Q2=new LinkedList<String>();
        Q2.add("chandrakant");
        Q2.add("Sushant");
        Q2.add("Sainath");
        Q.addAll(Q2);
        System.out.println(Q.peek());//This method is used to view the head of queue without removing it. It returns Null if the queue is empty.
        System.out.println(Q.element());//This method is similar to peek(). It throws NoSuchElementException when the queue is empty.
        System.out.println(Q.poll());//iThis method removes and returns the head of the queue. It returns null if the queue is empty.
        System.out.println(Q.offer("sudhir"));//it insert element at end of the Queue
        System.out.println(Q.contains("sudhir"));
        System.out.println(Q.containsAll(Q2));
        System.out.println(Q.isEmpty());
        System.out.println(Q.remove("Sushant"));
        System.out.println(Q);

    }
}
