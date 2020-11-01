package com.company;

import java.util.Scanner;

public class Practical1 {
    public static void main(String[] args) {
        System.out.println("enter the number");
        int number;//int is the data type and number is variable
        Scanner sc=new Scanner(System.in);
        number=sc.nextInt();
        if(number<=7)//Decision Making statement
        {

                switch(number){
                    case 1:
                        System.out.println("Monday");
                        break;
                    case 2:
                        System.out.println("tuesday");
                        break;
                    case 3:
                        System.out.println("wednesday");
                        break;
                    case 4:
                        System.out.println("Thursday");
                        break;
                    case 5:
                        System.out.println("Friday");
                        break;
                    case 6:
                        System.out.println("saturday");
                        break;
                    case 7:
                        System.out.println("sunday");
                        break;
                    default:
                        System.out.println("Wait...");


            }

        }else {
            System.out.println("enter the number in range of 1 to 7");
        }
    }
}
