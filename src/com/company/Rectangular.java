package com.company;
import java.util.Scanner;

public class Rectangular {
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        int a= ip.nextInt();
        int b=ip.nextInt();
        if(a<=0||b<=0) System.out.println("0");
        else {
            System.out.print((a+b)*2);
            System.out.print(" " + (a*b));
        }
    }
}
