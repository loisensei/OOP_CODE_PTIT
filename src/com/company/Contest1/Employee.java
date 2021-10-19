package com.company.Contest1;

import java.util.Scanner;

public class Employee {
    private String name;
    private String gender;
    private String birthDate;
    private String address;
    private String code;
    private String SignDate;
    public Employee(String a,String b,String c,String d,String e,String f){
        this.name = a;
        this.gender = b;
        this.birthDate =c;
        this.address=d;
        this.code=e;
        this.SignDate=f;
    }
    public static void setPerformer(String s){
        if(s.charAt(1)=='/'){
            s = new StringBuilder(s).insert(0,"0").toString();
        }
        if(s.charAt(4)=='/'){
            s = new StringBuilder(s).insert(3,"0").toString();
        }
    }
    public static void infomation(Employee employee){
        System.out.print("00001 "+employee.name+" "+employee.gender+" ");
        System.out.print(employee.birthDate+" "+employee.address+" "+employee.code+" "+employee.SignDate);
    }
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        Employee employee = new Employee(cin.nextLine(),cin.nextLine(),cin.nextLine(),cin.nextLine(),cin.nextLine(), cin.nextLine());
        setPerformer(employee.birthDate);
        setPerformer(employee.SignDate);

        infomation(employee);
    }
}
