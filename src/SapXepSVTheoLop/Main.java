package SapXepSVTheoLop;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int t = Integer.parseInt(cin.nextLine());
        ArrayList<SinhVien> ds = new ArrayList<>();
        while(t-->0){
            SinhVien a = new SinhVien(cin.nextLine(),cin.nextLine(),cin.nextLine(),cin.nextLine());
            ds.add(a);
        }
        int q = Integer.parseInt(cin.nextLine());
        while(q-->0) {
            String major = cin.nextLine();
            //Collections.sort(ds);
            System.out.println("DANH SACH SINH VIEN NGANH " + major.toUpperCase() + ":");
            for (SinhVien i : ds) {
                if (i.getMajor().compareTo(major) == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
