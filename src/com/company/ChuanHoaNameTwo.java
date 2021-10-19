package com.company;

import java.util.*;

public class ChuanHoaNameTwo {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();
        cin.nextLine();
        while(t-->0){
            String name = cin.nextLine();
            name =  name.trim();
            name = name.toLowerCase();
            name = name.replaceAll("\\s+"," ");
            String[] f_Name = name.split(" ");
            for(int i = 0 ;i< f_Name.length;i++){
                f_Name[i]= String.valueOf(f_Name[i].charAt(0)).toUpperCase() + f_Name[i].substring(1);

            }
            for(int i =1; i< f_Name.length;i++){
                System.out.print(f_Name[i]);
                if(i!=f_Name.length-1){
                    System.out.print(" ");
                }
            }
            f_Name[0] = f_Name[0].toUpperCase();
            System.out.println(", "+f_Name[0]);

        }
    }
}
