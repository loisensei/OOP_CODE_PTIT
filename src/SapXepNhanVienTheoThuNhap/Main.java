package SapXepNhanVienTheoThuNhap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int t = Integer.parseInt(cin.nextLine());
        ArrayList<Employee> ds = new ArrayList<Employee>();
        for(int i= 1; i<=t;i++){
            Employee a = new Employee(i,cin.nextLine(),cin.nextLine(),Integer.parseInt(cin.nextLine()),Integer.parseInt(cin.nextLine()));
            ds.add(a);
        }
        Collections.sort(ds);
        for(Employee i : ds){
            System.out.println(i);
        }
    }
}
