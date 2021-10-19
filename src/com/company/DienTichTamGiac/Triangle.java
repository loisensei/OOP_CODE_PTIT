package com.company.DienTichTamGiac;
import java.lang.Math;

public class Triangle {
    private double a,b,c;
    public Triangle(double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double perimeter(){
        return a+b+c;
    }
    public double area(){
        double p = this.perimeter()/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}
