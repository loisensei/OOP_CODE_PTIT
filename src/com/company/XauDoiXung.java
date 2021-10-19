package com.company;

import java.util.Scanner;

public class XauDoiXung {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();
        while(t-->0){
            String s = cin.next();
            int i = 0;
            int j = s.length()-1;
            int count = 0;
            while(i<j){
                if(s.charAt(i)!=s.charAt(j)){
                    count++;
                }
                i++;
                j--;
            }
            if(s.length()%2!=0){
                if(count>1){
                    System.out.println("NO");
                }else{
                    System.out.println("YES");
                }
            }else{
                if(count!=1){
                    System.out.println("NO");
                }else{
                    System.out.println("YES");
                }
            }

        }
    }
}
