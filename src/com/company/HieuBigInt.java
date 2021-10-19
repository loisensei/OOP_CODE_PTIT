package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class HieuBigInt {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();
        while(t-->0){
            BigInteger a = cin.nextBigInteger();
            BigInteger b = cin.nextBigInteger();
            BigInteger sub = a.subtract(b);
            sub = sub.abs();
            int dem=0;
            if(b.compareTo(a) > 0){
                String sul = sub.toString();
                String s = b.toString();
                dem = s.length()- sul.length();
            }else{
                String sul = sub.toString();
                String s = a.toString();
                dem = s.length()- sul.length();
            }

                for(int i=1;i<=dem;i++){
                    System.out.print("0");
                }

            System.out.println(sub);
        }
    }
}
