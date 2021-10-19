package DanhSachDoanhNghiepNhanSVThucTap1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int t = Integer.parseInt(cin.nextLine());
        ArrayList<Enterprise> ds = new ArrayList<>();
        while(t-->0){
            Enterprise a = new Enterprise(cin.nextLine(),cin.nextLine(),Integer.parseInt(cin.nextLine()));
            ds.add(a);
        }
        Collections.sort(ds);
        int q = Integer.parseInt(cin.nextLine());
        while(q-->0){
            int a = cin.nextInt();
            int b = cin.nextInt();
            System.out.printf("DANH SACH DOANH NGHIEP NHAN TU %d DEN %d SINH VIEN:\n",a,b);
            for(Enterprise i : ds){
                if(i.getQuantity() >=a && i.getQuantity() <=b){
                    System.out.println(i);
                }
            }
        }

    }
}
