package com.company;

import java.util.Scanner;
import java.util.Vector;

public class DanhSachCanh {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int[][] a= new int[n+5][n+5];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                a[i][j]= cin.nextInt();
            }
        }
        for(int i=1;i<=n-1;i++){
            for(int j=i+1;j<=n;j++){
                if(a[i][j]==1){
                    System.out.println("("+i+","+j+")");
                }
            }
        }
    }
}
