package com.company.SinhVien;

import java.text.ParseException;
import java.util.ArrayList;

import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner cin = new Scanner(System.in);
        int t = Integer.parseInt(cin.nextLine());
        ArrayList<Student> ds = new ArrayList<>();
        for(int i =1;i<=t;i++){
            Student a = new Student(i,cin.nextLine(),cin.nextLine(),cin.nextLine(),Double.parseDouble(cin.nextLine()));
            ds.add(a);
        }
        Collections.sort(ds);
        for(Student i : ds){
            System.out.println(i);
        }
    }
}
