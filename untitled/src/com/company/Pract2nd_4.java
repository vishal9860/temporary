package com.company;

import java.util.Scanner;

/*Armstrong number*/
/* MC19F14F025*/
public class Pract2nd_4 {
    public static void main(String[] args) {
        int number;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        number=sc.nextInt();
        int temp=number;
        int sum=0;
        while(number>0){
            int rem=number%10;
            sum=sum+rem*rem*rem;
            number=number/10;
        }
        if(sum==temp){
            System.out.println("number is Armstrong ");
        }else {
            System.out.println("number is not ArmStrong Number");
        }
    }
}
