package com.company;
import java.util.Scanner;

public class DemSoLanXH {
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        int dem=1;
        while(t!=0){
            int n = ip.nextInt();
            int[] a = new int[105];
            int[] b = new int[100005];
            for(int i : b){
                b[i]=0;
            }

            for(int i=0;i<n;i++){
                a[i] = ip.nextInt();
                b[a[i]]++;
            }
            System.out.println("Test "+dem+":");
            for(int i=0;i<n;i++){
                if(b[a[i]]!=0){
                    System.out.println(a[i]+" xuat hien "+b[a[i]]+" lan");
                    b[a[i]]=0;
                }
            }
            dem++;
            t--;
        }

    }
}
