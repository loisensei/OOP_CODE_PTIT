package com.company;
import  java.lang.String;
import java.util.Scanner;

public class PhuongTrinhBacNhat {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        float a = cin.nextFloat();
        float b = cin.nextFloat();
        float x = -b/a;
        String y = String.format("%.2f",x);
        if(a==0&&b!=0) System.out.println("VN");
        else if(a==0) System.out.println("VSN");
        else System.out.println(y);
    }
}
