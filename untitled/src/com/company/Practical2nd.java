package com.company;
/*MC!9F14F025*/
/*Practical no 3*/
public class Practical2nd {
    public static void main(String[] args) {
        int i=100;
        long l=i;
        float f=l;
        System.out.println("widening type casting");
        System.out.println("int value"+i);
        System.out.println("long value:"+l);
        System.out.println("float value"+f);

        System.out.println("Explicit type casting");
        double d=125.5;
        long l1=(long)d;
        int i1=(int)d;
        char c=(char)65;
        System.out.println("double is+d");
        System.out.println("long is +l1");
        System.out.println("int is "+i1);
        System.out.println("char is"+c);
    }
}
