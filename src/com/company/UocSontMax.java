package com.company;

import java.util.*;

public class UocSontMax {
    static long nt(long n){
        long max = 2;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                max = i;
                while(n%i==0){
                    n/=i;
                }
            }
        }
        if(n>1) max = n;
        return max;
    }

    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();
        while(t-->0){
            long n = cin.nextLong();
            System.out.println(nt(n));
        }
    }
}
