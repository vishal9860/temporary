package com.company;

import java.util.Scanner;

public class PRogram1 {
    void leftByOne(int arr[],int n){
        int temp,i;
        temp=arr[0];
        for ( i = 0; i <n-1 ; i++) {
            arr[i]=arr[i+1];
        }
        arr[i]=temp;
    }
    void leftRotate(int arr[],int d,int n){
        for(int i=0;i<d;i++)
        {
            leftByOne(arr,n);
        }

    }

    public static void main(String[] args) {
        PRogram1 obj=new PRogram1();
        Scanner sc=new Scanner(System.in);
        int n,d;
        System.out.println("enter the size of array");
        n=sc.nextInt();
        System.out.println("enter replacing position");
        d=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
        }
        obj.leftRotate(arr,n,d);

    }
}


