package com.company;
import java.util.Scanner;

public class ArrSymmetric {
    boolean Check(int a[],int n){
        int i=0;
        int j= n-1;
        while(i<=j){
            if(a[i]!=a[j]) return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);

        int t = ip.nextInt();
        while(t!=0){
            int[] a = new int[105];
            int n= ip.nextInt();
            for(int i=0;i<n;i++){
                a[i] = ip.nextInt();
            }
            ArrSymmetric kt = new ArrSymmetric();
            if(kt.Check(a,n)) System.out.println("YES");
            else System.out.println("NO");
            t--;
        }
    }
}
