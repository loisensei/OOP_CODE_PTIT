package com.company.Contest1;

import java.util.Scanner;

public class Student {

    private String name;
    private String grade;
    private String BirthDate;
    private float gpa;

    public Student(){
        this.name = "";
        this.grade = "";
        this.BirthDate = "";
        this.gpa = 0;
    }
    public void setName(String a){
        this.name = a;
    }
    public void setGrade(String a) {
        this.grade = a;
    }
    public void setBirthDate(String a) {

        if(a.charAt(1)=='/'){
            a = new StringBuilder(a).insert(0,"0").toString();
        }
        if(a.charAt(4)=='/'){
            a = new StringBuilder(a).insert(3,"0").toString();
        }
        this.BirthDate = a;
    }
    public void setGpa(float a){
        this.gpa = a;
    }
    public static void infomation(Student student){
        System.out.print("B20DCCN001 ");
        System.out.print(student.name+" "+student.grade+" ");
        System.out.print(student.BirthDate+" ");
        System.out.printf("%.2f",student.gpa);

    }
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        Student student = new Student();
        student.setName(cin.nextLine());
        student.setGrade(cin.nextLine());
        student.setBirthDate(cin.nextLine());
        student.setGpa(cin.nextFloat());
        infomation(student);
    }
}
