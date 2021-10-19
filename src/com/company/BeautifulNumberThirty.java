package com.company;

import java.util.*;

public class BeautifulNumberThirty {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();
        int[] nt = new int[15];
        Arrays.fill(nt,1);
        nt[0]=nt[1]=0;
        for(int i=2;i<=10;i++){
            if(nt[i]==1){
                for(int j =2*i;j<=10;j+=i){
                    nt[j]=0;
                }
            }
        }
        while(t-->0){
            String s = cin.next();
            boolean check = true;
            int i = 0;
            int j = s.length()-1;
            while(i<=j){
                char x = s.charAt(i);
                char y = s.charAt(j);
                if(x!=y){
                    check = false;
                    break;
                }
                if(nt[(int)(x-'0')]==0){
                    check = false;
                    break;
                }
                i++;
                j--;
            }
            if(check) System.out.println("YES");
            else System.out.println("NO");
        }

    }
}
