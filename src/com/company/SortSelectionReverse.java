package com.company;

import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class SortSelectionReverse{
    static void sortt(int a[],int n){
        String[] sul = new String[n+5];
        int dem = 1;
        for(int i=0;i<n-1;i++){
            int min_index = i;
            for(int j=i+1;j<n;j++){
                if(a[j]<a[min_index]) min_index = j;
            }

            int tmp = a[min_index];
            a[min_index] = a[i];
            a[i] = tmp;
            sul[dem]="";
            sul[dem]+="Buoc "+String.valueOf(dem)+": ";
            for(int j = 0;j<n;j++){
                sul[dem]+= String.valueOf(a[j])+" ";
            }
            dem++;
        }
        for(int i=dem-1;i>=1;i--){
            System.out.println(sul[i]);
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
