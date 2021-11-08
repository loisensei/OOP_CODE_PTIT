package HoaDon2;

import java.io.Serializable;

public class MatHang implements Serializable {
    private String ma,ten,donViTinh;
    private Integer giaMua,giaBan;

    public MatHang(int stt, String ten, String donViTinh, Integer giaMua, Integer giaBan) {
        this.ma = "MH"+ String.format("%03d",stt);
        this.ten = ten;
        this.donViTinh = donViTinh;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }

    public String getMa() {
        return this.ma;
    }

    public Integer getGiaBan() {
        return giaBan;
    }
    public String toString() {
        return ten + " " + donViTinh+" " + giaMua+" "+giaBan;
    }
}
