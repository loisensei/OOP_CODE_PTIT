package HoaDon2;

import java.io.Serializable;


public class KhachHang implements Serializable {
    private String ma,ten,gioiTinh,diaChi;
    private String ngaySinh;

    public KhachHang(int stt,String ten, String gioiTinh, String ngaySinh, String diaChi) {
        this.ma = "KH"+String.format("%03d",stt);
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.ngaySinh = ngaySinh;
    }

    public String getMa() {
        return this.ma;
    }

    public String toString(){
        return ten + " " + diaChi;
    }
}
