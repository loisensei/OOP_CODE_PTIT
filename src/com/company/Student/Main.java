package com.company.Student;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner cin = new Scanner(System.in);
        int t = Integer.parseInt(cin.nextLine());
        ArrayList<SinhVien> ds = new ArrayList<SinhVien>();
        for (int i = 1; i <=t;i++) {
            SinhVien a = new SinhVien(i, cin.nextLine(), cin.nextLine(), cin.nextLine(), Double.parseDouble(cin.nextLine()));
            ds.add(a);
        }
        for(SinhVien i : ds){
            System.out.println(i);
        }
    }
}
