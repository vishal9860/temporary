package com.company.Addition;

import java.util.Arrays;

public class Matrix_sorting {

    public  static void  matrix_sort(int arr[][],int n){
        int matrix[]=new int[n * n];
        int k=0;
        for (int i = 0; i <n; i++) {
            for(int j=0;j<n;j++){
                matrix[k++]=arr[i][j];
            }
        }
        k=0;
            Arrays.sort(matrix);
            for (int i = 0; i <n; i++) {
                for(int j=0;j<n;j++){
                    arr[i][j]=matrix[k++];
                }

        }
    }
    public static void print(int arr[][],int n){
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n; j++) {
                System.out.println(arr[i][j]+"");

            }

        }
    }
    public static void main(String[] args) {
          int arr[][]={{1,2,3}, {4,5,6}, {7,8,9}};
          int n=3;
          System.out.println("sorted matrix is");
           matrix_sort(arr,n);
           print(arr,n);

    }
}
