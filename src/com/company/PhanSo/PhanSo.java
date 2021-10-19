package com.company.PhanSo;

import java.math.BigInteger;
import java.nio.Buffer;

public class PhanSo {
    private BigInteger numerator;
    private BigInteger denominator;
    PhanSo(long a, long b){
        this.numerator = BigInteger.valueOf(a);
        this.denominator = BigInteger.valueOf(b);
    }
    public void rutGon(){
        BigInteger ucln = this.numerator.gcd(this.denominator);
        this.numerator = this.numerator.divide(ucln);
        this.denominator = this.denominator.divide(ucln);
    }

    public String toString(){
        return numerator+"/"+denominator;
    }

}
