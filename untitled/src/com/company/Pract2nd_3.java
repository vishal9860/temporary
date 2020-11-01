package com.company;
/*MC19F14F025
Vishal Bapu Jare
 */
/* program to find prime number or not*/
import java.util.Scanner;

public class Pract2nd_3 {
    public static boolean isprime(int number){
        for(int i=2;i<number;i++){
            if(number%i==0){
                 return false;
            }
            return  true;
        }
        return true;
    }
    public static void main(String[] args) {
        int number;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        number=sc.nextInt();
        if(isprime(number)){
            System.out.println(number+"is prime");
        }else {
            System.out.println(number+"is not prime");
        }

    }
}
