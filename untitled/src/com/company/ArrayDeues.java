package com.company;

import java.util.ArrayDeque;

public class ArrayDeues {
    public static void main(String[] args) {
        ArrayDeque<Integer> de=new ArrayDeque<>();
        de.add(20);
        de.add(30);
        de.add(40);
        de.addFirst(10);
        de.addLast(40);
        de.remove();
        de.offer(50);
        de.offerFirst(5);
        de.offerLast(60);
        System.out.println(de);
        System.out.println(de.removeFirst());
        System.out.println(de.removeLast());
        System.out.println(de.getFirst());
        System.out.println(de.getLast());
        System.out.println(de.offerFirst(5));
        System.out.println(de.offerLast(70));
        System.out.println(de.peekFirst());
        System.out.println(de.peekLast());
        System.out.println(de.pollFirst());
        System.out.println(de.pollLast());
        System.out.println(de.element());
        System.out.println(de);
    }
}
