package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class LuyThua {
    public static int MOD= 1000000007;
    public static long poww(int a, long b){
        if(b==0) return 1;
        if(b==1) return a;
        long tmp = poww(a,b/2);
        if(b%2==0) return tmp*tmp%MOD;
        else return a*(tmp*tmp%MOD)%MOD;
    }
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        while(true){
            int a = cin.nextInt();
            long b = cin.nextLong();
            if(a==0&&b==0) break;
            System.out.println(poww(a,b));
        }

    }
}
