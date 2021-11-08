package HoaDon2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File fis = new File("KH.in");
        Scanner cin = new Scanner(fis);
        List<KhachHang> khachHangList = new ArrayList<>();
        int n = Integer.parseInt(cin.nextLine());
        for(int i=1; i<=n; i++){
            KhachHang khachHang = new KhachHang(i,cin.nextLine(),cin.nextLine(),cin.nextLine(),cin.nextLine());
            khachHangList.add(khachHang);
        }
        File fis1 = new File("MH.in");
        Scanner cin1 = new Scanner(fis1);
        n = Integer.parseInt(cin1.nextLine());
        List<MatHang> matHangList = new ArrayList<>();
        for(int i=1 ; i<=n ;i++){
            MatHang matHang = new MatHang(i,cin1.nextLine(),cin1.nextLine(),Integer.parseInt(cin1.nextLine()),Integer.parseInt(cin1.nextLine()));
            matHangList.add(matHang);
        }
        List<HoaDon> hoaDonList = new ArrayList<>();
        File fis2 = new File("HD.in");
        Scanner cin2 = new Scanner(fis2);
        n = Integer.parseInt(cin2.nextLine());
        for(int i =1 ; i<= n;i++){
            String maKhachHang = cin2.next();
            String maMatHang = cin2.next();
            HoaDon hoaDon = new HoaDon(i,getKhachHang(khachHangList,maKhachHang),getMatHang(matHangList,maMatHang),cin2.nextInt());
            hoaDonList.add(hoaDon);
        }
        for(HoaDon hoaDon : hoaDonList){
            System.out.println(hoaDon);
        }
        
    }
    public static KhachHang getKhachHang(List<KhachHang> list,String ma){
        for(KhachHang khachHang : list){
            if(khachHang.getMa().equals(ma)) return khachHang;
        }
        return null;
    }
    public static MatHang getMatHang(List<MatHang> list,String ma){
        for(MatHang matHang : list){
            if(matHang.getMa().equals(ma)) return matHang;
        }
        return null;
    }

}
