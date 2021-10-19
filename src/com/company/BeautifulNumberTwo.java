package com.company;

import java.util.*;

public class BeautifulNumberTwo {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();
        while(t-->0){
            String s = cin.next();
            int i = 0;
            int j = s.length()-1;
            boolean check = true;
            int sum = 0;

            while(i<j){
                char x = s.charAt(i);
                char y = s.charAt(j);
                if(i==0&&x!='8'){
                    check = false;
                    break;
                }
                if(x!=y){
                    check = false;
                    break;
                }
                sum+= (int)(x-'0')*2;
                i++;
                j--;
            }
            if(i==j) sum+= (int)(s.charAt(i)-'0');
            if(sum%10!=0) check =false;

            if(check) System.out.println("YES");
            else System.out.println("NO");
        }

    }
}
