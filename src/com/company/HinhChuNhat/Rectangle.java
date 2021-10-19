package com.company.HinhChuNhat;

import java.util.Locale;

public class Rectangle {
    private Double width;
    private Double height;
    private String color;
    public Rectangle(){
        this.width = 1.0;
        this.height = 1.0;
    }
    public Rectangle(Double width,Double height,String color){
        this.width = width;
        this.height = height;
        this.color = formatColor(color);
    }

    public Double getWidth(){
        return width;
    }
    public void setWidth(Double width){
        this.width = width;
    }
    public Double getHeight(){
        return height;
    }
    public void setHeight(Double height){
        this.height = height;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public Double findArea(){
        return width*height;
    }
    public Double findPerimeter(){
        return (width+height)*2;
    }
    public String formatColor(String color){
        color = color.toLowerCase();
        color = String.valueOf(color.charAt(0)).toUpperCase()+color.substring(1);
        return color;
    }
    public String toString(){
        return String.format("%.0f",findPerimeter())+" "+ String.format("%.0f",findArea())+" "+ color;
    }
}
