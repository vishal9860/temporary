package com.company;

import java.util.Scanner;

//MC19F14F025
//Vishal bapu jare
public class Pract2nd_1 {
    public static void main(String[] args) {
        int n;
        int first=0;
        int second=1;
        int next;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size");
        n=sc.nextInt();
        System.out.println("fibbonacci series is");
        System.out.print(" "+first);
        System.out.print(" "+second);
        for (int i=2 ; i<n;i++) {
              next=first+second;
              System.out.print(" "+next);
              first=second;
              second=next;
        }
    }
}
