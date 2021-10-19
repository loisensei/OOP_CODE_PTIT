package com.company;

import java.util.Scanner;

public class TinhSum {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);

        int t = cin.nextInt();
        while(t!=0){
            long n = cin.nextLong();
            long sum = n*(1+n)/2;
            System.out.println(sum);
            t--;
        }
    }
}
