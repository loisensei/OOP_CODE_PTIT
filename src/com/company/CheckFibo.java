package com.company;
import java.math.BigInteger;
import java.util.*;
public class CheckFibo {
    static boolean fibo(long n){
        if(n==1||n==2) return true;
        long a1 = 1;
        long a2 = 1;
        long a = 0;
        while(a<n){
            a = a1 + a2;
            a1 = a2;
            a2 = a;
        }
        if(a==n) return true;
        else return false;
    }
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();
        while(t-->0){
            long n = cin.nextLong();
            if(fibo(n)) System.out.println("YES");
            else System.out.println("NO");

        }
        BigInteger a = new BigInteger("95084309584085045040504");
        BigInteger b = new BigInteger("9508430958408504504050");
        BigInteger[] s = a.divideAndRemainder(b);
        System.out.print(Arrays.toString(s));
    }
}
