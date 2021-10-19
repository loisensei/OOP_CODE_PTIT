package com.company;

import java.util.*;

public class BalancedPoint {
    static int check(int a[], int n){
        int[] b = new int[n+5];
        int[] c = new int[n+5];
        b[0] = a[0];
        for(int i=1;i<n;i++){
            b[i] = b[i-1] + a[i];
        }
        c[n-1] = a[n-1];
        for(int i = n-2;i>=0;i--){
            c[i] = c[i+1] + a[i];
        }
        for(int i=1;i<n-1;i++){
            if(b[i]==c[i]) return i+1;
        }
        return 0;
    }
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();
        while(t-->0){
            int n = cin.nextInt();
            int[] arr = new int[100005];
            for(int i=0;i<n;i++){
                arr[i] = cin.nextInt();
            }
            if(check(arr,n)!=0) System.out.println(check(arr,n));
            else System.out.println("-1");
        }
    }
}
