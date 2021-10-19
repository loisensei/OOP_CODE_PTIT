package com.company.Point;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Point {
    private Double x;
    private Double y;
    public Point(){}
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public Point(Point p){
        this(p.x,p.y);
    }
    public double getX(){return x;}
    public double getY(){return y;}
    public double distance(Point second){
        return sqrt(pow(second.x-this.x,2) + pow(second.y-this.y,2));
    }
    public static double distance(Point p1,Point p2){
        return sqrt(pow(p1.x-p2.x,2) + pow(p1.y-p2.y,2));
    }
    public String toString(){
        return x +" "+ y;
    }
}
