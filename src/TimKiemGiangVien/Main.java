package TimKiemGiangVien;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int t = Integer.parseInt(cin.nextLine());
        ArrayList<GiangVien> ds = new ArrayList<>();
        for(int i=1; i<=t ; i++){
            GiangVien a = new GiangVien(i, cin.nextLine(), cin.nextLine());
            ds.add(a);
        }
        int q = Integer.parseInt(cin.nextLine());
        while(q-->0){
            String s = cin.nextLine();
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA "+s+":");
            for(GiangVien a : ds){
                if(a.checkStringToken(s)){
                    System.out.println(a);
                }
            }
        }

    }
}
