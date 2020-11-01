package com.company;

import java.util.Scanner;

public class str {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        int count = 0;

        //Counts each character except space
        for(int i = 0; i <s.length(); i++) {
            if(s.charAt(i) == ' ')
                count++;
        }
        System.out.println(s.length());
        System.out.println(count+1);

    }
}
