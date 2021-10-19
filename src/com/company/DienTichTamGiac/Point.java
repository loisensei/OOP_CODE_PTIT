package com.company.DienTichTamGiac;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Point {
    private double x;
    private double y;
    public Point(double x, double y){
        this.x = x;
        this.y = y;;
    }
    public double distance(Point point){
        return sqrt(pow(point.x-this.x,2) + pow(point.y-this.y,2));
    }
}
