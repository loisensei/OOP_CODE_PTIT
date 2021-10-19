package com.company;

import java.util.*;

public class SortTrucTiepReverse {

    static void sortt(int a[],int n){
        int dem = 1;
        String[] kq = new String[n+1];
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
                kq[dem] ="";
                kq[dem]+="Buoc "+String.valueOf(dem)+": ";
                for(int j=0;j<n;j++){
                    kq[dem]+= String.valueOf(a[j])+" ";

                }
                dem++;

            }
        }
        for(int i=dem-1;i>=1;i--){
            System.out.println(kq[i]);
        }
    }
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();
        while(t-->0){
            int n = cin.nextInt();
            int[] a = new int[n+5];
            for(int i=0;i<n;i++){
                a[i]=cin.nextInt();
            }
            sortt(a,n);
        }
    }
}
