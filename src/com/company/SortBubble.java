package com.company;

import java.util.*;

public class SortBubble {
    static void sortt(int a[], int n){
        int index = 1;
        for(int i = 0; i<n-1; i++){
            boolean check = false;
            for(int j = 0; j< n-i-1; j++){
                if(a[j]>a[j+1]){
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                    check = true;
                }
            }
            if(check){
                System.out.print("Buoc "+index+": ");
                for(int j=0 ; j<n; j++){
                    System.out.print(a[j]+" ");
                }
                index++;
                System.out.println();
            }
        }
    }
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int[] arr = new int[105];
        for(int i=0 ; i<n;i++){
            arr[i] = cin.nextInt();
        }
        sortt(arr,n);
    }
}
