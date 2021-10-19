package com.company.PhanSoCt;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();
        while(t-->0) {
            PhanSo a = new PhanSo(cin.nextLong(), cin.nextLong());
            PhanSo b = new PhanSo(cin.nextLong(), cin.nextLong());
            PhanSo c = a.add(b);
            PhanSo mul = a.mul(b).mul(c);
            System.out.println(c+" "+mul);
        }
    }
}
