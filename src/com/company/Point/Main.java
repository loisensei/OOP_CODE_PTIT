package com.company.Point;



import java.util.Scanner;

import static com.company.Point.Point.*;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();
        while (t-- > 0) {
            Point a = new Point(cin.nextDouble(),cin.nextDouble());
            Point b = new Point(cin.nextDouble(),cin.nextDouble());
            Point c = new Point(cin.nextDouble(),cin.nextDouble());
            double x = distance(a,b);
            double y = distance(a,c);
            double z = distance(b,c);
            if(x < y+z && y<x+z && z<x+y) {
                System.out.printf("%.3f\n",x+y+z);
            }else{
                System.out.println("INVALID");
            }

        }
    }
}
