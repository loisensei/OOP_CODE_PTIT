package TinhThuNhapGiaoVien;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Teacher teacher = new Teacher(in.nextLine(),in.nextLine(),Integer.parseInt(in.nextLine()));
        System.out.println(teacher);
    }
}
