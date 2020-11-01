package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Question {
    public  static int   firstthree(int arr[],int size,int k) {
        PriorityQueue<Integer> Q = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            Q.add(arr[i]);
        }
        for (int j = k; j < size; j++) {
            if (arr[j] < Q.peek()) {
                continue;
            } else {
                Q.poll();
                Q.add(arr[j]);
            }
        }
        ArrayList<Integer> ar = new ArrayList<>(Q);
        int[] a = new int[ar.size()];
        return 1;    }
    public static void main(String[] args) {
        int[] arr={12,1,3,4,25,87,54};
        int size=arr.length;
        int k=3;
        firstthree(arr,size,k);

    }
}
