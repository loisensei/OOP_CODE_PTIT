package com.company;

import java.util.Scanner;

public class SortSelection {
    static void sortt(int a[],int n){
        int dem = 1;
        for(int i=0;i<n-1;i++){
            int min_index = i;
            for(int j=i+1;j<n;j++){
                if(a[j]<a[min_index]) min_index = j;
            }

                int tmp = a[min_index];
                a[min_index] = a[i];
                a[i] = tmp;
                System.out.print("Buoc "+dem+": ");
                dem++;
                for(int j = 0;j<n;j++){
                    System.out.print(a[j]+" ");
                }
                System.out.println();

        }
    }

    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int[] arr = new int[105];
        for(int i=0;i<n;i++){
            arr[i]= cin.nextInt();
        }
        sortt(arr,n);
    }
}
