package com.company.HinhChuNhat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        Rectangle rectangle = new Rectangle(cin.nextDouble(), cin.nextDouble(),cin.next());
        if(rectangle.getHeight()<=0||rectangle.getWidth()<=0){
            System.out.println("INVALID");
        }else {
            System.out.println(rectangle);
        }
    }
}
