package com.company;

import java.util.*;

public class TotalUoc {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int[] a = new int[n+5];
        int max = -1;
        for(int i=0;i<n;i++){
            a[i] = cin.nextInt();
            if(a[i]>max) max = a[i];
        }
        int[] nt = new int[max+5];
        Arrays.fill(nt,0);
        for(int i = 2;i<=Math.sqrt(max);i++){
            if(nt[i]==0){
                for(int j = i*i;j<=max;j+=i){
                    nt[j]=i;
                }
            }
        }
        for(int i = 2;i<=max;i++){
            if(nt[i]==0) nt[i]=i;
        }
        long sum = 0;
        for(int i =0 ;i<n;i++){
            while(a[i]!=1){
                sum+= nt[a[i]];
                a[i]/=nt[a[i]];
            }
        }
        System.out.println(sum);
    }
}
