package com.company;

import java.util.*;

public class ChiaTamGiac {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();
        while(t-->0){
            int n = cin.nextInt();
            int h = cin.nextInt();
            for(int i =1 ; i< n;i++){
                System.out.printf("%.6f ",h*Math.sqrt((double)i/n));
            }
            System.out.println();
        }
    }
}
