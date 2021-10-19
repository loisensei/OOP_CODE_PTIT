package com.company.Student;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SinhVien {
    private String msv,ten,lop;
    private Date ngaySinh;
    private double gpa;
    public SinhVien(int n,String ten,String lop,String ngaySinh,double gpa) throws ParseException {
        this.msv = "B20DCCN" + String.format("%03d",n);
        this.ten = ten;
        this.lop = lop;
        this.ngaySinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaySinh);
        this.gpa = gpa;
    }
    public String toString() {
        return msv + " "+ten+" "+lop+" "+new SimpleDateFormat("dd/MM/yyyy").format(ngaySinh)+" "+String.format("%.2f",gpa);
    }
}
