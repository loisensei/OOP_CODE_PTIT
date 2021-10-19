package com.company;
import java.math.BigInteger;
import java.util.*;
public class LCMOfNnumber {
    static long ucln(long a,long b){
        while(a*b!=0){
            if(a>b) a%=b;
            else b%=a;
        }
        return a+b;
    }
    static long bcnn(long a, long b){
        return (a/ucln(a,b))*b;
    }
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();
        while(t-->0){
           int n = cin.nextInt();
           long lcm = 1;
            for(int i=1;i<=n;i++){
                lcm = bcnn(lcm,i);
            }
            System.out.println(lcm);
        }
    }
}
