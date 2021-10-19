package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class AddressEmail {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();
        List<String> listEmail = new ArrayList<>();
        cin.nextLine();
        while (t-- > 0) {
            String fullName = cin.nextLine();
            fullName = fullName.trim().toLowerCase();
            fullName = fullName.replaceAll("\\s+"," ");
            String[] s = fullName.split(" ");
            String Resul = "";
            Resul+=s[s.length-1];
            for(int i=0;i<s.length-1;i++){
                Resul+= String.valueOf(s[i].charAt(0));
            }
            int dem =1 ;
            for(String i : listEmail){
                if(Objects.equals(i, Resul)){
                    dem++;
                }
            }

            listEmail.add(Resul);
            if(dem>1) Resul+=String.valueOf(dem);
            System.out.println(Resul+"@ptit.edu.vn");
        }
    }
}
