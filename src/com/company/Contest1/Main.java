package com.company.Contest1;

import java.util.*;



public class Main {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int t = Integer.parseInt(cin.nextLine());
        ArrayList<NhanVien> ds = new ArrayList<>();
        for(int i=1;i<=t;i++) {
            NhanVien a = new NhanVien(i, cin.nextLine(), Integer.parseInt(cin.nextLine()), Integer.parseInt(cin.nextLine()), cin.nextLine());
            ds.add(a);
        }
        Collections.sort(ds);
        for(NhanVien i : ds){
            System.out.println(i);
        }
    }


}
