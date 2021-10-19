package com.company;

import java.util.*;

public class ChuanHoaNameOne {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();
        cin.nextLine();
        while(t-->0){
            String name = cin.nextLine();
            name = name.trim(); // loai bo khoang trang hai dau
            name = name.toLowerCase(); //cac ki tu chuyen thanh chu thuong
            name = name.replaceAll("\\s+"," "); // thay the khoang trang dai bang 1 khoang trang
            String[] myName = name.split(" ");
            name = "";
            for(int i = 0; i< myName.length;i++){
                name += String.valueOf(myName[i].charAt(0)).toUpperCase() + myName[i].substring(1);
                if(i<myName.length-1){
                    name+=" ";
                }
            }
            System.out.println(name);

        }
    }
}
