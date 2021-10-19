package com.company;

import java.util.Scanner;



public class SoKhongLienKe {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();
        while(t-->0){
            String n = cin.next();
            int sum =0 ;
            boolean check = true;
            for(int i =1 ; i< n.length();i++){
                int b = n.charAt(i-1)-48;
                int a = n.charAt(i)-48;
                if(i==1) sum+= b;
                sum+=a;
                if(Math.abs(a-b)!=2){
                    check = false;
                    break;
                }
            }
            if(sum%10!=0) check = false;
            if(check){
                System.out.println("YES");
            }else{System.out.println("NO");}
        }
    }
}
