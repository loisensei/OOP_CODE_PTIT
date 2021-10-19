package com.company;

import java.util.Scanner;

public class student {
    private String name;
    private String date;
    private float score1;
    private float score2;
    private float score3;
    public float SumScore(){
        return score1+score2+score3;
    }
    public void In(){
        System.out.print(name+" "+date+" "+this.SumScore());
    }
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        student student1 = new student();
        student1.name=cin.nextLine();
        student1.date=cin.nextLine();
        student1.score1=cin.nextFloat();
        student1.score2=cin.nextFloat();
        student1.score3=cin.nextFloat();
        student1.In();
    }
}
