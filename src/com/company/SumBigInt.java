package com.company;

import java.math.BigInteger;
import java.util.*;

public class SumBigInt {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        BigInteger a = cin.nextBigInteger();
        BigInteger b = cin.nextBigInteger();
        System.out.println(a.add(b));
    }
}
