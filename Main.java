package com.michael;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr = {54, 876,32,6,1,76,56,56,56,23};
        mergeSort(arr, 0, arr.length - 1);
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void mergeSort(int[] arr, int p, int r){
        if(p<r){
            int q = (int)Math.floor((r+p) / 2);
            mergeSort(arr, p, q);
            mergeSort(arr,q+1, r);
            merge(arr, p, q, r);
        }
    }

    public static void merge(int[] arr, int p, int q, int r){
        int n1 = q - p + 2;
        int n2 = r - q + 1;
        int[] left = new int[n1];
        int[] right = new int[n2];
        for (int i=0; i < n1 - 1; i++){
            left[i] = arr[p + i];
        }
        for (int i = 0; i < n2 - 1; i++){
            right[i] = arr[q + 1 + i];
        }
        left[n1-1] = Integer.MAX_VALUE;
        right[n2-1] = Integer.MAX_VALUE;
        int i = 0, j = 0;

        for (int k = p; k <= r; k++){
            if(left[i] < right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
        }
    }
}
