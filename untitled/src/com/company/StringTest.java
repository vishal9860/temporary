package com.company;
import java.util.Scanner;
public class StringTest {
    public static void main(String[] args) {
        String v = new String("vishal");
        for (int i = 0; i < v.length(); i++) {
            System.out.println("" + v.charAt(i));

        }
        String s;
        char[] arr = {'s', 'a', 'c', 'h', 'i', 'n'};
        s = new String(arr);
        System.out.println("the length of the String is" + s.length());
        int count = 0;
         

    }
}
