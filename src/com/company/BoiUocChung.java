package com.company;
import java.util.*;
public class BoiUocChung {
    static long ucln(long a, long b){
        while(a!=b){
            if(a>b) a=a-b;
            if(b>a) b=b-a;
        }
        return a;
    }
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();
        while(t-->0){
            long a = cin.nextLong();
            long b = cin.nextLong();
            long c = ucln(a,b);
            long d = (a*b)/c;
            System.out.println(d+" "+c);
        }
    }
}
