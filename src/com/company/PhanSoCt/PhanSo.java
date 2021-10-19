package com.company.PhanSoCt;


public class PhanSo {
    private long numerator;
    private long denominator;
    public PhanSo(long a, long b){
        this.numerator = a;
        this.denominator = b;
    }
    public PhanSo add(PhanSo phanso){
        long ts = this.numerator*phanso.denominator+this.denominator*phanso.numerator;
        long ms = this.denominator*phanso.denominator;
        PhanSo tmp = new PhanSo(ts, ms);
        tmp.rutGon();
        return tmp;
    }
    public void setTu(long a){
        this.numerator = a;
    }
    public void setMau(long a){
        this.denominator = a;
    }
    public void rutGon(){
        long i = ucln(this.numerator, this.denominator);
        this.setTu(this.numerator / i);
        this.setMau(this.denominator / i);
    }
    public long ucln(long a, long b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }
    public PhanSo mul(PhanSo a){
        long ts = this.numerator * a.numerator;
        long ms = this.denominator * a.denominator;
        PhanSo tmp = new PhanSo(ts, ms);
        tmp.rutGon();
        return tmp;
    }
    public String toString(){
        return numerator+"/"+denominator;
    }
}
