package com.company;

import java.util.Scanner;

public class Number4AndNumber7 {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        String n = cin.nextLine();
        int quantity =0;
        for(int i =0 ;i<n.length();i++){
            if(n.charAt(i)=='4' || n.charAt(i)=='7') quantity++;
        }
        if(quantity==4 || quantity==7){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
