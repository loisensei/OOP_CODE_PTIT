package com.company;

import java.util.*;

public class TapTuRieng {
    public  static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();
        cin.nextLine();
        while(t-->0){
            String a = cin.nextLine();
            String b = cin.nextLine();
            List<String> s = Arrays.asList(a.split(" "));
            Collections.sort(s);
            List<String> check = Arrays.asList(b.split(" "));
            Set<String> set = new LinkedHashSet<String>(s);

            for(String i : set){
                if(!check.contains(i)){
                    System.out.print(i+" ");
                }
            }
            System.out.println();
        }
    }
}
