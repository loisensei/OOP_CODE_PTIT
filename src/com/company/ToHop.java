package com.company;

import java.util.*;

public class ToHop {
    int n;
    int k;
    int dem;

    public ToHop(int n, int k){
        this.n = n;
        this.k = k;

        this.dem = 0;
    }

    public void listed(int[] a,int i){
        for(int j = a[i-1]+1;j<=n-k+i;j++){
            a[i] = j;
            if(i==k){
                for(int l = 1;l<=k;l++){
                    System.out.print(a[l]);
                }
                dem++;
                System.out.print(" ");
            }else{
                listed(a,i+1);
            }
        }
    }
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        ToHop st = new ToHop(cin.nextInt(),cin.nextInt());
        int[] a = new int[st.n];
        st.listed(a,1);
        System.out.println();
        System.out.print("Tong cong co "+st.dem+" to hop");
    }
}
