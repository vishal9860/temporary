package com.company;

import java.util.Scanner;
/*palindrome Number*/
/*MC19F14F025*/
public class Practical_2nd_6 {
        public static void main(String[] args) {
            int number;
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the number");
            number=sc.nextInt();
            int rev=0;
            int temp=number;
            while(number>0){
                rev=rev*10+number%10;
                number=number/10;
            }
            if(temp==rev){
                System.out.println("palindrome nuber");
            }else {
                System.out.println("not palindrome number");
            }

        }
    }


