package com.company;

import java.util.*;

public class BeautifulNumberOne {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();
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
                if((int)(x)%2!=0){
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
