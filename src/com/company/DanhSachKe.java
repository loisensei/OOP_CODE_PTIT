package com.company;

import java.util.*;

public class DanhSachKe {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int[][] arr= new int[n+5][n+5];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                arr[i][j]= cin.nextInt();
            }
        }
        for(int i=1;i<=n;i++){
            System.out.print("List("+i+")"+" = ");
            for(int j=1;j<=n;j++){
                if(arr[i][j]==1){
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }
}
