package com.company;

import java.util.Scanner;

public class SortChen {
    static void sortt(int a[],int n){
        System.out.println("Buoc 0: "+a[0]);
        int dem =1;
        for(int i=1;i<n;i++){
            int k = a[i];
            int j = i - 1;
            while(j>=0&&a[j]>k){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = k;
            System.out.print("Buoc "+dem+": ");
            dem++;
            for(int t = 0;t<=i;t++){
                System.out.print(a[t]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int[] arr = new int[105];
        for(int i=0;i<n;i++){
            arr[i] = cin.nextInt();
        }
        sortt(arr,n);
    }
}
