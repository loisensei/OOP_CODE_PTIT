package com.company;

import java.util.Scanner;

public class Fibonaxi {
    long BackTrack(int n){
        long a1=1;
        long a2=1;
        if(n==1||n==2){
            return 1;
        }
        int i=3;
        long a=0;
        while(i<=n){
            a=a1+a2;
            a1=a2;
            a2=a;
            i++;
        }
        return a;
    }

    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        while(t!=0){
            Fibonaxi check = new Fibonaxi();
            int n = ip.nextInt();
            System.out.println(check.BackTrack(n));

            t--;
        }
    }
}
