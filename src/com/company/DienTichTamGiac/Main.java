package com.company.DienTichTamGiac;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();
        while(t-->0){
            Point a = new Point(cin.nextDouble(), cin.nextDouble());
            Point b = new Point(cin.nextDouble(), cin.nextDouble());
            Point c = new Point(cin.nextDouble(), cin.nextDouble());
            double x = a.distance(b);
            double y = a.distance(c);
            double z = c.distance(b);
            if(x < y+z && y<x+z && z<x+y) {
                Triangle triangle = new Triangle(x, y, z);
                System.out.printf("%.2f\n", triangle.area());
            }else{
                System.out.println("INVALID");
            }
        }
    }
}
