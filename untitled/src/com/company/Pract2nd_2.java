package com.company;
/*Mc19F14F025*/
/* Vishal Bapu Jare */
/*Factorial of number*/
import java.util.Scanner;
import java.io.*;
public class Pract2nd_2 {
    public static void main(String[] args) {
        int number;
        int fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        number=sc.nextInt();
        for (int i = 1; i <=number ; i++) {
            fact=fact*i;
        }
        System.out.println("factorial of"+number+" is"+fact);
    }
}
