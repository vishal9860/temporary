package com.company;
/* reverse a number*/
/*MC19F14F025*/
/*Vishal bapu jare*/
import java.util.Scanner;
public class Pract_2nd_5 {
    public static void main(String[] args) {
        int number;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        number=sc.nextInt();
        int rev=0;
        while(number>0){
             rev=rev*10+number%10;
            number=number/10;
        }
        System.out.println("reverser number is "+rev);
    }
}
