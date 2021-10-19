package com.company;

import java.util.Scanner;

public class SortTrucTiep {
    void sortt(int a[],int n){
        int dem = 1;
        for(int i=0;i<n-1;i++){
            boolean check = false;
            for(int j=i+1;j<n;j++){
                if(a[i]>a[j]){
                    check = true;
                    int tmp = a[i];
                    a[i]= a[j];
                    a[j]=tmp;
                }
            }
            if(check){
                System.out.print("Buoc "+dem+": ");
                dem++;
                for(int j=0;j<n;j++){
                    System.out.print(a[j]+" ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        int[] arr = new int[105];
        for(int i=0;i<n;i++){
            arr[i] = ip.nextInt();
        }
        SortTrucTiep result = new SortTrucTiep();
        result.sortt(arr,n);
    }
}
