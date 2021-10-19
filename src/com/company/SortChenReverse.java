package com.company;

import java.util.Scanner;

public class SortChenReverse {
    static void sortt(int a[],int n){

        int dem =1;
        String[] kq = new String[n+1];
        kq[0]="";
        kq[0]+="Buoc 0: " + String.valueOf(a[0]);
        for(int i=1;i<n;i++){
            int k = a[i];
            int j = i - 1;
            while(j>=0&&a[j]>k){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = k;
            kq[dem]="";
            kq[dem]+="Buoc "+ String.valueOf(dem)+": ";
            for(int t = 0;t<=i;t++){
                kq[dem]+= String.valueOf(a[t])+" ";
            }
            dem++;
        }
        for(int i=dem-1;i>=0;i--){
            System.out.println(kq[i]);
        }
    }
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int[] a = new int[n+5];
        for(int i=0;i<n;i++){
            a[i] = cin.nextInt();
        }
        sortt(a,n);

    }
}
