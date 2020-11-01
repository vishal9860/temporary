package com.company;

import java.util.Scanner;

public class StringTest {
    public static  String removevoewls(String s){
        s=s.replaceAll("[AEIOUaeiou]","");
        s=s.replaceAll(" ","");
        return s;
    }
    public static void main(String[] args) {
        String s;
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        System.out.println(removevoewls(s));

    }
}
