package com.company.NhanVien;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee implements Comparable<Employee> {
    private String mnv;
    private String name,gender,address,code;
    private Date birthDate,signDate;
    public Employee(int mnv,String name,String gender,String birthDate,String address,String code,String signDate) throws ParseException {
        this.mnv = String.format("%05d",mnv);
        this.name = name;
        this.gender = gender;
        this.birthDate = new SimpleDateFormat("dd/MM/yyyy").parse(birthDate);
        this.address = address;
        this.code = code;
        this.signDate = new SimpleDateFormat("dd/MM/yyyy").parse(signDate);
    }
    public String toString() {
        return mnv+" "+name+" "+gender+" "+new SimpleDateFormat("dd/MM/yyyy").format(birthDate)+" "+address+" "+code+" "+ new SimpleDateFormat("dd/MM/yyyy").format(signDate);
    }

    @Override
    public int compareTo(Employee o) {
        if(this.birthDate.before(o.birthDate)) return -1;
        if(this.birthDate.after(o.birthDate)) return 1;
        return 0;
    }
}
