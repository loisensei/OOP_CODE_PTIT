package com.company.Contest1;

public class NhanVien implements Comparable<NhanVien>{
    private String mnv,name,chucVu;
    private int luongCoBan,soNgayCong;

    public int tienLuong(){
        return luongCoBan*soNgayCong;
    }

    public NhanVien(int n, String name, int luongCoBan, int soNgayCong, String chucVu) {
        this.mnv = "NV" + String.format("%02d", n);
        this.name = name;
        this.luongCoBan = luongCoBan;
        this.soNgayCong = soNgayCong;
        this.chucVu = chucVu;
    }
    public int tienThuong(){
        if(soNgayCong>=25){
            return (int)(tienLuong()*0.2);
        }else if(soNgayCong>=22){
            return (int)(tienLuong()*0.1);
        }else{
            return 0;
        }
    }
    public int phucap(){
        if(chucVu.equals("GD")) return 250000;
        else if(chucVu.equals("PGD")) return 200000;
        else if(chucVu.equals("TP")) return 180000;
        else return 150000;
    }
    public int luongAll(){
        return phucap()+tienLuong()+tienThuong();
    }
    public String toString(){
        return mnv+" " + name+ " "+ tienLuong()+" "+tienThuong()+" "+ phucap()+" "+ luongAll();
    }


    @Override
    public int compareTo(NhanVien o) {
        if(this.luongAll()> o.luongAll()) return -1;
        if(this.luongAll()<o.luongAll()) return 1;
        return 0;
    }
}
