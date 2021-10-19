package com.company.SinhVien;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Student implements Comparable<Student>{
    private String msv,name,grade;
    private Date birthDate;
    private Double gpa;
    public Student(int n, String name, String grade, String birthDate, Double gpa) throws ParseException {
        this.msv = "B20DCCN"+String.format("%03d",n);
        this.name = chuanHoa(name);
        this.grade = grade;
        this.birthDate = new SimpleDateFormat("dd/MM/yyyy").parse(birthDate);
        this.gpa = gpa;
    }
    public String toString() {
        return msv+" "+name+" "+grade+" "+new SimpleDateFormat("dd/MM/yyyy").format(birthDate)+" "+String.format("%.2f",gpa);
    }
    public static String chuanHoa(String name){
        name = name.toLowerCase().trim().replaceAll("\\s+"," ");
        String[] list = name.split(" ");
        StringBuilder nameBuilder = new StringBuilder();
        for(int i = 0; i<list.length; i++){
            list[i] = String.valueOf(list[i].charAt(0)).toUpperCase()+list[i].substring(1);
            nameBuilder.append(list[i]).append(" ");
        }
        return nameBuilder.toString().trim();
    }

    @Override
    public int compareTo(Student o) {
        return o.gpa.compareTo(this.gpa);
    }
}
