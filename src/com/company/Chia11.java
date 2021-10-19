package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class Chia11 {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();
        while(t-->0){
            BigInteger n = cin.nextBigInteger();
            BigInteger m = new BigInteger("11");
            if(n.mod(m).compareTo(BigInteger.valueOf(0))==0 ){
                System.out.println("1");
            }else{
                System.out.println("0");
            }

        }
    }
}

