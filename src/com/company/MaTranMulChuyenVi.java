package com.company;

import java.util.Scanner;

public class MaTranMulChuyenVi {
    public static void nhanChuyenVi(int[][] a, int n, int m){
        int[][] b = new int[n][n];
        int x = 0, y=0;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                int sum = 0;
                for(int k = 0; k<m;k++){
                    int tmp = a[i][k]*a[j][k];
                    sum+=tmp;
                }
                b[x][y]=sum;
                y++;
            }
            x++;
            y=0;
        }
        for(int i = 0;i<n;i++){
            for(int j= 0;j<n;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();
        int dem = 1;
        while(t-->0){
            int n = cin.nextInt();
            int m = cin.nextInt();
            int[][] a = new int[n][m];
            for(int i = 0 ;i< n;i++){
                for(int j =0;j<m;j++){
                    a[i][j] = cin.nextInt();
                }
            }
            System.out.println("Test "+dem+":");
            dem++;
            nhanChuyenVi(a,n,m);

        }
    }
}
