package com.company;
import com.company.Addition.Addition;
import java.util.Scanner;
public class Practical_16 {
    public static void main(String[] args) {
        //creating Addition class instance
        int x,y;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter first number");
        x= sc.nextInt();
        System.out.println("enter the second number");
        y= sc.nextInt();
        Addition add=new Addition();
        System.out.println("sum is"+add.get_sum(x,y));
        System.out.println("multiplication is"+add.getMul(x,y));
        System.out.println("substraction is"+add.get_Sub(x,y));
        System.out.println("Division is"+add.get_Div(x,y));
    }
}
