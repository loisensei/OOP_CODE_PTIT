package HoaDon2;

import java.io.Serializable;

public class HoaDon implements Serializable {
    private String ma;
    private KhachHang khachHang;
    private MatHang matHang;
    private Integer soLuong;

    public HoaDon(int stt, KhachHang khachHang, MatHang matHang, Integer soLuong) {
        this.ma = "HD"+ String.format("%03d",stt);
        this.khachHang = khachHang;
        this.matHang = matHang;
        this.soLuong = soLuong;
    }
    public Long thanhTien(){
        return (long)soLuong* matHang.getGiaBan();
    }
    public String toString(){
        return ma + " " + khachHang + " " + matHang+" "+soLuong+" "+thanhTien();
    }
}
